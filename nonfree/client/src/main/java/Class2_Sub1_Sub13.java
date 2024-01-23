import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class2_Sub1_Sub13 extends Class2_Sub1 {

	@OriginalMember(owner = "client!fm", name = "O", descriptor = "I")
	private int anInt2000 = 1;

	@OriginalMember(owner = "client!fm", name = "S", descriptor = "I")
	private int anInt2004 = 0;

	@OriginalMember(owner = "client!fm", name = "Q", descriptor = "I")
	private int anInt2002 = 0;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2002 = arg0.method2146();
		} else if (arg1 == 1) {
			this.anInt2004 = arg0.method2146();
		} else if (arg1 == 3) {
			this.anInt2000 = arg0.method2146();
		}
	}

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "(I)V")
	@Override
	public void method4595() {
		Static66.method1205();
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			@Pc(25) int local25 = Static272.anIntArray521[arg0];
			@Pc(31) int local31 = local25 - 2048 >> 1;
			for (@Pc(33) int local33 = 0; local33 < Static281.anInt5558; local33++) {
				@Pc(44) int local44 = Static234.anIntArray462[local33];
				@Pc(50) int local50 = local44 - 2048 >> 1;
				@Pc(61) int local61;
				if (this.anInt2002 == 0) {
					local61 = this.anInt2000 * (local44 - local25);
				} else {
					@Pc(74) int local74 = local50 * local50 + local31 * local31 >> 12;
					local61 = (int) (Math.sqrt((double) ((float) local74 / 4096.0F)) * 4096.0D);
					local61 = (int) ((double) (local61 * this.anInt2000) * 3.141592653589793D);
				}
				local61 -= local61 & 0xFFFFF000;
				if (this.anInt2004 == 0) {
					local61 = Static80.anIntArray164[local61 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2004 == 2) {
					local61 -= 2048;
					if (local61 < 0) {
						local61 = -local61;
					}
					local61 = 2048 - local61 << 1;
				}
				local11[local33] = local61;
			}
		}
		return local11;
	}
}
