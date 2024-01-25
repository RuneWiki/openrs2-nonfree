import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class2_Sub6_Sub9 extends Class2_Sub6 {

	@OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
	private int anInt2748 = 4;

	@OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
	private int anInt2752 = 4;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub9() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt2748 = arg1.method8547();
		} else if (arg0 == 1) {
			this.anInt2752 = arg1.method8547();
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8470(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass52_41.method962(arg0);
		if (super.aClass52_41.aBoolean88) {
			@Pc(22) int local22 = Static51.anInt1085 / this.anInt2748;
			@Pc(27) int local27 = Static262.anInt5589 / this.anInt2752;
			@Pc(38) int[][] local38;
			if (local27 <= 0) {
				local38 = this.method8465(0, 0);
			} else {
				@Pc(44) int local44 = arg0 % local27;
				local38 = this.method8465(0, Static262.anInt5589 * local44 / local27);
			}
			@Pc(58) int[] local58 = local38[0];
			@Pc(62) int[] local62 = local38[1];
			@Pc(66) int[] local66 = local38[2];
			@Pc(70) int[] local70 = local13[0];
			@Pc(74) int[] local74 = local13[1];
			@Pc(78) int[] local78 = local13[2];
			for (@Pc(80) int local80 = 0; local80 < Static51.anInt1085; local80++) {
				@Pc(97) int local97;
				if (local22 > 0) {
					@Pc(91) int local91 = local80 % local22;
					local97 = Static51.anInt1085 * local91 / local22;
				} else {
					local97 = 0;
				}
				local70[local80] = local58[local97];
				local74[local80] = local62[local97];
				local78[local80] = local66[local97];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			@Pc(26) int local26 = Static51.anInt1085 / this.anInt2748;
			@Pc(31) int local31 = Static262.anInt5589 / this.anInt2752;
			@Pc(42) int[] local42;
			@Pc(48) int local48;
			if (local31 <= 0) {
				local42 = this.method8461(0, 0);
			} else {
				local48 = arg0 % local31;
				local42 = this.method8461(0, local48 * Static262.anInt5589 / local31);
			}
			for (local48 = 0; local48 < Static51.anInt1085; local48++) {
				if (local26 > 0) {
					@Pc(68) int local68 = local48 % local26;
					local11[local48] = local42[local68 * Static51.anInt1085 / local26];
				} else {
					local11[local48] = local42[0];
				}
			}
		}
		return local11;
	}
}
