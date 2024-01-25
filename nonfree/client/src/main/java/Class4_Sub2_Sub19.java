import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class4_Sub2_Sub19 extends Class4_Sub2 {

	@OriginalMember(owner = "client!nn", name = "K", descriptor = "I")
	private int anInt6889 = 0;

	@OriginalMember(owner = "client!nn", name = "L", descriptor = "I")
	private int anInt6890 = 0;

	@OriginalMember(owner = "client!nn", name = "M", descriptor = "I")
	private int anInt6891 = 1;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6890 = arg0.method7004();
		} else if (arg1 == 1) {
			this.anInt6889 = arg0.method7004();
		} else if (arg1 == 3) {
			this.anInt6891 = arg0.method7004();
		}
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			@Pc(27) int local27 = Static217.anIntArray501[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static417.anInt5248; local35++) {
				@Pc(41) int local41 = Static579.anIntArray585[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(61) int local61;
				if (this.anInt6890 == 0) {
					local61 = this.anInt6891 * (local41 - local27);
				} else {
					@Pc(73) int local73 = local47 * local47 + local33 * local33 >> 12;
					local61 = (int) (Math.sqrt((double) ((float) local73 / 4096.0F)) * 4096.0D);
					local61 = (int) ((double) (local61 * this.anInt6891) * 3.141592653589793D);
				}
				local61 -= local61 & 0xFFFFF000;
				if (this.anInt6889 == 0) {
					local61 = Static1.anIntArray273[local61 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt6889 == 2) {
					local61 -= 2048;
					if (local61 < 0) {
						local61 = -local61;
					}
					local61 = 2048 - local61 << 1;
				}
				local19[local35] = local61;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)V")
	@Override
	public void method8210() {
		Static374.method5814();
	}
}
