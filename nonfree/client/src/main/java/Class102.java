import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class102 {

	@OriginalMember(owner = "client!he", name = "b", descriptor = "I")
	private int anInt2563;

	@OriginalMember(owner = "client!he", name = "f", descriptor = "I")
	private int anInt2566;

	@OriginalMember(owner = "client!he", name = "g", descriptor = "Lclient!ig;")
	private Class12 aClass12_6;

	@OriginalMember(owner = "client!he", name = "n", descriptor = "I")
	private int anInt2570;

	@OriginalMember(owner = "client!he", name = "p", descriptor = "I")
	public int anInt2572;

	@OriginalMember(owner = "client!he", name = "r", descriptor = "I")
	private int anInt2573;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "I")
	private final int anInt2562;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "I")
	private final int anInt2569;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "I")
	private final int anInt2567;

	@OriginalMember(owner = "client!he", name = "q", descriptor = "Z")
	private final boolean aBoolean187;

	@OriginalMember(owner = "client!he", name = "k", descriptor = "I")
	private final int anInt2568;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "I")
	private final int anInt2564;

	@OriginalMember(owner = "client!he", name = "o", descriptor = "I")
	private final int anInt2571;

	@OriginalMember(owner = "client!he", name = "e", descriptor = "I")
	private final int anInt2565;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt2562 = arg2;
		this.anInt2569 = arg3;
		this.anInt2567 = arg4;
		this.aBoolean187 = arg7;
		this.anInt2568 = arg1;
		this.anInt2564 = arg6;
		this.anInt2571 = arg5;
		this.anInt2565 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!qq;Lclient!he;)Z")
	public boolean method2342(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class102 arg1) {
		return this.aClass12_6 != null || this.method2343(arg0, arg1);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Lclient!qq;Lclient!he;)Z")
	private boolean method2343(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class102 arg1) {
		if (this.aClass12_6 == null) {
			if (this.anInt2565 == 0) {
				if (Static213.anInterface11_5.method2468(this.anInt2568)) {
					@Pc(23) int[] local23 = Static213.anInterface11_5.method2465(this.anInt2570, 0.7F, this.anInt2568, this.anInt2570);
					this.aClass12_6 = arg0.method3512(local23, this.anInt2570, this.anInt2570, this.anInt2570);
				}
			} else if (this.anInt2565 == 2) {
				this.method2350(arg0, arg1);
			} else if (this.anInt2565 == 1) {
				this.method2344(arg0, arg1);
			}
		}
		return this.aClass12_6 != null;
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(Lclient!qq;Lclient!he;)V")
	private void method2344(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class102 arg1) {
		Static142.method2347(arg0);
		Static142.method2351(arg0);
		arg0.method3524(Static142.anIntArray248);
		arg0.method3570(0, 0, this.anInt2570, this.anInt2570);
		arg0.method3552();
		arg0.method3559(0, 0, this.anInt2570, this.anInt2570, this.anInt2564 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean187) {
				local31 = -arg1.anInt2562;
				local33 = -arg1.anInt2569;
				local35 = -arg1.anInt2567;
			} else {
				local31 = arg1.anInt2562 - this.anInt2562;
				local33 = arg1.anInt2569 - this.anInt2569;
				local35 = arg1.anInt2567 - this.anInt2567;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt2566 != 0) {
			local79 = Class6_Sub1_Sub18.anIntArray642[this.anInt2566];
			local84 = Class6_Sub1_Sub18.anIntArray643[this.anInt2566];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt2563 != 0) {
			local79 = Class6_Sub1_Sub18.anIntArray642[this.anInt2563];
			local84 = Class6_Sub1_Sub18.anIntArray643[this.anInt2563];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class39 local147 = Static142.aClass39_5.method4863((byte) 0, 51200, true);
		if (arg0.method3576()) {
			local147.method4901((short) 0, (short) this.anInt2568);
		} else {
			local147.method4909((short) 127, Static213.anInterface11_5.method2466(this.anInt2568).aShort93);
			local147.method4901((short) 0, (short) -1);
		}
		arg0.method3583(1.0F);
		arg0.method3529(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt2570 * 1024 / (local147.method4890() - local147.method4877());
		if (this.anInt2564 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method3519(this.anInt2570 / 2, this.anInt2570 / 2, local84, local84);
		arg0.method3509(arg0.method3513());
		@Pc(223) Class132 local223 = arg0.method3513();
		local223.method3986(0, 0, arg0.method3543() - local147.method4894());
		local147.method4864(local223, null, 1024);
		@Pc(245) int local245 = this.anInt2570 * 13 / 16;
		@Pc(252) int local252 = (this.anInt2570 - local245) / 2;
		Static142.aClass12_7.method5659(local252, local252, local245, local245, 0, this.anInt2564 | 0xFF000000, 1);
		this.aClass12_6 = arg0.method3518(0, 0, this.anInt2570, this.anInt2570, true);
		arg0.method3552();
		arg0.method3559(0, 0, this.anInt2570, this.anInt2570, 0, 0);
		Static142.aClass12_5.method5659(0, 0, this.anInt2570, this.anInt2570, 1, 0, 0);
		this.aClass12_6.method5660(0);
		arg0.method3570(Static142.anIntArray248[0], Static142.anIntArray248[1], Static142.anIntArray248[2], Static142.anIntArray248[3]);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII)Z")
	public boolean method2346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean187) {
			this.anInt2572 = 1073741823;
			local7 = this.anInt2562;
			local12 = this.anInt2569;
			local17 = this.anInt2567;
		} else {
			local7 = this.anInt2562 - arg0;
			local12 = this.anInt2569 - arg1;
			local17 = this.anInt2567 - arg2;
			this.anInt2572 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt2572 == 0) {
				this.anInt2572 = 1;
			}
			local7 = (local7 << 8) / this.anInt2572;
			local12 = (local12 << 8) / this.anInt2572;
			local17 = (local17 << 8) / this.anInt2572;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt2573 = this.anInt2571 * arg3 / (this.aBoolean187 ? 1024 : this.anInt2572);
		} else {
			this.anInt2573 = 0;
		}
		if (this.anInt2573 < 8) {
			this.aClass12_6 = null;
			return false;
		}
		@Pc(143) int local143 = Static420.method5696(this.anInt2573);
		if (local143 > arg3) {
			local143 = Static191.method2948(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt2570) {
			this.anInt2570 = local143;
		}
		this.anInt2566 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt2563 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass12_6 = null;
		return true;
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "()V")
	public void method2348() {
		this.aClass12_6 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!qq;IIIIII)V")
	public void method2349(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass12_6 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt2566 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt2563 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt2573) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt2573) / 2;
		if (local38 < arg4 && local38 + this.anInt2573 > 0 && local51 < arg3 && local51 + this.anInt2573 > 0) {
			this.aClass12_6.method5667(local51 + arg1, local38 + arg2, this.anInt2573, this.anInt2573);
		}
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(Lclient!qq;Lclient!he;)V")
	private void method2350(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class102 arg1) {
		@Pc(6) Class266 local6 = Static249.method3846(this.anInt2568, Static314.aClass158_89);
		if (local6 == null) {
			return;
		}
		arg0.method3524(Static142.anIntArray248);
		arg0.method3570(0, 0, this.anInt2570, this.anInt2570);
		arg0.method3559(0, 0, this.anInt2570, this.anInt2570, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean187) {
				local32 = -arg1.anInt2562;
				local34 = -arg1.anInt2569;
				local36 = -arg1.anInt2567;
			} else {
				local32 = this.anInt2562 - arg1.anInt2562;
				local34 = this.anInt2569 - arg1.anInt2569;
				local36 = this.anInt2567 - arg1.anInt2567;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt2566 != 0) {
			local81 = -this.anInt2566 & 0x3FFF;
			local85 = Class6_Sub1_Sub18.anIntArray642[local81];
			local89 = Class6_Sub1_Sub18.anIntArray643[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt2563 != 0) {
			local81 = -this.anInt2563 & 0x3FFF;
			local85 = Class6_Sub1_Sub18.anIntArray642[local81];
			local89 = Class6_Sub1_Sub18.anIntArray643[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method3583(1.0F);
		arg0.method3529(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class39 local172 = arg0.method3496(local6, 2048, 0, 64, 768);
		local85 = local172.method4890() - local172.method4877();
		local89 = local172.method4905() - local172.method4875();
		local99 = local172.method4877() + local85 / 2;
		@Pc(198) int local198 = local172.method4875() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method3519(local99, local198, local205, local205);
		arg0.method3509(arg0.method3513());
		@Pc(218) Class132 local218 = arg0.method3564();
		local218.method3986(0, 0, arg0.method3543() - local172.method4894());
		local172.method4864(local218, null, arg0.method3543());
		this.aClass12_6 = arg0.method3518(0, 0, this.anInt2570, this.anInt2570, true);
		this.aClass12_6.method5660(3);
		arg0.method3570(Static142.anIntArray248[0], Static142.anIntArray248[1], Static142.anIntArray248[2], Static142.anIntArray248[3]);
	}
}
