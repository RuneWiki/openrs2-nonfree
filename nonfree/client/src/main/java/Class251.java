import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class251 {

	@OriginalMember(owner = "client!no", name = "d", descriptor = "I")
	private int anInt7593;

	@OriginalMember(owner = "client!no", name = "h", descriptor = "I")
	private int anInt7597;

	@OriginalMember(owner = "client!no", name = "i", descriptor = "Lclient!mq;")
	private Class71 aClass71_16;

	@OriginalMember(owner = "client!no", name = "m", descriptor = "I")
	private int anInt7600 = -1;

	@OriginalMember(owner = "client!no", name = "q", descriptor = "Z")
	private boolean aBoolean564 = true;

	@OriginalMember(owner = "client!no", name = "f", descriptor = "I")
	private final int anInt7595;

	@OriginalMember(owner = "client!no", name = "k", descriptor = "I")
	private final int anInt7598;

	@OriginalMember(owner = "client!no", name = "o", descriptor = "I")
	private final int anInt7601;

	@OriginalMember(owner = "client!no", name = "n", descriptor = "[Lclient!qq;")
	private final Class304[] aClass304Array2;

	@OriginalMember(owner = "client!no", name = "g", descriptor = "I")
	private final int anInt7596;

	@OriginalMember(owner = "client!no", name = "b", descriptor = "Lclient!qq;")
	private final Class304 aClass304_1;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "[Lclient!qq;")
	private final Class304[] aClass304Array1;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(I[Lclient!qq;IIII)V")
	public Class251(@OriginalArg(0) int arg0, @OriginalArg(1) Class304[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7595 = arg3;
		this.anInt7598 = arg0;
		this.anInt7601 = arg4;
		this.aClass304Array2 = arg1;
		this.anInt7596 = arg5;
		if (arg1 == null) {
			this.aClass304_1 = null;
			this.aClass304Array1 = null;
		} else {
			this.aClass304Array1 = new Class304[arg1.length];
			this.aClass304_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IILclient!ha;IIIIIBI)V")
	public void method6717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class101 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg4 + arg7 & 0x3FFF;
		if (this.anInt7598 == -1 || this.anInt7593 == 0) {
			arg2.aa(arg6, arg1, arg5, arg0, arg8, 0);
		} else {
			@Pc(25) Class136 local25 = Static94.anInterface3_1.method1941(this.anInt7598);
			if (this.aClass71_16 == null && Static94.anInterface3_1.method1940(this.anInt7598)) {
				@Pc(62) int[] local62 = local25.anInt4370 == 2 ? Static94.anInterface3_1.method1939(0.7F, this.anInt7598, this.anInt7593, this.anInt7593) : Static94.anInterface3_1.method1938(false, 0.7F, this.anInt7593, this.anInt7598, this.anInt7593);
				this.aClass71_16 = arg2.method8111(this.anInt7593, local62, this.anInt7593, this.anInt7593);
			}
			if (local25.anInt4370 == 2) {
				arg2.aa(arg6, arg1, arg5, arg0, arg8, 0);
			}
			if (this.aClass71_16 != null) {
				@Pc(100) int local100 = local25.anInt4370 == 2 ? 1 : 0;
				@Pc(106) int local106 = arg3 * arg0 / -4096;
				@Pc(120) int local120;
				for (local120 = (arg5 - arg0) / 2 + arg0 * local7 / 4096; local120 > arg0; local120 -= arg0) {
				}
				while (local106 > arg0) {
					local106 -= arg0;
				}
				while (local120 < 0) {
					local120 += arg0;
				}
				while (local106 < 0) {
					local106 += arg0;
				}
				for (@Pc(166) int local166 = local120 - arg0; local166 < arg5; local166 += arg0) {
					for (@Pc(173) int local173 = local106 - arg0; local173 < arg0; local173 += arg0) {
						this.aClass71_16.method7702(local166 + arg6, local173 - -arg1, arg0, arg0, 1, 0, local100);
					}
				}
			}
		}
		for (@Pc(223) int local223 = this.anInt7597 - 1; local223 >= 0; local223--) {
			this.aClass304Array1[local223].method7809(arg2, arg6, arg1, arg5, arg0, arg3, local7);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILclient!ha;I)Z")
	public boolean method6719(@OriginalArg(0) int arg0, @OriginalArg(1) Class101 arg1) {
		if (arg0 != this.anInt7600) {
			this.anInt7600 = arg0;
			@Pc(22) int local22 = Static427.method7013(arg0);
			if (local22 > 512) {
				local22 = 512;
			}
			if (local22 <= 0) {
				local22 = 1;
			}
			if (local22 != this.anInt7593) {
				this.aClass71_16 = null;
				this.anInt7593 = local22;
			}
			if (this.aClass304Array2 != null) {
				this.anInt7597 = 0;
				@Pc(54) int[] local54 = new int[this.aClass304Array2.length];
				for (@Pc(56) int local56 = 0; local56 < this.aClass304Array2.length; local56++) {
					@Pc(63) Class304 local63 = this.aClass304Array2[local56];
					if (local63.method7804(this.anInt7595, this.anInt7601, this.anInt7596, this.anInt7600)) {
						local54[this.anInt7597] = local63.anInt8828;
						this.aClass304Array1[this.anInt7597++] = local63;
					}
				}
				Static548.method8414(this.anInt7597 - 1, 0, local54, this.aClass304Array1);
			}
			this.aBoolean564 = true;
		}
		@Pc(116) boolean local116 = false;
		if (this.aBoolean564) {
			this.aBoolean564 = false;
			for (@Pc(127) int local127 = this.anInt7597 - 1; local127 >= 0; local127--) {
				@Pc(138) boolean local138 = this.aClass304Array1[local127].method7808(arg1, this.aClass304_1);
				local116 |= local138;
				this.aBoolean564 |= !local138;
			}
		}
		return local116;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V")
	public void method6721() {
		if (this.aClass304Array2 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.aClass304Array2.length; local18++) {
				this.aClass304Array2[local18].method7803();
			}
		}
		this.aClass71_16 = null;
	}
}
