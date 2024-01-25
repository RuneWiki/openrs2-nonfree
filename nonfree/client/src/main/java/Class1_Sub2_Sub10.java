import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class1_Sub2_Sub10 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
	private int anInt1551 = 4096;

	@OriginalMember(owner = "client!ej", name = "J", descriptor = "Z")
	private boolean aBoolean137 = true;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt1551 = arg1.method5177();
		} else if (arg0 == 1) {
			this.aBoolean137 = arg1.method5174() == 1;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5504(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass228_41.method4874(arg0);
		if (super.aClass228_41.aBoolean523) {
			@Pc(27) int[] local27 = this.method5510(arg0 - 1 & Static13.anInt189, 0);
			@Pc(33) int[] local33 = this.method5510(arg0, 0);
			@Pc(43) int[] local43 = this.method5510(Static13.anInt189 & arg0 + 1, 0);
			@Pc(47) int[] local47 = local13[0];
			@Pc(51) int[] local51 = local13[1];
			@Pc(55) int[] local55 = local13[2];
			for (@Pc(57) int local57 = 0; local57 < Static158.anInt2658; local57++) {
				@Pc(71) int local71 = this.anInt1551 * (local43[local57] - local27[local57]);
				@Pc(91) int local91 = (local33[local57 + 1 & Static271.anInt4721] - local33[Static271.anInt4721 & local57 - 1]) * this.anInt1551;
				@Pc(95) int local95 = local91 >> 12;
				@Pc(99) int local99 = local71 >> 12;
				@Pc(105) int local105 = local95 * local95 >> 12;
				@Pc(111) int local111 = local99 * local99 >> 12;
				@Pc(125) int local125 = (int) (Math.sqrt((double) ((float) (local111 + local105 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(132) int local132;
				@Pc(136) int local136;
				@Pc(134) int local134;
				if (local125 == 0) {
					local132 = 0;
					local134 = 0;
					local136 = 0;
				} else {
					local132 = local91 / local125;
					local136 = local71 / local125;
					local134 = 16777216 / local125;
				}
				if (this.aBoolean137) {
					local134 = (local134 >> 1) + 2048;
					local132 = (local132 >> 1) + 2048;
					local136 = (local136 >> 1) + 2048;
				}
				local47[local57] = local132;
				local51[local57] = local136;
				local55[local57] = local134;
			}
		}
		return local13;
	}
}
