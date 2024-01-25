import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class6_Sub8_Sub4 extends Class6_Sub8 {

	@OriginalMember(owner = "client!eu", name = "F", descriptor = "I")
	private int anInt3063 = 0;

	@OriginalMember(owner = "client!eu", name = "B", descriptor = "I")
	private int anInt3065 = 0;

	@OriginalMember(owner = "client!eu", name = "H", descriptor = "I")
	private int anInt3066 = 1;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			@Pc(27) int local27 = Static424.anIntArray466[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static83.anInt1268; local35++) {
				@Pc(41) int local41 = Static2.anIntArray1[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(61) int local61;
				if (this.anInt3065 == 0) {
					local61 = this.anInt3066 * (local41 - local27);
				} else {
					@Pc(74) int local74 = local47 * local47 + local33 * local33 >> 12;
					local61 = (int) (Math.sqrt((double) ((float) local74 / 4096.0F)) * 4096.0D);
					local61 = (int) ((double) (this.anInt3066 * local61) * 3.141592653589793D);
				}
				local61 -= local61 & 0xFFFFF000;
				if (this.anInt3063 == 0) {
					local61 = Static471.anIntArray505[local61 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt3063 == 2) {
					local61 -= 2048;
					if (local61 < 0) {
						local61 = -local61;
					}
					local61 = 2048 - local61 << 1;
				}
				local11[local35] = local61;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt3065 = arg1.method3030();
		} else if (arg0 == 1) {
			this.anInt3063 = arg1.method3030();
		} else if (arg0 == 3) {
			this.anInt3066 = arg1.method3030();
		}
	}

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)V")
	@Override
	public void method8936() {
		Static496.method7310();
	}
}
