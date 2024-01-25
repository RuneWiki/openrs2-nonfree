import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class2_Sub4_Sub18 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ho", name = "F", descriptor = "I")
	private int anInt4120 = 0;

	@OriginalMember(owner = "client!ho", name = "I", descriptor = "I")
	private int anInt4123 = 0;

	@OriginalMember(owner = "client!ho", name = "J", descriptor = "I")
	private int anInt4124 = 1;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4123 = arg0.method2859();
		} else if (arg1 == 1) {
			this.anInt4120 = arg0.method2859();
		} else if (arg1 == 3) {
			this.anInt4124 = arg0.method2859();
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			@Pc(27) int local27 = Static415.anIntArray482[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static395.anInt6816; local35++) {
				@Pc(41) int local41 = Static20.anIntArray40[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(58) int local58;
				if (this.anInt4123 == 0) {
					local58 = this.anInt4124 * (local41 - local27);
				} else {
					@Pc(70) int local70 = local33 * local33 + local47 * local47 >> 12;
					local58 = (int) (Math.sqrt((double) ((float) local70 / 4096.0F)) * 4096.0D);
					local58 = (int) ((double) (this.anInt4124 * local58) * 3.141592653589793D);
				}
				local58 -= local58 & 0xFFFFF000;
				if (this.anInt4120 == 0) {
					local58 = Static246.anIntArray290[local58 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt4120 == 2) {
					local58 -= 2048;
					if (local58 < 0) {
						local58 = -local58;
					}
					local58 = 2048 - local58 << 1;
				}
				local19[local35] = local58;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V")
	@Override
	public void method8902() {
		Static154.method2691();
	}
}
