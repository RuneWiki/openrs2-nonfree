import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class15_Sub2_Sub1 extends Class15_Sub2 {

	@OriginalMember(owner = "client!cb", name = "rc", descriptor = "Lclient!vm;")
	public Class188 aClass188_1;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "()I")
	@Override
	public int method4274() {
		return this.anInt5348;
	}

	@OriginalMember(owner = "client!cb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass20_Sub2_6 != null) {
			this.aClass20_Sub2_6.method1694();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass188_1 == null) {
			return;
		}
		if (!this.aBoolean352) {
			@Pc(26) Class112 local26 = this.anInt5332 != -1 && this.anInt5343 == 0 ? Static208.method3496(this.anInt5332) : null;
			@Pc(51) Class112 local51 = this.anInt5365 == -1 || this.anInt5365 == this.method4297().anInt4136 && local26 != null ? null : Static208.method3496(this.anInt5365);
			@Pc(72) Class15_Sub5 local72 = this.aClass188_1.method4617(local51, local26, this.anInt5319, this.anInt5377, this.anInt5368, this.aClass62Array3, this.anInt5318, this.anInt5362, this.anInt5340);
			if (local72 == null) {
				return;
			}
			this.method4290(local72, null);
		}
		if (this.aClass20_Sub2_6 != null) {
			this.aClass20_Sub2_6.method1691(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)I")
	@Override
	public int method4293() {
		if (this.aClass188_1.anIntArray572 != null) {
			@Pc(13) Class188 local13 = this.aClass188_1.method4618();
			if (local13 != null && local13.anInt5881 != -1) {
				return local13.anInt5881;
			}
		}
		return this.aClass188_1.anInt5881;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!vm;)V")
	public void method633(@OriginalArg(1) Class188 arg0) {
		this.aClass188_1 = arg0;
		if (this.aClass20_Sub2_6 != null) {
			this.aClass20_Sub2_6.method1688();
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)I")
	@Override
	protected int method4291() {
		if (this.aClass188_1.anIntArray572 != null) {
			@Pc(18) Class188 local18 = this.aClass188_1.method4618();
			if (local18 != null && local18.anInt5849 != -1) {
				return local18.anInt5849;
			}
		}
		return this.anInt5338;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4282() {
		return this.aClass188_1 != null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIIIJILclient!gl;)V")
	@Override
	public void method4272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20_Sub2 arg10) {
		if (this.aClass188_1 == null) {
			return;
		}
		@Pc(28) Class112 local28 = this.anInt5332 != -1 && this.anInt5343 == 0 ? Static208.method3496(this.anInt5332) : null;
		@Pc(53) Class112 local53 = this.anInt5365 == -1 || this.anInt5365 == this.method4297().anInt4136 && local28 != null ? null : Static208.method3496(this.anInt5365);
		@Pc(74) Class15_Sub5 local74 = this.aClass188_1.method4617(local53, local28, this.anInt5319, this.anInt5377, this.anInt5368, this.aClass62Array3, this.anInt5318, this.anInt5362, this.anInt5340);
		if (local74 == null) {
			return;
		}
		this.anInt5348 = local74.method4274();
		@Pc(84) Class188 local84 = this.aClass188_1;
		if (local84.anIntArray572 != null) {
			local84 = local84.method4618();
		}
		@Pc(139) Class15_Sub5 local139;
		if (Static191.aBoolean276 && local84.aBoolean390) {
			local139 = Static31.method631(this.aClass188_1.anInt5867, local74, this.aClass188_1.aShort87, this.anInt5358, this.aClass188_1.aShort88, this.anInt5371, local53 == null ? this.anInt5377 : this.anInt5319, this.anInt5308, this.aClass188_1.aByte27, this.aBoolean356, arg0, this.aClass188_1.aByte28, local53 == null ? local28 : local53);
			if (Static116.aBoolean184) {
				@Pc(143) float local143 = Static116.method1980();
				@Pc(145) float local145 = Static116.method1964();
				Static116.method1947();
				Static116.method1956(local143, local145 - 150.0F);
				local139.method4272(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass20_Sub2_6);
				Static116.method1958();
				Static116.method1956(local143, local145);
			} else {
				local139.method4272(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass20_Sub2_6);
			}
		}
		this.method4296(local74);
		local139 = null;
		this.method4295(local74, arg0);
		if (this.anInt5301 != -1 && this.anInt5316 != -1) {
			@Pc(210) Class96 local210 = Static156.method2852(this.anInt5301);
			local139 = local210.method2801(this.anInt5316, this.anInt5321, this.anInt5363);
			if (local139 != null) {
				local139.method2356(0, -this.anInt5326, 0);
				if (local210.aBoolean233) {
					if (Static53.anInt1320 != 0) {
						local139.method2347(Static53.anInt1320);
					}
					if (Static83.anInt1962 != 0) {
						local139.method2334(Static83.anInt1962);
					}
					if (Static170.anInt3752 != 0) {
						local139.method2356(0, Static170.anInt3752, 0);
					}
				}
			}
		}
		if (!Static116.aBoolean184) {
			if (local139 != null) {
				local74 = ((Class15_Sub5_Sub1) local74).method2262(local139);
			}
			this.method4290(local74, local139);
			if (this.aClass188_1.anInt5867 == 1) {
				local74.aBoolean206 = true;
			}
			local74.method4272(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub2_6);
			return;
		}
		this.method4290(local74, local139);
		if (this.aClass188_1.anInt5867 == 1) {
			local74.aBoolean206 = true;
		}
		local74.method4272(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub2_6);
		if (local139 == null) {
			return;
		}
		if (this.aClass188_1.anInt5867 == 1) {
			local139.aBoolean206 = true;
		}
		if (this.aClass20_Sub2_6 != null) {
			@Pc(304) Class15_Sub5_Sub2 local304 = (Class15_Sub5_Sub2) local139;
			this.aClass20_Sub2_6.method1699(local304.aClass185Array2, local304.aClass176Array2, true, local304.anIntArray285, local304.anIntArray287, local304.anIntArray288);
		}
		local139.method4272(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub2_6);
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)I")
	@Override
	public int method4292() {
		if (this.aClass188_1.anIntArray572 != null) {
			@Pc(13) Class188 local13 = this.aClass188_1.method4618();
			if (local13 != null && local13.anInt5865 != -1) {
				return local13.anInt5865;
			}
		}
		return this.aClass188_1.anInt5865 == -1 ? super.method4292() : this.aClass188_1.anInt5865;
	}
}
