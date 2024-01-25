import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rea")
public final class Class5_Sub1_Sub29 extends Class5_Sub1 {

	@OriginalMember(owner = "client!rea", name = "K", descriptor = "I")
	private int anInt8678 = 0;

	@OriginalMember(owner = "client!rea", name = "L", descriptor = "I")
	private int anInt8680 = 1365;

	@OriginalMember(owner = "client!rea", name = "G", descriptor = "I")
	private int anInt8679 = 20;

	@OriginalMember(owner = "client!rea", name = "C", descriptor = "I")
	private int anInt8677 = 0;

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt8680 = arg1.method8519();
		} else if (arg0 == 1) {
			this.anInt8679 = arg1.method8519();
		} else if (arg0 == 2) {
			this.anInt8677 = arg1.method8519();
		} else if (arg0 == 3) {
			this.anInt8678 = arg1.method8519();
		}
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			for (@Pc(27) int local27 = 0; local27 < Static648.anInt9588; local27++) {
				@Pc(41) int local41 = this.anInt8677 + (Static293.anIntArray288[local27] << 12) / this.anInt8680;
				@Pc(53) int local53 = this.anInt8678 + (Static23.anIntArray27[arg0] << 12) / this.anInt8680;
				@Pc(59) int local59 = local41;
				@Pc(61) int local61 = local53;
				@Pc(67) int local67 = local41 * local41 >> 12;
				@Pc(73) int local73 = local53 * local53 >> 12;
				@Pc(75) int local75 = 0;
				while (local67 + local73 < 16384 && local75 < this.anInt8679) {
					local61 = local53 + (local61 * local59 >> 12) * 2;
					local59 = local41 + local67 - local73;
					local73 = local61 * local61 >> 12;
					local75++;
					local67 = local59 * local59 >> 12;
				}
				local11[local27] = this.anInt8679 - 1 > local75 ? (local75 << 12) / this.anInt8679 : 0;
			}
		}
		return local11;
	}
}
