import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
	private int anInt155 = 977;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
	private int anInt156;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
	private int anInt157;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
	private int anInt158;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
	private int anInt159;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
	private int anInt160;

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
	private int anInt161;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	private int anInt162;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "Lclient!nc;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
	private int anInt163;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
	private int anInt164;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
	private int anInt165;

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
	private int anInt166;

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "[I")
	private int[] anIntArray17;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIIIIZI)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt156 = arg0;
			this.anInt157 = arg1;
			this.anInt158 = arg5;
			this.anInt159 = arg6;
			this.anInt160 = arg3;
			this.anInt161 = arg7;
			this.anInt162 = arg2;
			if (arg4 != -1) {
				this.aClass27_1 = Class27.aClass27Array1[arg4];
				this.anInt163 = 0;
				this.anInt164 = client.anInt283;
				if (arg8 && this.aClass27_1.anInt809 != -1) {
					this.anInt163 = (int) (Math.random() * (double) this.aClass27_1.anInt808);
					this.anInt164 -= (int) (Math.random() * (double) this.aClass27_1.method506(this.anInt163, this.anInt155));
				}
			}
			@Pc(75) Class9 local75 = Class9.method288(this.anInt156);
			this.anInt165 = local75.anInt530;
			this.anInt166 = local75.anInt531;
			@Pc(87) int local87 = 80 / arg9;
			this.anIntArray17 = local75.anIntArray160;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("69551, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass27_1 != null) {
				@Pc(11) int local11 = client.anInt283 - this.anInt164;
				if (local11 > 100 && this.aClass27_1.anInt809 > 0) {
					local11 = 100;
				}
				label43: {
					do {
						do {
							if (local11 <= this.aClass27_1.method506(this.anInt163, this.anInt155)) {
								break label43;
							}
							local11 -= this.aClass27_1.method506(this.anInt163, this.anInt155);
							this.anInt163++;
						} while (this.anInt163 < this.aClass27_1.anInt808);
						this.anInt163 -= this.aClass27_1.anInt809;
					} while (this.anInt163 >= 0 && this.anInt163 < this.aClass27_1.anInt808);
					this.aClass27_1 = null;
				}
				this.anInt164 = client.anInt283 - local11;
				if (this.aClass27_1 != null) {
					local3 = this.aClass27_1.anIntArray225[this.anInt163];
				}
			}
			@Pc(97) Class9 local97;
			if (this.anIntArray17 == null) {
				local97 = Class9.method288(this.anInt156);
			} else {
				local97 = this.method50();
			}
			return local97 == null ? null : local97.method294(this.anInt157, this.anInt158, this.anInt159, this.anInt160, this.anInt161, this.anInt162, local3);
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("52002, " + -59 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)Lclient!ec;")
	private Class9 method50() {
		try {
			@Pc(8) int local8 = -1;
			if (this.anInt165 != -1) {
				@Pc(17) Class36 local17 = Class36.aClass36Array1[this.anInt165];
				@Pc(20) int local20 = local17.anInt858;
				@Pc(23) int local23 = local17.anInt859;
				@Pc(26) int local26 = local17.anInt860;
				@Pc(32) int local32 = client.anIntArray48[local26 - local23];
				local8 = aClient1.anIntArray32[local20] >> local23 & local32;
			} else if (this.anInt166 != -1) {
				local8 = aClient1.anIntArray32[this.anInt166];
			}
			return local8 < 0 || local8 >= this.anIntArray17.length || this.anIntArray17[local8] == -1 ? null : Class9.method288(this.anIntArray17[local8]);
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("43932, " + 4 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}
}
