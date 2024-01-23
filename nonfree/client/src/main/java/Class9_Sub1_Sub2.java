import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class9_Sub1_Sub2 extends Class9_Sub1 {

	@OriginalMember(owner = "client!ak", name = "xc", descriptor = "Lclient!g;")
	public Class45 aClass45_1;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass45_1 != null) {
			;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method219() {
		return this.aClass45_1 != null;
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)I")
	@Override
	protected int method211() {
		if (Static68.anInt1404 != 0 && this.aClass45_1.anIntArray154 != null) {
			@Pc(17) Class45 local17 = this.aClass45_1.method1460();
			if (local17 != null && local17.anInt2027 != -1) {
				return local17.anInt2027;
			}
		}
		return super.anInt432;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!g;I)V")
	public void method223(@OriginalArg(0) Class45 arg0) {
		this.aClass45_1 = arg0;
		if (super.aClass96_Sub1_3 != null) {
			super.aClass96_Sub1_3.method2835();
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "()I")
	@Override
	public int method3587() {
		return super.anInt482;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIIIJILclient!nl;)V")
	@Override
	public void method3588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class96_Sub1 arg10) {
		if (this.aClass45_1 == null) {
			return;
		}
		@Pc(21) Class49 local21 = super.anInt443 != -1 && super.anInt399 == 0 ? Static131.method697(super.anInt443) : null;
		@Pc(42) Class49 local42 = super.anInt451 == -1 || super.anInt451 == this.method207().anInt2744 && local21 != null ? null : Static131.method697(super.anInt451);
		@Pc(63) Class9_Sub5 local63 = this.aClass45_1.method1470(super.anInt464, super.anInt407, super.anInt474, super.aClass83Array3, super.anInt450, local42, local21, super.anInt422, super.anInt431);
		if (local63 == null) {
			return;
		}
		super.anInt482 = local63.method3587();
		@Pc(73) Class45 local73 = this.aClass45_1;
		if (local73.anIntArray154 != null) {
			local73 = local73.method1460();
		}
		@Pc(125) Class9_Sub5 local125;
		if (Static19.aBoolean37 && local73.aBoolean119) {
			local125 = Static24.method480(super.aBoolean23, this.aClass45_1.aByte8, super.anInt427, local42 == null ? local21 : local42, local63, local42 == null ? super.anInt431 : super.anInt464, this.aClass45_1.aShort13, this.aClass45_1.anInt2021, this.aClass45_1.aByte7, arg0, this.aClass45_1.aShort12, super.anInt401, super.anInt479);
			local125.method3588(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, super.aClass96_Sub1_3);
		}
		this.method214(local63);
		this.method213(local63, arg0);
		local125 = null;
		if (super.anInt448 != -1 && super.anInt472 != -1) {
			@Pc(163) Class14 local163 = Static172.method2975(super.anInt448);
			local125 = local163.method332(super.anInt461, super.anInt472, super.anInt460);
			if (local125 != null) {
				local125.method3613(0, -super.anInt449, 0);
				if (local163.aBoolean34) {
					if (Static128.anInt3216 != 0) {
						local125.method3619(Static128.anInt3216);
					}
					if (Static65.anInt1817 != 0) {
						local125.method3614(Static65.anInt1817);
					}
					if (Static194.anInt4337 != 0) {
						local125.method3613(0, Static194.anInt4337, 0);
					}
				}
			}
		}
		if (local125 != null) {
			local63 = ((Class9_Sub5_Sub1) local63).method3633(local125);
		}
		if (this.aClass45_1.anInt2021 == 1) {
			local63.aBoolean247 = true;
		}
		local63.method3588(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.aClass96_Sub1_3);
	}

	@OriginalMember(owner = "client!ak", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
	}
}
