import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class173 {

	@OriginalMember(owner = "client!in", name = "m", descriptor = "Lclient!hk;")
	private Class155 aClass155_11;

	@OriginalMember(owner = "client!in", name = "c", descriptor = "I")
	private int anInt4333;

	@OriginalMember(owner = "client!in", name = "g", descriptor = "I")
	private int anInt4334;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "Z")
	private boolean aBoolean283 = true;

	@OriginalMember(owner = "client!in", name = "p", descriptor = "I")
	private int anInt4326 = -1;

	@OriginalMember(owner = "client!in", name = "k", descriptor = "I")
	private final int anInt4336;

	@OriginalMember(owner = "client!in", name = "q", descriptor = "[Lclient!uja;")
	private final Class365[] aClass365Array2;

	@OriginalMember(owner = "client!in", name = "r", descriptor = "I")
	private final int anInt4335;

	@OriginalMember(owner = "client!in", name = "h", descriptor = "I")
	private final int anInt4332;

	@OriginalMember(owner = "client!in", name = "j", descriptor = "I")
	private final int anInt4329;

	@OriginalMember(owner = "client!in", name = "l", descriptor = "[Lclient!uja;")
	private final Class365[] aClass365Array1;

	@OriginalMember(owner = "client!in", name = "d", descriptor = "Lclient!uja;")
	private final Class365 aClass365_1;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(I[Lclient!uja;IIII)V")
	public Class173(@OriginalArg(0) int arg0, @OriginalArg(1) Class365[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4336 = arg3;
		this.aClass365Array2 = arg1;
		this.anInt4335 = arg4;
		this.anInt4332 = arg0;
		this.anInt4329 = arg5;
		if (arg1 == null) {
			this.aClass365Array1 = null;
			this.aClass365_1 = null;
		} else {
			this.aClass365Array1 = new Class365[arg1.length];
			this.aClass365_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IZLclient!ha;)Z")
	public boolean method3972(@OriginalArg(0) int arg0, @OriginalArg(2) Class100 arg1) {
		if (arg0 != this.anInt4326) {
			this.anInt4326 = arg0;
			@Pc(19) int local19 = Static186.method3180(arg0);
			if (local19 > 512) {
				local19 = 512;
			}
			if (local19 <= 0) {
				local19 = 1;
			}
			if (this.anInt4334 != local19) {
				this.anInt4334 = local19;
				this.aClass155_11 = null;
			}
			if (this.aClass365Array2 != null) {
				this.anInt4333 = 0;
				@Pc(54) int[] local54 = new int[this.aClass365Array2.length];
				for (@Pc(56) int local56 = 0; local56 < this.aClass365Array2.length; local56++) {
					@Pc(65) Class365 local65 = this.aClass365Array2[local56];
					if (local65.method8333(this.anInt4336, this.anInt4335, this.anInt4329, this.anInt4326)) {
						local54[this.anInt4333] = local65.anInt9781;
						this.aClass365Array1[this.anInt4333++] = local65;
					}
				}
				Static581.method8008(this.aClass365Array1, 0, this.anInt4333 - 1, local54);
			}
			this.aBoolean283 = true;
		}
		@Pc(132) boolean local132 = false;
		if (this.aBoolean283) {
			this.aBoolean283 = false;
			for (@Pc(143) int local143 = this.anInt4333 - 1; local143 >= 0; local143--) {
				@Pc(154) boolean local154 = this.aClass365Array1[local143].method8330(arg1, this.aClass365_1);
				local132 |= local154;
				this.aBoolean283 |= !local154;
			}
		}
		return local132;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)V")
	public void method3973() {
		if (this.aClass365Array2 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.aClass365Array2.length; local18++) {
				this.aClass365Array2[local18].method8329();
			}
		}
		this.aClass155_11 = null;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IILclient!ha;IIIIIII)V")
	public void method3975(@OriginalArg(1) int arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(15) int local15 = arg5 + arg7 & 0x3FFF;
		if (this.anInt4332 == -1 || this.anInt4334 == 0) {
			arg1.aa(arg8, arg4, arg6, arg0, arg3, 0);
		} else {
			@Pc(35) Class44 local35 = Static211.anInterface7_7.method7423(this.anInt4332);
			if (this.aClass155_11 == null && Static211.anInterface7_7.method7421(this.anInt4332)) {
				@Pc(81) int[] local81 = local35.anInt809 == 2 ? Static211.anInterface7_7.method7419(this.anInt4332, 0.7F, this.anInt4334, this.anInt4334) : Static211.anInterface7_7.method7424(this.anInt4334, false, this.anInt4334, this.anInt4332, 0.7F);
				this.aClass155_11 = arg1.method8645(this.anInt4334, this.anInt4334, local81, this.anInt4334);
			}
			if (local35.anInt809 == 2) {
				arg1.aa(arg8, arg4, arg6, arg0, arg3, 0);
			}
			if (this.aClass155_11 != null) {
				@Pc(126) int local126 = local35.anInt809 == 2 ? 1 : 0;
				@Pc(132) int local132 = arg2 * arg0 / -4096;
				@Pc(146) int local146;
				for (local146 = (arg6 - arg0) / 2 + arg0 * local15 / 4096; local146 > arg0; local146 -= arg0) {
				}
				while (local146 < 0) {
					local146 += arg0;
				}
				while (local132 > arg0) {
					local132 -= arg0;
				}
				while (local132 < 0) {
					local132 += arg0;
				}
				for (@Pc(204) int local204 = local146 - arg0; local204 < arg6; local204 += arg0) {
					for (@Pc(211) int local211 = local132 - arg0; local211 < arg0; local211 += arg0) {
						this.aClass155_11.method7200(arg8 + local204, arg4 + local211, arg0, arg0, 1, 0, local126);
					}
				}
			}
		}
		for (@Pc(270) int local270 = this.anInt4333 - 1; local270 >= 0; local270--) {
			this.aClass365Array1[local270].method8327(arg1, arg8, arg4, arg6, arg0, arg2, local15);
		}
	}
}
