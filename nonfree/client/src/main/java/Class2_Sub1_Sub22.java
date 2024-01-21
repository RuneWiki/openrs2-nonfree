import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class2_Sub1_Sub22 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ua", name = "C", descriptor = "F")
	private float aFloat3;

	@OriginalMember(owner = "client!ua", name = "I", descriptor = "[I")
	private int[] anIntArray365;

	@OriginalMember(owner = "client!ua", name = "D", descriptor = "Z")
	public boolean aBoolean172 = false;

	@OriginalMember(owner = "client!ua", name = "T", descriptor = "Lclient!l;")
	private final Class55 aClass55_1;

	@OriginalMember(owner = "client!ua", name = "K", descriptor = "Z")
	public boolean aBoolean173;

	@OriginalMember(owner = "client!ua", name = "O", descriptor = "Z")
	public final boolean aBoolean174;

	@OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
	public final int anInt3965;

	@OriginalMember(owner = "client!ua", name = "z", descriptor = "Z")
	private boolean aBoolean171;

	@OriginalMember(owner = "client!ua", name = "V", descriptor = "Z")
	private boolean aBoolean175;

	@OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
	public int anInt3966;

	@OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
	private int anInt3957;

	@OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
	private int anInt3959;

	@OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
	private int anInt3958;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class2_Sub1_Sub22(@OriginalArg(0) Class2_Sub11 arg0) {
		this.aClass55_1 = new Class55(arg0);
		@Pc(14) int local14 = arg0.method1534();
		this.aBoolean173 = (local14 & 0x2) != 0;
		this.aBoolean174 = (local14 & 0x1) != 0;
		@Pc(39) int local39 = arg0.method1534();
		this.anInt3965 = 0x1 << (local39 & 0x7) + 1;
		this.aBoolean171 = (local39 & 0x80) != 0;
		this.aBoolean175 = (local39 & 0x8) != 0;
		this.anInt3966 = arg0.method1557();
		this.anInt3957 = arg0.method1534();
		if (this.anInt3957 == 255) {
			this.anInt3957 = 256;
		}
		this.anInt3959 = arg0.method1552();
		this.anInt3958 = arg0.method1552();
		arg0.method1534();
		arg0.method1534();
		arg0.method1534();
	}

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub22() {
		this.aClass55_1 = new Class55();
		this.aBoolean174 = true;
		this.anInt3965 = 64;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
	public void method2736(@OriginalArg(0) int arg0) {
		if (this.anIntArray365 == null || this.anInt3958 == 0 && this.anInt3959 == 0) {
			return;
		}
		if (Static125.anIntArray246 == null || Static125.anIntArray246.length < this.anIntArray365.length) {
			Static125.anIntArray246 = new int[this.anIntArray365.length];
		}
		@Pc(44) int local44 = this.anIntArray365.length;
		@Pc(55) int local55 = this.anIntArray365.length == 4096 ? 64 : 128;
		@Pc(60) int local60 = this.anInt3959 * arg0;
		@Pc(64) int local64 = local55 - 1;
		@Pc(68) int local68 = local44 - 1;
		@Pc(75) int local75 = arg0 * local55 * this.anInt3958;
		for (@Pc(77) int local77 = 0; local77 < local44; local77 += local55) {
			@Pc(85) int local85 = local68 & local75 + local77;
			for (@Pc(87) int local87 = 0; local87 < local55; local87++) {
				@Pc(98) int local98 = local85 + (local64 & local60 + local87);
				@Pc(102) int local102 = local87 + local77;
				Static125.anIntArray246[local102] = this.anIntArray365[local98];
			}
		}
		@Pc(123) int[] local123 = this.anIntArray365;
		this.anIntArray365 = Static125.anIntArray246;
		Static125.anIntArray246 = local123;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!hb;Lclient!pb;I)[I")
	public int[] method2737(@OriginalArg(0) int arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) Class71 arg2) {
		if (this.aClass55_1.method1690(arg1, arg2)) {
			@Pc(21) int local21 = arg0 >= this.anInt3965 ? this.anInt3965 : arg0;
			return this.aClass55_1.method1689(local21, 1.0D, local21, this.aBoolean171, arg1, arg2, false);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ua", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!hb;FIILclient!pb;)[I")
	public int[] method2741(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class71 arg3) {
		if (this.anIntArray365 == null || this.aFloat3 != arg1) {
			if (!this.aClass55_1.method1690(arg0, arg3)) {
				return null;
			}
			@Pc(41) int local41 = this.anInt3965 <= arg2 ? this.anInt3965 : arg2;
			this.anIntArray365 = this.aClass55_1.method1689(local41, (double) arg1, local41, this.aBoolean171, arg0, arg3, true);
			this.aFloat3 = arg1;
			if (this.aBoolean175) {
				@Pc(65) int[] local65 = new int[local41];
				@Pc(68) int[] local68 = new int[local41];
				@Pc(71) int[] local71 = new int[local41];
				@Pc(76) int[] local76 = new int[local41 * local41];
				@Pc(82) int local82 = local41 - 1;
				@Pc(87) int local87 = local41;
				@Pc(88) int local88 = local41;
				@Pc(92) int local92 = local41 - 1;
				@Pc(96) int local96 = local41 * local41;
				@Pc(102) int local102;
				for (@Pc(98) int local98 = 2; local98 >= 0; local98--) {
					for (local102 = local82; local102 >= 0; local102--) {
						local87--;
						@Pc(110) int local110 = this.anIntArray365[local87];
						local65[local102] += local110 >> 16 & 0xFF;
						local68[local102] += local110 >> 8 & 0xFF;
						local71[local102] += local110 & 0xFF;
					}
					if (local87 == 0) {
						local87 = local96;
					}
				}
				@Pc(156) int local156 = local96;
				for (@Pc(158) int local158 = local92; local158 >= 0; local158--) {
					@Pc(162) int local162 = 1;
					@Pc(164) int local164 = 1;
					@Pc(167) int local167 = 0;
					@Pc(169) int local169 = 0;
					@Pc(170) int local170 = 0;
					for (local102 = 2; local102 >= 0; local102--) {
						local162--;
						local167 += local68[local162];
						local170 += local65[local162];
						local169 += local71[local162];
						if (local162 == 0) {
							local162 = local41;
						}
					}
					for (local102 = local82; local102 >= 0; local102--) {
						local164--;
						@Pc(215) int local215 = local170 / 9;
						@Pc(219) int local219 = local167 / 9;
						local162--;
						@Pc(224) int local224 = local169 / 9;
						local156--;
						local76[local156] = local215 << 16 | local219 << 8 | local224;
						local170 += local65[local162] - local65[local164];
						local167 += local68[local162] - local68[local164];
						local169 += local71[local162] - local71[local164];
						if (local162 == 0) {
							local162 = local41;
						}
						if (local164 == 0) {
							local164 = local41;
						}
					}
					for (local102 = local82; local102 >= 0; local102--) {
						local88--;
						@Pc(297) int local297 = this.anIntArray365[local88];
						local87--;
						@Pc(303) int local303 = this.anIntArray365[local87];
						local65[local102] += (local303 >> 16 & 0xFF) - ((local297 & 0xFF173D) >> 16);
						local68[local102] += (local303 >> 8 & 0xFF) - ((local297 & 0xFF0B) >> 8);
						local71[local102] += (local303 & 0xFF) - (local297 & 0xFF);
					}
					if (local88 == 0) {
						local88 = local96;
					}
					if (local87 == 0) {
						local87 = local96;
					}
				}
				this.anIntArray365 = local76;
			}
		}
		return this.anIntArray365;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!pb;BLclient!hb;)Z")
	public boolean method2742(@OriginalArg(0) Class71 arg0, @OriginalArg(2) Interface3 arg1) {
		return this.aClass55_1.method1690(arg1, arg0);
	}
}
