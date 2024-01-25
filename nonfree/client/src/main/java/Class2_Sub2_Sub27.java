import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class2_Sub2_Sub27 extends Class2_Sub2 {

	@OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
	private int anInt7053 = 4096;

	@OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
	private int anInt7052 = 4096;

	@OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
	private int anInt7058 = 4096;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7946(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass314_41.method7006(arg0);
		if (super.aClass314_41.aBoolean653) {
			@Pc(21) int[][] local21 = this.method7947(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static153.anInt3070; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local33[local47];
				@Pc(61) int local61 = local29[local47];
				if (local53 == local57 && local61 == local57) {
					local37[local47] = this.anInt7052 * local53 >> 12;
					local41[local47] = this.anInt7058 * local57 >> 12;
					local45[local47] = this.anInt7053 * local61 >> 12;
				} else {
					local37[local47] = this.anInt7052;
					local41[local47] = this.anInt7058;
					local45[local47] = this.anInt7053;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7052 = arg0.method4294();
		} else if (arg1 == 1) {
			this.anInt7058 = arg0.method4294();
		} else if (arg1 == 2) {
			this.anInt7053 = arg0.method4294();
		}
	}
}
