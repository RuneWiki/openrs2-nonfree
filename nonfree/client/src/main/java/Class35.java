import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class35 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
	public int anInt961;

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
	public int anInt964;

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
	public int anInt967;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BILclient!lf;)V")
	private void method905(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt961 = arg1.method1386();
			this.anInt964 = arg1.method1378();
			this.anInt967 = arg1.method1378();
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILclient!lf;)V")
	public void method906(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1378();
			if (local5 == 0) {
				return;
			}
			this.method905(local5, arg0);
		}
	}
}
