import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public final class Class25_Sub1_Sub2 extends Class25_Sub1 {

	@OriginalMember(owner = "client!gq", name = "C", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!gq", name = "G", descriptor = "I")
	private int anInt2229;

	@OriginalMember(owner = "client!gq", name = "H", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!gq", name = "J", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!gq", name = "L", descriptor = "Lclient!hn;")
	private Class41_Sub3 aClass41_Sub3_4;

	@OriginalMember(owner = "client!gq", name = "N", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!gq", name = "O", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!gq", name = "P", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!gq", name = "bb", descriptor = "I")
	private int anInt2243;

	@OriginalMember(owner = "client!gq", name = "kb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!gq", name = "pb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!gq", name = "V", descriptor = "I")
	private int anInt2237 = 0;

	@OriginalMember(owner = "client!gq", name = "lb", descriptor = "I")
	private int lb = 0;

	@OriginalMember(owner = "client!gq", name = "ib", descriptor = "Z")
	private boolean aBoolean181 = false;

	@OriginalMember(owner = "client!gq", name = "jb", descriptor = "I")
	private int anInt2250 = -32768;

	@OriginalMember(owner = "client!gq", name = "rb", descriptor = "I")
	private int anInt2255 = -1;

	@OriginalMember(owner = "client!gq", name = "Q", descriptor = "I")
	public final int anInt2233;

	@OriginalMember(owner = "client!gq", name = "ab", descriptor = "I")
	private final int anInt2242;

	@OriginalMember(owner = "client!gq", name = "fb", descriptor = "I")
	public final int anInt2247;

	@OriginalMember(owner = "client!gq", name = "W", descriptor = "I")
	public final int anInt2238;

	@OriginalMember(owner = "client!gq", name = "B", descriptor = "I")
	private final int anInt2226;

	@OriginalMember(owner = "client!gq", name = "nb", descriptor = "I")
	public final int anInt2252;

	@OriginalMember(owner = "client!gq", name = "Z", descriptor = "I")
	private final int anInt2241;

	@OriginalMember(owner = "client!gq", name = "T", descriptor = "Lclient!pp;")
	private final Class185 aClass185_2;

	static {
		new Class169("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class25_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt2233 = arg5;
		this.aBoolean181 = false;
		this.anInt2242 = arg0;
		this.anInt2247 = arg6;
		this.anInt2238 = arg9;
		this.anInt2226 = arg7;
		this.anInt2252 = arg10;
		this.anInt2241 = arg8;
		@Pc(65) int local65 = Static10.aClass246_1.method5429(this.anInt2242).anInt3346;
		if (local65 == -1) {
			this.aClass185_2 = null;
		} else {
			this.aClass185_2 = Static25.aClass67_1.method1227(local65);
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZLclient!tq;Lclient!ns;)V")
	private void method1827(@OriginalArg(1) Class164 arg0, @OriginalArg(2) Class22 arg1) {
		@Pc(6) Class197[] local6 = arg1.method1591();
		@Pc(9) Class12[] local9 = arg1.method1589();
		if ((this.aClass41_Sub3_4 == null || this.aClass41_Sub3_4.aBoolean226) && (local6 != null || local9 != null)) {
			this.aClass41_Sub3_4 = new Class41_Sub3(Static366.anInt5883);
		}
		if (this.aClass41_Sub3_4 != null) {
			this.aClass41_Sub3_4.method2150(arg0, (long) Static366.anInt5883, local6, local9);
			this.aClass41_Sub3_4.method2147(super.aByte70, super.aShort88, super.aShort87, super.aShort89, super.aShort90);
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILclient!tq;)V")
	@Override
	public void method5232(@OriginalArg(1) Class164 arg0) {
		@Pc(9) Class22 local9 = this.method1829(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class127 local15 = arg0.method5378();
		local15.method5269(this.anInt2243);
		local15.method5276(this.anInt2229);
		local15.method5260((int) this.aDouble3, (int) this.aDouble2, (int) this.aDouble8);
		this.anInt2250 = local9.method1561();
		this.method1827(arg0, local9);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILclient!tq;B)Lclient!ns;")
	private Class22 method1829(@OriginalArg(0) int arg0, @OriginalArg(1) Class164 arg1) {
		@Pc(14) Class134 local14 = Static10.aClass246_1.method5429(this.anInt2242);
		return local14.method2734(arg0, arg1, this.lb, this.anInt2255, this.anInt2237, Static25.aClass67_1);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BZLclient!tq;Lclient!hm;III)V")
	@Override
	public void method5235(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class164 arg1, @OriginalArg(3) Class25 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)I")
	@Override
	public int method5239() {
		return this.anInt2250;
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5236() {
		return false;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(Lclient!tq;I)Lclient!cj;")
	@Override
	public Class41_Sub1 method5229(@OriginalArg(0) Class164 arg0) {
		@Pc(9) Class22 local9 = this.method1829(1024, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class127 local16 = arg0.method5378();
		local16.method5269(this.anInt2243);
		local16.method5276(this.anInt2229);
		local16.method5260((int) this.aDouble3, (int) this.aDouble2, (int) this.aDouble8);
		if (this.aClass41_Sub3_4 == null) {
			local9.method1565(local16, null, 0);
		} else {
			@Pc(49) Class108 local49 = this.aClass41_Sub3_4.method2143();
			arg0.method5365(local9, local49, local16, null);
		}
		this.anInt2250 = local9.method1561();
		this.method1827(arg0, local9);
		return null;
	}

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "(I)V")
	@Override
	public void method5241() {
		super.aShort88 = super.aShort87 = (short) (this.aDouble3 / 128.0D);
		super.aShort89 = super.aShort90 = (short) (this.aDouble8 / 128.0D);
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V")
	@Override
	public void method5233() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "(I)V")
	public void method1832() {
		if (this.aClass41_Sub3_4 != null) {
			this.aClass41_Sub3_4.method2140();
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIII)V")
	public void method1833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean181) {
			local13 = arg1 - super.anInt6080;
			@Pc(20) double local20 = (double) (arg3 - super.anInt6077);
			@Pc(29) double local29 = Math.sqrt(local20 * local20 + local13 * local13);
			this.aDouble3 = local13 * (double) this.anInt2241 / local29 + (double) super.anInt6080;
			this.aDouble8 = (double) super.anInt6077 + (double) this.anInt2241 * local20 / local29;
			this.aDouble2 = super.anInt6085;
		}
		local13 = this.anInt2247 + 1 - arg2;
		this.aDouble5 = ((double) arg1 - this.aDouble3) / local13;
		this.aDouble7 = ((double) arg3 - this.aDouble8) / local13;
		this.aDouble6 = Math.sqrt(this.aDouble7 * this.aDouble7 + this.aDouble5 * this.aDouble5);
		if (this.anInt2226 == -1) {
			this.aDouble4 = ((double) arg0 - this.aDouble2) / local13;
		} else {
			if (!this.aBoolean181) {
				this.aDouble4 = -this.aDouble6 * Math.tan((double) this.anInt2226 * 0.02454369D);
			}
			this.aDouble1 = ((double) arg0 - this.aDouble2 - this.aDouble4 * local13) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)V")
	public void method1834(@OriginalArg(1) int arg0) {
		if (this.anInt2226 == -1) {
			this.aDouble2 += this.aDouble4 * (double) arg0;
		} else {
			this.aDouble2 += this.aDouble4 * (double) arg0 + this.aDouble1 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble4 += this.aDouble1 * (double) arg0;
		}
		this.aBoolean181 = true;
		this.aDouble8 += (double) arg0 * this.aDouble7;
		this.aDouble3 += this.aDouble5 * (double) arg0;
		this.anInt2229 = (int) (Math.atan2(this.aDouble5, this.aDouble7) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt2243 = (int) (Math.atan2(this.aDouble4, this.aDouble6) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass185_2 == null) {
			return;
		}
		this.anInt2237 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass185_2.anIntArray582[this.lb] >= this.anInt2237) {
						return;
					}
					this.anInt2237 -= this.aClass185_2.anIntArray582[this.lb];
					this.lb++;
					if (this.lb >= this.aClass185_2.anIntArray579.length) {
						this.lb -= this.aClass185_2.anInt4801;
						if (this.lb < 0 || this.lb >= this.aClass185_2.anIntArray579.length) {
							this.lb = 0;
						}
					}
					this.anInt2255 = this.lb + 1;
				} while (this.anInt2255 < this.aClass185_2.anIntArray579.length);
				this.anInt2255 -= this.aClass185_2.anInt4801;
			} while (this.anInt2255 >= 0 && this.anInt2255 < this.aClass185_2.anIntArray579.length);
			this.anInt2255 = -1;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!tq;III)Z")
	@Override
	public boolean method5234(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!gq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass41_Sub3_4 != null) {
			this.aClass41_Sub3_4.method2140();
		}
	}
}
