import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "Z")
	private boolean aBoolean29 = false;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
	private int anInt158;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
	private int anInt159;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
	private int anInt160;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
	private int anInt161;

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
	private int anInt162;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	private int anInt163;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
	private int anInt164;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "Lclient!nc;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
	private int anInt165;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
	private int anInt166;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
	private int anInt157;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIIZIII)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt158 = arg3;
			this.anInt159 = arg0;
			this.anInt160 = arg1;
			this.anInt161 = arg9;
			this.anInt162 = arg7;
			this.anInt163 = arg4;
			this.anInt164 = arg8;
			this.aClass27_1 = Class27.aClass27Array1[arg2];
			this.anInt165 = 0;
			this.anInt166 = client.anInt207;
			if (arg5 != 0) {
				this.anInt157 = 429;
			}
			if (arg6 && this.aClass27_1.anInt796 != -1) {
				this.anInt165 = (int) (Math.random() * (double) this.aClass27_1.anInt795);
				this.anInt166 -= (int) (Math.random() * (double) this.aClass27_1.method499(this.anInt165));
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("5750, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method670() {
		try {
			@Pc(9) int local9;
			if (this.aClass27_1 != null) {
				local9 = client.anInt207 - this.anInt166;
				if (local9 > 100 && this.aClass27_1.anInt796 > 0) {
					local9 = 100;
				}
				label36: {
					do {
						do {
							if (local9 <= this.aClass27_1.method499(this.anInt165)) {
								break label36;
							}
							local9 -= this.aClass27_1.method499(this.anInt165);
							this.anInt165++;
						} while (this.anInt165 < this.aClass27_1.anInt795);
						this.anInt165 -= this.aClass27_1.anInt796;
					} while (this.anInt165 >= 0 && this.anInt165 < this.aClass27_1.anInt795);
					this.aClass27_1 = null;
				}
				this.anInt166 = client.anInt207 - local9;
			}
			local9 = -1;
			if (this.aClass27_1 != null) {
				local9 = this.aClass27_1.anIntArray222[this.anInt165];
			}
			@Pc(102) Class9 local102 = Class9.method287(this.anInt158);
			return local102.method293(this.anInt159, this.anInt160, this.anInt161, this.anInt162, this.anInt163, this.anInt164, local9);
		} catch (@Pc(121) RuntimeException local121) {
			signlink.reporterror("9888, " + false + ", " + local121.toString());
			throw new RuntimeException();
		}
	}
}
