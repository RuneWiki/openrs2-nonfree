import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public class Class1_Sub2_Sub9 extends Class1_Sub2 {

	@OriginalMember(owner = "client!of", name = "V", descriptor = "I")
	protected int anInt817;

	@OriginalMember(owner = "client!of", name = "fb", descriptor = "I")
	protected int anInt821;

	@OriginalMember(owner = "client!of", name = "kb", descriptor = "[I")
	protected int[] anIntArray53;

	@OriginalMember(owner = "client!of", name = "ob", descriptor = "I")
	private int anInt828;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public final void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt828 = arg1.method1280();
		}
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(B)Z")
	protected final boolean method628() {
		if (this.anIntArray53 != null) {
			return true;
		} else if (this.anInt828 >= 0) {
			@Pc(27) Class1_Sub1_Sub1_Sub4 local27 = Static173.method3415(Static164.aClass76_127, this.anInt828);
			local27.method3033();
			this.anInt821 = local27.anInt3968;
			this.anIntArray53 = local27.anIntArray374;
			this.anInt817 = local27.anInt3967;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "(B)I")
	@Override
	public final int method3399() {
		return this.anInt828;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3391(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass19_41.method1028(arg0);
		if (super.aClass19_41.aBoolean54 && this.method628()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(56) int local56 = (this.anInt821 == Static181.anInt4508 ? arg0 : this.anInt821 * arg0 / Static181.anInt4508) * this.anInt817;
			@Pc(66) int local66;
			@Pc(74) int local74;
			if (Static22.anInt596 == this.anInt817) {
				for (local66 = 0; local66 < Static22.anInt596; local66++) {
					local74 = this.anIntArray53[local56++];
					local36[local66] = (local74 & 0xFF) << 4;
					local32[local66] = local74 >> 4 & 0xFF0;
					local28[local66] = local74 >> 12 & 0xFF0;
				}
			} else {
				for (local66 = 0; local66 < Static22.anInt596; local66++) {
					local74 = this.anInt817 * local66 / Static22.anInt596;
					@Pc(127) int local127 = this.anIntArray53[local56 + local74];
					local36[local66] = (local127 & 0xFF) << 4;
					local32[local66] = local127 >> 4 & 0xFF0;
					local28[local66] = local127 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}
}
