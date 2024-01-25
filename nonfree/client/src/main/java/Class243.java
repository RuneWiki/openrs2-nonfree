import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class243 {

	@OriginalMember(owner = "client!tp", name = "h", descriptor = "[I")
	public int[] anIntArray678;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
	public int anInt7121 = -1;

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
	public int anInt7124 = -1;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!ia;I)V")
	public void method5437(@OriginalArg(0) Class1_Sub3 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1171();
			if (local3 == 0) {
				return;
			}
			this.method5438(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!ia;II)V")
	private void method5438(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt7121 = arg0.method1177();
		} else if (arg1 == 2) {
			this.anIntArray678 = new int[arg0.method1171()];
			for (@Pc(26) int local26 = 0; local26 < this.anIntArray678.length; local26++) {
				this.anIntArray678[local26] = arg0.method1177();
			}
		} else if (arg1 == 3) {
			this.anInt7124 = arg0.method1171();
		}
	}
}
