import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class242 {

	@OriginalMember(owner = "client!of", name = "d", descriptor = "Lclient!f;")
	private Class46 aClass46_15;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "I")
	private int anInt6352;

	@OriginalMember(owner = "client!of", name = "n", descriptor = "I")
	private int anInt6359;

	@OriginalMember(owner = "client!of", name = "k", descriptor = "I")
	private int anInt6356 = -1;

	@OriginalMember(owner = "client!of", name = "s", descriptor = "Z")
	private boolean aBoolean523 = true;

	@OriginalMember(owner = "client!of", name = "l", descriptor = "I")
	private final int anInt6357;

	@OriginalMember(owner = "client!of", name = "i", descriptor = "I")
	private final int anInt6354;

	@OriginalMember(owner = "client!of", name = "q", descriptor = "I")
	private final int anInt6360;

	@OriginalMember(owner = "client!of", name = "g", descriptor = "I")
	private final int anInt6353;

	@OriginalMember(owner = "client!of", name = "p", descriptor = "[Lclient!bn;")
	private final Class30[] aClass30Array2;

	@OriginalMember(owner = "client!of", name = "o", descriptor = "[Lclient!bn;")
	private final Class30[] aClass30Array1;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "Lclient!bn;")
	private final Class30 aClass30_1;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(I[Lclient!bn;IIII)V")
	public Class242(@OriginalArg(0) int arg0, @OriginalArg(1) Class30[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6357 = arg5;
		this.anInt6354 = arg0;
		this.anInt6360 = arg3;
		this.anInt6353 = arg4;
		this.aClass30Array2 = arg1;
		if (arg1 == null) {
			this.aClass30_1 = null;
			this.aClass30Array1 = null;
		} else {
			this.aClass30Array1 = new Class30[arg1.length];
			this.aClass30_1 = arg2 < 0 ? null : arg1[arg2];
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!r;II)Z")
	public boolean method5526(@OriginalArg(0) Class43 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anInt6356) {
			this.anInt6356 = arg1;
			@Pc(21) int local21 = Static247.method4032(arg1);
			if (local21 > 512) {
				local21 = 512;
			}
			if (local21 <= 0) {
				local21 = 1;
			}
			if (local21 != this.anInt6352) {
				this.anInt6352 = local21;
				this.aClass46_15 = null;
			}
			if (this.aClass30Array2 != null) {
				this.anInt6359 = 0;
				@Pc(60) int[] local60 = new int[this.aClass30Array2.length];
				for (@Pc(62) int local62 = 0; local62 < this.aClass30Array2.length; local62++) {
					@Pc(69) Class30 local69 = this.aClass30Array2[local62];
					if (local69.method781(this.anInt6360, this.anInt6353, this.anInt6357, this.anInt6356)) {
						local60[this.anInt6359] = local69.anInt1006;
						this.aClass30Array1[this.anInt6359++] = local69;
					}
				}
				Static88.method1973(local60, this.aClass30Array1, this.anInt6359 - 1, 0);
			}
			this.aBoolean523 = true;
		}
		@Pc(118) boolean local118 = false;
		if (this.aBoolean523) {
			this.aBoolean523 = false;
			for (@Pc(129) int local129 = this.anInt6359 - 1; local129 >= 0; local129--) {
				@Pc(140) boolean local140 = this.aClass30Array1[local129].method778(arg0, this.aClass30_1);
				this.aBoolean523 |= !local140;
				local118 |= local140;
			}
		}
		return local118;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
	public void method5528() {
		if (this.aClass30Array2 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass30Array2.length; local6++) {
				this.aClass30Array2[local6].method785();
			}
		}
		this.aClass46_15 = null;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIIIIILclient!r;I)V")
	public void method5529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class43 arg7, @OriginalArg(9) int arg8) {
		@Pc(18) int local18 = arg4 + arg5 & 0x3FFF;
		if (this.anInt6354 == -1) {
			arg7.J(arg0, arg1, arg2, arg6, arg8, 0);
		} else {
			@Pc(29) Class224 local29 = Static1.anInterface8_1.method6560(this.anInt6354);
			if (this.aClass46_15 == null && Static1.anInterface8_1.method6559(this.anInt6354)) {
				@Pc(67) int[] local67 = local29.aBoolean492 ? Static1.anInterface8_1.method6556(this.anInt6354, this.anInt6352, 0.7F, this.anInt6352) : Static1.anInterface8_1.method6555(this.anInt6354, false, 0.7F, this.anInt6352, this.anInt6352);
				this.aClass46_15 = arg7.method7198(local67, this.anInt6352, this.anInt6352, this.anInt6352);
			}
			if (local29.aBoolean492) {
				arg7.J(arg0, arg1, arg2, arg6, arg8, 0);
			}
			if (this.aClass46_15 != null) {
				@Pc(100) int local100 = local29.aBoolean492 ? 1 : 0;
				@Pc(106) int local106 = arg6 * arg3 / -4096;
				@Pc(119) int local119;
				for (local119 = (arg2 - arg6) / 2 + local18 * arg6 / 4096; local119 > arg6; local119 -= arg6) {
				}
				while (local106 > arg6) {
					local106 -= arg6;
				}
				while (local119 < 0) {
					local119 += arg6;
				}
				while (local106 < 0) {
					local106 += arg6;
				}
				for (@Pc(165) int local165 = local119 - arg6; local165 < arg2; local165 += arg6) {
					for (@Pc(172) int local172 = local106 - arg6; local172 < arg6; local172 += arg6) {
						this.aClass46_15.method7613(arg0 + local165, local172 + arg1, arg6, arg6, 1, 0, local100);
					}
				}
			}
		}
		for (@Pc(225) int local225 = this.anInt6359 - 1; local225 >= 0; local225--) {
			this.aClass30Array1[local225].method777(arg7, arg0, arg1, arg2, arg6, arg3, local18);
		}
	}
}
