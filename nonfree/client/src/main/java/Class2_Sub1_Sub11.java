import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class2_Sub1_Sub11 extends Class2_Sub1 {

	@OriginalMember(owner = "client!md", name = "Z", descriptor = "I")
	public int anInt1894 = 0;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!g;B)V")
	public void method1358(@OriginalArg(0) Class2_Sub5 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1281();
			if (local13 == 0) {
				return;
			}
			this.method1359(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IILclient!g;)V")
	private void method1359(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub5 arg1) {
		if (arg0 == 5) {
			this.anInt1894 = arg1.method1273();
		}
	}
}
