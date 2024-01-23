import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
	public int anInt285 = 0;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!pg;)V")
	public void method212(@OriginalArg(1) Class1_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2142();
			if (local5 == 0) {
				return;
			}
			this.method213(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!pg;BI)V")
	private void method213(@OriginalArg(0) Class1_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt285 = arg0.method2178();
		}
	}
}
