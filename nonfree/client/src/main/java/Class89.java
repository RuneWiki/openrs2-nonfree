import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class89 {

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
	private int anInt3202;

	@OriginalMember(owner = "client!fj", name = "k", descriptor = "Lclient!ha;")
	private Class12 aClass12_4;

	@OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
	private int anInt3210;

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "Z")
	private boolean aBoolean203 = true;

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
	private int anInt3209 = -1;

	@OriginalMember(owner = "client!fj", name = "s", descriptor = "[Lclient!uf;")
	private final Class287[] aClass287Array2;

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
	private final int anInt3204;

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
	private final int anInt3205;

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
	private final int anInt3207;

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
	private final int anInt3206;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "[Lclient!uf;")
	private final Class287[] aClass287Array1;

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "Lclient!uf;")
	private final Class287 aClass287_1;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(I[Lclient!uf;IIII)V")
	public Class89(@OriginalArg(0) int arg0, @OriginalArg(1) Class287[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass287Array2 = arg1;
		this.anInt3204 = arg4;
		this.anInt3205 = arg5;
		this.anInt3207 = arg3;
		this.anInt3206 = arg0;
		if (arg1 == null) {
			this.aClass287Array1 = null;
			this.aClass287_1 = null;
		} else {
			this.aClass287Array1 = new Class287[arg1.length];
			this.aClass287_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILclient!qa;IIZIIII)V")
	public void method2908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class9 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg5 + arg8 & 0x3FFF;
		if (this.anInt3206 == -1) {
			arg2.f(arg0, arg1, arg4, arg7, arg3, 0);
		} else {
			@Pc(28) Class175 local28 = Static534.anInterface8_14.method7085(this.anInt3206);
			if (this.aClass12_4 == null && Static534.anInterface8_14.method7084(this.anInt3206)) {
				@Pc(64) int[] local64 = local28.aBoolean353 ? Static534.anInterface8_14.method7086(this.anInt3210, this.anInt3210, this.anInt3206, 0.7F) : Static534.anInterface8_14.method7088(this.anInt3210, false, this.anInt3210, 0.7F, this.anInt3206);
				this.aClass12_4 = arg2.method7641(local64, this.anInt3210, this.anInt3210, this.anInt3210);
			}
			if (local28.aBoolean353) {
				arg2.f(arg0, arg1, arg4, arg7, arg3, 0);
			}
			if (this.aClass12_4 != null) {
				@Pc(97) int local97 = local28.aBoolean353 ? 1 : 0;
				@Pc(103) int local103 = arg6 * arg7 / -4096;
				@Pc(116) int local116;
				for (local116 = (arg4 - arg7) / 2 + arg7 * local5 / 4096; local116 > arg7; local116 -= arg7) {
				}
				while (local116 < 0) {
					local116 += arg7;
				}
				while (arg7 < local103) {
					local103 -= arg7;
				}
				while (local103 < 0) {
					local103 += arg7;
				}
				for (@Pc(165) int local165 = local116 - arg7; local165 < arg4; local165 += arg7) {
					for (@Pc(171) int local171 = local103 - arg7; local171 < arg7; local171 += arg7) {
						this.aClass12_4.ra(arg0 + local165, arg1 + local171, arg7, arg7, 1, 0, local97);
					}
				}
			}
		}
		for (@Pc(205) int local205 = this.anInt3202 - 1; local205 >= 0; local205--) {
			this.aClass287Array1[local205].method7025(arg2, arg0, arg1, arg4, arg7, arg6, local5);
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!qa;II)Z")
	public boolean method2909(@OriginalArg(0) Class9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anInt3209) {
			this.anInt3209 = arg1;
			@Pc(26) int local26 = Static216.method3865(arg1);
			if (local26 > 512) {
				local26 = 512;
			}
			if (local26 <= 0) {
				local26 = 1;
			}
			if (this.anInt3210 != local26) {
				this.anInt3210 = local26;
				this.aClass12_4 = null;
			}
			if (this.aClass287Array2 != null) {
				this.anInt3202 = 0;
				@Pc(60) int[] local60 = new int[this.aClass287Array2.length];
				for (@Pc(62) int local62 = 0; local62 < this.aClass287Array2.length; local62++) {
					@Pc(68) Class287 local68 = this.aClass287Array2[local62];
					if (local68.method7024(this.anInt3207, this.anInt3204, this.anInt3205, this.anInt3209)) {
						local60[this.anInt3202] = local68.anInt8274;
						this.aClass287Array1[this.anInt3202++] = local68;
					}
				}
				Static102.method2274(this.aClass287Array1, this.anInt3202 - 1, 0, local60);
			}
			this.aBoolean203 = true;
		}
		@Pc(121) boolean local121 = false;
		if (this.aBoolean203) {
			this.aBoolean203 = false;
			for (@Pc(132) int local132 = this.anInt3202 - 1; local132 >= 0; local132--) {
				@Pc(142) boolean local142 = this.aClass287Array1[local132].method7026(arg0, this.aClass287_1);
				local121 |= local142;
				this.aBoolean203 |= !local142;
			}
		}
		return local121;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
	public void method2910() {
		if (this.aClass287Array2 != null) {
			for (@Pc(13) int local13 = 0; local13 < this.aClass287Array2.length; local13++) {
				this.aClass287Array2[local13].method7034();
			}
		}
		this.aClass12_4 = null;
	}
}
