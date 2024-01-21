import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class1_Sub3_Sub4 extends Class1_Sub3 {

	@OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
	public int anInt1160 = 0;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!ka;BI)V")
	private void method812(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt1160 = arg0.method3023();
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILclient!ka;)V")
	public void method817(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3010();
			if (local5 == 0) {
				return;
			}
			this.method812(arg0, local5);
		}
	}
}
