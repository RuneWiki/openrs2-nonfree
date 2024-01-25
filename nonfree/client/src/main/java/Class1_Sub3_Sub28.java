import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class1_Sub3_Sub28 extends Class1_Sub3 {

	@OriginalMember(owner = "client!q", name = "J", descriptor = "Z")
	private boolean aBoolean495 = true;

	@OriginalMember(owner = "client!q", name = "N", descriptor = "I")
	private int anInt5094 = 4096;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub28() {
		super(1, false);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt5094 = arg1.method4556();
		} else if (arg0 == 1) {
			this.aBoolean495 = arg1.method4532() == 1;
		}
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5538(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass144_41.method3947(arg0);
		if (super.aClass144_41.aBoolean415) {
			@Pc(35) int[] local35 = this.method5532(0, Static49.anInt1526 & arg0 - 1);
			@Pc(43) int[] local43 = this.method5532(0, arg0);
			@Pc(53) int[] local53 = this.method5532(0, arg0 + 1 & Static49.anInt1526);
			@Pc(57) int[] local57 = local19[0];
			@Pc(61) int[] local61 = local19[1];
			@Pc(65) int[] local65 = local19[2];
			for (@Pc(67) int local67 = 0; local67 < Static153.anInt3378; local67++) {
				@Pc(81) int local81 = (local53[local67] - local35[local67]) * this.anInt5094;
				@Pc(100) int local100 = this.anInt5094 * (local43[local67 + 1 & Static250.anInt5127] - local43[local67 - 1 & Static250.anInt5127]);
				@Pc(104) int local104 = local100 >> 12;
				@Pc(108) int local108 = local81 >> 12;
				@Pc(114) int local114 = local104 * local104 >> 12;
				@Pc(120) int local120 = local108 * local108 >> 12;
				@Pc(134) int local134 = (int) (Math.sqrt((double) ((float) (local120 + local114 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(151) int local151;
				@Pc(143) int local143;
				@Pc(147) int local147;
				if (local134 == 0) {
					local147 = 0;
					local143 = 0;
					local151 = 0;
				} else {
					local143 = local81 / local134;
					local147 = 16777216 / local134;
					local151 = local100 / local134;
				}
				if (this.aBoolean495) {
					local143 = (local143 >> 1) + 2048;
					local147 = (local147 >> 1) + 2048;
					local151 = (local151 >> 1) + 2048;
				}
				local57[local67] = local151;
				local61[local67] = local143;
				local65[local67] = local147;
			}
		}
		return local19;
	}
}
