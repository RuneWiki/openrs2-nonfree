import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
	private int anInt156 = -533;

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

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
	private int anInt163;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "Lclient!nc;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
	private int anInt164;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
	private int anInt165;

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
	private int anInt166;

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
	private int anInt167;

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "[I")
	private int[] anIntArray17;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIZIIIII)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt157 = arg9;
			this.anInt158 = arg7;
			this.anInt159 = arg5;
			this.anInt160 = arg3;
			this.anInt161 = arg6;
			this.anInt162 = arg1;
			this.anInt163 = arg8;
			if (arg0 != -1) {
				this.aClass27_1 = Class27.aClass27Array1[arg0];
				this.anInt164 = 0;
				this.anInt165 = client.anInt223;
				if (arg4 && this.aClass27_1.anInt792 != -1) {
					this.anInt164 = (int) (Math.random() * (double) this.aClass27_1.anInt791);
					this.anInt165 -= (int) (Math.random() * (double) this.aClass27_1.method506(this.anInt164));
				}
			}
			@Pc(83) Class9 local83 = Class9.method288(this.anInt157);
			this.anInt166 = local83.anInt527;
			this.anInt167 = local83.anInt528;
			this.anIntArray17 = local83.anIntArray160;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("14718, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass27_1 != null) {
				@Pc(11) int local11 = client.anInt223 - this.anInt165;
				if (local11 > 100 && this.aClass27_1.anInt792 > 0) {
					local11 = 100;
				}
				label43: {
					do {
						do {
							if (local11 <= this.aClass27_1.method506(this.anInt164)) {
								break label43;
							}
							local11 -= this.aClass27_1.method506(this.anInt164);
							this.anInt164++;
						} while (this.anInt164 < this.aClass27_1.anInt791);
						this.anInt164 -= this.aClass27_1.anInt792;
					} while (this.anInt164 >= 0 && this.anInt164 < this.aClass27_1.anInt791);
					this.aClass27_1 = null;
				}
				this.anInt165 = client.anInt223 - local11;
				if (this.aClass27_1 != null) {
					local3 = this.aClass27_1.anIntArray225[this.anInt164];
				}
			}
			@Pc(96) Class9 local96;
			if (this.anIntArray17 == null) {
				local96 = Class9.method288(this.anInt157);
			} else {
				local96 = this.method50(this.anInt156);
			}
			return local96 == null ? null : local96.method294(this.anInt158, this.anInt159, this.anInt160, this.anInt161, this.anInt162, this.anInt163, local3);
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("98666, " + -67 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lclient!ec;")
	private Class9 method50(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = -1;
			if (arg0 >= 0) {
				for (@Pc(7) int local7 = 1; local7 > 0; local7++) {
				}
			}
			if (this.anInt166 != -1) {
				@Pc(21) Class36 local21 = Class36.aClass36Array1[this.anInt166];
				@Pc(24) int local24 = local21.anInt839;
				@Pc(27) int local27 = local21.anInt840;
				@Pc(30) int local30 = local21.anInt841;
				@Pc(36) int local36 = client.anIntArray67[local30 - local27];
				local3 = aClient1.anIntArray33[local24] >> local27 & local36;
			} else if (this.anInt167 != -1) {
				local3 = aClient1.anIntArray33[this.anInt167];
			}
			return local3 < 0 || local3 >= this.anIntArray17.length || this.anIntArray17[local3] == -1 ? null : Class9.method288(this.anIntArray17[local3]);
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("2485, " + arg0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}
}
