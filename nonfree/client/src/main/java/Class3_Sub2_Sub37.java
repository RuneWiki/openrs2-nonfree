import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class3_Sub2_Sub37 extends Class3_Sub2 {

	@OriginalMember(owner = "client!tj", name = "O", descriptor = "I")
	private int anInt5476 = 1;

	@OriginalMember(owner = "client!tj", name = "P", descriptor = "I")
	private int anInt5477 = 0;

	@OriginalMember(owner = "client!tj", name = "U", descriptor = "I")
	private int anInt5480 = 0;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			@Pc(22) int local22 = Static205.anIntArray450[arg0];
			@Pc(28) int local28 = local22 - 2048 >> 1;
			for (@Pc(30) int local30 = 0; local30 < Static22.anInt421; local30++) {
				@Pc(37) int local37 = Static185.anIntArray424[local30];
				@Pc(43) int local43 = local37 - 2048 >> 1;
				@Pc(57) int local57;
				if (this.anInt5477 == 0) {
					local57 = (local37 - local22) * this.anInt5476;
				} else {
					@Pc(69) int local69 = local43 * local43 + local28 * local28 >> 12;
					local57 = (int) (Math.sqrt((double) ((float) local69 / 4096.0F)) * 4096.0D);
					local57 = (int) ((double) (this.anInt5476 * local57) * 3.141592653589793D);
				}
				local57 -= local57 & 0xFFFFF000;
				if (this.anInt5480 == 0) {
					local57 = Static122.anIntArray279[local57 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt5480 == 2) {
					local57 -= 2048;
					if (local57 < 0) {
						local57 = -local57;
					}
					local57 = 2048 - local57 << 1;
				}
				local13[local30] = local57;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt5477 = arg1.method3915();
		} else if (arg0 == 1) {
			this.anInt5480 = arg1.method3915();
		} else if (arg0 == 3) {
			this.anInt5476 = arg1.method3915();
		}
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)V")
	@Override
	public void method4952() {
		Static66.method1029();
	}
}
