import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class46 {

	@OriginalMember(owner = "client!db", name = "b", descriptor = "Lclient!sg;")
	private Class97 aClass97_7;

	@OriginalMember(owner = "client!db", name = "g", descriptor = "I")
	public int anInt954;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "I")
	private int anInt956;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "I")
	private int anInt957;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "I")
	private final int anInt952;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "I")
	private final int anInt960;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "I")
	private final int anInt963;

	@OriginalMember(owner = "client!db", name = "k", descriptor = "Z")
	private final boolean aBoolean59;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "I")
	private final int anInt959;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "I")
	private final int anInt961;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "I")
	private final int anInt953;

	@OriginalMember(owner = "client!db", name = "h", descriptor = "I")
	private final int anInt955;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt952 = arg2;
		this.anInt960 = arg3;
		this.anInt963 = arg4;
		this.aBoolean59 = arg7;
		this.anInt959 = arg1;
		this.anInt961 = arg6;
		this.anInt953 = arg5;
		this.anInt955 = arg0;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!uo;Lclient!db;)Z")
	private boolean method720(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class46 arg1) {
		if (this.aClass97_7 == null) {
			if (this.anInt955 == 0) {
				if (Static181.anInterface2_3.method2246(this.anInt959)) {
					@Pc(23) int[] local23 = Static181.anInterface2_3.method2247(this.anInt962, 0.7F, this.anInt962, this.anInt959);
					this.aClass97_7 = arg0.method4958(local23, this.anInt962, this.anInt962, this.anInt962);
				}
			} else if (this.anInt955 == 2) {
				this.method729(arg0, arg1);
			} else if (this.anInt955 == 1) {
				this.method730(arg0, arg1);
			}
		}
		return this.aClass97_7 != null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)Z")
	public boolean method721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean59) {
			this.anInt954 = 1073741823;
			local7 = this.anInt952;
			local12 = this.anInt960;
			local17 = this.anInt963;
		} else {
			local7 = this.anInt952 - arg0;
			local12 = this.anInt960 - arg1;
			local17 = this.anInt963 - arg2;
			this.anInt954 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt954 == 0) {
				this.anInt954 = 1;
			}
			local7 = (local7 << 8) / this.anInt954;
			local12 = (local12 << 8) / this.anInt954;
			local17 = (local17 << 8) / this.anInt954;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt956 = this.anInt953 * arg3 / (this.aBoolean59 ? 1024 : this.anInt954);
		} else {
			this.anInt956 = 0;
		}
		if (this.anInt956 < 8) {
			this.aClass97_7 = null;
			return false;
		}
		@Pc(143) int local143 = Static90.method4097(this.anInt956);
		if (local143 > arg3) {
			local143 = Static39.method577(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt962) {
			this.anInt962 = local143;
		}
		this.anInt957 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt958 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass97_7 = null;
		return true;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "()V")
	public void method724() {
		this.aClass97_7 = null;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(Lclient!uo;Lclient!db;)Z")
	public boolean method726(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class46 arg1) {
		return this.aClass97_7 != null || this.method720(arg0, arg1);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!uo;IIIIII)V")
	public void method728(@OriginalArg(0) Class129 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass97_7 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt957 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt958 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt956) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt956) / 2;
		if (local38 < arg4 && local38 + this.anInt956 > 0 && local51 < arg3 && local51 + this.anInt956 > 0) {
			this.aClass97_7.method5548(local51 + arg1, local38 + arg2, this.anInt956, this.anInt956);
		}
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(Lclient!uo;Lclient!db;)V")
	private void method729(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class46 arg1) {
		@Pc(6) Class31 local6 = Static119.method1790(Static193.aClass144_55, this.anInt959);
		if (local6 == null) {
			return;
		}
		arg0.method4920(Static50.anIntArray67);
		arg0.method4952(0, 0, this.anInt962, this.anInt962);
		arg0.method4945(0, 0, this.anInt962, this.anInt962, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean59) {
				local32 = -arg1.anInt952;
				local34 = -arg1.anInt960;
				local36 = -arg1.anInt963;
			} else {
				local32 = this.anInt952 - arg1.anInt952;
				local34 = this.anInt960 - arg1.anInt960;
				local36 = this.anInt963 - arg1.anInt963;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt957 != 0) {
			local81 = -this.anInt957 & 0x3FFF;
			local85 = Class140.anIntArray330[local81];
			local89 = Class140.anIntArray329[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt958 != 0) {
			local81 = -this.anInt958 & 0x3FFF;
			local85 = Class140.anIntArray330[local81];
			local89 = Class140.anIntArray329[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method4937(1.0F);
		arg0.method4925(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class126 local172 = arg0.method4929(local6, 1024, 0, 64, 768);
		local85 = local172.method3118() - local172.method3117();
		local89 = local172.method3150() - local172.method3155();
		local99 = local172.method3117() + local85 / 2;
		@Pc(198) int local198 = local172.method3155() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method4996(local99, local198, local205, local205);
		arg0.method4971(arg0.method4983());
		@Pc(218) Class61 local218 = arg0.method4979();
		local218.method3666(0, 0, arg0.method4976() - local172.method3120());
		local172.method3133(local218, null, arg0.method4976());
		this.aClass97_7 = arg0.method4960(0, 0, this.anInt962, this.anInt962, true);
		this.aClass97_7.method5547(3);
		arg0.method4952(Static50.anIntArray67[0], Static50.anIntArray67[1], Static50.anIntArray67[2], Static50.anIntArray67[3]);
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(Lclient!uo;Lclient!db;)V")
	private void method730(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class46 arg1) {
		Static50.method723(arg0);
		Static50.method727(arg0);
		arg0.method4920(Static50.anIntArray67);
		arg0.method4952(0, 0, this.anInt962, this.anInt962);
		arg0.method4944();
		arg0.method4945(0, 0, this.anInt962, this.anInt962, this.anInt961 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean59) {
				local31 = -arg1.anInt952;
				local33 = -arg1.anInt960;
				local35 = -arg1.anInt963;
			} else {
				local31 = arg1.anInt952 - this.anInt952;
				local33 = arg1.anInt960 - this.anInt960;
				local35 = arg1.anInt963 - this.anInt963;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt957 != 0) {
			local79 = Class140.anIntArray330[this.anInt957];
			local84 = Class140.anIntArray329[this.anInt957];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt958 != 0) {
			local79 = Class140.anIntArray330[this.anInt958];
			local84 = Class140.anIntArray329[this.anInt958];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class126 local147 = Static50.aClass126_2.method3158((byte) 0, 25600, true);
		if (arg0.method4975()) {
			local147.method3146((short) 0, (short) this.anInt959);
		} else {
			local147.method3162((short) 127, Static181.anInterface2_3.method2244(this.anInt959).aShort63);
			local147.method3146((short) 0, (short) -1);
		}
		arg0.method4937(1.0F);
		arg0.method4925(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt962 * 1024 / (local147.method3118() - local147.method3117());
		if (this.anInt961 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method4996(this.anInt962 / 2, this.anInt962 / 2, local84, local84);
		arg0.method4971(arg0.method4983());
		@Pc(223) Class61 local223 = arg0.method4983();
		local223.method3666(0, 0, arg0.method4976() - local147.method3120());
		local147.method3133(local223, null, 1024);
		@Pc(245) int local245 = this.anInt962 * 13 / 16;
		@Pc(252) int local252 = (this.anInt962 - local245) / 2;
		Static50.aClass97_9.method5550(local252, local252, local245, local245, 1, this.anInt961 | 0xFF000000, 1);
		this.aClass97_7 = arg0.method4960(0, 0, this.anInt962, this.anInt962, true);
		arg0.method4944();
		arg0.method4945(0, 0, this.anInt962, this.anInt962, 0, 0);
		Static50.aClass97_8.method5550(0, 0, this.anInt962, this.anInt962, 0, 0, 0);
		this.aClass97_7.method5547(0);
		arg0.method4952(Static50.anIntArray67[0], Static50.anIntArray67[1], Static50.anIntArray67[2], Static50.anIntArray67[3]);
	}
}
