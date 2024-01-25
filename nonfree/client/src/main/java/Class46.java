import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class46 {

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
	public int anInt1186;

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
	public int anInt1188;

	@OriginalMember(owner = "client!cu", name = "i", descriptor = "I")
	public int anInt1190;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLclient!ug;)V")
	public void method1048(@OriginalArg(1) Class1_Sub28 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5337();
			if (local13 == 0) {
				return;
			}
			this.method1050(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!ug;BI)V")
	private void method1050(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1188 = arg0.method5335();
			this.anInt1186 = arg0.method5337();
			this.anInt1190 = arg0.method5337();
		}
	}
}
