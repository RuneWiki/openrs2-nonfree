import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class109 {

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
	public int anInt3361 = 0;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!pi;B)V")
	public void method2669(@OriginalArg(0) Class4_Sub24 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3110();
			if (local5 == 0) {
				return;
			}
			this.method2671(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILclient!pi;)V")
	private void method2671(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 5) {
			this.anInt3361 = arg1.method3085();
		}
	}
}
