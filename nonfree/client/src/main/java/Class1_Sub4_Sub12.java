import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class1_Sub4_Sub12 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
	private int anInt1660 = 4096;

	@OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
	private int anInt1663 = 4096;

	@OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
	private int anInt1659 = 4096;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method5691(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass50_41.method1086(arg0);
		if (super.aClass50_41.aBoolean131) {
			@Pc(27) int[][] local27 = this.method5696(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static395.anInt6592; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(63) int local63 = local39[local53];
				@Pc(67) int local67 = local35[local53];
				if (local63 == local59 && local67 == local63) {
					local43[local53] = local59 * this.anInt1659 >> 12;
					local47[local53] = this.anInt1663 * local63 >> 12;
					local51[local53] = this.anInt1660 * local67 >> 12;
				} else {
					local43[local53] = this.anInt1659;
					local47[local53] = this.anInt1663;
					local51[local53] = this.anInt1660;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1659 = arg0.method5335();
		} else if (arg1 == 1) {
			this.anInt1663 = arg0.method5335();
		} else if (arg1 == 2) {
			this.anInt1660 = arg0.method5335();
		}
	}
}
