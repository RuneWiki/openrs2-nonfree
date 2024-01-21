import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class3_Sub2_Sub22 extends Class3_Sub2 {

	@OriginalMember(owner = "client!oa", name = "hb", descriptor = "I")
	private int anInt2855 = 1;

	@OriginalMember(owner = "client!oa", name = "eb", descriptor = "I")
	private int anInt2852 = 0;

	@OriginalMember(owner = "client!oa", name = "lb", descriptor = "I")
	private int anInt2857 = 0;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(27) int local27 = Static34.anIntArray37[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static190.anInt3865; local35++) {
				@Pc(41) int local41 = Static133.anIntArray187[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(61) int local61;
				if (this.anInt2857 == 0) {
					local61 = (local41 - local27) * this.anInt2855;
				} else {
					@Pc(73) int local73 = local33 * local33 + local47 * local47 >> 12;
					local61 = (int) (Math.sqrt((double) ((float) local73 / 4096.0F)) * 4096.0D);
					local61 = (int) ((double) (this.anInt2855 * local61) * 3.141592653589793D);
				}
				local61 -= local61 & 0xFFFFF000;
				if (this.anInt2852 == 0) {
					local61 = Static52.anIntArray58[local61 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2852 == 2) {
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

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2857 = arg0.method1278();
		} else if (arg1 == 1) {
			this.anInt2852 = arg0.method1278();
		} else if (arg1 == 3) {
			this.anInt2855 = arg0.method1278();
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	@Override
	public void method3329() {
		Static198.method3152();
	}
}
