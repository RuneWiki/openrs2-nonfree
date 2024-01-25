import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qga")
public final class Class4_Sub1_Sub29 extends Class4_Sub1 {

	@OriginalMember(owner = "client!qga", name = "C", descriptor = "Z")
	private boolean aBoolean548 = true;

	@OriginalMember(owner = "client!qga", name = "I", descriptor = "I")
	private int anInt7986 = 4096;

	@OriginalMember(owner = "client!qga", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt7986 = arg1.method4936();
		} else if (arg0 == 1) {
			this.aBoolean548 = arg1.method4905() == 1;
		}
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8388(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass84_41.method2457(arg0);
		if (super.aClass84_41.aBoolean194) {
			@Pc(27) int[] local27 = this.method8392(arg0 - 1 & Static237.anInt4286, 0);
			@Pc(33) int[] local33 = this.method8392(arg0, 0);
			@Pc(43) int[] local43 = this.method8392(Static237.anInt4286 & arg0 + 1, 0);
			@Pc(47) int[] local47 = local13[0];
			@Pc(51) int[] local51 = local13[1];
			@Pc(55) int[] local55 = local13[2];
			for (@Pc(57) int local57 = 0; local57 < Static376.anInt7260; local57++) {
				@Pc(71) int local71 = this.anInt7986 * (local43[local57] - local27[local57]);
				@Pc(91) int local91 = this.anInt7986 * (local33[local57 + 1 & Static569.anInt9982] - local33[local57 - 1 & Static569.anInt9982]);
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
					local134 = 16777216 / local125;
					local132 = local91 / local125;
					local136 = local71 / local125;
				}
				if (this.aBoolean548) {
					local136 = (local136 >> 1) + 2048;
					local132 = (local132 >> 1) + 2048;
					local134 = (local134 >> 1) + 2048;
				}
				local47[local57] = local132;
				local51[local57] = local136;
				local55[local57] = local134;
			}
		}
		return local13;
	}
}
