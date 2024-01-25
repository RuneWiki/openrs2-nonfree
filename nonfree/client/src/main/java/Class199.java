import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class199 {

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
	private int anInt6238;

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
	private int anInt6239;

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "Lclient!cq;")
	private Class8 aClass8_25;

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
	private int anInt6241 = -1;

	@OriginalMember(owner = "client!uj", name = "w", descriptor = "Z")
	private boolean aBoolean516 = true;

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "[Lclient!cg;")
	private final Class33[] aClass33Array1;

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
	private final int anInt6243;

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
	private final int anInt6240;

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
	private final int anInt6236;

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
	private final int anInt6244;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "Lclient!cg;")
	private final Class33 aClass33_1;

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "[Lclient!cg;")
	private final Class33[] aClass33Array2;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(I[Lclient!cg;IIII)V")
	public Class199(@OriginalArg(0) int arg0, @OriginalArg(1) Class33[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass33Array1 = arg1;
		this.anInt6243 = arg3;
		this.anInt6240 = arg5;
		this.anInt6236 = arg0;
		this.anInt6244 = arg4;
		if (arg1 == null) {
			this.aClass33_1 = null;
			this.aClass33Array2 = null;
		} else {
			this.aClass33Array2 = new Class33[arg1.length];
			this.aClass33_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
	public void method5371() {
		if (this.aClass33Array1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass33Array1.length; local6++) {
				this.aClass33Array1[local6].method709();
			}
		}
		this.aClass8_25 = null;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBIIILclient!ii;IIII)V")
	public void method5374(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class105 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) int local7 = arg0 + arg1 & 0x3FFF;
		if (this.anInt6236 == -1) {
			arg4.method4249(arg8, arg7, arg3, arg6, arg2, 0);
		} else {
			@Pc(22) Class116 local22 = Static159.anInterface2_7.method951(this.anInt6236);
			if (this.aClass8_25 == null && Static159.anInterface2_7.method952(this.anInt6236)) {
				@Pc(60) int[] local60 = local22.aBoolean218 ? Static159.anInterface2_7.method949(this.anInt6238, false, this.anInt6238, this.anInt6236, 0.7F) : Static159.anInterface2_7.method950(this.anInt6238, this.anInt6238, 0.7F, this.anInt6236);
				this.aClass8_25 = arg4.method4257(local60, this.anInt6238, this.anInt6238, this.anInt6238);
			}
			if (!local22.aBoolean218) {
				arg4.method4249(arg8, arg7, arg3, arg6, arg2, 0);
			}
			if (this.aClass8_25 != null) {
				@Pc(93) int local93 = local22.aBoolean218 ? 0 : 1;
				@Pc(99) int local99 = arg5 * arg6 / -4096;
				@Pc(112) int local112;
				for (local112 = (arg3 - arg6) / 2 + local7 * arg6 / 4096; local112 > arg6; local112 -= arg6) {
				}
				while (local112 < 0) {
					local112 += arg6;
				}
				while (arg6 < local99) {
					local99 -= arg6;
				}
				while (local99 < 0) {
					local99 += arg6;
				}
				for (@Pc(161) int local161 = local112 - arg6; local161 < arg3; local161 += arg6) {
					for (@Pc(168) int local168 = local99 - arg6; local168 < arg6; local168 += arg6) {
						this.aClass8_25.method4391(local161 + arg8, local168 + arg7, arg6, arg6, 0, 0, local93);
					}
				}
			}
		}
		for (@Pc(217) int local217 = this.anInt6239 - 1; local217 >= 0; local217--) {
			this.aClass33Array2[local217].method715(arg4, arg8, arg7, arg3, arg6, arg5, local7);
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILclient!ii;I)Z")
	public boolean method5375(@OriginalArg(0) int arg0, @OriginalArg(1) Class105 arg1) {
		@Pc(55) int local55;
		if (arg0 != this.anInt6241) {
			this.anInt6241 = arg0;
			@Pc(12) int local12 = Static304.method5275(arg0);
			if (local12 > arg0) {
				local12 = Static351.method3411(arg0);
			}
			if (local12 > 512) {
				local12 = 512;
			}
			if (this.anInt6238 != local12) {
				this.anInt6238 = local12;
				this.aClass8_25 = null;
			}
			if (this.aClass33Array1 != null) {
				this.anInt6239 = 0;
				@Pc(53) int[] local53 = new int[this.aClass33Array1.length];
				for (local55 = 0; local55 < this.aClass33Array1.length; local55++) {
					@Pc(62) Class33 local62 = this.aClass33Array1[local55];
					if (local62.method712(this.anInt6243, this.anInt6244, this.anInt6240, this.anInt6241)) {
						local53[this.anInt6239] = local62.anInt914;
						this.aClass33Array2[this.anInt6239++] = local62;
					}
				}
				Static289.method5052(0, local53, this.aClass33Array2, this.anInt6239 - 1);
			}
			this.aBoolean516 = true;
		}
		@Pc(127) boolean local127 = false;
		if (this.aBoolean516) {
			this.aBoolean516 = false;
			for (local55 = this.anInt6239 - 1; local55 >= 0; local55--) {
				@Pc(149) boolean local149 = this.aClass33Array2[local55].method713(arg1, this.aClass33_1);
				local127 |= local149;
				this.aBoolean516 |= !local149;
			}
		}
		return local127;
	}
}
