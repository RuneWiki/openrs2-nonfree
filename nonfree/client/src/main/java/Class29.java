import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class29 {

	@OriginalMember(owner = "client!bv", name = "i", descriptor = "I")
	private int anInt1075;

	@OriginalMember(owner = "client!bv", name = "m", descriptor = "I")
	private int anInt1078;

	@OriginalMember(owner = "client!bv", name = "n", descriptor = "Lclient!f;")
	private Class22 aClass22_1;

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "Z")
	private boolean aBoolean93 = true;

	@OriginalMember(owner = "client!bv", name = "l", descriptor = "I")
	private int anInt1077 = -1;

	@OriginalMember(owner = "client!bv", name = "k", descriptor = "[Lclient!lj;")
	private final Class144[] aClass144Array1;

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
	private final int anInt1070;

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "I")
	private final int anInt1076;

	@OriginalMember(owner = "client!bv", name = "s", descriptor = "I")
	private final int anInt1080;

	@OriginalMember(owner = "client!bv", name = "p", descriptor = "I")
	private final int anInt1079;

	@OriginalMember(owner = "client!bv", name = "o", descriptor = "Lclient!lj;")
	private final Class144 aClass144_1;

	@OriginalMember(owner = "client!bv", name = "q", descriptor = "[Lclient!lj;")
	private final Class144[] aClass144Array2;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(I[Lclient!lj;IIII)V")
	public Class29(@OriginalArg(0) int arg0, @OriginalArg(1) Class144[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass144Array1 = arg1;
		this.anInt1070 = arg5;
		this.anInt1076 = arg3;
		this.anInt1080 = arg0;
		this.anInt1079 = arg4;
		if (arg1 == null) {
			this.aClass144_1 = null;
			this.aClass144Array2 = null;
		} else {
			this.aClass144Array2 = new Class144[arg1.length];
			this.aClass144_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IILclient!qa;)Z")
	public boolean method925(@OriginalArg(0) int arg0, @OriginalArg(2) Class75 arg1) {
		if (this.anInt1077 != arg0) {
			this.anInt1077 = arg0;
			@Pc(10) int local10 = Static350.method4984(arg0);
			if (local10 > arg0) {
				local10 = Static78.method1396(arg0);
			}
			if (local10 > 512) {
				local10 = 512;
			}
			if (local10 != this.anInt1075) {
				this.anInt1075 = local10;
				this.aClass22_1 = null;
			}
			if (this.aClass144Array1 != null) {
				this.anInt1078 = 0;
				@Pc(47) int[] local47 = new int[this.aClass144Array1.length];
				for (@Pc(49) int local49 = 0; local49 < this.aClass144Array1.length; local49++) {
					@Pc(55) Class144 local55 = this.aClass144Array1[local49];
					if (local55.method3644(this.anInt1076, this.anInt1079, this.anInt1070, this.anInt1077)) {
						local47[this.anInt1078] = local55.anInt4468;
						this.aClass144Array2[this.anInt1078++] = local55;
					}
				}
				Static348.method5833(this.aClass144Array2, this.anInt1078 - 1, local47, 0);
			}
			this.aBoolean93 = true;
		}
		@Pc(113) boolean local113 = false;
		if (this.aBoolean93) {
			this.aBoolean93 = false;
			for (@Pc(124) int local124 = this.anInt1078 - 1; local124 >= 0; local124--) {
				@Pc(134) boolean local134 = this.aClass144Array2[local124].method3645(arg1, this.aClass144_1);
				this.aBoolean93 |= !local134;
				local113 |= local134;
			}
		}
		return local113;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V")
	public void method927() {
		if (this.aClass144Array1 != null) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass144Array1.length; local8++) {
				this.aClass144Array1[local8].method3647();
			}
		}
		this.aClass22_1 = null;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIIIILclient!qa;Z)V")
	public void method933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class75 arg8) {
		@Pc(11) int local11 = arg7 + arg5 & 0x3FFF;
		if (this.anInt1080 == -1) {
			arg8.NA(arg1, arg0, arg2, arg3, arg6, 0);
		} else {
			@Pc(22) Class62 local22 = Static60.anInterface7_2.method2131(this.anInt1080);
			if (this.aClass22_1 == null && Static60.anInterface7_2.method2132(this.anInt1080)) {
				@Pc(58) int[] local58 = local22.aBoolean148 ? Static60.anInterface7_2.method2129(0.7F, this.anInt1075, this.anInt1075, false, this.anInt1080) : Static60.anInterface7_2.method2128(this.anInt1075, 0.7F, this.anInt1080, this.anInt1075);
				this.aClass22_1 = arg8.method2640(local58, this.anInt1075, this.anInt1075, this.anInt1075);
			}
			if (!local22.aBoolean148) {
				arg8.NA(arg1, arg0, arg2, arg3, arg6, 0);
			}
			if (this.aClass22_1 != null) {
				@Pc(91) int local91 = local22.aBoolean148 ? 0 : 1;
				@Pc(97) int local97 = arg4 * arg3 / -4096;
				@Pc(110) int local110;
				for (local110 = arg3 * local11 / 4096 + (arg2 - arg3) / 2; local110 > arg3; local110 -= arg3) {
				}
				while (local110 < 0) {
					local110 += arg3;
				}
				while (arg3 < local97) {
					local97 -= arg3;
				}
				while (local97 < 0) {
					local97 += arg3;
				}
				for (@Pc(156) int local156 = local110 - arg3; local156 < arg2; local156 += arg3) {
					for (@Pc(163) int local163 = local97 - arg3; local163 < arg3; local163 += arg3) {
						this.aClass22_1.M(local156 + arg1, local163 + arg0, arg3, arg3, 1, 0, local91);
					}
				}
			}
		}
		for (@Pc(212) int local212 = this.anInt1078 - 1; local212 >= 0; local212--) {
			this.aClass144Array2[local212].method3643(arg8, arg1, arg0, arg2, arg3, arg4, local11);
		}
	}
}
