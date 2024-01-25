import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class1_Sub2_Sub25 extends Class1_Sub2 {

	@OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
	private int anInt4202 = 4096;

	@OriginalMember(owner = "client!nm", name = "J", descriptor = "I")
	private int anInt4201 = 4096;

	@OriginalMember(owner = "client!nm", name = "Q", descriptor = "I")
	private int anInt4205 = 4096;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5664(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass129_41.method3671(arg0);
		if (super.aClass129_41.aBoolean338) {
			@Pc(27) int[][] local27 = this.method5659(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static251.anInt6509; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(63) int local63 = local39[local53];
				@Pc(67) int local67 = local35[local53];
				if (local59 == local63 && local63 == local67) {
					local43[local53] = this.anInt4202 * local59 >> 12;
					local47[local53] = local63 * this.anInt4201 >> 12;
					local51[local53] = this.anInt4205 * local67 >> 12;
				} else {
					local43[local53] = this.anInt4202;
					local47[local53] = this.anInt4201;
					local51[local53] = this.anInt4205;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt4202 = arg1.method3115();
		} else if (arg0 == 1) {
			this.anInt4201 = arg1.method3115();
		} else if (arg0 == 2) {
			this.anInt4205 = arg1.method3115();
		}
	}
}
