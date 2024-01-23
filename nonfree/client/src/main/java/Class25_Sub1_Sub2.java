import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class25_Sub1_Sub2 extends Class25_Sub1 {

	@OriginalMember(owner = "client!ek", name = "pc", descriptor = "Lclient!sa;")
	public Class143 aClass143_1;

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(B)I")
	@Override
	protected int method1231() {
		if (this.aClass143_1.anIntArray535 != null) {
			@Pc(20) Class143 local20 = this.aClass143_1.method4065();
			if (local20 != null && local20.anInt5183 != -1) {
				return local20.anInt5183;
			}
		}
		return this.anInt1642;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLclient!sa;)V")
	public void method1250(@OriginalArg(1) Class143 arg0) {
		this.aClass143_1 = arg0;
		if (this.aClass95_Sub1_3 != null) {
			this.aClass95_Sub1_3.method2873();
		}
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "()I")
	@Override
	public int method4773() {
		return this.anInt1649;
	}

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method1244() {
		return this.aClass143_1 != null;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass143_1 != null) {
			;
		}
	}

	@OriginalMember(owner = "client!ek", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIIIIJILclient!ll;)V")
	@Override
	public void method4768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class95_Sub1 arg10) {
		if (this.aClass143_1 == null) {
			return;
		}
		@Pc(23) Class163 local23 = this.anInt1625 != -1 && this.anInt1653 == 0 ? Static115.method1895(this.anInt1625) : null;
		@Pc(43) Class163 local43 = this.anInt1646 == -1 || this.anInt1646 == this.method1232().anInt4578 && local23 != null ? null : Static115.method1895(this.anInt1646);
		@Pc(64) Class25_Sub2 local64 = this.aClass143_1.method4072(local43, this.anInt1608, this.anInt1640, this.anInt1677, this.aClass86Array3, this.anInt1614, this.anInt1619, this.anInt1648, local23);
		if (local64 == null) {
			return;
		}
		this.anInt1649 = local64.method4773();
		@Pc(74) Class143 local74 = this.aClass143_1;
		if (local74.anIntArray535 != null) {
			local74 = local74.method4065();
		}
		@Pc(128) Class25_Sub2 local128;
		if (Static263.aBoolean302 && local74.aBoolean280) {
			local128 = Static218.method3882(local43 == null ? this.anInt1608 : this.anInt1640, arg0, this.aClass143_1.aShort37, this.anInt1603, this.anInt1635, local64, this.anInt1604, this.aClass143_1.aShort38, this.aClass143_1.aByte22, this.aBoolean86, this.aClass143_1.aByte24, this.aClass143_1.anInt5188, local43 == null ? local23 : local43);
			if (Static296.aBoolean335) {
				@Pc(132) float local132 = Static296.method4829();
				@Pc(134) float local134 = Static296.method4831();
				Static296.method4808();
				Static296.method4830(local132, local134 - 150.0F);
				local128.method4768(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass95_Sub1_3);
				Static296.method4813();
				Static296.method4830(local132, local134);
			} else {
				local128.method4768(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass95_Sub1_3);
			}
		}
		this.method1241(local64);
		this.method1238(local64, arg0);
		local128 = null;
		if (this.anInt1669 != -1 && this.anInt1616 != -1) {
			@Pc(198) Class139 local198 = Static43.method942(this.anInt1669);
			local128 = local198.method4030(this.anInt1645, this.anInt1671, this.anInt1616);
			if (local128 != null) {
				local128.method3474(0, -this.anInt1660, 0);
				if (local198.aBoolean276) {
					if (Static199.anInt4490 != 0) {
						local128.method3471(Static199.anInt4490);
					}
					if (Static242.anInt5299 != 0) {
						local128.method3464(Static242.anInt5299);
					}
					if (Static8.anInt4425 != 0) {
						local128.method3474(0, Static8.anInt4425, 0);
					}
				}
			}
		}
		if (!Static296.aBoolean335) {
			if (local128 != null) {
				local64 = ((Class25_Sub2_Sub2) local64).method3499(local128);
			}
			if (this.aClass143_1.anInt5188 == 1) {
				local64.aBoolean232 = true;
			}
			local64.method4768(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass95_Sub1_3);
			return;
		}
		if (this.aClass143_1.anInt5188 == 1) {
			local64.aBoolean232 = true;
		}
		local64.method4768(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass95_Sub1_3);
		if (local128 != null) {
			if (this.aClass143_1.anInt5188 == 1) {
				local128.aBoolean232 = true;
			}
			local128.method4768(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass95_Sub1_3);
		}
	}
}
