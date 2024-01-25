import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class164 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "I")
	public int anInt4728;

	@OriginalMember(owner = "client!m", name = "b", descriptor = "I")
	public int anInt4729;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "I")
	public int anInt4730;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLclient!ia;)V")
	public void method3647(@OriginalArg(1) Class1_Sub3 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method1171();
			if (local3 == 0) {
				return;
			}
			this.method3648(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!ia;B)V")
	private void method3648(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt4730 = arg1.method1177();
			this.anInt4729 = arg1.method1171();
			this.anInt4728 = arg1.method1171();
		}
	}
}
