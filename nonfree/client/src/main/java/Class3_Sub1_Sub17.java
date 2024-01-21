import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class3_Sub1_Sub17 extends Class3_Sub1 {

	@OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
	public int anInt2860 = 0;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILclient!ob;)V")
	private void method1957(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (arg0 == 5) {
			this.anInt2860 = arg1.method602();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ob;B)V")
	public void method1958(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method647();
			if (local5 == 0) {
				return;
			}
			this.method1957(local5, arg0);
		}
	}
}
