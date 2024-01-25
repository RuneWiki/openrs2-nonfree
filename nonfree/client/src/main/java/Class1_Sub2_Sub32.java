import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class1_Sub2_Sub32 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pr", name = "O", descriptor = "I")
	private int anInt4830 = 4096;

	@OriginalMember(owner = "client!pr", name = "U", descriptor = "I")
	private int anInt4832 = 4096;

	@OriginalMember(owner = "client!pr", name = "W", descriptor = "I")
	private int anInt4834 = 4096;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt4830 = arg1.method5177();
		} else if (arg0 == 1) {
			this.anInt4834 = arg1.method5177();
		} else if (arg0 == 2) {
			this.anInt4832 = arg1.method5177();
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5504(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass228_41.method4874(arg0);
		if (super.aClass228_41.aBoolean523) {
			@Pc(23) int[][] local23 = this.method5514(arg0, 0);
			@Pc(27) int[] local27 = local23[0];
			@Pc(31) int[] local31 = local23[1];
			@Pc(35) int[] local35 = local23[2];
			@Pc(39) int[] local39 = local13[0];
			@Pc(43) int[] local43 = local13[1];
			@Pc(47) int[] local47 = local13[2];
			for (@Pc(49) int local49 = 0; local49 < Static158.anInt2658; local49++) {
				@Pc(55) int local55 = local27[local49];
				@Pc(59) int local59 = local35[local49];
				@Pc(63) int local63 = local31[local49];
				if (local59 == local55 && local63 == local59) {
					local39[local49] = local55 * this.anInt4830 >> 12;
					local43[local49] = this.anInt4834 * local59 >> 12;
					local47[local49] = this.anInt4832 * local63 >> 12;
				} else {
					local39[local49] = this.anInt4830;
					local43[local49] = this.anInt4834;
					local47[local49] = this.anInt4832;
				}
			}
		}
		return local13;
	}
}
