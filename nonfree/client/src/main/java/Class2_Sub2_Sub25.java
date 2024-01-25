import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ow")
public final class Class2_Sub2_Sub25 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ow", name = "K", descriptor = "I")
	private int anInt6919 = 4096;

	@OriginalMember(owner = "client!ow", name = "L", descriptor = "Z")
	private boolean aBoolean537 = true;

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6919 = arg0.method4294();
		} else if (arg1 == 1) {
			this.aBoolean537 = arg0.method4325() == 1;
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7946(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass314_41.method7006(arg0);
		if (super.aClass314_41.aBoolean653) {
			@Pc(29) int[] local29 = this.method7951(Static28.anInt6368 & arg0 - 1, 0);
			@Pc(35) int[] local35 = this.method7951(arg0, 0);
			@Pc(45) int[] local45 = this.method7951(Static28.anInt6368 & arg0 + 1, 0);
			@Pc(49) int[] local49 = local11[0];
			@Pc(53) int[] local53 = local11[1];
			@Pc(57) int[] local57 = local11[2];
			for (@Pc(59) int local59 = 0; local59 < Static153.anInt3070; local59++) {
				@Pc(73) int local73 = this.anInt6919 * (local45[local59] - local29[local59]);
				@Pc(92) int local92 = (local35[local59 + 1 & Static431.anInt7305] - local35[local59 - 1 & Static431.anInt7305]) * this.anInt6919;
				@Pc(96) int local96 = local92 >> 12;
				@Pc(100) int local100 = local73 >> 12;
				@Pc(106) int local106 = local96 * local96 >> 12;
				@Pc(112) int local112 = local100 * local100 >> 12;
				@Pc(126) int local126 = (int) (Math.sqrt((double) ((float) (local106 + local112 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(143) int local143;
				@Pc(135) int local135;
				@Pc(139) int local139;
				if (local126 == 0) {
					local143 = 0;
					local139 = 0;
					local135 = 0;
				} else {
					local135 = local73 / local126;
					local139 = 16777216 / local126;
					local143 = local92 / local126;
				}
				if (this.aBoolean537) {
					local135 = (local135 >> 1) + 2048;
					local139 = (local139 >> 1) + 2048;
					local143 = (local143 >> 1) + 2048;
				}
				local49[local59] = local143;
				local53[local59] = local135;
				local57[local59] = local139;
			}
		}
		return local11;
	}
}
