import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class2_Sub4_Sub18 extends Class2_Sub4 {

	@OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
	private int anInt5477 = 4096;

	@OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
	private int anInt5479 = 4096;

	@OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
	private int anInt5481 = 4096;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7561(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass143_41.method2531(arg0);
		if (super.aClass143_41.aBoolean214) {
			@Pc(27) int[][] local27 = this.method7567(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static143.anInt7434; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(63) int local63 = local39[local53];
				@Pc(67) int local67 = local35[local53];
				if (local63 == local59 && local67 == local63) {
					local43[local53] = local59 * this.anInt5479 >> 12;
					local47[local53] = local63 * this.anInt5477 >> 12;
					local51[local53] = local67 * this.anInt5481 >> 12;
				} else {
					local43[local53] = this.anInt5479;
					local47[local53] = this.anInt5477;
					local51[local53] = this.anInt5481;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt5479 = arg1.method4518();
		} else if (arg0 == 1) {
			this.anInt5477 = arg1.method4518();
		} else if (arg0 == 2) {
			this.anInt5481 = arg1.method4518();
		}
	}
}
