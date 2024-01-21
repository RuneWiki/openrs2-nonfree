import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class2_Sub1_Sub11 extends Class2_Sub1 {

	@OriginalMember(owner = "client!hj", name = "U", descriptor = "I")
	private int anInt1717 = 0;

	@OriginalMember(owner = "client!hj", name = "Y", descriptor = "I")
	private int anInt1720 = 0;

	@OriginalMember(owner = "client!hj", name = "ab", descriptor = "I")
	private int anInt1722 = 1;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			@Pc(27) int local27 = Static81.anIntArray174[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static135.anInt2897; local35++) {
				@Pc(41) int local41 = Static107.anIntArray304[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(58) int local58;
				if (this.anInt1720 == 0) {
					local58 = this.anInt1722 * (local41 - local27);
				} else {
					@Pc(70) int local70 = local33 * local33 + local47 * local47 >> 12;
					local58 = (int) (Math.sqrt((double) ((float) local70 / 4096.0F)) * 4096.0D);
					local58 = (int) ((double) (this.anInt1722 * local58) * 3.141592653589793D);
				}
				local58 -= local58 & 0xFFFFF000;
				if (this.anInt1717 == 0) {
					local58 = Static36.anIntArray74[local58 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt1717 == 2) {
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

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1720 = arg0.method260();
		} else if (arg1 == 1) {
			this.anInt1717 = arg0.method260();
		} else if (arg1 == 3) {
			this.anInt1722 = arg0.method260();
		}
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
	@Override
	public void method3260() {
		Static50.method997();
	}
}
