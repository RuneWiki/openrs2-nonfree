import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bb")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
	private int anInt166 = 942;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "Z")
	private boolean aBoolean33 = true;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
	private int anInt167;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
	private int anInt168;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
	private int anInt169;

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
	private int anInt170;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	private int anInt171;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
	private int anInt172;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
	private int anInt173;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "Lclient!nc;")
	private Class27 aClass27_1;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
	private int anInt174;

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
	private int anInt175;

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
	private int anInt176;

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
	private int anInt177;

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "[I")
	private int[] anIntArray17;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIIZIIB)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte arg9) {
		try {
			this.anInt167 = arg1;
			this.anInt168 = arg0;
			this.anInt169 = arg4;
			this.anInt170 = arg2;
			this.anInt171 = arg7;
			this.anInt172 = arg8;
			this.anInt173 = arg3;
			if (arg5 != -1) {
				this.aClass27_1 = Class27.aClass27Array1[arg5];
				this.anInt174 = 0;
				this.anInt175 = client.anInt252;
				if (arg6 && this.aClass27_1.anInt815 != -1) {
					this.anInt174 = (int) (Math.random() * (double) this.aClass27_1.anInt814);
					this.anInt175 -= (int) (Math.random() * (double) this.aClass27_1.method506(this.anInt174, this.aBoolean33));
				}
			}
			@Pc(84) Class9 local84 = Class9.method288(this.anInt167);
			this.anInt176 = local84.anInt533;
			this.anInt177 = local84.anInt534;
			this.anIntArray17 = local84.anIntArray160;
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("58187, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lclient!eb;")
	@Override
	protected Class1_Sub1_Sub1_Sub5 method676() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass27_1 != null) {
				@Pc(11) int local11 = client.anInt252 - this.anInt175;
				if (local11 > 100 && this.aClass27_1.anInt815 > 0) {
					local11 = 100;
				}
				label43: {
					do {
						do {
							if (local11 <= this.aClass27_1.method506(this.anInt174, this.aBoolean33)) {
								break label43;
							}
							local11 -= this.aClass27_1.method506(this.anInt174, this.aBoolean33);
							this.anInt174++;
						} while (this.anInt174 < this.aClass27_1.anInt814);
						this.anInt174 -= this.aClass27_1.anInt815;
					} while (this.anInt174 >= 0 && this.anInt174 < this.aClass27_1.anInt814);
					this.aClass27_1 = null;
				}
				this.anInt175 = client.anInt252 - local11;
				if (this.aClass27_1 != null) {
					local3 = this.aClass27_1.anIntArray225[this.anInt174];
				}
			}
			@Pc(104) Class9 local104;
			if (this.anIntArray17 == null) {
				local104 = Class9.method288(this.anInt167);
			} else {
				local104 = this.method50();
			}
			return local104 == null ? null : local104.method294(this.anInt168, this.anInt169, this.anInt170, this.anInt171, this.anInt172, this.anInt173, local3);
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("25039, " + -47094 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Lclient!ec;")
	private Class9 method50() {
		try {
			@Pc(3) int local3 = -1;
			if (this.anInt176 != -1) {
				@Pc(21) Class36 local21 = Class36.aClass36Array1[this.anInt176];
				@Pc(24) int local24 = local21.anInt862;
				@Pc(27) int local27 = local21.anInt863;
				@Pc(30) int local30 = local21.anInt864;
				@Pc(36) int local36 = client.anIntArray91[local30 - local27];
				local3 = aClient1.anIntArray81[local24] >> local27 & local36;
			} else if (this.anInt177 != -1) {
				local3 = aClient1.anIntArray81[this.anInt177];
			}
			return local3 < 0 || local3 >= this.anIntArray17.length || this.anIntArray17[local3] == -1 ? null : Class9.method288(this.anIntArray17[local3]);
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("83244, " + 0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}
}
