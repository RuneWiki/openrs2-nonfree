import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class19 {

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
	private int anInt514;

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
	private int anInt515;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
	private int anInt519;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "Lclient!lf;")
	private Class90 aClass90_3;

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
	public int anInt520;

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
	private int anInt523;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
	private final int anInt517;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
	private final int anInt518;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
	private final int anInt513;

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "Z")
	private final boolean aBoolean59;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
	private final int anInt516;

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
	private final int anInt522;

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
	private final int anInt524;

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
	private final int anInt521;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt517 = arg2;
		this.anInt518 = arg3;
		this.anInt513 = arg4;
		this.aBoolean59 = arg7;
		this.anInt516 = arg1;
		this.anInt522 = arg6;
		this.anInt524 = arg5;
		this.anInt521 = arg0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!aa;Lclient!bf;)V")
	private void method574(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class19 arg1) {
		@Pc(6) Class12 local6 = Static328.method5503(Static234.aClass165_71, this.anInt516);
		if (local6 == null) {
			return;
		}
		arg0.method3311(Static22.anIntArray77);
		arg0.method3250(0, 0, this.anInt523, this.anInt523);
		arg0.method3300(0, 0, this.anInt523, this.anInt523, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean59) {
				local32 = -arg1.anInt517;
				local34 = -arg1.anInt518;
				local36 = -arg1.anInt513;
			} else {
				local32 = this.anInt517 - arg1.anInt517;
				local34 = this.anInt518 - arg1.anInt518;
				local36 = this.anInt513 - arg1.anInt513;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt519 != 0) {
			local81 = -this.anInt519 & 0x3FFF;
			local85 = Class1_Sub1_Sub16.anIntArray587[local81];
			local89 = Class1_Sub1_Sub16.anIntArray586[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt515 != 0) {
			local81 = -this.anInt515 & 0x3FFF;
			local85 = Class1_Sub1_Sub16.anIntArray587[local81];
			local89 = Class1_Sub1_Sub16.anIntArray586[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method3341(1.0F);
		arg0.method3329(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class78 local172 = arg0.method3251(local6, 1024, 0, 64, 768);
		local85 = local172.method4363() - local172.method4387();
		local89 = local172.method4368() - local172.method4388();
		local99 = local172.method4387() + local85 / 2;
		@Pc(198) int local198 = local172.method4388() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method3278(local99, local198, local205, local205);
		arg0.method3239(arg0.method3298());
		@Pc(218) Class21 local218 = arg0.method3284();
		local218.method2814(0, 0, arg0.method3340() - local172.method4378());
		local172.method4384(local218, null, arg0.method3340());
		this.aClass90_3 = arg0.method3266(0, 0, this.anInt523, this.anInt523, true);
		this.aClass90_3.method5456(3);
		arg0.method3250(Static22.anIntArray77[0], Static22.anIntArray77[1], Static22.anIntArray77[2], Static22.anIntArray77[3]);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(Lclient!aa;Lclient!bf;)Z")
	private boolean method575(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class19 arg1) {
		if (this.aClass90_3 == null) {
			if (this.anInt521 == 0) {
				if (Static172.anInterface7_8.method2789(this.anInt516)) {
					@Pc(23) int[] local23 = Static172.anInterface7_8.method2790(this.anInt516, 0.7F, this.anInt523, this.anInt523);
					this.aClass90_3 = arg0.method3288(local23, this.anInt523, this.anInt523, this.anInt523);
				}
			} else if (this.anInt521 == 2) {
				this.method574(arg0, arg1);
			} else if (this.anInt521 == 1) {
				this.method576(arg0, arg1);
			}
		}
		return this.aClass90_3 != null;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(Lclient!aa;Lclient!bf;)V")
	private void method576(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class19 arg1) {
		Static22.method577(arg0);
		Static22.method582(arg0);
		arg0.method3311(Static22.anIntArray77);
		arg0.method3250(0, 0, this.anInt523, this.anInt523);
		arg0.method3294();
		arg0.method3300(0, 0, this.anInt523, this.anInt523, this.anInt522 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean59) {
				local31 = -arg1.anInt517;
				local33 = -arg1.anInt518;
				local35 = -arg1.anInt513;
			} else {
				local31 = arg1.anInt517 - this.anInt517;
				local33 = arg1.anInt518 - this.anInt518;
				local35 = arg1.anInt513 - this.anInt513;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt519 != 0) {
			local79 = Class1_Sub1_Sub16.anIntArray587[this.anInt519];
			local84 = Class1_Sub1_Sub16.anIntArray586[this.anInt519];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt515 != 0) {
			local79 = Class1_Sub1_Sub16.anIntArray587[this.anInt515];
			local84 = Class1_Sub1_Sub16.anIntArray586[this.anInt515];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class78 local147 = Static22.aClass78_2.method4394((byte) 0, 25600, true);
		if (arg0.method3321()) {
			local147.method4404((short) 0, (short) this.anInt516);
		} else {
			local147.method4374((short) 127, Static172.anInterface7_8.method2788(this.anInt516).aShort90);
			local147.method4404((short) 0, (short) -1);
		}
		arg0.method3341(1.0F);
		arg0.method3329(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt523 * 1024 / (local147.method4363() - local147.method4387());
		if (this.anInt522 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method3278(this.anInt523 / 2, this.anInt523 / 2, local84, local84);
		arg0.method3239(arg0.method3298());
		@Pc(223) Class21 local223 = arg0.method3298();
		local223.method2814(0, 0, arg0.method3340() - local147.method4378());
		local147.method4384(local223, null, 1024);
		@Pc(245) int local245 = this.anInt523 * 13 / 16;
		@Pc(252) int local252 = (this.anInt523 - local245) / 2;
		Static22.aClass90_1.method5458(local252, local252, local245, local245, 1, this.anInt522 | 0xFF000000, 1);
		this.aClass90_3 = arg0.method3266(0, 0, this.anInt523, this.anInt523, true);
		arg0.method3294();
		arg0.method3300(0, 0, this.anInt523, this.anInt523, 0, 0);
		Static22.aClass90_2.method5458(0, 0, this.anInt523, this.anInt523, 0, 0, 0);
		this.aClass90_3.method5456(0);
		arg0.method3250(Static22.anIntArray77[0], Static22.anIntArray77[1], Static22.anIntArray77[2], Static22.anIntArray77[3]);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)Z")
	public boolean method578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean59) {
			this.anInt520 = 1073741823;
			local7 = this.anInt517;
			local12 = this.anInt518;
			local17 = this.anInt513;
		} else {
			local7 = this.anInt517 - arg0;
			local12 = this.anInt518 - arg1;
			local17 = this.anInt513 - arg2;
			this.anInt520 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt520 == 0) {
				this.anInt520 = 1;
			}
			local7 = (local7 << 8) / this.anInt520;
			local12 = (local12 << 8) / this.anInt520;
			local17 = (local17 << 8) / this.anInt520;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt514 = this.anInt524 * arg3 / (this.aBoolean59 ? 1024 : this.anInt520);
		} else {
			this.anInt514 = 0;
		}
		if (this.anInt514 < 8) {
			this.aClass90_3 = null;
			return false;
		}
		@Pc(143) int local143 = Static339.method5608(this.anInt514);
		if (local143 > arg3) {
			local143 = Static244.method4321(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt523) {
			this.anInt523 = local143;
		}
		this.anInt519 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt515 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass90_3 = null;
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(Lclient!aa;Lclient!bf;)Z")
	public boolean method579(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class19 arg1) {
		return this.aClass90_3 != null || this.method575(arg0, arg1);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "()V")
	public void method581() {
		this.aClass90_3 = null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!aa;IIIIII)V")
	public void method584(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass90_3 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt519 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt515 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt514) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt514) / 2;
		if (local38 < arg4 && local38 + this.anInt514 > 0 && local51 < arg3 && local51 + this.anInt514 > 0) {
			this.aClass90_3.method5462(local51 + arg1, local38 + arg2, this.anInt514, this.anInt514);
		}
	}
}
