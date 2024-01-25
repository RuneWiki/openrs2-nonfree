import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class12 {

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
	public int anInt357;

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
	private int anInt359;

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
	private int anInt363;

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "Lclient!gj;")
	private Class31 aClass31_9;

	@OriginalMember(owner = "client!ap", name = "n", descriptor = "I")
	private int anInt365;

	@OriginalMember(owner = "client!ap", name = "p", descriptor = "I")
	private int anInt366;

	@OriginalMember(owner = "client!ap", name = "r", descriptor = "I")
	private final int anInt367;

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
	private final int anInt358;

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
	private final int anInt361;

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "Z")
	private final boolean aBoolean51;

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
	private final int anInt356;

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
	private final int anInt362;

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
	private final int anInt360;

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
	private final int anInt364;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt367 = arg2;
		this.anInt358 = arg3;
		this.anInt361 = arg4;
		this.aBoolean51 = arg7;
		this.anInt356 = arg1;
		this.anInt362 = arg6;
		this.anInt360 = arg5;
		this.anInt364 = arg0;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "()V")
	public void method609() {
		this.aClass31_9 = null;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!ae;Lclient!ap;)V")
	private void method613(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class12 arg1) {
		@Pc(6) Class192 local6 = Static111.method2400(Static302.aClass191_191, this.anInt356);
		if (local6 == null) {
			return;
		}
		arg0.method4235(Static14.anIntArray25);
		arg0.method4252(0, 0, this.anInt366, this.anInt366);
		arg0.method4246(0, 0, this.anInt366, this.anInt366, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean51) {
				local32 = -arg1.anInt367;
				local34 = -arg1.anInt358;
				local36 = -arg1.anInt361;
			} else {
				local32 = this.anInt367 - arg1.anInt367;
				local34 = this.anInt358 - arg1.anInt358;
				local36 = this.anInt361 - arg1.anInt361;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt363 != 0) {
			local81 = -this.anInt363 & 0x3FFF;
			local85 = Class24.anIntArray35[local81];
			local89 = Class24.anIntArray36[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt359 != 0) {
			local81 = -this.anInt359 & 0x3FFF;
			local85 = Class24.anIntArray35[local81];
			local89 = Class24.anIntArray36[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method4216(1.0F);
		arg0.method4223(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class7 local172 = arg0.method4237(local6, 1024, 0, 64, 768);
		local85 = local172.method1440() - local172.method1447();
		local89 = local172.method1425() - local172.method1430();
		local99 = local172.method1447() + local85 / 2;
		@Pc(198) int local198 = local172.method1430() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method4266(local99, local198, local205, local205);
		arg0.method4233(arg0.method4273());
		@Pc(218) Class133 local218 = arg0.method4244();
		local218.method4324(0, 0, arg0.method4215() - local172.method1420());
		local172.method1437(local218, null, arg0.method4215());
		this.aClass31_9 = arg0.method4291(0, 0, this.anInt366, this.anInt366, true);
		this.aClass31_9.method4381(3);
		arg0.method4252(Static14.anIntArray25[0], Static14.anIntArray25[1], Static14.anIntArray25[2], Static14.anIntArray25[3]);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIII)Z")
	public boolean method615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean51) {
			this.anInt357 = 1073741823;
			local7 = this.anInt367;
			local12 = this.anInt358;
			local17 = this.anInt361;
		} else {
			local7 = this.anInt367 - arg0;
			local12 = this.anInt358 - arg1;
			local17 = this.anInt361 - arg2;
			this.anInt357 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt357 == 0) {
				this.anInt357 = 1;
			}
			local7 = (local7 << 8) / this.anInt357;
			local12 = (local12 << 8) / this.anInt357;
			local17 = (local17 << 8) / this.anInt357;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt365 = this.anInt360 * arg3 / (this.aBoolean51 ? 1024 : this.anInt357);
		} else {
			this.anInt365 = 0;
		}
		if (this.anInt365 < 8) {
			this.aClass31_9 = null;
			return false;
		}
		@Pc(143) int local143 = Static216.method3815(this.anInt365);
		if (local143 > arg3) {
			local143 = Static331.method2985(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt366) {
			this.anInt366 = local143;
		}
		this.anInt363 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt359 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass31_9 = null;
		return true;
	}

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(Lclient!ae;Lclient!ap;)V")
	private void method616(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class12 arg1) {
		Static14.method611(arg0);
		Static14.method612(arg0);
		arg0.method4235(Static14.anIntArray25);
		arg0.method4252(0, 0, this.anInt366, this.anInt366);
		arg0.method4225();
		arg0.method4246(0, 0, this.anInt366, this.anInt366, this.anInt362 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean51) {
				local31 = -arg1.anInt367;
				local33 = -arg1.anInt358;
				local35 = -arg1.anInt361;
			} else {
				local31 = arg1.anInt367 - this.anInt367;
				local33 = arg1.anInt358 - this.anInt358;
				local35 = arg1.anInt361 - this.anInt361;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt363 != 0) {
			local79 = Class24.anIntArray35[this.anInt363];
			local84 = Class24.anIntArray36[this.anInt363];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt359 != 0) {
			local79 = Class24.anIntArray35[this.anInt359];
			local84 = Class24.anIntArray36[this.anInt359];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class7 local147 = Static14.aClass7_1.method1436((byte) 0, 25600, true);
		if (arg0.method4258()) {
			local147.method1401((short) 0, (short) this.anInt356);
		} else {
			local147.method1417((short) 127, Static326.anInterface7_8.method5778(this.anInt356).aShort92);
			local147.method1401((short) 0, (short) -1);
		}
		arg0.method4216(1.0F);
		arg0.method4223(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt366 * 1024 / (local147.method1440() - local147.method1447());
		if (this.anInt362 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method4266(this.anInt366 / 2, this.anInt366 / 2, local84, local84);
		arg0.method4233(arg0.method4273());
		@Pc(223) Class133 local223 = arg0.method4273();
		local223.method4324(0, 0, arg0.method4215() - local147.method1420());
		local147.method1437(local223, null, 1024);
		@Pc(245) int local245 = this.anInt366 * 13 / 16;
		@Pc(252) int local252 = (this.anInt366 - local245) / 2;
		Static14.aClass31_10.method4391(local252, local252, local245, local245, 1, this.anInt362 | 0xFF000000, 1);
		this.aClass31_9 = arg0.method4291(0, 0, this.anInt366, this.anInt366, true);
		arg0.method4225();
		arg0.method4246(0, 0, this.anInt366, this.anInt366, 0, 0);
		Static14.aClass31_8.method4391(0, 0, this.anInt366, this.anInt366, 0, 0, 0);
		this.aClass31_9.method4381(0);
		arg0.method4252(Static14.anIntArray25[0], Static14.anIntArray25[1], Static14.anIntArray25[2], Static14.anIntArray25[3]);
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(Lclient!ae;Lclient!ap;)Z")
	private boolean method617(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class12 arg1) {
		if (this.aClass31_9 == null) {
			if (this.anInt364 == 0) {
				if (Static326.anInterface7_8.method5780(this.anInt356)) {
					@Pc(23) int[] local23 = Static326.anInterface7_8.method5781(this.anInt356, this.anInt366, 0.7F, this.anInt366);
					this.aClass31_9 = arg0.method4227(local23, this.anInt366, this.anInt366, this.anInt366);
				}
			} else if (this.anInt364 == 2) {
				this.method613(arg0, arg1);
			} else if (this.anInt364 == 1) {
				this.method616(arg0, arg1);
			}
		}
		return this.aClass31_9 != null;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!ae;IIIIII)V")
	public void method618(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass31_9 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt363 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt359 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt365) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt365) / 2;
		if (local38 < arg4 && local38 + this.anInt365 > 0 && local51 < arg3 && local51 + this.anInt365 > 0) {
			this.aClass31_9.method4390(local51 + arg1, local38 + arg2, this.anInt365, this.anInt365);
		}
	}

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "(Lclient!ae;Lclient!ap;)Z")
	public boolean method619(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class12 arg1) {
		return this.aClass31_9 != null || this.method617(arg0, arg1);
	}
}
