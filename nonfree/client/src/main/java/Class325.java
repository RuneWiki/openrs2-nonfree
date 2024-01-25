import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class325 {

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
	private int anInt8772;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "Lclient!r;")
	private Class2_Sub6_Sub9 aClass2_Sub6_Sub9_5;

	@OriginalMember(owner = "client!rl", name = "F", descriptor = "[Z")
	private boolean[] aBooleanArray35;

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "Lclient!ka;")
	private Class45 aClass45_6;

	@OriginalMember(owner = "client!rl", name = "v", descriptor = "Lclient!hv;")
	public Class4_Sub7 aClass4_Sub7_7;

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "Lclient!jr;")
	private Class202 aClass202_2;

	@OriginalMember(owner = "client!rl", name = "B", descriptor = "Z")
	private boolean aBoolean743 = false;

	@OriginalMember(owner = "client!rl", name = "t", descriptor = "Z")
	private boolean aBoolean745 = false;

	@OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
	private int anInt8788 = -1;

	@OriginalMember(owner = "client!rl", name = "u", descriptor = "I")
	private int anInt8773 = 0;

	@OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
	private int anInt8791 = 0;

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "Z")
	private boolean aBoolean746 = false;

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
	public final int anInt8786;

	@OriginalMember(owner = "client!rl", name = "E", descriptor = "B")
	private final byte aByte121;

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
	public final int anInt8783;

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "B")
	private final byte aByte120;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "Lclient!tl;")
	private final Class4_Sub2 aClass4_Sub2_22;

	@OriginalMember(owner = "client!rl", name = "A", descriptor = "I")
	public final int anInt8781;

	@OriginalMember(owner = "client!rl", name = "s", descriptor = "Z")
	private final boolean aBoolean744;

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "Lclient!cb;")
	private final Class53 aClass53_11;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lclient!ha;Lclient!dga;IIIILclient!tl;ZI)V")
	public Class325(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class4_Sub2 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.aBoolean746 = arg7;
		this.anInt8786 = arg3;
		this.aByte121 = (byte) arg5;
		this.anInt8783 = arg1.anInt1860;
		this.aBoolean743 = arg8 != -1;
		this.aByte120 = (byte) arg4;
		this.aClass4_Sub2_22 = arg6;
		this.anInt8781 = arg2;
		this.aBoolean744 = arg0.method9646() && arg1.aBoolean212 && !this.aBoolean746;
		this.aClass53_11 = new Class53_Sub1(arg6, false);
		this.method7773(arg8, 1, false);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ha;I)V")
	public void method7764(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1) {
		this.method7768(true, 262144, true, arg0);
		if (arg1 <= 109) {
			this.method7775();
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)I")
	public int method7765(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.anInt8773 : -1;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!jr;I)V")
	public void method7766(@OriginalArg(0) Class202 arg0) {
		this.aClass202_2 = arg0;
		this.aClass45_6 = null;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZIZZLclient!ha;)Lclient!ka;")
	public Class45 method7768(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class145 arg3) {
		@Pc(17) Class81 local17 = Static148.aClass153_3.method3342(this.anInt8783);
		if (local17.anIntArray143 != null) {
			local17 = local17.method1629(Static166.anInt2884 == 3 ? Static498.anInterface26_3 : Static396.aClass107_1);
		}
		if (local17 == null) {
			this.method7774(arg3);
			this.anInt8788 = -1;
			return null;
		}
		if (!this.aBoolean743 && local17.anInt1860 != this.anInt8788) {
			this.method7773(-1, 0, true);
			this.aBoolean745 = false;
			this.aClass45_6 = null;
		}
		this.method7771(this.aClass4_Sub2_22);
		if (arg2) {
			arg2 &= !this.aBoolean745 & this.aBoolean744 & Static650.aClass2_Sub30_29.aClass11_Sub16_1.method4292() != 0;
		}
		if (arg0 && !arg2) {
			this.anInt8788 = local17.anInt1860;
			return null;
		}
		if (arg2) {
			Static237.method9873(this.aClass2_Sub6_Sub9_5, this.aByte121, this.aClass4_Sub2_22.anInt10229, this.aClass4_Sub2_22.anInt10228, this.aBooleanArray35);
			this.aBoolean745 = false;
		}
		@Pc(151) Class133 local151 = Static158.aClass133Array4[this.aByte121];
		@Pc(158) Class133 local158;
		if (this.aBoolean746) {
			local158 = Static126.aClass133Array1[0];
		} else {
			local158 = this.aByte121 >= 3 ? null : Static158.aClass133Array4[this.aByte121 + 1];
		}
		@Pc(180) Class45 local180 = null;
		if (this.aClass53_11.method4094()) {
			if (arg2) {
				arg1 |= 0x40000;
			}
			local180 = local17.method1633(this.anInt8781 == 11 ? this.anInt8786 + 4 : this.anInt8786, this.anInt8781 == 11 ? 10 : this.anInt8781, local158, local151.method8214(this.aClass4_Sub2_22.anInt10229, this.aClass4_Sub2_22.anInt10228), this.aClass4_Sub2_22.anInt10229, this.aClass53_11, arg3, this.aClass202_2, arg1, this.aClass4_Sub2_22.anInt10228, local151);
			if (local180 == null) {
				this.anInt8791 = 0;
				this.aBooleanArray35 = null;
				this.aClass2_Sub6_Sub9_5 = null;
				this.anInt8773 = 0;
			} else {
				if (arg2) {
					if (this.aBooleanArray35 == null) {
						this.aBooleanArray35 = new boolean[4];
					}
					this.aClass2_Sub6_Sub9_5 = local180.ba(this.aClass2_Sub6_Sub9_5);
					Static628.method8496(this.aClass2_Sub6_Sub9_5, this.aByte121, this.aClass4_Sub2_22.anInt10229, this.aClass4_Sub2_22.anInt10228, this.aBooleanArray35);
					this.aBoolean745 = true;
				}
				this.anInt8791 = local180.fa();
				this.anInt8773 = local180.ma();
			}
			this.aClass45_6 = null;
		} else if (this.aClass45_6 != null && (arg1 & this.aClass45_6.ua()) == arg1 && local17.anInt1860 == this.anInt8788) {
			local180 = this.aClass45_6;
		} else {
			if (this.aClass45_6 != null) {
				arg1 |= this.aClass45_6.ua();
			}
			@Pc(271) Class222 local271 = local17.method1640(arg1, arg2, this.anInt8781 == 11 ? this.anInt8786 + 4 : this.anInt8786, local158, arg3, this.anInt8781 == 11 ? 10 : this.anInt8781, this.aClass4_Sub2_22.anInt10228, this.aClass202_2, local151.method8214(this.aClass4_Sub2_22.anInt10229, this.aClass4_Sub2_22.anInt10228), this.aClass4_Sub2_22.anInt10229, local151);
			if (local271 == null) {
				this.anInt8791 = 0;
				this.aClass2_Sub6_Sub9_5 = null;
				this.aBooleanArray35 = null;
				this.aClass45_6 = null;
				this.anInt8773 = 0;
			} else {
				local180 = local271.aClass45_4;
				this.aClass45_6 = local271.aClass45_4;
				if (arg2) {
					this.aBooleanArray35 = null;
					this.aClass2_Sub6_Sub9_5 = local271.aClass2_Sub6_Sub9_3;
					Static628.method8496(this.aClass2_Sub6_Sub9_5, this.aByte121, this.aClass4_Sub2_22.anInt10229, this.aClass4_Sub2_22.anInt10228, (boolean[]) null);
					this.aBoolean745 = true;
				}
				this.anInt8791 = local180.fa();
				this.anInt8773 = local180.ma();
			}
		}
		this.anInt8788 = local17.anInt1860;
		return local180;
	}

	@OriginalMember(owner = "client!rl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass4_Sub7_7 != null) {
			this.aClass4_Sub7_7.method3637();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ka;IILclient!ha;Lclient!gw;IIIZ)V")
	public void method7769(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class145 arg3, @OriginalArg(4) Class86 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7) {
		@Pc(6) Class364[] local6 = arg0.method5753();
		@Pc(9) Class363[] local9 = arg0.method5745();
		if ((this.aClass4_Sub7_7 == null || this.aClass4_Sub7_7.aBoolean355) && (local6 != null || local9 != null)) {
			@Pc(41) Class81 local41 = Static148.aClass153_3.method3342(this.anInt8783);
			if (local41.anIntArray143 != null) {
				local41 = local41.method1629(Static166.anInt2884 == 3 ? Static498.anInterface26_3 : Static396.aClass107_1);
			}
			if (local41 != null) {
				this.aClass4_Sub7_7 = Static256.method3629(Static528.anInt8386, true);
			}
		}
		if (this.aClass4_Sub7_7 == null) {
			return;
		}
		arg0.method5750(arg4);
		if (arg7) {
			this.aClass4_Sub7_7.method3627(arg3, (long) Static528.anInt8386, local6, local9);
		} else {
			this.aClass4_Sub7_7.method3632((long) Static528.anInt8386);
		}
		this.aClass4_Sub7_7.method3628(this.aByte120, arg5, arg6, arg1, arg2);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!tl;I)V")
	private void method7771(@OriginalArg(0) Class4_Sub2 arg0) {
		if (!this.aClass53_11.method4094()) {
			this.method7773(-1, 0, false);
		} else if (this.aClass53_11.method4077(Static528.anInt8386 - this.anInt8772)) {
			if (Static650.aClass2_Sub30_29.aClass11_Sub16_1.method4292() == 2) {
				this.aBoolean745 = false;
			}
			if (this.aClass53_11.method4098()) {
				this.aClass53_11.method4089(-1);
				this.aBoolean743 = false;
				this.method7773(-1, 0, false);
			}
		}
		this.anInt8772 = Static528.anInt8386;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)V")
	public void method7772(@OriginalArg(1) int arg0) {
		this.aBoolean743 = true;
		this.method7773(arg0, 1, false);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIZ)V")
	private void method7773(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(18) Class81 local18 = Static148.aClass153_3.method3342(this.anInt8783);
			@Pc(20) Class81 local20 = local18;
			if (local18.anIntArray143 != null) {
				local18 = local18.method1629(Static166.anInt2884 == 3 ? Static498.anInterface26_3 : Static396.aClass107_1);
			}
			if (local18 == null) {
				return;
			}
			if (local20 == local18) {
				local20 = null;
			}
			if (local18.method1636()) {
				if (arg2 && this.aClass53_11.method4094() && local18.method1624(this.aClass53_11.method4088())) {
					return;
				}
				if (this.anInt8788 != local18.anInt1860) {
					local9 = local18.aBoolean224;
				}
				local7 = local18.method1628();
				if (local18.method1634()) {
					arg1 = 0;
				} else {
					arg1 = 1;
				}
			} else if (local20 != null && local20.method1636()) {
				if (arg2 && this.aClass53_11.method4094() && local20.method1624(this.aClass53_11.method4088())) {
					return;
				}
				if (local18.anInt1860 != this.anInt8788) {
					local9 = local20.aBoolean224;
				}
				local7 = local20.method1628();
				if (local20.method1634()) {
					arg1 = 0;
				} else {
					arg1 = 1;
				}
			}
		}
		if (local7 == -1) {
			this.aClass53_11.method4091();
		} else {
			this.aClass53_11.method4085(arg1, local9, local7, 0);
			this.anInt8772 = Static528.anInt8386;
			this.aBoolean745 = false;
			this.aClass45_6 = null;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ha;B)V")
	public void method7774(@OriginalArg(0) Class145 arg0) {
		if (this.aClass2_Sub6_Sub9_5 != null) {
			Static237.method9873(this.aClass2_Sub6_Sub9_5, this.aByte121, this.aClass4_Sub2_22.anInt10229, this.aClass4_Sub2_22.anInt10228, this.aBooleanArray35);
			this.aBooleanArray35 = null;
			this.aClass2_Sub6_Sub9_5 = null;
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(Z)Z")
	public boolean method7775() {
		return this.aBoolean744;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)I")
	public int method7776(@OriginalArg(0) int arg0) {
		if (arg0 != 22997) {
			this.aBoolean743 = true;
		}
		return this.anInt8791;
	}
}
