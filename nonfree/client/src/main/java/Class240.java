import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class240 {

	@OriginalMember(owner = "client!mu", name = "w", descriptor = "I")
	private int anInt6650;

	@OriginalMember(owner = "client!mu", name = "i", descriptor = "Lclient!r;")
	private Class6_Sub2_Sub18 aClass6_Sub2_Sub18_3;

	@OriginalMember(owner = "client!mu", name = "s", descriptor = "Lclient!ka;")
	private Class54 aClass54_2;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "[Z")
	private boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "Lclient!ao;")
	private Class22 aClass22_1;

	@OriginalMember(owner = "client!mu", name = "I", descriptor = "Lclient!it;")
	public Class60_Sub4 aClass60_Sub4_6;

	@OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
	private int anInt6648 = 0;

	@OriginalMember(owner = "client!mu", name = "y", descriptor = "Z")
	private boolean aBoolean499 = false;

	@OriginalMember(owner = "client!mu", name = "H", descriptor = "I")
	private int anInt6659 = -1;

	@OriginalMember(owner = "client!mu", name = "v", descriptor = "Z")
	private boolean aBoolean501 = false;

	@OriginalMember(owner = "client!mu", name = "u", descriptor = "Z")
	private boolean aBoolean498 = false;

	@OriginalMember(owner = "client!mu", name = "A", descriptor = "I")
	private int anInt6662 = 0;

	@OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
	public final int anInt6660;

	@OriginalMember(owner = "client!mu", name = "h", descriptor = "I")
	public final int anInt6647;

	@OriginalMember(owner = "client!mu", name = "o", descriptor = "B")
	private final byte aByte96;

	@OriginalMember(owner = "client!mu", name = "r", descriptor = "Lclient!rfa;")
	private Class60_Sub1 aClass60_Sub1_17;

	@OriginalMember(owner = "client!mu", name = "B", descriptor = "B")
	private final byte aByte95;

	@OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
	public final int anInt6663;

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "Z")
	private final boolean aBoolean500;

	@OriginalMember(owner = "client!mu", name = "t", descriptor = "Lclient!qu;")
	private final Class104 aClass104_9;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!ha;Lclient!fw;IIIILclient!rfa;ZI)V")
	public Class240(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Class125 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class60_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.anInt6660 = arg1.anInt3629;
		this.anInt6647 = arg3;
		this.aBoolean498 = arg8 != -1;
		this.aBoolean501 = arg7;
		this.aByte96 = (byte) arg4;
		this.aClass60_Sub1_17 = arg6;
		this.aByte95 = (byte) arg5;
		this.anInt6663 = arg2;
		this.aBoolean500 = arg0.method6658() && arg1.aBoolean288 && !this.aBoolean501;
		this.aClass104_9 = new Class104_Sub2(arg6, false);
		this.method5917(1, false, arg8);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILclient!ao;)V")
	public void method5911(@OriginalArg(1) Class22 arg0) {
		this.aClass54_2 = null;
		this.aClass22_1 = arg0;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)Z")
	public boolean method5913() {
		return this.aBoolean500;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILclient!ha;ZZB)Lclient!ka;")
	public Class54 method5914(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(11) Class125 local11 = Static290.aClass163_5.method4124(120, this.anInt6660);
		if (local11.anIntArray198 != null) {
			local11 = local11.method3383(Static303.aClass55_2);
		}
		if (local11 == null) {
			this.method5919(4, arg1);
			this.anInt6659 = -1;
			return null;
		}
		if (!this.aBoolean498 && this.anInt6659 != local11.anInt3629) {
			this.method5917(0, true, -1);
			this.aClass54_2 = null;
			this.aBoolean499 = false;
		}
		this.method5921(this.aClass60_Sub1_17);
		if (arg3) {
			arg3 &= !this.aBoolean499 & this.aBoolean500 & Static687.aClass6_Sub44_33.aClass7_Sub3_1.method591() != 0;
		}
		if (arg2 && !arg3) {
			this.anInt6659 = local11.anInt3629;
			return null;
		}
		if (arg3) {
			Static415.method6398(this.aClass6_Sub2_Sub18_3, this.aByte95, this.aClass60_Sub1_17.anInt9048, this.aClass60_Sub1_17.anInt9057, this.aBooleanArray20);
			this.aBoolean499 = false;
		}
		@Pc(128) Class96 local128 = Static555.aClass96Array3[this.aByte95];
		@Pc(149) Class96 local149;
		if (this.aBoolean501) {
			local149 = Static524.aClass96Array2[0];
		} else {
			local149 = this.aByte95 >= 3 ? null : Static555.aClass96Array3[this.aByte95 + 1];
		}
		@Pc(165) Class54 local165 = null;
		if (this.aClass104_9.method9030()) {
			if (arg3) {
				arg0 |= 0x40000;
			}
			local165 = local11.method3376(this.aClass60_Sub1_17.anInt9048, this.anInt6663 == 11 ? 10 : this.anInt6663, local128.method8077(this.aClass60_Sub1_17.anInt9048, this.aClass60_Sub1_17.anInt9057), arg1, this.aClass60_Sub1_17.anInt9057, this.anInt6663 == 11 ? this.anInt6647 + 4 : this.anInt6647, this.aClass22_1, arg0, local128, this.aClass104_9, local149);
			if (local165 == null) {
				this.aBooleanArray20 = null;
				this.aClass6_Sub2_Sub18_3 = null;
				this.anInt6662 = 0;
				this.anInt6648 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray20 == null) {
						this.aBooleanArray20 = new boolean[4];
					}
					this.aClass6_Sub2_Sub18_3 = local165.ba(this.aClass6_Sub2_Sub18_3);
					Static167.method3308(this.aClass6_Sub2_Sub18_3, this.aByte95, this.aClass60_Sub1_17.anInt9048, this.aClass60_Sub1_17.anInt9057, this.aBooleanArray20);
					this.aBoolean499 = true;
				}
				this.anInt6648 = local165.fa();
				this.anInt6662 = local165.ma();
			}
			this.aClass54_2 = null;
		} else if (this.aClass54_2 != null && arg0 == (arg0 & this.aClass54_2.ua()) && this.anInt6659 == local11.anInt3629) {
			local165 = this.aClass54_2;
		} else {
			if (this.aClass54_2 != null) {
				arg0 |= this.aClass54_2.ua();
			}
			@Pc(251) Class252 local251 = local11.method3387(this.anInt6663 == 11 ? 10 : this.anInt6663, arg1, arg3, local128, this.anInt6663 == 11 ? this.anInt6647 + 4 : this.anInt6647, this.aClass60_Sub1_17.anInt9048, this.aClass22_1, local128.method8077(this.aClass60_Sub1_17.anInt9048, this.aClass60_Sub1_17.anInt9057), local149, this.aClass60_Sub1_17.anInt9057, arg0);
			if (local251 == null) {
				this.aClass54_2 = null;
				this.anInt6662 = 0;
				this.aBooleanArray20 = null;
				this.anInt6648 = 0;
				this.aClass6_Sub2_Sub18_3 = null;
			} else {
				local165 = local251.aClass54_3;
				this.aClass54_2 = local251.aClass54_3;
				if (arg3) {
					this.aBooleanArray20 = null;
					this.aClass6_Sub2_Sub18_3 = local251.aClass6_Sub2_Sub18_4;
					Static167.method3308(this.aClass6_Sub2_Sub18_3, this.aByte95, this.aClass60_Sub1_17.anInt9048, this.aClass60_Sub1_17.anInt9057, (boolean[]) null);
					this.aBoolean499 = true;
				}
				this.anInt6648 = local165.fa();
				this.anInt6662 = local165.ma();
			}
		}
		this.anInt6659 = local11.anInt3629;
		return local165;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZI)V")
	public void method5915(@OriginalArg(1) int arg0) {
		this.aBoolean498 = true;
		this.method5917(1, false, arg0);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)I")
	public int method5916(@OriginalArg(0) int arg0) {
		if (arg0 <= 92) {
			this.method5918((Class75) null);
		}
		return this.anInt6662;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIZI)V")
	private void method5917(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2;
		@Pc(17) boolean local17 = false;
		if (arg2 == -1) {
			@Pc(26) Class125 local26 = Static290.aClass163_5.method4124(127, this.anInt6660);
			@Pc(28) Class125 local28 = local26;
			if (local26.anIntArray198 != null) {
				local26 = local26.method3383(Static303.aClass55_2);
			}
			if (local26 == null) {
				return;
			}
			if (local28 == local26) {
				local28 = null;
			}
			if (local26.method3386()) {
				if (arg1 && this.aClass104_9.method9030() && local26.method3389(this.aClass104_9.method9032())) {
					return;
				}
				if (local26.anInt3629 != this.anInt6659) {
					local17 = local26.aBoolean294;
				}
				local7 = local26.method3373();
				if (local26.method3379()) {
					arg0 = 0;
				} else {
					arg0 = 1;
				}
			} else if (local28 != null && local28.method3386()) {
				if (arg1 && this.aClass104_9.method9030() && local28.method3389(this.aClass104_9.method9032())) {
					return;
				}
				if (this.anInt6659 != local26.anInt3629) {
					local17 = local28.aBoolean294;
				}
				local7 = local28.method3373();
				if (local28.method3379()) {
					arg0 = 0;
				} else {
					arg0 = 1;
				}
			}
		}
		if (local7 == -1) {
			this.aClass104_9.method9040();
		} else {
			this.aClass104_9.method9042(local7, arg0, local17, 0);
			this.aBoolean499 = false;
			this.anInt6650 = Static141.anInt8737;
			this.aClass54_2 = null;
		}
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(ILclient!ha;)V")
	public void method5918(@OriginalArg(1) Class75 arg0) {
		this.method5914(262144, arg0, true, true);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILclient!ha;)V")
	public void method5919(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1) {
		if (this.aClass6_Sub2_Sub18_3 != null) {
			Static415.method6398(this.aClass6_Sub2_Sub18_3, this.aByte95, this.aClass60_Sub1_17.anInt9048, this.aClass60_Sub1_17.anInt9057, this.aBooleanArray20);
			this.aBooleanArray20 = null;
			this.aClass6_Sub2_Sub18_3 = null;
		}
		if (arg0 != 4) {
			this.aClass60_Sub1_17 = null;
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILclient!ka;IIILclient!ha;ZILclient!qa;)V")
	public void method5920(@OriginalArg(0) int arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class75 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class109 arg7) {
		@Pc(6) Class216[] local6 = arg1.method7408();
		@Pc(9) Class173[] local9 = arg1.method7409();
		if ((this.aClass60_Sub4_6 == null || this.aClass60_Sub4_6.aBoolean376) && (local6 != null || local9 != null)) {
			@Pc(32) Class125 local32 = Static290.aClass163_5.method4124(126, this.anInt6660);
			if (local32.anIntArray198 != null) {
				local32 = local32.method3383(Static303.aClass55_2);
			}
			if (local32 != null) {
				this.aClass60_Sub4_6 = Static267.method4553(Static141.anInt8737, true);
			}
		}
		if (this.aClass60_Sub4_6 == null) {
			return;
		}
		arg1.method7410(arg7);
		if (arg5) {
			this.aClass60_Sub4_6.method4548(arg4, (long) Static141.anInt8737, local6, local9);
		} else {
			this.aClass60_Sub4_6.method4546((long) Static141.anInt8737);
		}
		this.aClass60_Sub4_6.method4547(this.aByte96, arg2, arg0, arg6, arg3);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLclient!rfa;)V")
	private void method5921(@OriginalArg(1) Class60_Sub1 arg0) {
		if (!this.aClass104_9.method9030()) {
			this.method5917(0, false, -1);
		} else if (this.aClass104_9.method9039(Static141.anInt8737 - this.anInt6650)) {
			if (Static687.aClass6_Sub44_33.aClass7_Sub3_1.method591() == 2) {
				this.aBoolean499 = false;
			}
			if (this.aClass104_9.method9038()) {
				this.aClass104_9.method9035(-1);
				this.aBoolean498 = false;
				this.method5917(0, false, -1);
			}
		}
		this.anInt6650 = Static141.anInt8737;
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)I")
	public int method5922() {
		return this.anInt6648;
	}

	@OriginalMember(owner = "client!mu", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass60_Sub4_6 != null) {
			this.aClass60_Sub4_6.method4543();
		}
	}
}
