import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class5_Sub2_Sub5 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ba", name = "O", descriptor = "I")
	private int anInt497 = 4096;

	@OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
	private int anInt494 = 4096;

	@OriginalMember(owner = "client!ba", name = "P", descriptor = "I")
	private int anInt498 = 4096;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub5() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5806(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass154_41.method4027(arg0);
		if (super.aClass154_41.aBoolean336) {
			@Pc(29) int[][] local29 = this.method5818(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static15.anInt493; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local41[local55];
				@Pc(69) int local69 = local37[local55];
				if (local65 == local61 && local65 == local69) {
					local45[local55] = this.anInt494 * local61 >> 12;
					local49[local55] = this.anInt497 * local65 >> 12;
					local53[local55] = this.anInt498 * local69 >> 12;
				} else {
					local45[local55] = this.anInt494;
					local49[local55] = this.anInt497;
					local53[local55] = this.anInt498;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt494 = arg0.method1845();
		} else if (arg1 == 1) {
			this.anInt497 = arg0.method1845();
		} else if (arg1 == 2) {
			this.anInt498 = arg0.method1845();
		}
	}
}
