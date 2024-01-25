import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class3_Sub3_Sub6 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
	public int anInt1255 = 0;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILclient!bt;)V")
	private void method1076(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 2) {
			this.anInt1255 = arg1.method6004();
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZLclient!bt;)V")
	public void method1077(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method6053();
			if (local3 == 0) {
				return;
			}
			this.method1076(local3, arg0);
		}
	}
}
