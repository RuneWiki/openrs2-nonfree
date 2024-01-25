import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class2_Sub7_Sub19 extends Class2_Sub7 {

	@OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
	private int anInt3995 = 4096;

	@OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
	private int anInt3997 = 4096;

	@OriginalMember(owner = "client!jg", name = "N", descriptor = "I")
	private int anInt3999 = 4096;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt3999 = arg1.method5229();
		} else if (arg0 == 1) {
			this.anInt3995 = arg1.method5229();
		} else if (arg0 == 2) {
			this.anInt3997 = arg1.method5229();
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7585(@OriginalArg(1) int arg0) {
		@Pc(21) int[][] local21 = super.aClass180_41.method4533(arg0);
		if (super.aClass180_41.aBoolean392) {
			@Pc(31) int[][] local31 = this.method7589(0, arg0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			@Pc(47) int[] local47 = local21[0];
			@Pc(51) int[] local51 = local21[1];
			@Pc(55) int[] local55 = local21[2];
			for (@Pc(57) int local57 = 0; local57 < Static352.anInt6485; local57++) {
				@Pc(63) int local63 = local35[local57];
				@Pc(67) int local67 = local43[local57];
				@Pc(71) int local71 = local39[local57];
				if (local63 == local67 && local71 == local67) {
					local47[local57] = this.anInt3999 * local63 >> 12;
					local51[local57] = this.anInt3995 * local67 >> 12;
					local55[local57] = this.anInt3997 * local71 >> 12;
				} else {
					local47[local57] = this.anInt3999;
					local51[local57] = this.anInt3995;
					local55[local57] = this.anInt3997;
				}
			}
		}
		return local21;
	}
}
