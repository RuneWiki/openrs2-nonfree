import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class82 {

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
	public int anInt1909 = 1;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!et;B)V")
	public void method1643(@OriginalArg(0) Class2_Sub20 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method8581(-17416);
			if (local14 == 0) {
				return;
			}
			this.method1645(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IBLclient!et;)V")
	private void method1645(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static639.method8672(arg1.method8536());
		} else if (arg0 == 2) {
			this.anInt1909 = 0;
		}
	}
}
