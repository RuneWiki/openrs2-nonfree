import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class14_Sub7_Sub33 extends Class14_Sub7 {

	@OriginalMember(owner = "client!sh", name = "V", descriptor = "I")
	private int anInt9340 = 0;

	@OriginalMember(owner = "client!sh", name = "S", descriptor = "I")
	private int anInt9345 = 1;

	@OriginalMember(owner = "client!sh", name = "J", descriptor = "I")
	private int anInt9346 = 0;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt9346 = arg1.method7695(120);
		} else if (arg0 == 1) {
			this.anInt9340 = arg1.method7695(111);
		} else if (arg0 == 3) {
			this.anInt9345 = arg1.method7695(99);
		}
	}

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "(I)V")
	@Override
	public void method9386() {
		Static678.method9367();
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(20) int[] local20 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			@Pc(28) int local28 = Static655.anIntArray573[arg0];
			@Pc(34) int local34 = local28 - 2048 >> 1;
			for (@Pc(36) int local36 = 0; local36 < Static613.anInt10114; local36++) {
				@Pc(42) int local42 = Static588.anIntArray506[local36];
				@Pc(48) int local48 = local42 - 2048 >> 1;
				@Pc(62) int local62;
				if (this.anInt9346 == 0) {
					local62 = (local42 - local28) * this.anInt9345;
				} else {
					@Pc(75) int local75 = local48 * local48 + local34 * local34 >> 12;
					local62 = (int) (Math.sqrt((double) ((float) local75 / 4096.0F)) * 4096.0D);
					local62 = (int) ((double) (this.anInt9345 * local62) * 3.141592653589793D);
				}
				local62 -= local62 & 0xFFFFF000;
				if (this.anInt9340 == 0) {
					local62 = Static600.anIntArray533[local62 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt9340 == 2) {
					local62 -= 2048;
					if (local62 < 0) {
						local62 = -local62;
					}
					local62 = 2048 - local62 << 1;
				}
				local20[local36] = local62;
			}
		}
		return local20;
	}
}
