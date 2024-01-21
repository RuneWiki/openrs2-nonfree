import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
	private int anInt148 = 584;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "Z")
	private boolean aBoolean37 = true;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	private int anInt149;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
	private int anInt150;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
	private int anInt151;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
	private int anInt152;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
	private int anInt153;

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
	private int anInt154;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	private int anInt155;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "Lclient!nc;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
	private int anInt156;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
	private int anInt157;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIBIIZIII)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt149 = arg0;
			this.anInt150 = arg1;
			this.anInt151 = arg7;
			this.anInt152 = arg5;
			this.anInt153 = arg2;
			this.anInt154 = arg9;
			this.anInt155 = arg8;
			this.aClass27_1 = Class27.aClass27Array1[arg4];
			this.anInt156 = 0;
			this.anInt157 = client.anInt375;
			if (arg6 && this.aClass27_1.anInt769 != -1) {
				this.anInt156 = (int) (Math.random() * (double) this.aClass27_1.anInt768);
				this.anInt157 -= (int) (Math.random() * (double) this.aClass27_1.method498(this.anInt156));
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("74632, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method669() {
		try {
			@Pc(9) int local9;
			if (this.aClass27_1 != null) {
				local9 = client.anInt375 - this.anInt157;
				if (local9 > 100 && this.aClass27_1.anInt769 > 0) {
					local9 = 100;
				}
				label36: {
					do {
						do {
							if (local9 <= this.aClass27_1.method498(this.anInt156)) {
								break label36;
							}
							local9 -= this.aClass27_1.method498(this.anInt156);
							this.anInt156++;
						} while (this.anInt156 < this.aClass27_1.anInt768);
						this.anInt156 -= this.aClass27_1.anInt769;
					} while (this.anInt156 >= 0 && this.anInt156 < this.aClass27_1.anInt768);
					this.aClass27_1 = null;
				}
				this.anInt157 = client.anInt375 - local9;
			}
			local9 = -1;
			if (this.aClass27_1 != null) {
				local9 = this.aClass27_1.anIntArray222[this.anInt156];
			}
			@Pc(92) Class9 local92 = Class9.method286(this.anInt149);
			return local92.method292(this.anInt150, this.anInt151, this.anInt152, this.anInt153, this.anInt154, this.anInt155, local9);
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("21900, " + 0 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}
}
