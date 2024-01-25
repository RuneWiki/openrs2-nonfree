import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class4_Sub2_Sub13 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ip", name = "N", descriptor = "I")
	private int anInt4690 = 1;

	@OriginalMember(owner = "client!ip", name = "O", descriptor = "I")
	private int anInt4691 = 1;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4690 = arg0.method7004();
		} else if (arg1 == 1) {
			this.anInt4691 = arg0.method7004();
		} else if (arg1 == 2) {
			super.aBoolean713 = arg0.method7004() == 1;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8201(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass64_41.method1614(arg0);
		if (super.aClass64_41.aBoolean154) {
			@Pc(28) int local28 = this.anInt4691 + this.anInt4691 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(41) int local41 = this.anInt4690 + this.anInt4690 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][][] local48 = new int[local28][][];
			@Pc(74) int local74;
			@Pc(76) int local76;
			for (@Pc(54) int local54 = arg0 - this.anInt4691; local54 <= this.anInt4691 + arg0; local54++) {
				@Pc(66) int[][] local66 = this.method8202(Static565.anInt5164 & local54, 0);
				@Pc(70) int[][] local70 = new int[3][Static417.anInt5248];
				@Pc(72) int local72 = 0;
				local74 = 0;
				local76 = 0;
				@Pc(80) int[] local80 = local66[0];
				@Pc(84) int[] local84 = local66[1];
				@Pc(88) int[] local88 = local66[2];
				for (@Pc(92) int local92 = -this.anInt4690; local92 <= this.anInt4690; local92++) {
					@Pc(98) int local98 = local92 & Static359.anInt6929;
					local74 += local84[local98];
					local72 += local80[local98];
					local76 += local88[local98];
				}
				@Pc(125) int[] local125 = local70[0];
				@Pc(129) int[] local129 = local70[1];
				@Pc(133) int[] local133 = local70[2];
				@Pc(135) int local135 = 0;
				while (Static417.anInt5248 > local135) {
					local125[local135] = local45 * local72 >> 16;
					local129[local135] = local45 * local74 >> 16;
					local133[local135] = local45 * local76 >> 16;
					@Pc(168) int local168 = Static359.anInt6929 & local135 - this.anInt4690;
					local72 -= local80[local168];
					local135++;
					local74 -= local84[local168];
					local76 -= local88[local168];
					@Pc(194) int local194 = local135 + this.anInt4690 & Static359.anInt6929;
					local72 += local80[local194];
					local74 += local84[local194];
					local76 += local88[local194];
				}
				local48[local54 + this.anInt4691 - arg0] = local70;
			}
			@Pc(237) int[] local237 = local16[0];
			@Pc(241) int[] local241 = local16[1];
			@Pc(245) int[] local245 = local16[2];
			for (local74 = 0; local74 < Static417.anInt5248; local74++) {
				local76 = 0;
				@Pc(253) int local253 = 0;
				@Pc(255) int local255 = 0;
				for (@Pc(257) int local257 = 0; local257 < local28; local257++) {
					@Pc(263) int[][] local263 = local48[local257];
					local76 += local263[0][local74];
					local255 += local263[2][local74];
					local253 += local263[1][local74];
				}
				local237[local74] = local76 * local32 >> 16;
				local241[local74] = local32 * local253 >> 16;
				local245[local74] = local32 * local255 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			@Pc(30) int local30 = this.anInt4691 + this.anInt4691 + 1;
			@Pc(34) int local34 = 65536 / local30;
			@Pc(42) int local42 = this.anInt4690 + this.anInt4690 + 1;
			@Pc(46) int local46 = 65536 / local42;
			@Pc(49) int[][] local49 = new int[local30][];
			@Pc(69) int local69;
			for (@Pc(54) int local54 = arg0 - this.anInt4691; local54 <= this.anInt4691 + arg0; local54++) {
				@Pc(64) int[] local64 = this.method8208(0, Static565.anInt5164 & local54);
				@Pc(67) int[] local67 = new int[Static417.anInt5248];
				local69 = 0;
				for (@Pc(73) int local73 = -this.anInt4690; local73 <= this.anInt4690; local73++) {
					local69 += local64[local73 & Static359.anInt6929];
				}
				@Pc(90) int local90 = 0;
				while (Static417.anInt5248 > local90) {
					local67[local90] = local46 * local69 >> 16;
					local69 -= local64[local90 - this.anInt4690 & Static359.anInt6929];
					local90++;
					local69 += local64[local90 + this.anInt4690 & Static359.anInt6929];
				}
				local49[local54 + this.anInt4691 - arg0] = local67;
			}
			for (@Pc(153) int local153 = 0; local153 < Static417.anInt5248; local153++) {
				@Pc(157) int local157 = 0;
				for (local69 = 0; local69 < local30; local69++) {
					local157 += local49[local69][local153];
				}
				local13[local153] = local34 * local157 >> 16;
			}
		}
		return local13;
	}
}
