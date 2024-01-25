import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class118 {

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
	private int anInt3268;

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "Lclient!hh;")
	private Class6 aClass6_8;

	@OriginalMember(owner = "client!fp", name = "s", descriptor = "I")
	private int anInt3277;

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "Z")
	private boolean aBoolean237 = true;

	@OriginalMember(owner = "client!fp", name = "n", descriptor = "I")
	private int anInt3273 = -1;

	@OriginalMember(owner = "client!fp", name = "q", descriptor = "I")
	private final int anInt3275;

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
	private final int anInt3266;

	@OriginalMember(owner = "client!fp", name = "m", descriptor = "[Lclient!fw;")
	private final Class121[] aClass121Array1;

	@OriginalMember(owner = "client!fp", name = "l", descriptor = "I")
	private final int anInt3272;

	@OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
	private final int anInt3271;

	@OriginalMember(owner = "client!fp", name = "k", descriptor = "Lclient!fw;")
	private final Class121 aClass121_1;

	@OriginalMember(owner = "client!fp", name = "t", descriptor = "[Lclient!fw;")
	private final Class121[] aClass121Array2;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(I[Lclient!fw;IIII)V")
	public Class118(@OriginalArg(0) int arg0, @OriginalArg(1) Class121[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3275 = arg3;
		this.anInt3266 = arg0;
		this.aClass121Array1 = arg1;
		this.anInt3272 = arg4;
		this.anInt3271 = arg5;
		if (arg1 == null) {
			this.aClass121_1 = null;
			this.aClass121Array2 = null;
		} else {
			this.aClass121Array2 = new Class121[arg1.length];
			this.aClass121_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
	public void method2797() {
		if (this.aClass121Array1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.aClass121Array1.length; local15++) {
				this.aClass121Array1[local15].method2884();
			}
		}
		this.aClass6_8 = null;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!ha;II)Z")
	public boolean method2800(@OriginalArg(0) Class95 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anInt3273) {
			this.anInt3273 = arg1;
			@Pc(24) int local24 = Static324.method4617(arg1);
			if (local24 > 512) {
				local24 = 512;
			}
			if (local24 <= 0) {
				local24 = 1;
			}
			if (local24 != this.anInt3277) {
				this.anInt3277 = local24;
				this.aClass6_8 = null;
			}
			if (this.aClass121Array1 != null) {
				this.anInt3268 = 0;
				@Pc(54) int[] local54 = new int[this.aClass121Array1.length];
				for (@Pc(56) int local56 = 0; local56 < this.aClass121Array1.length; local56++) {
					@Pc(63) Class121 local63 = this.aClass121Array1[local56];
					if (local63.method2876(this.anInt3275, this.anInt3272, this.anInt3271, this.anInt3273)) {
						local54[this.anInt3268] = local63.anInt3386;
						this.aClass121Array2[this.anInt3268++] = local63;
					}
				}
				Static117.method1795(this.anInt3268 - 1, this.aClass121Array2, local54, 0);
			}
			this.aBoolean237 = true;
		}
		@Pc(116) boolean local116 = false;
		if (this.aBoolean237) {
			this.aBoolean237 = false;
			for (@Pc(127) int local127 = this.anInt3268 - 1; local127 >= 0; local127--) {
				@Pc(138) boolean local138 = this.aClass121Array2[local127].method2875(arg0, this.aClass121_1);
				local116 |= local138;
				this.aBoolean237 |= !local138;
			}
		}
		return local116;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILclient!ha;IIIIBIII)V")
	public void method2801(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg4 + arg7 & 0x3FFF;
		if (this.anInt3266 == -1 || this.anInt3277 == 0) {
			arg1.aa(arg8, arg0, arg5, arg6, arg2, 0);
		} else {
			@Pc(35) Class250 local35 = Static55.anInterface2_1.method8330(this.anInt3266);
			if (this.aClass6_8 == null && Static55.anInterface2_1.method8328(this.anInt3266)) {
				@Pc(74) int[] local74 = local35.anInt6666 == 2 ? Static55.anInterface2_1.method8327(0.7F, this.anInt3277, this.anInt3266, this.anInt3277) : Static55.anInterface2_1.method8329(this.anInt3277, this.anInt3277, false, this.anInt3266, 0.7F);
				this.aClass6_8 = arg1.method7993(local74, this.anInt3277, this.anInt3277, this.anInt3277);
			}
			if (local35.anInt6666 == 2) {
				arg1.aa(arg8, arg0, arg5, arg6, arg2, 0);
			}
			if (this.aClass6_8 != null) {
				@Pc(114) int local114 = local35.anInt6666 == 2 ? 1 : 0;
				@Pc(120) int local120 = arg3 * arg6 / -4096;
				@Pc(133) int local133;
				for (local133 = local7 * arg6 / 4096 + (arg5 - arg6) / 2; local133 > arg6; local133 -= arg6) {
				}
				while (arg6 < local120) {
					local120 -= arg6;
				}
				while (local133 < 0) {
					local133 += arg6;
				}
				while (local120 < 0) {
					local120 += arg6;
				}
				for (@Pc(176) int local176 = local133 - arg6; local176 < arg5; local176 += arg6) {
					for (@Pc(183) int local183 = local120 - arg6; local183 < arg6; local183 += arg6) {
						this.aClass6_8.method5135(arg8 + local176, arg0 + local183, arg6, arg6, 1, 0, local114);
					}
				}
			}
		}
		for (@Pc(218) int local218 = this.anInt3268 - 1; local218 >= 0; local218--) {
			this.aClass121Array2[local218].method2877(arg1, arg8, arg0, arg5, arg6, arg3, local7);
		}
	}
}
