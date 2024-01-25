import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class24 {

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
	private int anInt441;

	@OriginalMember(owner = "client!bj", name = "h", descriptor = "Lclient!kr;")
	private Class46 aClass46_3;

	@OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
	private int anInt444;

	@OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
	public int anInt445;

	@OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
	private int anInt448;

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
	private int anInt450;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
	private final int anInt440;

	@OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
	private final int anInt449;

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
	private final int anInt443;

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "Z")
	private final boolean aBoolean36;

	@OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
	private final int anInt451;

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
	private final int anInt442;

	@OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
	private final int anInt447;

	@OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
	private final int anInt446;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt440 = arg2;
		this.anInt449 = arg3;
		this.anInt443 = arg4;
		this.aBoolean36 = arg7;
		this.anInt451 = arg1;
		this.anInt442 = arg6;
		this.anInt447 = arg5;
		this.anInt446 = arg0;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!dr;Lclient!bj;)Z")
	public boolean method375(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class24 arg1) {
		return this.aClass46_3 != null || this.method377(arg0, arg1);
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(Lclient!dr;Lclient!bj;)Z")
	private boolean method377(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class24 arg1) {
		if (this.aClass46_3 == null) {
			if (this.anInt446 == 0) {
				if (Static209.anInterface3_8.method167(this.anInt451)) {
					@Pc(23) int[] local23 = Static209.anInterface3_8.method164(0.7F, this.anInt444, this.anInt451, this.anInt444);
					this.aClass46_3 = arg0.method3729(local23, this.anInt444, this.anInt444, this.anInt444);
				}
			} else if (this.anInt446 == 2) {
				this.method379(arg0, arg1);
			} else if (this.anInt446 == 1) {
				this.method381(arg0, arg1);
			}
		}
		return this.aClass46_3 != null;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIII)Z")
	public boolean method378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean36) {
			this.anInt445 = 1073741823;
			local7 = this.anInt440;
			local12 = this.anInt449;
			local17 = this.anInt443;
		} else {
			local7 = this.anInt440 - arg0;
			local12 = this.anInt449 - arg1;
			local17 = this.anInt443 - arg2;
			this.anInt445 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt445 == 0) {
				this.anInt445 = 1;
			}
			local7 = (local7 << 8) / this.anInt445;
			local12 = (local12 << 8) / this.anInt445;
			local17 = (local17 << 8) / this.anInt445;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt450 = this.anInt447 * arg3 / (this.aBoolean36 ? 1024 : this.anInt445);
		} else {
			this.anInt450 = 0;
		}
		if (this.anInt450 < 8) {
			this.aClass46_3 = null;
			return false;
		}
		@Pc(143) int local143 = Static51.method1026(this.anInt450);
		if (local143 > arg3) {
			local143 = Static344.method5603(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt444) {
			this.anInt444 = local143;
		}
		this.anInt448 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt441 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass46_3 = null;
		return true;
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(Lclient!dr;Lclient!bj;)V")
	private void method379(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class24 arg1) {
		@Pc(6) Class111 local6 = Static309.method5155(this.anInt451, Static219.aClass104_125);
		if (local6 == null) {
			return;
		}
		arg0.method3676(Static29.anIntArray56);
		arg0.method3677(0, 0, this.anInt444, this.anInt444);
		arg0.method3712(0, 0, this.anInt444, this.anInt444, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean36) {
				local32 = -arg1.anInt440;
				local34 = -arg1.anInt449;
				local36 = -arg1.anInt443;
			} else {
				local32 = this.anInt440 - arg1.anInt440;
				local34 = this.anInt449 - arg1.anInt449;
				local36 = this.anInt443 - arg1.anInt443;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt448 != 0) {
			local81 = -this.anInt448 & 0x3FFF;
			local85 = Class101.anIntArray234[local81];
			local89 = Class101.anIntArray235[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt441 != 0) {
			local81 = -this.anInt441 & 0x3FFF;
			local85 = Class101.anIntArray234[local81];
			local89 = Class101.anIntArray235[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method3717(1.0F);
		arg0.method3664(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class49 local172 = arg0.method3667(local6, 1024, 0, 64, 768);
		local85 = local172.method5827() - local172.method5826();
		local89 = local172.method5845() - local172.method5842();
		local99 = local172.method5826() + local85 / 2;
		@Pc(198) int local198 = local172.method5842() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method3716(local99, local198, local205, local205);
		arg0.method3682(arg0.method3736());
		@Pc(218) Class38 local218 = arg0.method3672();
		local218.method4474(0, 0, arg0.method3706() - local172.method5834());
		local172.method5835(local218, null, arg0.method3706());
		this.aClass46_3 = arg0.method3741(0, 0, this.anInt444, this.anInt444, true);
		this.aClass46_3.method5024(3);
		arg0.method3677(Static29.anIntArray56[0], Static29.anIntArray56[1], Static29.anIntArray56[2], Static29.anIntArray56[3]);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "()V")
	public void method380() {
		this.aClass46_3 = null;
	}

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "(Lclient!dr;Lclient!bj;)V")
	private void method381(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class24 arg1) {
		Static29.method382(arg0);
		Static29.method376(arg0);
		arg0.method3676(Static29.anIntArray56);
		arg0.method3677(0, 0, this.anInt444, this.anInt444);
		arg0.method3665();
		arg0.method3712(0, 0, this.anInt444, this.anInt444, this.anInt442 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean36) {
				local31 = -arg1.anInt440;
				local33 = -arg1.anInt449;
				local35 = -arg1.anInt443;
			} else {
				local31 = arg1.anInt440 - this.anInt440;
				local33 = arg1.anInt449 - this.anInt449;
				local35 = arg1.anInt443 - this.anInt443;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt448 != 0) {
			local79 = Class101.anIntArray234[this.anInt448];
			local84 = Class101.anIntArray235[this.anInt448];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt441 != 0) {
			local79 = Class101.anIntArray234[this.anInt441];
			local84 = Class101.anIntArray235[this.anInt441];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class49 local147 = Static29.aClass49_1.method5810((byte) 0, 25600, true);
		if (arg0.method3679()) {
			local147.method5847((short) 0, (short) this.anInt451);
		} else {
			local147.method5850((short) 127, Static209.anInterface3_8.method166(this.anInt451).aShort40);
			local147.method5847((short) 0, (short) -1);
		}
		arg0.method3717(1.0F);
		arg0.method3664(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt444 * 1024 / (local147.method5827() - local147.method5826());
		if (this.anInt442 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method3716(this.anInt444 / 2, this.anInt444 / 2, local84, local84);
		arg0.method3682(arg0.method3736());
		@Pc(223) Class38 local223 = arg0.method3736();
		local223.method4474(0, 0, arg0.method3706() - local147.method5834());
		local147.method5835(local223, null, 1024);
		@Pc(245) int local245 = this.anInt444 * 13 / 16;
		@Pc(252) int local252 = (this.anInt444 - local245) / 2;
		Static29.aClass46_4.method5026(local252, local252, local245, local245, 1, this.anInt442 | 0xFF000000, 1);
		this.aClass46_3 = arg0.method3741(0, 0, this.anInt444, this.anInt444, true);
		arg0.method3665();
		arg0.method3712(0, 0, this.anInt444, this.anInt444, 0, 0);
		Static29.aClass46_2.method5026(0, 0, this.anInt444, this.anInt444, 0, 0, 0);
		this.aClass46_3.method5024(0);
		arg0.method3677(Static29.anIntArray56[0], Static29.anIntArray56[1], Static29.anIntArray56[2], Static29.anIntArray56[3]);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!dr;IIIIII)V")
	public void method385(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass46_3 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt448 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt441 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt450) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt450) / 2;
		if (local38 < arg4 && local38 + this.anInt450 > 0 && local51 < arg3 && local51 + this.anInt450 > 0) {
			this.aClass46_3.method5021(local51 + arg1, local38 + arg2, this.anInt450, this.anInt450);
		}
	}
}
