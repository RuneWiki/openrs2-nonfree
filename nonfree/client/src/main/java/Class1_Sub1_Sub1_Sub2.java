import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!INFJTSRJ")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!INFJTSRJ", name = "r", descriptor = "Lclient!client;")
	public static client aClient2;

	@OriginalMember(owner = "client!INFJTSRJ", name = "k", descriptor = "I")
	private int anInt155 = -43582;

	@OriginalMember(owner = "client!INFJTSRJ", name = "t", descriptor = "I")
	private int anInt162;

	@OriginalMember(owner = "client!INFJTSRJ", name = "u", descriptor = "I")
	private int anInt163;

	@OriginalMember(owner = "client!INFJTSRJ", name = "v", descriptor = "I")
	private int anInt164;

	@OriginalMember(owner = "client!INFJTSRJ", name = "l", descriptor = "I")
	private int anInt156;

	@OriginalMember(owner = "client!INFJTSRJ", name = "m", descriptor = "I")
	private int anInt157;

	@OriginalMember(owner = "client!INFJTSRJ", name = "n", descriptor = "I")
	private int anInt158;

	@OriginalMember(owner = "client!INFJTSRJ", name = "o", descriptor = "I")
	private int anInt159;

	@OriginalMember(owner = "client!INFJTSRJ", name = "s", descriptor = "Lclient!KMWMLVIH;")
	private Class19 aClass19_1;

	@OriginalMember(owner = "client!INFJTSRJ", name = "q", descriptor = "I")
	private int anInt161;

	@OriginalMember(owner = "client!INFJTSRJ", name = "p", descriptor = "I")
	private int anInt160;

	@OriginalMember(owner = "client!INFJTSRJ", name = "x", descriptor = "I")
	private int anInt165;

	@OriginalMember(owner = "client!INFJTSRJ", name = "y", descriptor = "I")
	private int anInt166;

	@OriginalMember(owner = "client!INFJTSRJ", name = "w", descriptor = "[I")
	private int[] anIntArray52;

	@OriginalMember(owner = "client!INFJTSRJ", name = "<init>", descriptor = "(IIIIIIIZII)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			this.anInt162 = arg2;
			this.anInt163 = arg5;
			this.anInt164 = arg6;
			this.anInt156 = arg8;
			this.anInt157 = arg1;
			this.anInt158 = arg0;
			this.anInt159 = arg9;
			if (arg3 != -1) {
				this.aClass19_1 = Class19.aClass19Array1[arg3];
				this.anInt161 = 0;
				this.anInt160 = client.anInt953;
				if (arg7 && this.aClass19_1.anInt212 != -1) {
					this.anInt161 = (int) (Math.random() * (double) this.aClass19_1.anInt211);
					this.anInt160 -= (int) (Math.random() * (double) this.aClass19_1.method193(this.anInt161));
				}
			}
			@Pc(81) Class32 local81 = Class32.method345(this.anInt162);
			this.anInt165 = local81.anInt544;
			this.anInt166 = local81.anInt542;
			this.anIntArray52 = local81.anIntArray154;
		} catch (@Pc(95) RuntimeException local95) {
			signlink.reporterror("25231, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local95.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!INFJTSRJ", name = "a", descriptor = "(I)Lclient!PXRGLLGB;")
	private Class32 method135() {
		try {
			@Pc(3) int local3 = -1;
			if (this.anInt165 != -1) {
				@Pc(22) Class9 local22 = Class9.aClass9Array1[this.anInt165];
				@Pc(25) int local25 = local22.anInt88;
				@Pc(28) int local28 = local22.anInt89;
				@Pc(31) int local31 = local22.anInt90;
				@Pc(37) int local37 = client.anIntArray236[local31 - local28];
				local3 = aClient2.anIntArray231[local25] >> local28 & local37;
			} else if (this.anInt166 != -1) {
				local3 = aClient2.anIntArray231[this.anInt166];
			}
			return local3 < 0 || local3 >= this.anIntArray52.length || this.anIntArray52[local3] == -1 ? null : Class32.method345(this.anIntArray52[local3]);
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("3624, " + 38796 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!INFJTSRJ", name = "a", descriptor = "(Z)Lclient!IYSWJGDE;")
	@Override
	protected Class1_Sub1_Sub1_Sub3 method513() {
		try {
			@Pc(8) int local8 = -1;
			if (this.aClass19_1 != null) {
				@Pc(16) int local16 = client.anInt953 - this.anInt160;
				if (local16 > 100 && this.aClass19_1.anInt212 > 0) {
					local16 = 100;
				}
				label43: {
					do {
						do {
							if (local16 <= this.aClass19_1.method193(this.anInt161)) {
								break label43;
							}
							local16 -= this.aClass19_1.method193(this.anInt161);
							this.anInt161++;
						} while (this.anInt161 < this.aClass19_1.anInt211);
						this.anInt161 -= this.aClass19_1.anInt212;
					} while (this.anInt161 >= 0 && this.anInt161 < this.aClass19_1.anInt211);
					this.aClass19_1 = null;
				}
				this.anInt160 = client.anInt953 - local16;
				if (this.aClass19_1 != null) {
					local8 = this.aClass19_1.anIntArray99[this.anInt161];
				}
			}
			@Pc(100) Class32 local100;
			if (this.anIntArray52 == null) {
				local100 = Class32.method345(this.anInt162);
			} else {
				local100 = this.method135();
			}
			return local100 == null ? null : local100.method342(this.anInt163, this.anInt164, this.anInt156, this.anInt157, this.anInt158, this.anInt159, local8);
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("56247, " + true + ", " + local129.toString());
			throw new RuntimeException();
		}
	}
}
