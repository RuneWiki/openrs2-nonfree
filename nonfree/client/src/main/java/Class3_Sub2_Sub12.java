import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class3_Sub2_Sub12 extends Class3_Sub2 {

	@OriginalMember(owner = "client!haa", name = "J", descriptor = "Z")
	private boolean aBoolean360 = true;

	@OriginalMember(owner = "client!haa", name = "L", descriptor = "I")
	private int anInt4346 = 4096;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9203(@OriginalArg(1) int arg0) {
		@Pc(23) int[][] local23 = super.aClass36_41.method731(arg0);
		if (super.aClass36_41.aBoolean75) {
			@Pc(37) int[] local37 = this.method9204(Static599.anInt9773 & arg0 - 1, 0);
			@Pc(43) int[] local43 = this.method9204(arg0, 0);
			@Pc(53) int[] local53 = this.method9204(arg0 + 1 & Static599.anInt9773, 0);
			@Pc(57) int[] local57 = local23[0];
			@Pc(61) int[] local61 = local23[1];
			@Pc(65) int[] local65 = local23[2];
			for (@Pc(67) int local67 = 0; local67 < Static636.anInt10302; local67++) {
				@Pc(81) int local81 = (local53[local67] - local37[local67]) * this.anInt4346;
				@Pc(100) int local100 = (local43[Static144.anInt2744 & local67 + 1] - local43[local67 - 1 & Static144.anInt2744]) * this.anInt4346;
				@Pc(104) int local104 = local100 >> 12;
				@Pc(108) int local108 = local81 >> 12;
				@Pc(114) int local114 = local104 * local104 >> 12;
				@Pc(120) int local120 = local108 * local108 >> 12;
				@Pc(134) int local134 = (int) (Math.sqrt((double) ((float) (local120 + local114 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(143) int local143;
				@Pc(141) int local141;
				@Pc(145) int local145;
				if (local134 == 0) {
					local141 = 0;
					local143 = 0;
					local145 = 0;
				} else {
					local141 = local81 / local134;
					local143 = local100 / local134;
					local145 = 16777216 / local134;
				}
				if (this.aBoolean360) {
					local141 = (local141 >> 1) + 2048;
					local143 = (local143 >> 1) + 2048;
					local145 = (local145 >> 1) + 2048;
				}
				local57[local67] = local143;
				local61[local67] = local141;
				local65[local67] = local145;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt4346 = arg1.method5272();
		} else if (arg0 == 1) {
			this.aBoolean360 = arg1.method5322(-108) == 1;
		}
	}
}
