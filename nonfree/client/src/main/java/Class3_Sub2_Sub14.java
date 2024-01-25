import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class3_Sub2_Sub14 extends Class3_Sub2 {

	@OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
	private int anInt5778 = 4;

	@OriginalMember(owner = "client!kk", name = "H", descriptor = "I")
	private int anInt5781 = 4;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5778 = arg0.method4888();
		} else if (arg1 == 1) {
			this.anInt5781 = arg0.method4888();
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8711(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass115_41.method2722(arg0);
		if (super.aClass115_41.aBoolean233) {
			@Pc(25) int local25 = Static30.anInt908 / this.anInt5778;
			@Pc(30) int local30 = Static157.anInt2964 / this.anInt5781;
			@Pc(46) int[][] local46;
			if (local30 > 0) {
				@Pc(36) int local36 = arg0 % local30;
				local46 = this.method8718(0, Static157.anInt2964 * local36 / local30);
			} else {
				local46 = this.method8718(0, 0);
			}
			@Pc(58) int[] local58 = local46[0];
			@Pc(62) int[] local62 = local46[1];
			@Pc(66) int[] local66 = local46[2];
			@Pc(70) int[] local70 = local16[0];
			@Pc(74) int[] local74 = local16[1];
			@Pc(78) int[] local78 = local16[2];
			for (@Pc(80) int local80 = 0; local80 < Static30.anInt908; local80++) {
				@Pc(94) int local94;
				if (local25 > 0) {
					@Pc(88) int local88 = local80 % local25;
					local94 = local88 * Static30.anInt908 / local25;
				} else {
					local94 = 0;
				}
				local70[local80] = local58[local94];
				local74[local80] = local62[local94];
				local78[local80] = local66[local94];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			@Pc(25) int local25 = Static30.anInt908 / this.anInt5778;
			@Pc(30) int local30 = Static157.anInt2964 / this.anInt5781;
			@Pc(38) int[] local38;
			@Pc(44) int local44;
			if (local30 <= 0) {
				local38 = this.method8716(0, 0);
			} else {
				local44 = arg0 % local30;
				local38 = this.method8716(0, local44 * Static157.anInt2964 / local30);
			}
			for (local44 = 0; local44 < Static30.anInt908; local44++) {
				if (local25 <= 0) {
					local16[local44] = local38[0];
				} else {
					@Pc(72) int local72 = local44 % local25;
					local16[local44] = local38[local72 * Static30.anInt908 / local25];
				}
			}
		}
		return local16;
	}
}
