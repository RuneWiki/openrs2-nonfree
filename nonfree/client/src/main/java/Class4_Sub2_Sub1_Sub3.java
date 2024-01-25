import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qga")
public final class Class4_Sub2_Sub1_Sub3 extends Class4_Sub2_Sub1 {

	@OriginalMember(owner = "client!qga", name = "Bb", descriptor = "D")
	private double aDouble43;

	@OriginalMember(owner = "client!qga", name = "Db", descriptor = "D")
	private double aDouble44;

	@OriginalMember(owner = "client!qga", name = "ub", descriptor = "D")
	private double aDouble45;

	@OriginalMember(owner = "client!qga", name = "T", descriptor = "I")
	private int anInt8205;

	@OriginalMember(owner = "client!qga", name = "N", descriptor = "I")
	private int anInt8210;

	@OriginalMember(owner = "client!qga", name = "U", descriptor = "D")
	private double aDouble46;

	@OriginalMember(owner = "client!qga", name = "Nb", descriptor = "D")
	private double aDouble47;

	@OriginalMember(owner = "client!qga", name = "Cb", descriptor = "D")
	private double aDouble48;

	@OriginalMember(owner = "client!qga", name = "jb", descriptor = "Lclient!hv;")
	private Class4_Sub7 aClass4_Sub7_6;

	@OriginalMember(owner = "client!qga", name = "P", descriptor = "D")
	private double aDouble49;

	@OriginalMember(owner = "client!qga", name = "xb", descriptor = "D")
	private double aDouble50;

	@OriginalMember(owner = "client!qga", name = "ob", descriptor = "I")
	private int anInt8199 = 0;

	@OriginalMember(owner = "client!qga", name = "O", descriptor = "I")
	private int anInt8201 = 0;

	@OriginalMember(owner = "client!qga", name = "qb", descriptor = "Z")
	private boolean aBoolean710 = false;

	@OriginalMember(owner = "client!qga", name = "wb", descriptor = "Z")
	private boolean aBoolean712 = false;

	@OriginalMember(owner = "client!qga", name = "yb", descriptor = "I")
	private final int anInt8187;

	@OriginalMember(owner = "client!qga", name = "Q", descriptor = "I")
	private final int anInt8223;

	@OriginalMember(owner = "client!qga", name = "gb", descriptor = "I")
	private final int anInt8188;

	@OriginalMember(owner = "client!qga", name = "tb", descriptor = "I")
	private final int anInt8206;

	@OriginalMember(owner = "client!qga", name = "lb", descriptor = "I")
	private final int lb;

	@OriginalMember(owner = "client!qga", name = "V", descriptor = "Z")
	private final boolean aBoolean711;

	@OriginalMember(owner = "client!qga", name = "Lb", descriptor = "I")
	public final int anInt8198;

	@OriginalMember(owner = "client!qga", name = "S", descriptor = "I")
	public final int anInt8220;

	@OriginalMember(owner = "client!qga", name = "kb", descriptor = "I")
	public final int anInt8189;

	@OriginalMember(owner = "client!qga", name = "pb", descriptor = "I")
	public final int anInt8209;

	@OriginalMember(owner = "client!qga", name = "K", descriptor = "I")
	private final int anInt8218;

	@OriginalMember(owner = "client!qga", name = "Ib", descriptor = "Lclient!cb;")
	private final Class53 aClass53_9;

	@OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class4_Sub2_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static324.method4554(arg1, arg3, arg4) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.aBoolean712 = false;
		this.anInt8187 = arg14;
		this.anInt8223 = arg10;
		this.anInt8188 = arg8;
		this.anInt8206 = arg0;
		this.lb = arg9;
		this.aBoolean711 = arg13;
		this.anInt8198 = arg7;
		this.anInt8220 = arg12;
		this.anInt8189 = arg6;
		this.anInt8209 = arg11;
		this.anInt8218 = arg5;
		@Pc(82) int local82 = Static119.aClass209_1.method4570(this.anInt8206).anInt9356;
		this.aClass53_9 = new Class53_Sub1(this, false);
		this.aClass53_9.method4089(local82);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V")
	public void method7305() {
		if (this.aClass4_Sub7_6 != null) {
			this.aClass4_Sub7_6.method3637();
		}
	}

	@OriginalMember(owner = "client!qga", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8968() {
		return false;
	}

	@OriginalMember(owner = "client!qga", name = "c", descriptor = "(Z)V")
	@Override
	public void method8973() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8980(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 != -11191) {
			Static515.method7314((byte) 32, -50);
		}
		return false;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lclient!ka;Lclient!gw;Lclient!ha;I)V")
	private void method7306(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) Class145 arg2) {
		arg0.method5750(arg1);
		@Pc(9) Class364[] local9 = arg0.method5753();
		@Pc(12) Class363[] local12 = arg0.method5745();
		if ((this.aClass4_Sub7_6 == null || this.aClass4_Sub7_6.aBoolean355) && (local9 != null || local12 != null)) {
			this.aClass4_Sub7_6 = Static256.method3629(Static528.anInt8386, true);
		}
		if (this.aClass4_Sub7_6 != null) {
			this.aClass4_Sub7_6.method3627(arg2, (long) Static528.anInt8386, local9, local12);
			this.aClass4_Sub7_6.method3628(super.aByte133, super.aShort130, super.aShort128, super.aShort127, super.aShort129);
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lclient!tl;ILclient!ha;IZIB)V")
	@Override
	public void method8967(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		if (arg6 != 89) {
			Static515.method7315(-77, 61, -63, -39, 32, 6, true);
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qga", name = "i", descriptor = "(I)V")
	@Override
	public void method8985() {
		super.aShort130 = super.aShort128 = (short) (int) (this.aDouble46 / 512.0D);
		super.aShort127 = super.aShort129 = (short) (int) (this.aDouble47 / 512.0D);
	}

	@OriginalMember(owner = "client!qga", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method8970() {
		return false;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIIII)V")
	public void method7309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) double local8;
		if (!this.aBoolean712) {
			local8 = (double) (arg0 - super.anInt10229);
			@Pc(14) double local14 = (double) (arg1 - super.anInt10228);
			@Pc(23) double local23 = Math.sqrt(local8 * local8 + local14 * local14);
			this.aDouble47 = (double) super.anInt10228 + (double) this.lb * local14 / local23;
			this.aDouble46 = local8 * (double) this.lb / local23 + (double) super.anInt10229;
			if (this.aBoolean711) {
				this.aDouble50 = (double) (Static324.method4554(super.aByte133, (int) this.aDouble46, (int) this.aDouble47) - this.anInt8218);
			} else {
				this.aDouble50 = (double) super.anInt10234;
			}
		}
		local8 = (double) (this.anInt8198 + 1 - arg4);
		this.aDouble49 = ((double) arg1 - this.aDouble47) / local8;
		this.aDouble48 = ((double) arg0 - this.aDouble46) / local8;
		this.aDouble43 = Math.sqrt(this.aDouble49 * this.aDouble49 + this.aDouble48 * this.aDouble48);
		if (arg2 != 3) {
			this.method8971((Class145) null);
		}
		if (this.anInt8188 == -1) {
			this.aDouble44 = ((double) arg3 - this.aDouble50) / local8;
		} else {
			if (!this.aBoolean712) {
				this.aDouble44 = -this.aDouble43 * Math.tan((double) this.anInt8188 * 0.02454369D);
			}
			this.aDouble45 = ((double) arg3 - this.aDouble50 - this.aDouble44 * local8) * 2.0D / (local8 * local8);
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lclient!ha;B)Lclient!iaa;")
	@Override
	public Class4_Sub8 method8966(@OriginalArg(0) Class145 arg0) {
		@Pc(18) Class45 local18 = this.method7312(arg0, 2048);
		if (local18 == null) {
			return null;
		}
		@Pc(26) Class86 local26 = arg0.method9699();
		local26.method7025(this.anInt8210);
		local26.method7034(this.anInt8205);
		local26.method7020((int) this.aDouble46, (int) this.aDouble50, (int) this.aDouble47);
		this.method7306(local18, local26, arg0);
		@Pc(56) Class4_Sub8 local56 = Static118.method1730(1, false);
		if (Static591.aBoolean812) {
			local18.method5759(local26, local56.aClass4_Sub6Array1[0], Static96.anInt1733, 0);
		} else {
			local18.method5769(local26, local56.aClass4_Sub6Array1[0], 0);
		}
		if (this.aClass4_Sub7_6 != null) {
			@Pc(88) Class236 local88 = this.aClass4_Sub7_6.method3640();
			if (Static591.aBoolean812) {
				arg0.method9690(local88, Static96.anInt1733);
			} else {
				arg0.method9666(local88);
			}
		}
		this.aBoolean710 = local18.F();
		this.anInt8199 = local18.fa();
		this.anInt8201 = local18.ma();
		return local56;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(II)V")
	public void method7310(@OriginalArg(0) int arg0) {
		this.aBoolean712 = true;
		this.aDouble46 += this.aDouble48 * (double) arg0;
		this.aDouble47 += (double) arg0 * this.aDouble49;
		if (this.aBoolean711) {
			this.aDouble50 = (double) (Static324.method4554(super.aByte133, (int) this.aDouble46, (int) this.aDouble47) - this.anInt8218);
		} else if (this.anInt8188 == -1) {
			this.aDouble50 += (double) arg0 * this.aDouble44;
		} else {
			this.aDouble50 += (double) arg0 * (double) arg0 * 0.5D * this.aDouble45 + this.aDouble44 * (double) arg0;
			this.aDouble44 += this.aDouble45 * (double) arg0;
		}
		this.anInt8205 = (int) (Math.atan2(this.aDouble48, this.aDouble49) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt8210 = (int) (Math.atan2(this.aDouble44, this.aDouble43) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass53_9.method4077(1) && this.aClass53_9.method4098()) {
			this.aClass53_9.method4087();
		}
	}

	@OriginalMember(owner = "client!qga", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass4_Sub7_6 != null) {
			this.aClass4_Sub7_6.method3637();
		}
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8975(@OriginalArg(1) Class145 arg0) {
		@Pc(9) Class45 local9 = this.method7312(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(21) Class86 local21 = arg0.method9699();
		local21.method7025(this.anInt8210);
		local21.method7034(this.anInt8205);
		local21.method7020((int) this.aDouble46, (int) this.aDouble50, (int) this.aDouble47);
		this.anInt8199 = local9.fa();
		this.anInt8201 = local9.ma();
		this.method7306(local9, local21, arg0);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lclient!ha;II)Lclient!ka;")
	private Class45 method7312(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1) {
		@Pc(19) Class347 local19 = Static119.aClass209_1.method4570(this.anInt8206);
		return local19.method8247((byte) 2, arg0, arg1, this.aClass53_9);
	}

	@OriginalMember(owner = "client!qga", name = "j", descriptor = "(I)V")
	public void method7313() {
		if (this.aBoolean712 || this.anInt8223 == 0) {
			return;
		}
		@Pc(24) Class4_Sub2_Sub1_Sub2 local24 = null;
		if (Static166.anInt2884 == 3) {
			local24 = Static199.aClass61Array1[this.anInt8223 - 1].method1238();
		} else {
			@Pc(48) int local48;
			if (this.anInt8223 >= 0) {
				local48 = this.anInt8223 - 1;
				@Pc(55) Class2_Sub49 local55 = (Class2_Sub49) Static467.aClass218_37.method5095((long) local48, 0);
				if (local55 != null) {
					local24 = local55.aClass4_Sub2_Sub1_Sub2_Sub2_3;
				}
			} else {
				local48 = -this.anInt8223 - 1;
				if (Class4_Sub2_Sub1_Sub2.lb == local48) {
					local24 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2;
				} else {
					local24 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local48];
				}
			}
		}
		if (local24 == null) {
			return;
		}
		super.anInt10228 = local24.anInt10228;
		super.anInt10229 = local24.anInt10229;
		super.anInt10234 = Static324.method4554(super.aByte133, local24.anInt10229, local24.anInt10228) - this.anInt8218;
		if (this.anInt8187 < 0) {
			return;
		}
		@Pc(110) Class49 local110 = local24.method2064(-62);
		@Pc(112) int local112 = 0;
		@Pc(114) int local114 = 0;
		if (local110.anIntArrayArray6 != null && local110.anIntArrayArray6[this.anInt8187] != null) {
			local112 = local110.anIntArrayArray6[this.anInt8187][0];
			local114 = local110.anIntArrayArray6[this.anInt8187][2];
		}
		if (local110.anIntArrayArray7 != null && local110.anIntArrayArray7[this.anInt8187] != null) {
			local112 += local110.anIntArrayArray7[this.anInt8187][0];
			local114 += local110.anIntArrayArray7[this.anInt8187][2];
		}
		if (local112 != 0 || local114 != 0) {
			@Pc(190) int local190 = local24.aClass178_7.method3799();
			@Pc(192) int local192 = local190;
			if (local24.anIntArray181 != null && local24.anIntArray181[this.anInt8187] != -1) {
				local192 = local24.anIntArray181[this.anInt8187];
			}
			@Pc(218) int local218 = local192 - local190 & 0x3FFF;
			@Pc(222) int local222 = Class145_Sub1.anIntArray761[local218];
			@Pc(226) int local226 = Class145_Sub1.anIntArray760[local218];
			@Pc(236) int local236 = local222 * local114 + local226 * local112 >> 14;
			local114 = local226 * local114 - local112 * local222 >> 14;
			super.anInt10229 += local236;
			super.anInt10228 += local114;
		}
		return;
	}

	@OriginalMember(owner = "client!qga", name = "d", descriptor = "(I)I")
	@Override
	public int method8977(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.aBoolean710 = false;
		}
		return this.anInt8199;
	}

	@OriginalMember(owner = "client!qga", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8976() {
		return this.aBoolean710;
	}

	@OriginalMember(owner = "client!qga", name = "g", descriptor = "(I)I")
	@Override
	protected int method8978() {
		this.anInt8201 = 32;
		return this.anInt8201;
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(Lclient!ha;Z)Lclient!it;")
	@Override
	public Class187 method8971(@OriginalArg(0) Class145 arg0) {
		return null;
	}
}
