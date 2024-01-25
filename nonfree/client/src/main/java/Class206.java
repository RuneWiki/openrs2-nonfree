import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class206 {

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
	public int anInt6067 = 2048;

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
	public int anInt6069 = 2048;

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
	public int anInt6068 = 0;

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
	public int anInt6065 = 0;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!ia;B)V")
	public void method4661(@OriginalArg(0) Class1_Sub3 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1171();
			if (local3 == 0) {
				return;
			}
			this.method4662(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILclient!ia;)V")
	private void method4662(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt6068 = arg1.method1171();
		} else if (arg0 == 2) {
			this.anInt6069 = arg1.method1177();
		} else if (arg0 == 3) {
			this.anInt6067 = arg1.method1177();
		} else if (arg0 == 4) {
			this.anInt6065 = arg1.method1215();
		}
	}
}
