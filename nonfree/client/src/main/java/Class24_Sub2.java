import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class24_Sub2 extends Class24 {

	@OriginalMember(owner = "client!f", name = "G", descriptor = "I")
	private int anInt1270 = -32768;

	@OriginalMember(owner = "client!f", name = "s", descriptor = "I")
	private final int anInt1258;

	@OriginalMember(owner = "client!f", name = "E", descriptor = "I")
	private final int anInt1268;

	@OriginalMember(owner = "client!f", name = "J", descriptor = "I")
	private final int anInt1272;

	@OriginalMember(owner = "client!f", name = "z", descriptor = "I")
	private final int anInt1265;

	@OriginalMember(owner = "client!f", name = "x", descriptor = "I")
	private final int anInt1263;

	@OriginalMember(owner = "client!f", name = "F", descriptor = "I")
	private final int anInt1269;

	@OriginalMember(owner = "client!f", name = "B", descriptor = "Lclient!ki;")
	private Class2_Sub2_Sub16 aClass2_Sub2_Sub16_2;

	@OriginalMember(owner = "client!f", name = "t", descriptor = "I")
	private int anInt1259;

	@OriginalMember(owner = "client!f", name = "I", descriptor = "I")
	private int anInt1271;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(IIIIIIIZLclient!rb;)V")
	public Class24_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class24 arg8) {
		this.anInt1258 = arg3;
		this.anInt1268 = arg5;
		this.anInt1272 = arg2;
		this.anInt1265 = arg4;
		this.anInt1263 = arg0;
		this.anInt1269 = arg1;
		if (arg6 != -1) {
			this.aClass2_Sub2_Sub16_2 = Static213.method3229(arg6);
			this.anInt1259 = 0;
			this.anInt1271 = Static13.anInt386 - 1;
			if (this.aClass2_Sub2_Sub16_2.anInt2334 == 0 && arg8 != null && arg8 instanceof Class24_Sub2) {
				@Pc(51) Class24_Sub2 local51 = (Class24_Sub2) arg8;
				if (local51.aClass2_Sub2_Sub16_2 == this.aClass2_Sub2_Sub16_2) {
					this.anInt1259 = local51.anInt1259;
					this.anInt1271 = local51.anInt1271;
					return;
				}
			}
			if (arg7 && this.aClass2_Sub2_Sub16_2.anInt2341 != -1) {
				this.anInt1259 = (int) (Math.random() * (double) this.aClass2_Sub2_Sub16_2.anIntArray232.length);
				this.anInt1271 -= (int) (Math.random() * (double) this.aClass2_Sub2_Sub16_2.anIntArray229[this.anInt1259]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "()I")
	@Override
	public int method2978() {
		return this.anInt1270;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(3) Class24 local3 = this.method972();
		if (local3 != null) {
			local3.method2974(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt1270 = local3.method2978();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)Lclient!rb;")
	private Class24 method972() {
		@Pc(10) Class2_Sub2_Sub20 local10 = Static99.method1689(this.anInt1263);
		if (local10.anIntArray264 != null) {
			local10 = local10.method2050();
		}
		if (local10 == null) {
			return null;
		}
		@Pc(30) int local30;
		@Pc(50) int local50;
		@Pc(89) int local89;
		@Pc(91) int local91;
		if (this.aClass2_Sub2_Sub16_2 != null) {
			local30 = Static13.anInt386 - this.anInt1271;
			if (local30 > 100 && this.aClass2_Sub2_Sub16_2.anInt2341 > 0) {
				local50 = this.aClass2_Sub2_Sub16_2.anIntArray232.length - this.aClass2_Sub2_Sub16_2.anInt2341;
				while (local50 > this.anInt1259 && local30 > this.aClass2_Sub2_Sub16_2.anIntArray229[this.anInt1259]) {
					local30 -= this.aClass2_Sub2_Sub16_2.anIntArray229[this.anInt1259];
					this.anInt1259++;
				}
				if (this.anInt1259 >= local50) {
					local89 = 0;
					for (local91 = local50; local91 < this.aClass2_Sub2_Sub16_2.anIntArray232.length; local91++) {
						local89 += this.aClass2_Sub2_Sub16_2.anIntArray229[local91];
					}
					local30 %= local89;
				}
			}
			label79: {
				do {
					do {
						if (local30 <= this.aClass2_Sub2_Sub16_2.anIntArray229[this.anInt1259]) {
							break label79;
						}
						local30 -= this.aClass2_Sub2_Sub16_2.anIntArray229[this.anInt1259];
						this.anInt1259++;
					} while (this.aClass2_Sub2_Sub16_2.anIntArray232.length > this.anInt1259);
					this.anInt1259 -= this.aClass2_Sub2_Sub16_2.anInt2341;
				} while (this.anInt1259 >= 0 && this.anInt1259 < this.aClass2_Sub2_Sub16_2.anIntArray232.length);
				this.aClass2_Sub2_Sub16_2 = null;
			}
			this.anInt1271 = Static13.anInt386 - local30;
		}
		if (this.anInt1272 == 1 || this.anInt1272 == 3) {
			local50 = local10.anInt2670;
			local30 = local10.anInt2665;
		} else {
			local30 = local10.anInt2670;
			local50 = local10.anInt2665;
		}
		local89 = this.anInt1265 + (local30 >> 1);
		local91 = (local30 + 1 >> 1) + this.anInt1265;
		@Pc(224) int local224 = this.anInt1268 + (local50 >> 1);
		@Pc(233) int local233 = this.anInt1268 + (local50 + 1 >> 1);
		@Pc(245) int[][] local245 = Static170.anIntArrayArrayArray10[this.anInt1258];
		@Pc(273) int local273 = local245[local91][local224] + local245[local89][local224] + local245[local89][local233] + local245[local91][local233] >> 2;
		@Pc(282) int local282 = (local30 << 6) + (this.anInt1265 << 7);
		@Pc(291) int local291 = (local50 << 6) + (this.anInt1268 << 7);
		@Pc(310) Class2_Sub2_Sub13 local310;
		if (this.aClass2_Sub2_Sub16_2 == null) {
			local310 = local10.method2045(local291, this.anInt1269, local273, local282, false, this.anInt1272, local245);
		} else {
			local310 = local10.method2053(local273, this.aClass2_Sub2_Sub16_2, this.anInt1269, this.anInt1259, local291, local282, this.anInt1272, local245);
		}
		return local310 == null ? null : local310.aClass24_2;
	}
}
