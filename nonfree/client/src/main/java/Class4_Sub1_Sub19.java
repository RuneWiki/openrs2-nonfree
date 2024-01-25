import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class4_Sub1_Sub19 extends Class4_Sub1 {

	@OriginalMember(owner = "client!lg", name = "C", descriptor = "I")
	private int anInt5996 = 0;

	@OriginalMember(owner = "client!lg", name = "D", descriptor = "I")
	private int anInt5997 = 1;

	@OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
	private int anInt6002 = 0;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			@Pc(27) int local27 = Static442.anIntArray449[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static376.anInt7260; local35++) {
				@Pc(41) int local41 = Static292.anIntArray394[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(71) int local71;
				if (this.anInt6002 == 0) {
					local71 = (local41 - local27) * this.anInt5997;
				} else {
					@Pc(61) int local61 = local47 * local47 + local33 * local33 >> 12;
					local71 = (int) (Math.sqrt((double) ((float) local61 / 4096.0F)) * 4096.0D);
					local71 = (int) ((double) (local71 * this.anInt5997) * 3.141592653589793D);
				}
				local71 -= local71 & 0xFFFFF000;
				if (this.anInt5996 == 0) {
					local71 = Static569.anIntArray535[local71 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt5996 == 2) {
					local71 -= 2048;
					if (local71 < 0) {
						local71 = -local71;
					}
					local71 = 2048 - local71 << 1;
				}
				local19[local35] = local71;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt6002 = arg1.method4905();
		} else if (arg0 == 1) {
			this.anInt5996 = arg1.method4905();
		} else if (arg0 == 3) {
			this.anInt5997 = arg1.method4905();
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	@Override
	public void method8391() {
		Static165.method3014();
	}
}
