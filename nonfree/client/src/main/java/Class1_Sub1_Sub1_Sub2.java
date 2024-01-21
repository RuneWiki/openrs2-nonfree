import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "Z")
	private boolean aBoolean41 = true;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
	private int anInt156;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
	private int anInt157;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
	private int anInt158;

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
	private int anInt159;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	private int anInt160;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
	private int anInt161;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
	private int anInt162;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "Lclient!nc;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
	private int anInt163;

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
	private int anInt164;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IZIIIIIZII)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt156 = arg9;
			this.anInt157 = arg0;
			this.anInt158 = arg8;
			this.anInt159 = arg2;
			this.anInt160 = arg5;
			this.anInt161 = arg4;
			this.anInt162 = arg3;
			this.aClass27_1 = Class27.aClass27Array1[arg6];
			this.anInt163 = 0;
			this.anInt164 = client.anInt265;
			if (arg7 && this.aClass27_1.anInt794 != -1) {
				this.anInt163 = (int) (Math.random() * (double) this.aClass27_1.anInt793);
				this.anInt164 -= (int) (Math.random() * (double) this.aClass27_1.method500(this.anInt163));
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("48248, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method671() {
		try {
			@Pc(9) int local9;
			if (this.aClass27_1 != null) {
				local9 = client.anInt265 - this.anInt164;
				if (local9 > 100 && this.aClass27_1.anInt794 > 0) {
					local9 = 100;
				}
				label36: {
					do {
						do {
							if (local9 <= this.aClass27_1.method500(this.anInt163)) {
								break label36;
							}
							local9 -= this.aClass27_1.method500(this.anInt163);
							this.anInt163++;
						} while (this.anInt163 < this.aClass27_1.anInt793);
						this.anInt163 -= this.aClass27_1.anInt794;
					} while (this.anInt163 >= 0 && this.anInt163 < this.aClass27_1.anInt793);
					this.aClass27_1 = null;
				}
				this.anInt164 = client.anInt265 - local9;
			}
			local9 = -1;
			if (this.aClass27_1 != null) {
				local9 = this.aClass27_1.anIntArray222[this.anInt163];
			}
			@Pc(92) Class9 local92 = Class9.method287(this.anInt156);
			return local92.method293(this.anInt157, this.anInt158, this.anInt159, this.anInt160, this.anInt161, this.anInt162, local9);
		} catch (@Pc(120) RuntimeException local120) {
			signlink.reporterror("33278, " + true + ", " + local120.toString());
			throw new RuntimeException();
		}
	}
}
