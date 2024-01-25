import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class2_Sub2_Sub35 extends Class2_Sub2 {

	@OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
	private int anInt7065 = 0;

	@OriginalMember(owner = "client!vi", name = "H", descriptor = "I")
	private int anInt7066 = 1;

	@OriginalMember(owner = "client!vi", name = "I", descriptor = "I")
	private int anInt7067 = 0;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7067 = arg0.method5495();
		} else if (arg1 == 1) {
			this.anInt7065 = arg0.method5495();
		} else if (arg1 == 3) {
			this.anInt7066 = arg0.method5495();
		}
	}

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			@Pc(27) int local27 = Static318.anIntArray565[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static429.anInt6518; local35++) {
				@Pc(41) int local41 = Static365.anIntArray535[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(70) int local70;
				if (this.anInt7067 == 0) {
					local70 = (local41 - local27) * this.anInt7066;
				} else {
					@Pc(60) int local60 = local33 * local33 + local47 * local47 >> 12;
					local70 = (int) (Math.sqrt((double) ((float) local60 / 4096.0F)) * 4096.0D);
					local70 = (int) ((double) (this.anInt7066 * local70) * 3.141592653589793D);
				}
				local70 -= local70 & 0xFFFFF000;
				if (this.anInt7065 == 0) {
					local70 = Static381.anIntArray532[local70 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt7065 == 2) {
					local70 -= 2048;
					if (local70 < 0) {
						local70 = -local70;
					}
					local70 = 2048 - local70 << 1;
				}
				local19[local35] = local70;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)V")
	@Override
	public void method5845() {
		Static180.method2885();
	}
}
