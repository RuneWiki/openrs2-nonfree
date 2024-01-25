import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class6_Sub3_Sub5 extends Class6_Sub3 {

	@OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
	private int anInt805 = 0;

	@OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
	private int anInt807 = 0;

	@OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
	private int anInt808 = 1;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "(I)V")
	@Override
	public void method7957() {
		Static583.method7925();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt807 = arg1.method6019();
		} else if (arg0 == 1) {
			this.anInt805 = arg1.method6019();
		} else if (arg0 == 3) {
			this.anInt808 = arg1.method6019();
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			@Pc(27) int local27 = Static77.anIntArray116[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static35.anInt670; local35++) {
				@Pc(41) int local41 = Static372.anIntArray481[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(71) int local71;
				if (this.anInt807 == 0) {
					local71 = (local41 - local27) * this.anInt808;
				} else {
					@Pc(61) int local61 = local47 * local47 + local33 * local33 >> 12;
					local71 = (int) (Math.sqrt((double) ((float) local61 / 4096.0F)) * 4096.0D);
					local71 = (int) ((double) (local71 * this.anInt808) * 3.141592653589793D);
				}
				local71 -= local71 & 0xFFFFF000;
				if (this.anInt805 == 0) {
					local71 = Static412.anIntArray712[local71 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt805 == 2) {
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
}
