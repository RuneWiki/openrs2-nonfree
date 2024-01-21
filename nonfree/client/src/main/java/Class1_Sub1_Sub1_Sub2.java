import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "Z")
	private boolean aBoolean35 = false;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
	private int anInt165;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
	private int anInt166;

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
	private int anInt167;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	private int anInt168;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
	private int anInt169;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
	private int anInt170;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
	private int anInt171;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "Lclient!nc;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
	private int anInt172;

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
	private int anInt173;

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
	private int anInt174;

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
	private int anInt175;

	@OriginalMember(owner = "client!bb", name = "C", descriptor = "[I")
	private int[] anIntArray17;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IZIIIIIIII)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt165 = arg0;
			this.anInt166 = arg4;
			this.anInt167 = arg9;
			this.anInt168 = arg3;
			this.anInt169 = arg7;
			this.anInt170 = arg6;
			this.anInt171 = arg2;
			if (arg5 != -1) {
				this.aClass27_1 = Class27.aClass27Array1[arg5];
				this.anInt172 = 0;
				this.anInt173 = client.anInt248;
				if (arg1 && this.aClass27_1.anInt808 != -1) {
					this.anInt172 = (int) (Math.random() * (double) this.aClass27_1.anInt807);
					this.anInt173 -= (int) (Math.random() * (double) this.aClass27_1.method506(this.anInt172));
				}
			}
			@Pc(87) Class9 local87 = Class9.method288(this.anInt165);
			this.anInt174 = local87.anInt531;
			this.anInt175 = local87.anInt532;
			this.anIntArray17 = local87.anIntArray160;
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("40809, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass27_1 != null) {
				@Pc(11) int local11 = client.anInt248 - this.anInt173;
				if (local11 > 100 && this.aClass27_1.anInt808 > 0) {
					local11 = 100;
				}
				label52: {
					do {
						do {
							if (local11 <= this.aClass27_1.method506(this.anInt172)) {
								break label52;
							}
							local11 -= this.aClass27_1.method506(this.anInt172);
							this.anInt172++;
						} while (this.anInt172 < this.aClass27_1.anInt807);
						this.anInt172 -= this.aClass27_1.anInt808;
					} while (this.anInt172 >= 0 && this.anInt172 < this.aClass27_1.anInt807);
					this.aClass27_1 = null;
				}
				this.anInt173 = client.anInt248 - local11;
				if (this.aClass27_1 != null) {
					local3 = this.aClass27_1.anIntArray225[this.anInt172];
				}
			}
			if (arg0 != 0) {
				this.aBoolean35 = !this.aBoolean35;
			}
			@Pc(105) Class9 local105;
			if (this.anIntArray17 == null) {
				local105 = Class9.method288(this.anInt165);
			} else {
				local105 = this.method50();
			}
			return local105 == null ? null : local105.method294(this.anInt166, this.anInt167, this.anInt168, this.anInt169, this.anInt170, this.anInt171, local3);
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("26352, " + arg0 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)Lclient!ec;")
	private Class9 method50() {
		try {
			@Pc(13) int local13 = -1;
			if (this.anInt174 != -1) {
				@Pc(22) Class36 local22 = Class36.aClass36Array1[this.anInt174];
				@Pc(25) int local25 = local22.anInt859;
				@Pc(28) int local28 = local22.anInt860;
				@Pc(31) int local31 = local22.anInt861;
				@Pc(37) int local37 = client.anIntArray42[local31 - local28];
				local13 = aClient1.anIntArray45[local25] >> local28 & local37;
			} else if (this.anInt175 != -1) {
				local13 = aClient1.anIntArray45[this.anInt175];
			}
			return local13 < 0 || local13 >= this.anIntArray17.length || this.anIntArray17[local13] == -1 ? null : Class9.method288(this.anIntArray17[local13]);
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("61348, " + 1 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}
}
