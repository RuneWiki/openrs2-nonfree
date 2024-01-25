import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cla")
public final class Class3_Sub2_Sub6 extends Class3_Sub2 {

	@OriginalMember(owner = "client!cla", name = "D", descriptor = "I")
	private int anInt1340 = 4096;

	@OriginalMember(owner = "client!cla", name = "E", descriptor = "I")
	private int anInt1341 = 4096;

	@OriginalMember(owner = "client!cla", name = "G", descriptor = "I")
	private int anInt1343 = 4096;

	@OriginalMember(owner = "client!cla", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cla", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9203(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass36_41.method731(arg0);
		if (super.aClass36_41.aBoolean75) {
			@Pc(33) int[][] local33 = this.method9212(0, arg0);
			@Pc(37) int[] local37 = local33[0];
			@Pc(41) int[] local41 = local33[1];
			@Pc(45) int[] local45 = local33[2];
			@Pc(49) int[] local49 = local13[0];
			@Pc(53) int[] local53 = local13[1];
			@Pc(57) int[] local57 = local13[2];
			for (@Pc(59) int local59 = 0; local59 < Static636.anInt10302; local59++) {
				@Pc(65) int local65 = local37[local59];
				@Pc(69) int local69 = local45[local59];
				@Pc(73) int local73 = local41[local59];
				if (local65 == local69 && local69 == local73) {
					local49[local59] = this.anInt1340 * local65 >> 12;
					local53[local59] = this.anInt1341 * local69 >> 12;
					local57[local59] = this.anInt1343 * local73 >> 12;
				} else {
					local49[local59] = this.anInt1340;
					local53[local59] = this.anInt1341;
					local57[local59] = this.anInt1343;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!cla", name = "a", descriptor = "(ILclient!rba;I)V")
	@Override
	public void method9214(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1) {
		if (arg0 == 0) {
			this.anInt1340 = arg1.method5272();
		} else if (arg0 == 1) {
			this.anInt1341 = arg1.method5272();
		} else if (arg0 == 2) {
			this.anInt1343 = arg1.method5272();
		}
	}
}
