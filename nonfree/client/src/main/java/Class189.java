import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class189 {

	@OriginalMember(owner = "client!op", name = "e", descriptor = "I")
	private int anInt5533;

	@OriginalMember(owner = "client!op", name = "f", descriptor = "Lclient!o;")
	private Class137 aClass137_16;

	@OriginalMember(owner = "client!op", name = "i", descriptor = "I")
	private int anInt5535;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "Z")
	private boolean aBoolean342 = true;

	@OriginalMember(owner = "client!op", name = "o", descriptor = "I")
	private int anInt5540 = -1;

	@OriginalMember(owner = "client!op", name = "g", descriptor = "[Lclient!wl;")
	private final Class267[] aClass267Array2;

	@OriginalMember(owner = "client!op", name = "h", descriptor = "I")
	private final int anInt5534;

	@OriginalMember(owner = "client!op", name = "m", descriptor = "I")
	private final int anInt5538;

	@OriginalMember(owner = "client!op", name = "k", descriptor = "I")
	private final int anInt5536;

	@OriginalMember(owner = "client!op", name = "q", descriptor = "I")
	private final int anInt5541;

	@OriginalMember(owner = "client!op", name = "p", descriptor = "Lclient!wl;")
	private final Class267 aClass267_1;

	@OriginalMember(owner = "client!op", name = "c", descriptor = "[Lclient!wl;")
	private final Class267[] aClass267Array1;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(I[Lclient!wl;IIII)V")
	public Class189(@OriginalArg(0) int arg0, @OriginalArg(1) Class267[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass267Array2 = arg1;
		this.anInt5534 = arg3;
		this.anInt5538 = arg5;
		this.anInt5536 = arg0;
		this.anInt5541 = arg4;
		if (arg1 == null) {
			this.aClass267_1 = null;
			this.aClass267Array1 = null;
		} else {
			this.aClass267Array1 = new Class267[arg1.length];
			this.aClass267_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!za;IIIIIIIII)V")
	public void method4275(@OriginalArg(0) Class106 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg1 + arg8 & 0x3FFF;
		if (this.anInt5536 == -1) {
			arg0.P(arg5, arg7, arg2, arg4, arg6, 0);
		} else {
			@Pc(31) Class150 local31 = Static260.anInterface7_9.method78(this.anInt5536);
			if (this.aClass137_16 == null && Static260.anInterface7_9.method77(this.anInt5536)) {
				@Pc(67) int[] local67 = local31.aBoolean276 ? Static260.anInterface7_9.method76(this.anInt5536, 0.7F, this.anInt5533, this.anInt5533, false) : Static260.anInterface7_9.method79(this.anInt5533, this.anInt5536, this.anInt5533, 0.7F);
				this.aClass137_16 = arg0.method5969(local67, this.anInt5533, this.anInt5533, this.anInt5533);
			}
			if (!local31.aBoolean276) {
				arg0.P(arg5, arg7, arg2, arg4, arg6, 0);
			}
			if (this.aClass137_16 != null) {
				@Pc(100) int local100 = local31.aBoolean276 ? 0 : 1;
				@Pc(106) int local106 = arg4 * arg3 / -4096;
				@Pc(119) int local119;
				for (local119 = (arg2 - arg4) / 2 + local7 * arg4 / 4096; local119 > arg4; local119 -= arg4) {
				}
				while (local119 < 0) {
					local119 += arg4;
				}
				while (arg4 < local106) {
					local106 -= arg4;
				}
				while (local106 < 0) {
					local106 += arg4;
				}
				for (@Pc(168) int local168 = local119 - arg4; local168 < arg2; local168 += arg4) {
					for (@Pc(175) int local175 = local106 - arg4; local175 < arg4; local175 += arg4) {
						this.aClass137_16.ya(local168 + arg5, local175 - -arg7, arg4, arg4, 1, 0, local100);
					}
				}
			}
		}
		for (@Pc(215) int local215 = this.anInt5535 - 1; local215 >= 0; local215--) {
			this.aClass267Array1[local215].method6109(arg0, arg5, arg7, arg2, arg4, arg3, local7);
		}
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
	public void method4276() {
		if (this.aClass267Array2 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.aClass267Array2.length; local4++) {
				this.aClass267Array2[local4].method6104();
			}
		}
		this.aClass137_16 = null;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IBLclient!za;)Z")
	public boolean method4277(@OriginalArg(0) int arg0, @OriginalArg(2) Class106 arg1) {
		if (arg0 != this.anInt5540) {
			this.anInt5540 = arg0;
			@Pc(25) int local25 = Static427.method5762(arg0);
			if (arg0 < local25) {
				local25 = Static417.method5678(arg0);
			}
			if (local25 > 512) {
				local25 = 512;
			}
			if (this.anInt5533 != local25) {
				this.anInt5533 = local25;
				this.aClass137_16 = null;
			}
			if (this.aClass267Array2 != null) {
				this.anInt5535 = 0;
				@Pc(62) int[] local62 = new int[this.aClass267Array2.length];
				for (@Pc(64) int local64 = 0; local64 < this.aClass267Array2.length; local64++) {
					@Pc(71) Class267 local71 = this.aClass267Array2[local64];
					if (local71.method6108(this.anInt5534, this.anInt5541, this.anInt5538, this.anInt5540)) {
						local62[this.anInt5535] = local71.anInt7881;
						this.aClass267Array1[this.anInt5535++] = local71;
					}
				}
				Static240.method3627(0, this.anInt5535 - 1, local62, this.aClass267Array1);
			}
			this.aBoolean342 = true;
		}
		@Pc(124) boolean local124 = false;
		if (this.aBoolean342) {
			this.aBoolean342 = false;
			for (@Pc(135) int local135 = this.anInt5535 - 1; local135 >= 0; local135--) {
				@Pc(146) boolean local146 = this.aClass267Array1[local135].method6110(arg1, this.aClass267_1);
				local124 |= local146;
				this.aBoolean342 |= !local146;
			}
		}
		return local124;
	}
}
