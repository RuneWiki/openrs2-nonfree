import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class36 {

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
	private int anInt1360;

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
	private int anInt1361;

	@OriginalMember(owner = "client!cr", name = "n", descriptor = "I")
	private int anInt1365;

	@OriginalMember(owner = "client!cr", name = "o", descriptor = "Lclient!vj;")
	private Class58 aClass58_8;

	@OriginalMember(owner = "client!cr", name = "q", descriptor = "I")
	private int anInt1366;

	@OriginalMember(owner = "client!cr", name = "r", descriptor = "I")
	public int anInt1367;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
	private final int anInt1356;

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
	private final int anInt1357;

	@OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
	private final int anInt1363;

	@OriginalMember(owner = "client!cr", name = "p", descriptor = "Z")
	private final boolean aBoolean99;

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
	private final int anInt1358;

	@OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
	private final int anInt1364;

	@OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
	private final int anInt1362;

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
	private final int anInt1359;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt1356 = arg2;
		this.anInt1357 = arg3;
		this.anInt1363 = arg4;
		this.aBoolean99 = arg7;
		this.anInt1358 = arg1;
		this.anInt1364 = arg6;
		this.anInt1362 = arg5;
		this.anInt1359 = arg0;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!vq;IIIIII)V")
	public void method1004(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass58_8 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt1365 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt1366 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt1361) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt1361) / 2;
		if (local38 < arg4 && local38 + this.anInt1361 > 0 && local51 < arg3 && local51 + this.anInt1361 > 0) {
			this.aClass58_8.method4278(local51 + arg1, local38 + arg2, this.anInt1361, this.anInt1361);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIII)Z")
	public boolean method1005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean99) {
			this.anInt1367 = 1073741823;
			local7 = this.anInt1356;
			local12 = this.anInt1357;
			local17 = this.anInt1363;
		} else {
			local7 = this.anInt1356 - arg0;
			local12 = this.anInt1357 - arg1;
			local17 = this.anInt1363 - arg2;
			this.anInt1367 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt1367 == 0) {
				this.anInt1367 = 1;
			}
			local7 = (local7 << 8) / this.anInt1367;
			local12 = (local12 << 8) / this.anInt1367;
			local17 = (local17 << 8) / this.anInt1367;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt1361 = this.anInt1362 * arg3 / (this.aBoolean99 ? 1024 : this.anInt1367);
		} else {
			this.anInt1361 = 0;
		}
		if (this.anInt1361 < 8) {
			this.aClass58_8 = null;
			return false;
		}
		@Pc(143) int local143 = Static28.method5505(this.anInt1361);
		if (local143 > arg3) {
			local143 = Static45.method916(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt1360) {
			this.anInt1360 = local143;
		}
		this.anInt1365 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt1366 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass58_8 = null;
		return true;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!vq;Lclient!cr;)Z")
	public boolean method1006(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class36 arg1) {
		return this.aClass58_8 != null || this.method1007(arg0, arg1);
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(Lclient!vq;Lclient!cr;)Z")
	private boolean method1007(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class36 arg1) {
		if (this.aClass58_8 == null) {
			if (this.anInt1359 == 0) {
				if (Static146.anInterface3_4.method5439(this.anInt1358)) {
					@Pc(23) int[] local23 = Static146.anInterface3_4.method5440(0.7F, this.anInt1358, this.anInt1360, this.anInt1360);
					this.aClass58_8 = arg0.method2679(local23, this.anInt1360, this.anInt1360, this.anInt1360);
				}
			} else if (this.anInt1359 == 2) {
				this.method1010(arg0, arg1);
			} else if (this.anInt1359 == 1) {
				this.method1013(arg0, arg1);
			}
		}
		return this.aClass58_8 != null;
	}

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "(Lclient!vq;Lclient!cr;)V")
	private void method1010(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class36 arg1) {
		@Pc(6) Class165 local6 = Static170.method3292(this.anInt1358, Static344.aClass193_45);
		if (local6 == null) {
			return;
		}
		arg0.method2699(Static50.anIntArray74);
		arg0.method2709(0, 0, this.anInt1360, this.anInt1360);
		arg0.method2682(0, 0, this.anInt1360, this.anInt1360, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean99) {
				local32 = -arg1.anInt1356;
				local34 = -arg1.anInt1357;
				local36 = -arg1.anInt1363;
			} else {
				local32 = this.anInt1356 - arg1.anInt1356;
				local34 = this.anInt1357 - arg1.anInt1357;
				local36 = this.anInt1363 - arg1.anInt1363;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt1365 != 0) {
			local81 = -this.anInt1365 & 0x3FFF;
			local85 = Class118_Sub1.anIntArray314[local81];
			local89 = Class118_Sub1.anIntArray317[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt1366 != 0) {
			local81 = -this.anInt1366 & 0x3FFF;
			local85 = Class118_Sub1.anIntArray314[local81];
			local89 = Class118_Sub1.anIntArray317[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method2662(1.0F);
		arg0.method2746(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class38 local172 = arg0.method2717(local6, 1024, 0, 64, 768);
		local85 = local172.method1907() - local172.method1888();
		local89 = local172.method1918() - local172.method1921();
		local99 = local172.method1888() + local85 / 2;
		@Pc(198) int local198 = local172.method1921() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method2660(local99, local198, local205, local205);
		arg0.method2656(arg0.method2705());
		@Pc(218) Class57 local218 = arg0.method2706();
		local218.method4189(0, 0, arg0.method2683() - local172.method1909());
		local172.method1920(local218, null, arg0.method2683());
		this.aClass58_8 = arg0.method2733(0, 0, this.anInt1360, this.anInt1360, true);
		this.aClass58_8.method4267(3);
		arg0.method2709(Static50.anIntArray74[0], Static50.anIntArray74[1], Static50.anIntArray74[2], Static50.anIntArray74[3]);
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "()V")
	public void method1011() {
		this.aClass58_8 = null;
	}

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "(Lclient!vq;Lclient!cr;)V")
	private void method1013(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class36 arg1) {
		Static50.method1014(arg0);
		Static50.method1009(arg0);
		arg0.method2699(Static50.anIntArray74);
		arg0.method2709(0, 0, this.anInt1360, this.anInt1360);
		arg0.method2678();
		arg0.method2682(0, 0, this.anInt1360, this.anInt1360, this.anInt1364 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean99) {
				local31 = -arg1.anInt1356;
				local33 = -arg1.anInt1357;
				local35 = -arg1.anInt1363;
			} else {
				local31 = arg1.anInt1356 - this.anInt1356;
				local33 = arg1.anInt1357 - this.anInt1357;
				local35 = arg1.anInt1363 - this.anInt1363;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt1365 != 0) {
			local79 = Class118_Sub1.anIntArray314[this.anInt1365];
			local84 = Class118_Sub1.anIntArray317[this.anInt1365];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt1366 != 0) {
			local79 = Class118_Sub1.anIntArray314[this.anInt1366];
			local84 = Class118_Sub1.anIntArray317[this.anInt1366];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class38 local147 = Static50.aClass38_1.method1915((byte) 0, 25600, true);
		if (arg0.method2675()) {
			local147.method1904((short) 0, (short) this.anInt1358);
		} else {
			local147.method1886((short) 127, Static146.anInterface3_4.method5441(this.anInt1358).aShort52);
			local147.method1904((short) 0, (short) -1);
		}
		arg0.method2662(1.0F);
		arg0.method2746(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt1360 * 1024 / (local147.method1907() - local147.method1888());
		if (this.anInt1364 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method2660(this.anInt1360 / 2, this.anInt1360 / 2, local84, local84);
		arg0.method2656(arg0.method2705());
		@Pc(223) Class57 local223 = arg0.method2705();
		local223.method4189(0, 0, arg0.method2683() - local147.method1909());
		local147.method1920(local223, null, 1024);
		@Pc(245) int local245 = this.anInt1360 * 13 / 16;
		@Pc(252) int local252 = (this.anInt1360 - local245) / 2;
		Static50.aClass58_7.method4272(local252, local252, local245, local245, 1, this.anInt1364 | 0xFF000000, 1);
		this.aClass58_8 = arg0.method2733(0, 0, this.anInt1360, this.anInt1360, true);
		arg0.method2678();
		arg0.method2682(0, 0, this.anInt1360, this.anInt1360, 0, 0);
		Static50.aClass58_6.method4272(0, 0, this.anInt1360, this.anInt1360, 0, 0, 0);
		this.aClass58_8.method4267(0);
		arg0.method2709(Static50.anIntArray74[0], Static50.anIntArray74[1], Static50.anIntArray74[2], Static50.anIntArray74[3]);
	}
}
