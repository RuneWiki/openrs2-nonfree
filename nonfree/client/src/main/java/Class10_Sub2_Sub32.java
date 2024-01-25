import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class10_Sub2_Sub32 extends Class10_Sub2 {

	@OriginalMember(owner = "client!uk", name = "S", descriptor = "I")
	private int anInt6926 = 0;

	@OriginalMember(owner = "client!uk", name = "P", descriptor = "I")
	private int anInt6924 = 1;

	@OriginalMember(owner = "client!uk", name = "T", descriptor = "I")
	private int anInt6927 = 0;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt6927 = arg1.method2502();
		} else if (arg0 == 1) {
			this.anInt6926 = arg1.method2502();
		} else if (arg0 == 3) {
			this.anInt6924 = arg1.method2502();
		}
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(Z)V")
	@Override
	public void method6036() {
		Static44.method657();
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			@Pc(19) int local19 = Static67.anIntArray106[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static121.anInt2458; local27++) {
				@Pc(33) int local33 = Static182.anIntArray374[local27];
				@Pc(39) int local39 = local33 - 2048 >> 1;
				@Pc(53) int local53;
				if (this.anInt6927 == 0) {
					local53 = this.anInt6924 * (local33 - local19);
				} else {
					@Pc(66) int local66 = local39 * local39 + local25 * local25 >> 12;
					local53 = (int) (Math.sqrt((double) ((float) local66 / 4096.0F)) * 4096.0D);
					local53 = (int) ((double) (this.anInt6924 * local53) * 3.141592653589793D);
				}
				local53 -= local53 & 0xFFFFF000;
				if (this.anInt6926 == 0) {
					local53 = Static218.anIntArray410[local53 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt6926 == 2) {
					local53 -= 2048;
					if (local53 < 0) {
						local53 = -local53;
					}
					local53 = 2048 - local53 << 1;
				}
				local11[local27] = local53;
			}
		}
		return local11;
	}
}
