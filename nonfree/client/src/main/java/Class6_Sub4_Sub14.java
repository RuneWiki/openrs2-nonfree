import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class6_Sub4_Sub14 extends Class6_Sub4 {

	@OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
	private int anInt3112 = 4096;

	@OriginalMember(owner = "client!fk", name = "E", descriptor = "I")
	private int anInt3113 = 4096;

	@OriginalMember(owner = "client!fk", name = "G", descriptor = "I")
	private int anInt3115 = 4096;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt3113 = arg1.method6003();
		} else if (arg0 == 1) {
			this.anInt3112 = arg1.method6003();
		} else if (arg0 == 2) {
			this.anInt3115 = arg1.method6003();
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7757(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass27_41.method911(arg0);
		if (super.aClass27_41.aBoolean54) {
			@Pc(21) int[][] local21 = this.method7747(arg0, 0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static408.anInt7209; local47++) {
				@Pc(53) int local53 = local25[local47];
				@Pc(57) int local57 = local33[local47];
				@Pc(61) int local61 = local29[local47];
				if (local57 == local53 && local61 == local57) {
					local37[local47] = local53 * this.anInt3113 >> 12;
					local41[local47] = this.anInt3112 * local57 >> 12;
					local45[local47] = this.anInt3115 * local61 >> 12;
				} else {
					local37[local47] = this.anInt3113;
					local41[local47] = this.anInt3112;
					local45[local47] = this.anInt3115;
				}
			}
		}
		return local11;
	}
}
