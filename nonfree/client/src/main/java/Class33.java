import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class33 {

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
	public int anInt914;

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "Lclient!cq;")
	private Class8 aClass8_6;

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
	private int anInt917;

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
	private int anInt919;

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
	private final int anInt912;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
	private final int anInt911;

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
	private final int anInt915;

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "Z")
	private final boolean aBoolean53;

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
	private final int anInt920;

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
	private final int anInt910;

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
	private final int anInt909;

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
	private final int anInt913;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt912 = arg2;
		this.anInt911 = arg3;
		this.anInt915 = arg4;
		this.aBoolean53 = arg7;
		this.anInt920 = arg1;
		this.anInt910 = arg6;
		this.anInt909 = arg5;
		this.anInt913 = arg0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "()V")
	public void method709() {
		this.aClass8_6 = null;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!ii;Lclient!cg;)V")
	private void method711(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class33 arg1) {
		@Pc(6) Class219 local6 = Static154.method2690(this.anInt920, Static347.aClass134_151);
		if (local6 == null) {
			return;
		}
		arg0.method4292(Static36.anIntArray54);
		arg0.method4268(0, 0, this.anInt919, this.anInt919);
		arg0.method4249(0, 0, this.anInt919, this.anInt919, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean53) {
				local32 = -arg1.anInt912;
				local34 = -arg1.anInt911;
				local36 = -arg1.anInt915;
			} else {
				local32 = this.anInt912 - arg1.anInt912;
				local34 = this.anInt911 - arg1.anInt911;
				local36 = this.anInt915 - arg1.anInt915;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt917 != 0) {
			local81 = -this.anInt917 & 0x3FFF;
			local85 = Class1_Sub5_Sub15.anIntArray335[local81];
			local89 = Class1_Sub5_Sub15.anIntArray333[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt916 != 0) {
			local81 = -this.anInt916 & 0x3FFF;
			local85 = Class1_Sub5_Sub15.anIntArray335[local81];
			local89 = Class1_Sub5_Sub15.anIntArray333[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.method4286(1.0F);
		arg0.method4243(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class40 local172 = arg0.method4301(local6, 1024, 0, 64, 768);
		local85 = local172.method4607() - local172.method4574();
		local89 = local172.method4616() - local172.method4572();
		local99 = local172.method4574() + local85 / 2;
		@Pc(198) int local198 = local172.method4572() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.method4282(local99, local198, local205, local205);
		arg0.method4213(arg0.method4267());
		@Pc(218) Class31 local218 = arg0.method4304();
		local218.method3187(0, 0, arg0.method4239() - local172.method4577());
		local172.method4592(local218, null, arg0.method4239());
		this.aClass8_6 = arg0.method4228(0, 0, this.anInt919, this.anInt919, true);
		this.aClass8_6.method4398(3);
		arg0.method4268(Static36.anIntArray54[0], Static36.anIntArray54[1], Static36.anIntArray54[2], Static36.anIntArray54[3]);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIII)Z")
	public boolean method712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean53) {
			this.anInt914 = 1073741823;
			local7 = this.anInt912;
			local12 = this.anInt911;
			local17 = this.anInt915;
		} else {
			local7 = this.anInt912 - arg0;
			local12 = this.anInt911 - arg1;
			local17 = this.anInt915 - arg2;
			this.anInt914 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt914 == 0) {
				this.anInt914 = 1;
			}
			local7 = (local7 << 8) / this.anInt914;
			local12 = (local12 << 8) / this.anInt914;
			local17 = (local17 << 8) / this.anInt914;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt918 = this.anInt909 * arg3 / (this.aBoolean53 ? 1024 : this.anInt914);
		} else {
			this.anInt918 = 0;
		}
		if (this.anInt918 < 8) {
			this.aClass8_6 = null;
			return false;
		}
		@Pc(143) int local143 = Static304.method5275(this.anInt918);
		if (local143 > arg3) {
			local143 = Static351.method3411(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt919) {
			this.anInt919 = local143;
		}
		this.anInt917 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt916 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass8_6 = null;
		return true;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(Lclient!ii;Lclient!cg;)Z")
	public boolean method713(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class33 arg1) {
		return this.aClass8_6 != null || this.method718(arg0, arg1);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!ii;IIIIII)V")
	public void method715(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass8_6 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt917 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt916 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt918) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt918) / 2;
		if (local38 < arg4 && local38 + this.anInt918 > 0 && local51 < arg3 && local51 + this.anInt918 > 0) {
			this.aClass8_6.method4390(local51 + arg1, local38 + arg2, this.anInt918, this.anInt918);
		}
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(Lclient!ii;Lclient!cg;)Z")
	private boolean method718(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class33 arg1) {
		if (this.aClass8_6 == null) {
			if (this.anInt913 == 0) {
				if (Static159.anInterface2_7.method952(this.anInt920)) {
					@Pc(23) int[] local23 = Static159.anInterface2_7.method950(this.anInt919, this.anInt919, 0.7F, this.anInt920);
					this.aClass8_6 = arg0.method4257(local23, this.anInt919, this.anInt919, this.anInt919);
				}
			} else if (this.anInt913 == 2) {
				this.method711(arg0, arg1);
			} else if (this.anInt913 == 1) {
				this.method719(arg0, arg1);
			}
		}
		return this.aClass8_6 != null;
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(Lclient!ii;Lclient!cg;)V")
	private void method719(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class33 arg1) {
		Static36.method714(arg0);
		Static36.method717(arg0);
		arg0.method4292(Static36.anIntArray54);
		arg0.method4268(0, 0, this.anInt919, this.anInt919);
		arg0.method4246();
		arg0.method4249(0, 0, this.anInt919, this.anInt919, this.anInt910 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean53) {
				local31 = -arg1.anInt912;
				local33 = -arg1.anInt911;
				local35 = -arg1.anInt915;
			} else {
				local31 = arg1.anInt912 - this.anInt912;
				local33 = arg1.anInt911 - this.anInt911;
				local35 = arg1.anInt915 - this.anInt915;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt917 != 0) {
			local79 = Class1_Sub5_Sub15.anIntArray335[this.anInt917];
			local84 = Class1_Sub5_Sub15.anIntArray333[this.anInt917];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt916 != 0) {
			local79 = Class1_Sub5_Sub15.anIntArray335[this.anInt916];
			local84 = Class1_Sub5_Sub15.anIntArray333[this.anInt916];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class40 local147 = Static36.aClass40_2.method4599((byte) 0, 25600, true);
		if (arg0.method4251()) {
			local147.method4610((short) 0, (short) this.anInt920);
		} else {
			local147.method4579((short) 127, Static159.anInterface2_7.method951(this.anInt920).aShort56);
			local147.method4610((short) 0, (short) -1);
		}
		arg0.method4286(1.0F);
		arg0.method4243(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt919 * 1024 / (local147.method4607() - local147.method4574());
		if (this.anInt910 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.method4282(this.anInt919 / 2, this.anInt919 / 2, local84, local84);
		arg0.method4213(arg0.method4267());
		@Pc(223) Class31 local223 = arg0.method4267();
		local223.method3187(0, 0, arg0.method4239() - local147.method4577());
		local147.method4592(local223, null, 1024);
		@Pc(245) int local245 = this.anInt919 * 13 / 16;
		@Pc(252) int local252 = (this.anInt919 - local245) / 2;
		Static36.aClass8_7.method4391(local252, local252, local245, local245, 1, this.anInt910 | 0xFF000000, 1);
		this.aClass8_6 = arg0.method4228(0, 0, this.anInt919, this.anInt919, true);
		arg0.method4246();
		arg0.method4249(0, 0, this.anInt919, this.anInt919, 0, 0);
		Static36.aClass8_5.method4391(0, 0, this.anInt919, this.anInt919, 0, 0, 0);
		this.aClass8_6.method4398(0);
		arg0.method4268(Static36.anIntArray54[0], Static36.anIntArray54[1], Static36.anIntArray54[2], Static36.anIntArray54[3]);
	}
}
