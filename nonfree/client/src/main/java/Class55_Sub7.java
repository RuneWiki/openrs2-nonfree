import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class55_Sub7 extends Class55 {

	@OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
	public int anInt8290;

	@OriginalMember(owner = "client!qj", name = "C", descriptor = "I")
	private int anInt8295;

	@OriginalMember(owner = "client!qj", name = "D", descriptor = "I")
	private int anInt8296;

	@OriginalMember(owner = "client!qj", name = "E", descriptor = "I")
	private int anInt8297;

	@OriginalMember(owner = "client!qj", name = "F", descriptor = "I")
	private int anInt8298;

	@OriginalMember(owner = "client!qj", name = "G", descriptor = "I")
	private int anInt8299;

	@OriginalMember(owner = "client!qj", name = "H", descriptor = "I")
	private int anInt8300;

	@OriginalMember(owner = "client!qj", name = "I", descriptor = "I")
	private int anInt8301;

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
	private int anInt8287 = 0;

	@OriginalMember(owner = "client!qj", name = "s", descriptor = "Z")
	public boolean aBoolean680 = false;

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "Lclient!hs;")
	public Class149 aClass149_1 = new Class149();

	@OriginalMember(owner = "client!qj", name = "A", descriptor = "Lclient!hs;")
	private Class149 aClass149_2 = new Class149();

	@OriginalMember(owner = "client!qj", name = "B", descriptor = "Z")
	private boolean aBoolean681 = false;

	@OriginalMember(owner = "client!qj", name = "w", descriptor = "Lclient!ru;")
	public final Class55_Sub8 aClass55_Sub8_7;

	@OriginalMember(owner = "client!qj", name = "x", descriptor = "J")
	private final long aLong203;

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "Lclient!gi;")
	public final Class121 aClass121_2;

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "Lclient!hm;")
	public Class144 aClass144_1;

	@OriginalMember(owner = "client!qj", name = "y", descriptor = "Lclient!hca;")
	public final Class134 aClass134_8;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!oa;Lclient!gi;Lclient!ru;J)V")
	public Class55_Sub7(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class55_Sub8 arg2, @OriginalArg(3) long arg3) {
		this.aClass55_Sub8_7 = arg2;
		this.aLong203 = arg3;
		this.aClass121_2 = arg1;
		this.aClass144_1 = this.aClass121_2.method3080();
		if (!arg0.method5280() && this.aClass144_1.anInt3853 != -1) {
			this.aClass144_1 = Static141.method2862(this.aClass144_1.anInt3853);
		}
		this.aClass134_8 = new Class134();
		this.anInt8287 = (int) ((double) this.anInt8287 + Math.random() * 64.0D);
		this.method6824();
		this.aClass149_2.anInt3926 = this.aClass149_1.anInt3926;
		this.aClass149_2.anInt3927 = this.aClass149_1.anInt3927;
		this.aClass149_2.anInt3920 = this.aClass149_1.anInt3920;
		this.aClass149_2.anInt3921 = this.aClass149_1.anInt3921;
		this.aClass149_2.anInt3916 = this.aClass149_1.anInt3916;
		this.aClass149_2.anInt3930 = this.aClass149_1.anInt3930;
		this.aClass149_2.anInt3928 = this.aClass149_1.anInt3928;
		this.aClass149_2.anInt3918 = this.aClass149_1.anInt3918;
		this.aClass149_2.anInt3929 = this.aClass149_1.anInt3929;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(JLclient!oa;I)V")
	public void method6819(@OriginalArg(0) long arg0, @OriginalArg(1) Class15 arg1) {
		for (@Pc(5) Class55_Sub2_Sub1_Sub1 local5 = (Class55_Sub2_Sub1_Sub1) this.aClass134_8.method3233(); local5 != null; local5 = (Class55_Sub2_Sub1_Sub1) this.aClass134_8.method3230()) {
			local5.method2492(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(JBLclient!oa;IZ)V")
	public void method6823(@OriginalArg(0) long arg0, @OriginalArg(2) Class15 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(51) int local51;
		if (this.aBoolean680) {
			arg3 = false;
		} else if (this.aClass144_1.anInt3849 > Static95.anInt2313) {
			arg3 = false;
		} else if (Static294.anIntArray663[Static95.anInt2313] < Static589.anInt10307) {
			arg3 = false;
		} else if (this.aBoolean681) {
			arg3 = false;
		} else if (this.aClass144_1.anInt3850 != -1) {
			local51 = (int) (arg0 - this.aLong203);
			if (this.aClass144_1.aBoolean292 || this.aClass144_1.anInt3850 >= local51) {
				local51 %= this.aClass144_1.anInt3850;
			} else {
				arg3 = false;
			}
			if (!this.aClass144_1.aBoolean297 && local51 < this.aClass144_1.anInt3829) {
				arg3 = false;
			}
			if (this.aClass144_1.aBoolean297 && this.aClass144_1.anInt3829 <= local51) {
				arg3 = false;
			}
		}
		if (arg3) {
			Static217.anInt4435++;
			local51 = (this.aClass149_1.anInt3920 + this.aClass149_1.anInt3921 + this.aClass149_1.anInt3928) / 3;
			@Pc(132) int local132 = (this.aClass149_1.anInt3929 + this.aClass149_1.anInt3927 + this.aClass149_1.anInt3926) / 3;
			@Pc(147) int local147 = (this.aClass149_1.anInt3916 + this.aClass149_1.anInt3918 + this.aClass149_1.anInt3930) / 3;
			@Pc(187) int local187;
			@Pc(196) int local196;
			@Pc(205) int local205;
			@Pc(214) int local214;
			@Pc(223) int local223;
			@Pc(232) int local232;
			@Pc(333) int local333;
			@Pc(389) int local389;
			@Pc(410) int local410;
			if (local51 != this.aClass149_1.anInt3914 || this.aClass149_1.anInt3919 != local132 || this.aClass149_1.anInt3915 != local147) {
				this.aClass149_1.anInt3915 = local147;
				this.aClass149_1.anInt3919 = local132;
				this.aClass149_1.anInt3914 = local51;
				local187 = this.aClass149_1.anInt3920 - this.aClass149_1.anInt3921;
				local196 = this.aClass149_1.anInt3929 - this.aClass149_1.anInt3927;
				local205 = this.aClass149_1.anInt3918 - this.aClass149_1.anInt3916;
				local214 = this.aClass149_1.anInt3928 - this.aClass149_1.anInt3921;
				local223 = this.aClass149_1.anInt3926 - this.aClass149_1.anInt3927;
				local232 = this.aClass149_1.anInt3930 - this.aClass149_1.anInt3916;
				this.anInt8300 = local223 * local187 - local214 * local196;
				this.anInt8295 = local232 * local196 - local205 * local223;
				this.anInt8297 = local214 * local205 - local232 * local187;
				while (true) {
					if (this.anInt8295 <= 32767 && this.anInt8297 <= 32767 && this.anInt8300 <= 32767 && this.anInt8295 >= -32767 && this.anInt8297 >= -32767 && this.anInt8300 >= -32767) {
						local333 = (int) Math.sqrt((double) (this.anInt8300 * this.anInt8300 + this.anInt8295 * this.anInt8295 + this.anInt8297 * this.anInt8297));
						if (local333 <= 0) {
							local333 = 1;
						}
						this.anInt8297 = this.anInt8297 * 32767 / local333;
						this.anInt8295 = this.anInt8295 * 32767 / local333;
						this.anInt8300 = this.anInt8300 * 32767 / local333;
						if (this.aClass144_1.aShort49 > 0 || this.aClass144_1.aShort48 > 0) {
							local389 = (int) (Math.atan2((double) this.anInt8300, (double) this.anInt8295) * 2607.5945876176133D);
							local410 = (int) (Math.atan2((double) this.anInt8297, Math.sqrt((double) (this.anInt8295 * this.anInt8295 + this.anInt8300 * this.anInt8300))) * 2607.5945876176133D);
							this.anInt8296 = this.aClass144_1.aShort49 - this.aClass144_1.aShort47;
							this.anInt8298 = this.aClass144_1.aShort48 - this.aClass144_1.aShort50;
							this.anInt8301 = local389 + this.aClass144_1.aShort47 - (this.anInt8296 >> 1);
							this.anInt8299 = local410 + this.aClass144_1.aShort50 - (this.anInt8298 >> 1);
						}
						break;
					}
					this.anInt8300 >>= 0x1;
					this.anInt8297 >>= 0x1;
					this.anInt8295 >>= 0x1;
				}
			}
			this.anInt8287 += (int) (((double) this.aClass144_1.anInt3832 + (double) (this.aClass144_1.anInt3818 - this.aClass144_1.anInt3832) * Math.random()) * (double) arg2);
			if (this.anInt8287 > 63) {
				local187 = this.anInt8287 >> 6;
				this.anInt8287 &= 0x3F;
				for (local223 = 0; local223 < local187; local223++) {
					@Pc(553) int local553;
					@Pc(557) int local557;
					if (this.aClass144_1.aShort49 <= 0 && this.aClass144_1.aShort48 <= 0) {
						local205 = this.anInt8297;
						local214 = this.anInt8300;
						local196 = this.anInt8295;
					} else {
						local232 = this.anInt8301 + (int) ((double) this.anInt8296 * Math.random());
						local232 &= 0x3FFF;
						local333 = Class2_Sub3.anIntArray620[local232];
						local389 = Class2_Sub3.anIntArray621[local232];
						local410 = (int) (Math.random() * (double) this.anInt8298) + this.anInt8299;
						local410 &= 0x1FFF;
						local553 = Class2_Sub3.anIntArray620[local410];
						local557 = Class2_Sub3.anIntArray621[local410];
						local196 = local553 * local389 >> 13;
						local205 = (local557 << 1) * -1;
						local214 = local553 * local333 >> 13;
					}
					@Pc(590) float local590 = (float) Math.random();
					@Pc(593) float local593 = (float) Math.random();
					if (local590 + local593 > 1.0F) {
						local593 = 1.0F - local593;
						local590 = 1.0F - local590;
					}
					@Pc(615) float local615 = 1.0F - local590 - local593;
					local410 = (int) (local590 * (float) this.aClass149_1.anInt3921 + local593 * (float) this.aClass149_1.anInt3920 + local615 * (float) this.aClass149_1.anInt3928);
					local553 = (int) (local615 * (float) this.aClass149_1.anInt3926 + local593 * (float) this.aClass149_1.anInt3929 + local590 * (float) this.aClass149_1.anInt3927);
					local557 = (int) ((float) this.aClass149_1.anInt3930 * local615 + (float) this.aClass149_1.anInt3916 * local590 + (float) this.aClass149_1.anInt3918 * local593);
					@Pc(703) int local703 = (int) ((float) this.aClass149_2.anInt3928 * local615 + local590 * (float) this.aClass149_2.anInt3921 + local593 * (float) this.aClass149_2.anInt3920);
					@Pc(725) int local725 = (int) ((float) this.aClass149_2.anInt3927 * local590 + (float) this.aClass149_2.anInt3929 * local593 + local615 * (float) this.aClass149_2.anInt3926);
					@Pc(747) int local747 = (int) (local615 * (float) this.aClass149_2.anInt3930 + (float) this.aClass149_2.anInt3918 * local593 + (float) this.aClass149_2.anInt3916 * local590);
					@Pc(752) int local752 = local410 - local703;
					@Pc(757) int local757 = local553 - local725;
					@Pc(761) int local761 = local557 - local747;
					@Pc(770) int local770 = (int) ((double) local703 + (double) local752 * Math.random());
					@Pc(779) int local779 = (int) ((double) local725 + Math.random() * (double) local757);
					@Pc(788) int local788 = (int) ((double) local761 * Math.random() + (double) local747);
					@Pc(806) int local806 = this.aClass144_1.anInt3825 + (int) ((double) (this.aClass144_1.anInt3842 - this.aClass144_1.anInt3825) * Math.random());
					@Pc(822) int local822 = (int) ((double) (this.aClass144_1.anInt3809 - this.aClass144_1.anInt3804) * Math.random()) + this.aClass144_1.anInt3804;
					@Pc(838) int local838 = this.aClass144_1.anInt3817 + (int) ((double) (this.aClass144_1.anInt3806 - this.aClass144_1.anInt3817) * Math.random());
					@Pc(900) int local900;
					if (this.aClass144_1.aBoolean296) {
						@Pc(903) double local903 = Math.random();
						local900 = (int) ((double) this.aClass144_1.anInt3812 * Math.random() + (double) this.aClass144_1.anInt3835) << 24 | (int) (local903 * (double) this.aClass144_1.anInt3833 + (double) this.aClass144_1.anInt3819) << 8 | (int) (local903 * (double) this.aClass144_1.anInt3824 + (double) this.aClass144_1.anInt3828) << 16 | (int) (local903 * (double) this.aClass144_1.anInt3810 + (double) this.aClass144_1.anInt3851);
					} else {
						local900 = (int) ((double) this.aClass144_1.anInt3819 + (double) this.aClass144_1.anInt3833 * Math.random()) << 8 | (int) ((double) this.aClass144_1.anInt3828 + Math.random() * (double) this.aClass144_1.anInt3824) << 16 | (int) ((double) this.aClass144_1.anInt3851 + Math.random() * (double) this.aClass144_1.anInt3810) | (int) ((double) this.aClass144_1.anInt3835 + Math.random() * (double) this.aClass144_1.anInt3812) << 24;
					}
					@Pc(965) int local965 = this.aClass144_1.anInt3848;
					if (!arg1.method5280() && !this.aClass144_1.aBoolean293) {
						local965 = -1;
					}
					if (Static101.anInt2415 == Static159.anInt3430) {
						new Class55_Sub2_Sub1_Sub1(this, local770, local779, local788, local196, local205, local214, local806, local822, local900, local838, local965, this.aClass144_1.aBoolean295, this.aClass144_1.aBoolean298);
					} else {
						@Pc(981) Class55_Sub2_Sub1_Sub1 local981 = Static136.aClass55_Sub2_Sub1_Sub1Array1[Static101.anInt2415];
						Static101.anInt2415 = Static101.anInt2415 + 1 & 0x3FF;
						local981.method2491(this, local770, local779, local788, local196, local205, local214, local806, local822, local900, local838, local965, this.aClass144_1.aBoolean295, this.aClass144_1.aBoolean298);
					}
				}
			}
		}
		if (!this.aClass149_1.method3379(this.aClass149_2)) {
			@Pc(1048) Class149 local1048 = this.aClass149_2;
			this.aClass149_2 = this.aClass149_1;
			this.aClass149_1 = local1048;
			this.aClass149_1.anInt3921 = this.aClass121_2.anInt3501;
			this.aClass149_1.anInt3930 = this.aClass121_2.anInt3499;
			this.aClass149_1.anInt3927 = this.aClass121_2.anInt3503;
			this.aClass149_1.anInt3929 = this.aClass121_2.anInt3509;
			this.aClass149_1.anInt3918 = this.aClass121_2.anInt3506;
			this.aClass149_1.anInt3928 = this.aClass121_2.anInt3498;
			this.aClass149_1.anInt3916 = this.aClass121_2.anInt3497;
			this.aClass149_1.anInt3920 = this.aClass121_2.anInt3511;
			this.aClass149_1.anInt3926 = this.aClass121_2.anInt3502;
		}
		this.anInt8290 = 0;
		for (@Pc(1118) Class55_Sub2_Sub1_Sub1 local1118 = (Class55_Sub2_Sub1_Sub1) this.aClass134_8.method3233(); local1118 != null; local1118 = (Class55_Sub2_Sub1_Sub1) this.aClass134_8.method3230()) {
			local1118.method2490(arg0, arg2);
			this.anInt8290++;
		}
		Static518.anInt9484 += this.anInt8290;
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V")
	public void method6824() {
		this.aClass149_1.anInt3921 = this.aClass121_2.anInt3501;
		this.aClass149_1.anInt3916 = this.aClass121_2.anInt3497;
		this.aClass149_1.anInt3928 = this.aClass121_2.anInt3498;
		this.aClass149_1.anInt3918 = this.aClass121_2.anInt3506;
		this.aClass149_1.anInt3930 = this.aClass121_2.anInt3499;
		this.aClass149_1.anInt3926 = this.aClass121_2.anInt3502;
		this.aClass149_1.anInt3927 = this.aClass121_2.anInt3503;
		this.aClass149_1.anInt3929 = this.aClass121_2.anInt3509;
		this.aClass149_1.anInt3920 = this.aClass121_2.anInt3511;
		if (this.aClass149_1.anInt3920 == this.aClass149_1.anInt3921 && this.aClass149_1.anInt3920 == this.aClass149_1.anInt3928 && this.aClass149_1.anInt3929 == this.aClass149_1.anInt3927 && this.aClass149_1.anInt3929 == this.aClass149_1.anInt3926 && this.aClass149_1.anInt3918 == this.aClass149_1.anInt3916 && this.aClass149_1.anInt3930 == this.aClass149_1.anInt3918) {
			this.aBoolean681 = true;
		} else if (this.aBoolean681) {
			this.aBoolean681 = false;
			this.aClass149_2.anInt3927 = this.aClass149_1.anInt3927;
			this.aClass149_2.anInt3920 = this.aClass149_1.anInt3920;
			this.aClass149_2.anInt3928 = this.aClass149_1.anInt3928;
			this.aClass149_2.anInt3930 = this.aClass149_1.anInt3930;
			this.aClass149_2.anInt3926 = this.aClass149_1.anInt3926;
			this.aClass149_2.anInt3921 = this.aClass149_1.anInt3921;
			this.aClass149_2.anInt3916 = this.aClass149_1.anInt3916;
			this.aClass149_2.anInt3918 = this.aClass149_1.anInt3918;
			this.aClass149_2.anInt3929 = this.aClass149_1.anInt3929;
		}
	}
}
