import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class209 {

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "Lclient!l;")
	private Class95 aClass95_17;

	@OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
	private int anInt5295;

	@OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
	private int anInt5296;

	@OriginalMember(owner = "client!qj", name = "n", descriptor = "Z")
	private boolean aBoolean377 = true;

	@OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
	private int anInt5294 = -1;

	@OriginalMember(owner = "client!qj", name = "v", descriptor = "[Lclient!tt;")
	private final Class243[] aClass243Array1;

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
	private final int anInt5287;

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
	private final int anInt5285;

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
	private final int anInt5286;

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
	private final int anInt5290;

	@OriginalMember(owner = "client!qj", name = "t", descriptor = "Lclient!tt;")
	private final Class243 aClass243_1;

	@OriginalMember(owner = "client!qj", name = "x", descriptor = "[Lclient!tt;")
	private final Class243[] aClass243Array2;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(I[Lclient!tt;IIII)V")
	public Class209(@OriginalArg(0) int arg0, @OriginalArg(1) Class243[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass243Array1 = arg1;
		this.anInt5287 = arg0;
		this.anInt5285 = arg4;
		this.anInt5286 = arg5;
		this.anInt5290 = arg3;
		if (arg1 == null) {
			this.aClass243_1 = null;
			this.aClass243Array2 = null;
		} else {
			this.aClass243Array2 = new Class243[arg1.length];
			this.aClass243_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!ya;IIIIIIIII)V")
	public void method4302(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = arg4 + arg7 & 0x3FFF;
		if (this.anInt5287 == -1) {
			arg0.O(arg3, arg5, arg6, arg2, arg8, 0);
		} else {
			@Pc(22) Class112 local22 = Static60.anInterface5_1.method4079(this.anInt5287);
			if (this.aClass95_17 == null && Static60.anInterface5_1.method4075(this.anInt5287)) {
				@Pc(60) int[] local60 = local22.aBoolean194 ? Static60.anInterface5_1.method4078(false, this.anInt5296, 0.7F, this.anInt5296, this.anInt5287) : Static60.anInterface5_1.method4077(this.anInt5296, 0.7F, this.anInt5296, this.anInt5287);
				this.aClass95_17 = arg0.method5351(local60, this.anInt5296, this.anInt5296, this.anInt5296);
			}
			if (!local22.aBoolean194) {
				arg0.O(arg3, arg5, arg6, arg2, arg8, 0);
			}
			if (this.aClass95_17 != null) {
				@Pc(93) int local93 = local22.aBoolean194 ? 0 : 1;
				@Pc(99) int local99 = arg2 * arg1 / -4096;
				@Pc(113) int local113;
				for (local113 = (arg6 - arg2) / 2 + arg2 * local11 / 4096; local113 > arg2; local113 -= arg2) {
				}
				while (local99 > arg2) {
					local99 -= arg2;
				}
				while (local113 < 0) {
					local113 += arg2;
				}
				while (local99 < 0) {
					local99 += arg2;
				}
				for (@Pc(166) int local166 = local113 - arg2; local166 < arg6; local166 += arg2) {
					for (@Pc(172) int local172 = local99 - arg2; local172 < arg2; local172 += arg2) {
						this.aClass95_17.s(local166 + arg3, arg5 + local172, arg2, arg2, 1, 0, local93);
					}
				}
			}
		}
		for (@Pc(217) int local217 = this.anInt5295 - 1; local217 >= 0; local217--) {
			this.aClass243Array2[local217].method5203(arg0, arg3, arg5, arg6, arg2, arg1, local11);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
	public void method4305() {
		if (this.aClass243Array1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass243Array1.length; local6++) {
				this.aClass243Array1[local6].method5211();
			}
		}
		this.aClass95_17 = null;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!ya;IZ)Z")
	public boolean method4306(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5294 != arg1) {
			this.anInt5294 = arg1;
			@Pc(20) int local20 = Static171.method2382(arg1);
			if (arg1 < local20) {
				local20 = Static359.method4736(arg1);
			}
			if (local20 > 512) {
				local20 = 512;
			}
			if (this.anInt5296 != local20) {
				this.aClass95_17 = null;
				this.anInt5296 = local20;
			}
			if (this.aClass243Array1 != null) {
				this.anInt5295 = 0;
				@Pc(61) int[] local61 = new int[this.aClass243Array1.length];
				for (@Pc(63) int local63 = 0; local63 < this.aClass243Array1.length; local63++) {
					@Pc(70) Class243 local70 = this.aClass243Array1[local63];
					if (local70.method5205(this.anInt5290, this.anInt5285, this.anInt5286, this.anInt5294)) {
						local61[this.anInt5295] = local70.anInt6435;
						this.aClass243Array2[this.anInt5295++] = local70;
					}
				}
				Static365.method4856(this.aClass243Array2, this.anInt5295 - 1, local61, 0);
			}
			this.aBoolean377 = true;
		}
		@Pc(128) boolean local128 = false;
		if (this.aBoolean377) {
			this.aBoolean377 = false;
			for (@Pc(139) int local139 = this.anInt5295 - 1; local139 >= 0; local139--) {
				@Pc(150) boolean local150 = this.aClass243Array2[local139].method5204(arg0, this.aClass243_1);
				local128 |= local150;
				this.aBoolean377 |= !local150;
			}
		}
		return local128;
	}
}
