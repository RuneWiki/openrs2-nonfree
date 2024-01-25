import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class1_Sub2_Sub13 extends Class1_Sub2 {

	@OriginalMember(owner = "client!jt", name = "H", descriptor = "I")
	private int anInt3786 = 0;

	@OriginalMember(owner = "client!jt", name = "K", descriptor = "I")
	private int anInt3789 = 1;

	@OriginalMember(owner = "client!jt", name = "G", descriptor = "I")
	private int anInt3785 = 0;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			@Pc(19) int local19 = Static258.anIntArray335[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static218.anInt3990; local27++) {
				@Pc(33) int local33 = Static434.anIntArray495[local27];
				@Pc(39) int local39 = local33 - 2048 >> 1;
				@Pc(65) int local65;
				if (this.anInt3786 == 0) {
					local65 = this.anInt3789 * (local33 - local19);
				} else {
					@Pc(55) int local55 = local25 * local25 + local39 * local39 >> 12;
					local65 = (int) (Math.sqrt((double) ((float) local55 / 4096.0F)) * 4096.0D);
					local65 = (int) ((double) (this.anInt3789 * local65) * 3.141592653589793D);
				}
				local65 -= local65 & 0xFFFFF000;
				if (this.anInt3785 == 0) {
					local65 = Static157.anIntArray201[local65 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt3785 == 2) {
					local65 -= 2048;
					if (local65 < 0) {
						local65 = -local65;
					}
					local65 = 2048 - local65 << 1;
				}
				local11[local27] = local65;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3786 = arg0.method2915();
		} else if (arg1 == 1) {
			this.anInt3785 = arg0.method2915();
		} else if (arg1 == 3) {
			this.anInt3789 = arg0.method2915();
		}
	}

	@OriginalMember(owner = "client!jt", name = "g", descriptor = "(I)V")
	@Override
	public void method5967() {
		Static1.method20();
	}
}
