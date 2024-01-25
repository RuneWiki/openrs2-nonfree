import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sfa")
public final class Class4_Sub1_Sub2_Sub5 extends Class4_Sub1_Sub2 {

	@OriginalMember(owner = "client!sfa", name = "Q", descriptor = "Lclient!ta;")
	private Class4_Sub10 aClass4_Sub10_8;

	@OriginalMember(owner = "client!sfa", name = "L", descriptor = "I")
	private final int anInt8930 = -1;

	@OriginalMember(owner = "client!sfa", name = "J", descriptor = "I")
	private int anInt8928 = 0;

	@OriginalMember(owner = "client!sfa", name = "fb", descriptor = "Z")
	private boolean aBoolean641 = true;

	@OriginalMember(owner = "client!sfa", name = "N", descriptor = "Z")
	public boolean aBoolean640 = false;

	@OriginalMember(owner = "client!sfa", name = "W", descriptor = "I")
	private int anInt8938 = 0;

	@OriginalMember(owner = "client!sfa", name = "gb", descriptor = "I")
	private int anInt8947 = 0;

	@OriginalMember(owner = "client!sfa", name = "hb", descriptor = "I")
	private int anInt8948 = 0;

	@OriginalMember(owner = "client!sfa", name = "H", descriptor = "I")
	private int anInt8926 = 0;

	@OriginalMember(owner = "client!sfa", name = "P", descriptor = "I")
	public final int anInt8932;

	@OriginalMember(owner = "client!sfa", name = "eb", descriptor = "I")
	private final int anInt8946;

	@OriginalMember(owner = "client!sfa", name = "ib", descriptor = "Lclient!vo;")
	private Class361 aClass361_3;

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class4_Sub1_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt8932 = arg1 + arg2;
		this.anInt8946 = arg0;
		this.anInt8928 = arg12;
		@Pc(53) Class145 local53 = Static275.aClass68_2.method2087(this.anInt8946);
		@Pc(56) int local56 = local53.anInt4224;
		if (local56 == -1) {
			this.aBoolean640 = true;
		} else {
			this.aClass361_3 = Static115.aClass227_1.method5968(local56);
			this.aBoolean640 = false;
		}
		if (this.anInt8932 == arg2) {
			Static74.method1765(this.anInt8926, this.aClass361_3, this);
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)V")
	public void method7710() {
		if (this.aClass4_Sub10_8 != null) {
			this.aClass4_Sub10_8.method7847();
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method7704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ILclient!jw;Lclient!ha;BIZI)V")
	@Override
	public void method7696(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sfa", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7690() {
		return false;
	}

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "(BLclient!ha;)Lclient!ro;")
	@Override
	public Class297 method7700(@OriginalArg(1) Class5 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "(BLclient!ha;)V")
	@Override
	public void method7699(@OriginalArg(1) Class5 arg0) {
		@Pc(20) Class17 local20 = this.method7712(this.anInt8946, arg0, 0);
		if (local20 != null) {
			@Pc(25) Class39 local25 = arg0.method7546();
			local25.method7240(super.anInt8916, super.anInt8915, super.anInt8911);
			this.method7713(local20, local25, arg0);
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(II)V")
	public void method7711(@OriginalArg(0) int arg0) {
		if (this.aBoolean640) {
			return;
		}
		this.anInt8938 += arg0;
		while (this.anInt8938 > this.aClass361_3.anIntArray642[this.anInt8926]) {
			this.anInt8938 -= this.aClass361_3.anIntArray642[this.anInt8926];
			this.anInt8926++;
			if (this.anInt8926 >= this.aClass361_3.anIntArray638.length) {
				this.aBoolean640 = true;
				break;
			}
		}
		if (!this.aBoolean640) {
			Static74.method1765(this.anInt8926, this.aClass361_3, this);
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(BLclient!ha;)Lclient!qs;")
	@Override
	public Class4_Sub8 method7692(@OriginalArg(1) Class5 arg0) {
		@Pc(20) Class17 local20 = this.method7712(this.anInt8946, arg0, (this.anInt8928 == 0 ? 0 : 5) | 0x800);
		if (local20 == null) {
			return null;
		}
		if (this.anInt8928 != 0) {
			local20.a(this.anInt8928 * 2048);
		}
		@Pc(45) Class39 local45 = arg0.method7546();
		local45.method7240(super.anInt8916, super.anInt8915, super.anInt8911);
		this.method7713(local20, local45, arg0);
		@Pc(64) Class4_Sub8 local64 = Static271.method4457(false, 1);
		if (Static279.aBoolean329) {
			local20.method5413(local45, local64.aClass4_Sub5Array1[0], Static401.anInt7417, 0);
		} else {
			local20.method5411(local45, local64.aClass4_Sub5Array1[0], 0);
		}
		if (this.aClass4_Sub10_8 != null) {
			@Pc(92) Class85 local92 = this.aClass4_Sub10_8.method7850();
			if (Static279.aBoolean329) {
				arg0.method7551(local92, Static401.anInt7417);
			} else {
				arg0.method7538(local92);
			}
		}
		this.aBoolean641 = local20.F();
		this.anInt8947 = local20.fa();
		this.anInt8948 = local20.ma();
		return local64;
	}

	@OriginalMember(owner = "client!sfa", name = "g", descriptor = "(I)I")
	@Override
	public int method7703() {
		return this.anInt8947;
	}

	@OriginalMember(owner = "client!sfa", name = "d", descriptor = "(B)I")
	@Override
	public int method7689(@OriginalArg(0) byte arg0) {
		return arg0 >= -4 ? 108 : this.anInt8948;
	}

	@OriginalMember(owner = "client!sfa", name = "e", descriptor = "(I)V")
	@Override
	public void method7697() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IILclient!ha;I)Lclient!ka;")
	private Class17 method7712(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class145 local10 = Static275.aClass68_2.method2087(arg0);
		@Pc(23) Class51 local23 = Static559.aClass51Array4[super.aByte123];
		@Pc(38) Class51 local38 = super.aByte124 >= 3 ? null : Static559.aClass51Array4[super.aByte124 + 1];
		return this.aBoolean640 ? local10.method3712(Static115.aClass227_1, -1, super.anInt8911, arg1, super.anInt8915, local23, super.anInt8916, arg2, local38, 0, -1) : local10.method3712(Static115.aClass227_1, this.anInt8930, super.anInt8911, arg1, super.anInt8915, local23, super.anInt8916, arg2, local38, this.anInt8938, this.anInt8926);
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ILclient!ka;Lclient!sk;Lclient!ha;)V")
	private void method7713(@OriginalArg(1) Class17 arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) Class5 arg2) {
		arg0.method5425(arg1);
		@Pc(9) Class284[] local9 = arg0.method5417();
		@Pc(17) Class353[] local17 = arg0.method5415();
		if ((this.aClass4_Sub10_8 == null || this.aClass4_Sub10_8.aBoolean651) && (local9 != null || local17 != null)) {
			this.aClass4_Sub10_8 = Static536.method7851(Static101.anInt2262, true);
		}
		if (this.aClass4_Sub10_8 != null) {
			this.aClass4_Sub10_8.method7849(arg2, (long) Static101.anInt2262, local9, local17);
			this.aClass4_Sub10_8.method7853(super.aByte123, super.aShort118, super.aShort117, super.aShort116, super.aShort119);
		}
	}

	@OriginalMember(owner = "client!sfa", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7702() {
		return this.aBoolean641;
	}

	@OriginalMember(owner = "client!sfa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass4_Sub10_8 != null) {
			this.aClass4_Sub10_8.method7847();
		}
	}

	@OriginalMember(owner = "client!sfa", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7693() {
		return false;
	}
}
