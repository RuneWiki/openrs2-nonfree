import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class247 {

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "Lclient!o;")
	private Class41 aClass41_17;

	@OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
	private int anInt7080;

	@OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
	private int anInt7083;

	@OriginalMember(owner = "client!uk", name = "i", descriptor = "Z")
	private boolean aBoolean469 = true;

	@OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
	private int anInt7081 = -1;

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
	private final int anInt7072;

	@OriginalMember(owner = "client!uk", name = "q", descriptor = "[Lclient!m;")
	private final Class167[] aClass167Array2;

	@OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
	private final int anInt7079;

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
	private final int anInt7077;

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
	private final int anInt7071;

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "Lclient!m;")
	private final Class167 aClass167_1;

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "[Lclient!m;")
	private final Class167[] aClass167Array1;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(I[Lclient!m;IIII)V")
	public Class247(@OriginalArg(0) int arg0, @OriginalArg(1) Class167[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7072 = arg0;
		this.aClass167Array2 = arg1;
		this.anInt7079 = arg5;
		this.anInt7077 = arg4;
		this.anInt7071 = arg3;
		if (arg1 == null) {
			this.aClass167_1 = null;
			this.aClass167Array1 = null;
		} else {
			this.aClass167Array1 = new Class167[arg1.length];
			this.aClass167_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!za;BI)Z")
	public boolean method5666(@OriginalArg(0) Class75 arg0, @OriginalArg(2) int arg1) {
		@Pc(48) int local48;
		if (arg1 != this.anInt7081) {
			this.anInt7081 = arg1;
			@Pc(12) int local12 = Static14.method326(arg1);
			if (local12 > 512) {
				local12 = 512;
			}
			if (local12 <= 0) {
				local12 = 1;
			}
			if (local12 != this.anInt7083) {
				this.aClass41_17 = null;
				this.anInt7083 = local12;
			}
			if (this.aClass167Array2 != null) {
				this.anInt7080 = 0;
				@Pc(46) int[] local46 = new int[this.aClass167Array2.length];
				for (local48 = 0; local48 < this.aClass167Array2.length; local48++) {
					@Pc(55) Class167 local55 = this.aClass167Array2[local48];
					if (local55.method3432(this.anInt7071, this.anInt7077, this.anInt7079, this.anInt7081)) {
						local46[this.anInt7080] = local55.anInt4269;
						this.aClass167Array1[this.anInt7080++] = local55;
					}
				}
				Static396.method5471(this.anInt7080 - 1, this.aClass167Array1, 0, local46);
			}
			this.aBoolean469 = true;
		}
		@Pc(120) boolean local120 = false;
		if (this.aBoolean469) {
			this.aBoolean469 = false;
			for (local48 = this.anInt7080 - 1; local48 >= 0; local48--) {
				@Pc(142) boolean local142 = this.aClass167Array1[local48].method3425(arg0, this.aClass167_1);
				local120 |= local142;
				this.aBoolean469 |= !local142;
			}
		}
		return local120;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
	public void method5667() {
		if (this.aClass167Array2 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.aClass167Array2.length; local14++) {
				this.aClass167Array2[local14].method3426();
			}
		}
		this.aClass41_17 = null;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIIILclient!za;I)V")
	public void method5668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class75 arg7, @OriginalArg(9) int arg8) {
		@Pc(12) int local12 = arg1 + arg5 & 0x3FFF;
		if (this.anInt7072 == -1) {
			arg7.P(arg8, arg6, arg3, arg2, arg4, 0);
		} else {
			@Pc(23) Class257 local23 = Static433.anInterface7_7.method1170(this.anInt7072);
			if (this.aClass41_17 == null && Static433.anInterface7_7.method1168(this.anInt7072)) {
				@Pc(59) int[] local59 = local23.aBoolean487 ? Static433.anInterface7_7.method1172(0.7F, this.anInt7083, this.anInt7072, this.anInt7083) : Static433.anInterface7_7.method1171(false, 0.7F, this.anInt7072, this.anInt7083, this.anInt7083);
				this.aClass41_17 = arg7.method6006(local59, this.anInt7083, this.anInt7083, this.anInt7083);
			}
			if (local23.aBoolean487) {
				arg7.P(arg8, arg6, arg3, arg2, arg4, 0);
			}
			if (this.aClass41_17 != null) {
				@Pc(92) int local92 = local23.aBoolean487 ? 1 : 0;
				@Pc(98) int local98 = arg0 * arg2 / -4096;
				@Pc(111) int local111;
				for (local111 = arg2 * local12 / 4096 + (arg3 - arg2) / 2; local111 > arg2; local111 -= arg2) {
				}
				while (local98 > arg2) {
					local98 -= arg2;
				}
				while (local111 < 0) {
					local111 += arg2;
				}
				while (local98 < 0) {
					local98 += arg2;
				}
				for (@Pc(153) int local153 = local111 - arg2; local153 < arg3; local153 += arg2) {
					for (@Pc(159) int local159 = local98 - arg2; local159 < arg2; local159 += arg2) {
						this.aClass41_17.ya(local153 + arg8, local159 - -arg6, arg2, arg2, 1, 0, local92);
					}
				}
			}
		}
		for (@Pc(214) int local214 = this.anInt7080 - 1; local214 >= 0; local214--) {
			this.aClass167Array1[local214].method3433(arg7, arg8, arg6, arg3, arg2, arg0, local12);
		}
	}
}
