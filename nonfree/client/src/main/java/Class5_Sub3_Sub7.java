import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class5_Sub3_Sub7 extends Class5_Sub3 {

	@OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
	private int anInt2084 = 4096;

	@OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
	private int anInt2087 = 4096;

	@OriginalMember(owner = "client!ei", name = "Q", descriptor = "I")
	private int anInt2081 = 4096;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9206(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass343_41.method7661(arg0);
		if (super.aClass343_41.aBoolean592) {
			@Pc(29) int[][] local29 = this.method9207(arg0, 0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static7.anInt102; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local41[local55];
				@Pc(69) int local69 = local37[local55];
				if (local65 == local61 && local65 == local69) {
					local45[local55] = this.anInt2084 * local61 >> 12;
					local49[local55] = local65 * this.anInt2081 >> 12;
					local53[local55] = local69 * this.anInt2087 >> 12;
				} else {
					local45[local55] = this.anInt2084;
					local49[local55] = this.anInt2081;
					local53[local55] = this.anInt2087;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2084 = arg0.method7333();
		} else if (arg1 == 1) {
			this.anInt2081 = arg0.method7333();
		} else if (arg1 == 2) {
			this.anInt2087 = arg0.method7333();
		}
	}
}
