import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class245 {

	@OriginalMember(owner = "client!v", name = "a", descriptor = "I")
	public int anInt6813 = 0;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!dh;Z)V")
	public void method5239(@OriginalArg(0) Class1_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4463();
			if (local5 == 0) {
				return;
			}
			this.method5242(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZILclient!dh;)V")
	private void method5242(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub11 arg1) {
		if (arg0 == 5) {
			this.anInt6813 = arg1.method4485();
		}
	}
}
