import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DROEXFTE")
public final class Class3_Sub1_Sub1_Sub3 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!DROEXFTE", name = "q", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!DROEXFTE", name = "B", descriptor = "B")
	private byte aByte3 = 6;

	@OriginalMember(owner = "client!DROEXFTE", name = "n", descriptor = "I")
	private int anInt182;

	@OriginalMember(owner = "client!DROEXFTE", name = "o", descriptor = "I")
	private int anInt183;

	@OriginalMember(owner = "client!DROEXFTE", name = "p", descriptor = "I")
	private int anInt184;

	@OriginalMember(owner = "client!DROEXFTE", name = "t", descriptor = "I")
	private int anInt186;

	@OriginalMember(owner = "client!DROEXFTE", name = "u", descriptor = "I")
	private int anInt187;

	@OriginalMember(owner = "client!DROEXFTE", name = "v", descriptor = "I")
	private int anInt188;

	@OriginalMember(owner = "client!DROEXFTE", name = "w", descriptor = "I")
	private int anInt189;

	@OriginalMember(owner = "client!DROEXFTE", name = "r", descriptor = "Lclient!UVDKTGZK;")
	private Class38 aClass38_1;

	@OriginalMember(owner = "client!DROEXFTE", name = "A", descriptor = "I")
	private int anInt192;

	@OriginalMember(owner = "client!DROEXFTE", name = "s", descriptor = "I")
	private int anInt185;

	@OriginalMember(owner = "client!DROEXFTE", name = "x", descriptor = "I")
	private int anInt190;

	@OriginalMember(owner = "client!DROEXFTE", name = "y", descriptor = "I")
	private int anInt191;

	@OriginalMember(owner = "client!DROEXFTE", name = "z", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!DROEXFTE", name = "<init>", descriptor = "(ZIIBIIIIII)V")
	public Class3_Sub1_Sub1_Sub3(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt182 = arg2;
			if (arg3 != this.aByte3) {
				for (@Pc(13) int local13 = 1; local13 > 0; local13++) {
				}
			}
			this.anInt183 = arg4;
			this.anInt184 = arg1;
			this.anInt186 = arg5;
			this.anInt187 = arg6;
			this.anInt188 = arg7;
			this.anInt189 = arg9;
			if (arg8 != -1) {
				this.aClass38_1 = Class38.aClass38Array1[arg8];
				this.anInt192 = 0;
				this.anInt185 = client.anInt1000;
				if (arg0 && this.aClass38_1.anInt708 != -1) {
					this.anInt192 = (int) (Math.random() * (double) this.aClass38_1.anInt707);
					this.anInt185 -= (int) (Math.random() * (double) this.aClass38_1.method525((byte) 5, this.anInt192));
				}
			}
			@Pc(85) Class19 local85 = Class19.method182(this.anInt182);
			this.anInt190 = local85.anInt387;
			this.anInt191 = local85.anInt384;
			this.anIntArray87 = local85.anIntArray124;
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("69191, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DROEXFTE", name = "a", descriptor = "(I)Lclient!CADBNSXE;")
	@Override
	protected Class3_Sub1_Sub1_Sub1 method562(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass38_1 != null) {
				@Pc(11) int local11 = client.anInt1000 - this.anInt185;
				if (local11 > 100 && this.aClass38_1.anInt708 > 0) {
					local11 = 100;
				}
				label47: {
					do {
						do {
							if (local11 <= this.aClass38_1.method525((byte) 5, this.anInt192)) {
								break label47;
							}
							local11 -= this.aClass38_1.method525((byte) 5, this.anInt192);
							this.anInt192++;
						} while (this.anInt192 < this.aClass38_1.anInt707);
						this.anInt192 -= this.aClass38_1.anInt708;
					} while (this.anInt192 >= 0 && this.anInt192 < this.aClass38_1.anInt707);
					this.aClass38_1 = null;
				}
				this.anInt185 = client.anInt1000 - local11;
				if (this.aClass38_1 != null) {
					local3 = this.aClass38_1.anIntArray191[this.anInt192];
				}
			}
			@Pc(95) Class19 local95;
			if (this.anIntArray87 == null) {
				local95 = Class19.method182(this.anInt182);
			} else {
				local95 = this.method100();
			}
			if (local95 == null) {
				return null;
			}
			@Pc(121) Class3_Sub1_Sub1_Sub1 local121 = local95.method183(this.anInt183, this.anInt184, this.anInt186, this.anInt187, this.anInt188, this.anInt189, local3);
			if (arg0 >= 0) {
				throw new NullPointerException();
			}
			return local121;
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("88827, " + arg0 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DROEXFTE", name = "a", descriptor = "(B)Lclient!LYSBQDHB;")
	private Class19 method100() {
		try {
			@Pc(8) int local8 = -1;
			if (this.anInt190 != -1) {
				@Pc(17) Class41 local17 = Class41.aClass41Array1[this.anInt190];
				@Pc(20) int local20 = local17.anInt750;
				@Pc(23) int local23 = local17.anInt751;
				@Pc(26) int local26 = local17.anInt752;
				@Pc(32) int local32 = client.anIntArray213[local26 - local23];
				local8 = aClient1.anIntArray232[local20] >> local23 & local32;
			} else if (this.anInt191 != -1) {
				local8 = aClient1.anIntArray232[this.anInt191];
			}
			return local8 < 0 || local8 >= this.anIntArray87.length || this.anIntArray87[local8] == -1 ? null : Class19.method182(this.anIntArray87[local8]);
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("85083, " + -41 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}
}
