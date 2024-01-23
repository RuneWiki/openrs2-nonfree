import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class1_Sub1_Sub19 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lb", name = "R", descriptor = "I")
	private int anInt2775 = 4;

	@OriginalMember(owner = "client!lb", name = "V", descriptor = "I")
	private int anInt2778 = 4;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method4459(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass176_41.method4469(arg0);
		if (this.aClass176_41.aBoolean437) {
			@Pc(27) int local27 = Static131.anInt2513 / this.anInt2775;
			@Pc(32) int local32 = Static219.anInt4483 / this.anInt2778;
			@Pc(49) int[] local49;
			@Pc(39) int local39;
			if (local32 > 0) {
				local39 = arg0 % local32;
				local49 = this.method4450(0, local39 * Static219.anInt4483 / local32);
			} else {
				local49 = this.method4450(0, 0);
			}
			for (local39 = 0; local39 < Static131.anInt2513; local39++) {
				if (local27 <= 0) {
					local17[local39] = local49[0];
				} else {
					@Pc(83) int local83 = local39 % local27;
					local17[local39] = local49[local83 * Static131.anInt2513 / local27];
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method4444(@OriginalArg(1) int arg0) {
		@Pc(12) int[][] local12 = this.aClass153_41.method3955(arg0);
		if (this.aClass153_41.aBoolean396) {
			@Pc(26) int local26 = Static131.anInt2513 / this.anInt2775;
			@Pc(31) int local31 = Static219.anInt4483 / this.anInt2778;
			@Pc(42) int[][] local42;
			if (local31 <= 0) {
				local42 = this.method4457(0, 0);
			} else {
				@Pc(48) int local48 = arg0 % local31;
				local42 = this.method4457(0, local48 * Static219.anInt4483 / local31);
			}
			@Pc(62) int[] local62 = local42[0];
			@Pc(66) int[] local66 = local42[1];
			@Pc(70) int[] local70 = local12[0];
			@Pc(74) int[] local74 = local42[2];
			@Pc(78) int[] local78 = local12[1];
			@Pc(82) int[] local82 = local12[2];
			for (@Pc(84) int local84 = 0; local84 < Static131.anInt2513; local84++) {
				@Pc(95) int local95;
				if (local26 <= 0) {
					local95 = 0;
				} else {
					@Pc(101) int local101 = local84 % local26;
					local95 = local101 * Static131.anInt2513 / local26;
				}
				local70[local84] = local62[local95];
				local78[local84] = local66[local95];
				local82[local84] = local74[local95];
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2775 = arg0.method3122();
		} else if (arg1 == 1) {
			this.anInt2778 = arg0.method3122();
		}
	}
}
