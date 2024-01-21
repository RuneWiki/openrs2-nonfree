import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BMMXGYBV")
public final class Class2_Sub1_Sub1_Sub3 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!BMMXGYBV", name = "s", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!BMMXGYBV", name = "u", descriptor = "Z")
	private boolean aBoolean25 = false;

	@OriginalMember(owner = "client!BMMXGYBV", name = "o", descriptor = "I")
	private int anInt85;

	@OriginalMember(owner = "client!BMMXGYBV", name = "p", descriptor = "I")
	private int anInt86;

	@OriginalMember(owner = "client!BMMXGYBV", name = "q", descriptor = "I")
	private int anInt87;

	@OriginalMember(owner = "client!BMMXGYBV", name = "v", descriptor = "I")
	private int anInt90;

	@OriginalMember(owner = "client!BMMXGYBV", name = "w", descriptor = "I")
	private int anInt91;

	@OriginalMember(owner = "client!BMMXGYBV", name = "x", descriptor = "I")
	private int anInt92;

	@OriginalMember(owner = "client!BMMXGYBV", name = "y", descriptor = "I")
	private int anInt93;

	@OriginalMember(owner = "client!BMMXGYBV", name = "z", descriptor = "Lclient!KSVXFIAD;")
	private Class22 aClass22_1;

	@OriginalMember(owner = "client!BMMXGYBV", name = "r", descriptor = "I")
	private int anInt88;

	@OriginalMember(owner = "client!BMMXGYBV", name = "t", descriptor = "I")
	private int anInt89;

	@OriginalMember(owner = "client!BMMXGYBV", name = "m", descriptor = "I")
	private int anInt83;

	@OriginalMember(owner = "client!BMMXGYBV", name = "n", descriptor = "I")
	private int anInt84;

	@OriginalMember(owner = "client!BMMXGYBV", name = "l", descriptor = "[I")
	private int[] anIntArray7;

	@OriginalMember(owner = "client!BMMXGYBV", name = "<init>", descriptor = "(IIIIIIIIZI)V")
	public Class2_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt85 = arg2;
			this.anInt86 = arg0;
			this.anInt87 = arg9;
			this.anInt90 = arg7;
			this.anInt91 = arg6;
			this.anInt92 = arg5;
			this.anInt93 = arg1;
			if (arg4 != -1) {
				this.aClass22_1 = Class22.aClass22Array1[arg4];
				this.anInt88 = 0;
				this.anInt89 = client.anInt993;
				if (arg8 && this.aClass22_1.anInt373 != -1) {
					this.anInt88 = (int) (Math.random() * (double) this.aClass22_1.anInt372);
					this.anInt89 -= (int) (Math.random() * (double) this.aClass22_1.method277(this.anInt88));
				}
			}
			@Pc(74) Class37 local74 = Class37.method451(this.anInt85);
			this.anInt83 = local74.anInt574;
			this.anInt84 = local74.anInt573;
			this.anIntArray7 = local74.anIntArray169;
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("85877, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BMMXGYBV", name = "a", descriptor = "(I)Lclient!OGORHYVW;")
	@Override
	protected Class2_Sub1_Sub1_Sub6 method565() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass22_1 != null) {
				@Pc(11) int local11 = client.anInt993 - this.anInt89;
				if (local11 > 100 && this.aClass22_1.anInt373 > 0) {
					local11 = 100;
				}
				label43: {
					do {
						do {
							if (local11 <= this.aClass22_1.method277(this.anInt88)) {
								break label43;
							}
							local11 -= this.aClass22_1.method277(this.anInt88);
							this.anInt88++;
						} while (this.anInt88 < this.aClass22_1.anInt372);
						this.anInt88 -= this.aClass22_1.anInt373;
					} while (this.anInt88 >= 0 && this.anInt88 < this.aClass22_1.anInt372);
					this.aClass22_1 = null;
				}
				this.anInt89 = client.anInt993 - local11;
				if (this.aClass22_1 != null) {
					local3 = this.aClass22_1.anIntArray92[this.anInt88];
				}
			}
			@Pc(101) Class37 local101;
			if (this.anIntArray7 == null) {
				local101 = Class37.method451(this.anInt85);
			} else {
				local101 = this.method32();
			}
			return local101 == null ? null : local101.method448(this.anInt86, this.anInt87, this.anInt90, this.anInt91, this.anInt92, this.anInt93, local3);
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("14388, " + 0 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BMMXGYBV", name = "b", descriptor = "(I)Lclient!SOLNFIIQ;")
	private Class37 method32() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt83 != -1) {
				@Pc(20) Class40 local20 = Class40.aClass40Array1[this.anInt83];
				@Pc(23) int local23 = local20.anInt678;
				@Pc(26) int local26 = local20.anInt679;
				@Pc(29) int local29 = local20.anInt680;
				@Pc(35) int local35 = client.anIntArray265[local29 - local26];
				local1 = aClient1.anIntArray250[local23] >> local26 & local35;
			} else if (this.anInt84 != -1) {
				local1 = aClient1.anIntArray250[this.anInt84];
			}
			return local1 < 0 || local1 >= this.anIntArray7.length || this.anIntArray7[local1] == -1 ? null : Class37.method451(this.anIntArray7[local1]);
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("17419, " + 363 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}
}
