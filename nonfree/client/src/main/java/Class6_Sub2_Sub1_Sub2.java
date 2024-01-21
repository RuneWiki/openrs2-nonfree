import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JBYEFPCA")
public final class Class6_Sub2_Sub1_Sub2 extends Class6_Sub2_Sub1 {

	@OriginalMember(owner = "client!JBYEFPCA", name = "q", descriptor = "Lclient!client;")
	public static client aClient3;

	@OriginalMember(owner = "client!JBYEFPCA", name = "y", descriptor = "I")
	private int anInt205 = 3;

	@OriginalMember(owner = "client!JBYEFPCA", name = "z", descriptor = "Z")
	private boolean aBoolean77 = true;

	@OriginalMember(owner = "client!JBYEFPCA", name = "l", descriptor = "I")
	private int anInt194;

	@OriginalMember(owner = "client!JBYEFPCA", name = "m", descriptor = "I")
	private int anInt195;

	@OriginalMember(owner = "client!JBYEFPCA", name = "n", descriptor = "I")
	private int anInt196;

	@OriginalMember(owner = "client!JBYEFPCA", name = "r", descriptor = "I")
	private int anInt199;

	@OriginalMember(owner = "client!JBYEFPCA", name = "s", descriptor = "I")
	private int anInt200;

	@OriginalMember(owner = "client!JBYEFPCA", name = "t", descriptor = "I")
	private int anInt201;

	@OriginalMember(owner = "client!JBYEFPCA", name = "u", descriptor = "I")
	private int anInt202;

	@OriginalMember(owner = "client!JBYEFPCA", name = "A", descriptor = "Lclient!RIUJHZLL;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!JBYEFPCA", name = "o", descriptor = "I")
	private int anInt197;

	@OriginalMember(owner = "client!JBYEFPCA", name = "p", descriptor = "I")
	private int anInt198;

	@OriginalMember(owner = "client!JBYEFPCA", name = "v", descriptor = "I")
	private int anInt203;

	@OriginalMember(owner = "client!JBYEFPCA", name = "w", descriptor = "I")
	private int anInt204;

	@OriginalMember(owner = "client!JBYEFPCA", name = "x", descriptor = "[I")
	private int[] anIntArray56;

	@OriginalMember(owner = "client!JBYEFPCA", name = "<init>", descriptor = "(IIIIIIIIZZ)V")
	public Class6_Sub2_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9) {
		try {
			this.anInt194 = arg3;
			this.anInt195 = arg5;
			this.anInt196 = arg6;
			this.anInt199 = arg7;
			this.anInt200 = arg0;
			this.anInt201 = arg4;
			this.anInt202 = arg2;
			if (arg1 != -1) {
				this.aClass33_1 = Class33.aClass33Array1[arg1];
				this.anInt197 = 0;
				this.anInt198 = client.anInt928;
				if (arg9 && this.aClass33_1.anInt559 != -1) {
					this.anInt197 = (int) (Math.random() * (double) this.aClass33_1.anInt558);
					this.anInt198 -= (int) (Math.random() * (double) this.aClass33_1.method371(this.anInt197, this.anInt205));
				}
			}
			@Pc(87) Class2 local87 = Class2.method24(this.anInt194);
			this.anInt203 = local87.anInt31;
			this.anInt204 = local87.anInt34;
			this.anIntArray56 = local87.anIntArray3;
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("16628, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JBYEFPCA", name = "a", descriptor = "(I)Lclient!BQKZHFKO;")
	private Class2 method200() {
		try {
			@Pc(1) int local1 = -1;
			if (this.anInt203 != -1) {
				@Pc(17) Class38 local17 = Class38.aClass38Array1[this.anInt203];
				@Pc(20) int local20 = local17.anInt681;
				@Pc(23) int local23 = local17.anInt682;
				@Pc(26) int local26 = local17.anInt683;
				@Pc(32) int local32 = client.anIntArray228[local26 - local23];
				local1 = aClient3.anIntArray240[local20] >> local23 & local32;
			} else if (this.anInt204 != -1) {
				local1 = aClient3.anIntArray240[this.anInt204];
			}
			return local1 < 0 || local1 >= this.anIntArray56.length || this.anIntArray56[local1] == -1 ? null : Class2.method24(this.anIntArray56[local1]);
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("43945, " + -12201 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JBYEFPCA", name = "a", descriptor = "(Z)Lclient!WEVRTBOZ;")
	@Override
	protected Class6_Sub2_Sub1_Sub6 method482() {
		try {
			@Pc(3) int local3 = -1;
			if (this.aClass33_1 != null) {
				@Pc(17) int local17 = client.anInt928 - this.anInt198;
				if (local17 > 100 && this.aClass33_1.anInt559 > 0) {
					local17 = 100;
				}
				label43: {
					do {
						do {
							if (local17 <= this.aClass33_1.method371(this.anInt197, this.anInt205)) {
								break label43;
							}
							local17 -= this.aClass33_1.method371(this.anInt197, this.anInt205);
							this.anInt197++;
						} while (this.anInt197 < this.aClass33_1.anInt558);
						this.anInt197 -= this.aClass33_1.anInt559;
					} while (this.anInt197 >= 0 && this.anInt197 < this.aClass33_1.anInt558);
					this.aClass33_1 = null;
				}
				this.anInt198 = client.anInt928 - local17;
				if (this.aClass33_1 != null) {
					local3 = this.aClass33_1.anIntArray129[this.anInt197];
				}
			}
			@Pc(103) Class2 local103;
			if (this.anIntArray56 == null) {
				local103 = Class2.method24(this.anInt194);
			} else {
				local103 = this.method200();
			}
			return local103 == null ? null : local103.method20(this.anInt195, this.anInt196, this.anInt199, this.anInt200, this.anInt201, this.anInt202, local3);
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("43774, " + true + ", " + local132.toString());
			throw new RuntimeException();
		}
	}
}
