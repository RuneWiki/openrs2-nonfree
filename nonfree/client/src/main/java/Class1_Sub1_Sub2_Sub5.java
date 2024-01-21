import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WBWOBAFW")
public final class Class1_Sub1_Sub2_Sub5 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!WBWOBAFW", name = "x", descriptor = "Lclient!client;")
	public static client aClient3;

	@OriginalMember(owner = "client!WBWOBAFW", name = "B", descriptor = "I")
	private int anInt715;

	@OriginalMember(owner = "client!WBWOBAFW", name = "m", descriptor = "B")
	private byte aByte21 = 7;

	@OriginalMember(owner = "client!WBWOBAFW", name = "y", descriptor = "I")
	private int anInt712;

	@OriginalMember(owner = "client!WBWOBAFW", name = "z", descriptor = "I")
	private int anInt713;

	@OriginalMember(owner = "client!WBWOBAFW", name = "A", descriptor = "I")
	private int anInt714;

	@OriginalMember(owner = "client!WBWOBAFW", name = "r", descriptor = "I")
	private int anInt707;

	@OriginalMember(owner = "client!WBWOBAFW", name = "s", descriptor = "I")
	private int anInt708;

	@OriginalMember(owner = "client!WBWOBAFW", name = "t", descriptor = "I")
	private int anInt709;

	@OriginalMember(owner = "client!WBWOBAFW", name = "u", descriptor = "I")
	private int anInt710;

	@OriginalMember(owner = "client!WBWOBAFW", name = "v", descriptor = "Lclient!LKGEGIEW;")
	private Class22 aClass22_2;

	@OriginalMember(owner = "client!WBWOBAFW", name = "n", descriptor = "I")
	private int anInt704;

	@OriginalMember(owner = "client!WBWOBAFW", name = "w", descriptor = "I")
	private int anInt711;

	@OriginalMember(owner = "client!WBWOBAFW", name = "p", descriptor = "I")
	private int anInt705;

	@OriginalMember(owner = "client!WBWOBAFW", name = "q", descriptor = "I")
	private int anInt706;

	@OriginalMember(owner = "client!WBWOBAFW", name = "o", descriptor = "[I")
	private int[] anIntArray150;

	@OriginalMember(owner = "client!WBWOBAFW", name = "<init>", descriptor = "(IIIIBIIIIZ)V")
	public Class1_Sub1_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		try {
			if (arg4 != this.aByte21) {
				for (@Pc(10) int local10 = 1; local10 > 0; local10++) {
				}
			}
			this.anInt712 = arg0;
			this.anInt713 = arg2;
			this.anInt714 = arg1;
			this.anInt707 = arg6;
			this.anInt708 = arg3;
			this.anInt709 = arg5;
			this.anInt710 = arg7;
			if (arg8 != -1) {
				this.aClass22_2 = Class22.aClass22Array1[arg8];
				this.anInt704 = 0;
				this.anInt711 = client.anInt995;
				if (arg9 && this.aClass22_2.anInt434 != -1) {
					this.anInt704 = (int) (Math.random() * (double) this.aClass22_2.anInt433);
					this.anInt711 -= (int) (Math.random() * (double) this.aClass22_2.method252(this.anInt704));
				}
			}
			@Pc(85) Class46 local85 = Class46.method515(this.anInt712);
			this.anInt705 = local85.anInt761;
			this.anInt706 = local85.anInt750;
			this.anIntArray150 = local85.anIntArray163;
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("84816, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBWOBAFW", name = "a", descriptor = "(I)Lclient!ZKARKDQW;")
	@Override
	protected Class1_Sub1_Sub2_Sub6 method529() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass22_2 != null) {
				@Pc(17) int local17 = client.anInt995 - this.anInt711;
				if (local17 > 100 && this.aClass22_2.anInt434 > 0) {
					local17 = 100;
				}
				label43: {
					do {
						do {
							if (local17 <= this.aClass22_2.method252(this.anInt704)) {
								break label43;
							}
							local17 -= this.aClass22_2.method252(this.anInt704);
							this.anInt704++;
						} while (this.anInt704 < this.aClass22_2.anInt433);
						this.anInt704 -= this.aClass22_2.anInt434;
					} while (this.anInt704 >= 0 && this.anInt704 < this.aClass22_2.anInt433);
					this.aClass22_2 = null;
				}
				this.anInt711 = client.anInt995 - local17;
				if (this.aClass22_2 != null) {
					local3 = this.aClass22_2.anIntArray76[this.anInt704];
				}
			}
			@Pc(101) Class46 local101;
			if (this.anIntArray150 == null) {
				local101 = Class46.method515(this.anInt712);
			} else {
				local101 = this.method482();
			}
			return local101 == null ? null : local101.method521(this.anInt713, this.anInt714, this.anInt707, this.anInt708, this.anInt709, this.anInt710, local3);
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("90577, " + 4016 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBWOBAFW", name = "a", descriptor = "(Z)Lclient!YZDBYLRM;")
	private Class46 method482() {
		try {
			@Pc(3) int local3 = -1;
			if (this.anInt705 != -1) {
				@Pc(21) Class38 local21 = Class38.aClass38Array1[this.anInt705];
				@Pc(24) int local24 = local21.anInt677;
				@Pc(27) int local27 = local21.anInt678;
				@Pc(30) int local30 = local21.anInt679;
				@Pc(36) int local36 = client.anIntArray265[local30 - local27];
				local3 = aClient3.anIntArray231[local24] >> local27 & local36;
			} else if (this.anInt706 != -1) {
				local3 = aClient3.anIntArray231[this.anInt706];
			}
			return local3 < 0 || local3 >= this.anIntArray150.length || this.anIntArray150[local3] == -1 ? null : Class46.method515(this.anIntArray150[local3]);
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("17301, " + true + ", " + local79.toString());
			throw new RuntimeException();
		}
	}
}
