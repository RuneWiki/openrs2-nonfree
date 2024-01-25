import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class17 {

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "Lclient!kr;")
	private Class20 aClass20_1;

	@OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
	private int anInt311;

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
	private int anInt303 = -1;

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "Z")
	private boolean aBoolean25 = true;

	@OriginalMember(owner = "client!aj", name = "s", descriptor = "[Lclient!he;")
	private final Class144[] aClass144Array2;

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
	private final int anInt305;

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
	private final int anInt301;

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
	private final int anInt307;

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
	private final int anInt300;

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "[Lclient!he;")
	private final Class144[] aClass144Array1;

	@OriginalMember(owner = "client!aj", name = "q", descriptor = "Lclient!he;")
	private final Class144 aClass144_1;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(I[Lclient!he;IIII)V")
	public Class17(@OriginalArg(0) int arg0, @OriginalArg(1) Class144[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass144Array2 = arg1;
		this.anInt305 = arg0;
		this.anInt301 = arg3;
		this.anInt307 = arg5;
		this.anInt300 = arg4;
		if (arg1 == null) {
			this.aClass144_1 = null;
			this.aClass144Array1 = null;
		} else {
			this.aClass144Array1 = new Class144[arg1.length];
			this.aClass144_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
	public void method323() {
		if (this.aClass144Array2 != null) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass144Array2.length; local8++) {
				this.aClass144Array2[local8].method3540();
			}
		}
		this.aClass20_1 = null;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIILclient!ha;III)V")
	public void method326(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class87 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(17) int local17 = arg4 + arg6 & 0x3FFF;
		if (this.anInt305 == -1 || this.anInt310 == 0) {
			arg5.aa(arg8, arg0, arg3, arg1, arg7, 0);
		} else {
			@Pc(39) Class199 local39 = Static486.anInterface6_10.method6357(this.anInt305);
			if (this.aClass20_1 == null && Static486.anInterface6_10.method6355(this.anInt305)) {
				@Pc(80) int[] local80 = local39.anInt5691 == 2 ? Static486.anInterface6_10.method6358(this.anInt310, this.anInt305, 0.7F, this.anInt310) : Static486.anInterface6_10.method6354(0.7F, this.anInt310, false, this.anInt305, this.anInt310);
				this.aClass20_1 = arg5.method7913(this.anInt310, local80, this.anInt310, this.anInt310);
			}
			if (local39.anInt5691 == 2) {
				arg5.aa(arg8, arg0, arg3, arg1, arg7, 0);
			}
			if (this.aClass20_1 != null) {
				@Pc(118) int local118 = local39.anInt5691 == 2 ? 1 : 0;
				@Pc(124) int local124 = arg2 * arg1 / -4096;
				@Pc(137) int local137;
				for (local137 = local17 * arg1 / 4096 + (arg3 - arg1) / 2; local137 > arg1; local137 -= arg1) {
				}
				while (local137 < 0) {
					local137 += arg1;
				}
				while (local124 > arg1) {
					local124 -= arg1;
				}
				while (local124 < 0) {
					local124 += arg1;
				}
				for (@Pc(175) int local175 = local137 - arg1; local175 < arg3; local175 += arg1) {
					for (@Pc(181) int local181 = local124 - arg1; local181 < arg1; local181 += arg1) {
						this.aClass20_1.method4596(arg8 + local175, local181 - -arg0, arg1, arg1, 1, 0, local118);
					}
				}
			}
		}
		for (@Pc(220) int local220 = this.anInt311 - 1; local220 >= 0; local220--) {
			this.aClass144Array1[local220].method3542(arg5, arg8, arg0, arg3, arg1, arg2, local17);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILclient!ha;I)Z")
	public boolean method328(@OriginalArg(0) int arg0, @OriginalArg(1) Class87 arg1) {
		if (this.anInt303 != arg0) {
			this.anInt303 = arg0;
			@Pc(16) int local16 = Static291.method4549(arg0);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (local16 != this.anInt310) {
				this.aClass20_1 = null;
				this.anInt310 = local16;
			}
			if (this.aClass144Array2 != null) {
				this.anInt311 = 0;
				@Pc(50) int[] local50 = new int[this.aClass144Array2.length];
				for (@Pc(52) int local52 = 0; local52 < this.aClass144Array2.length; local52++) {
					@Pc(59) Class144 local59 = this.aClass144Array2[local52];
					if (local59.method3548(this.anInt301, this.anInt300, this.anInt307, this.anInt303)) {
						local50[this.anInt311] = local59.anInt4279;
						this.aClass144Array1[this.anInt311++] = local59;
					}
				}
				Static470.method6758(local50, this.anInt311 - 1, this.aClass144Array1, 0);
			}
			this.aBoolean25 = true;
		}
		@Pc(112) boolean local112 = false;
		if (this.aBoolean25) {
			this.aBoolean25 = false;
			for (@Pc(123) int local123 = this.anInt311 - 1; local123 >= 0; local123--) {
				@Pc(134) boolean local134 = this.aClass144Array1[local123].method3543(arg1, this.aClass144_1);
				local112 |= local134;
				this.aBoolean25 |= !local134;
			}
		}
		return local112;
	}
}
