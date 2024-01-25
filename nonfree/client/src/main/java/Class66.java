import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class66 {

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "Z")
	public boolean aBoolean170;

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
	public int anInt1943;

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
	public int anInt1945;

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
	public int anInt1947;

	@OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
	public int anInt1949;

	@OriginalMember(owner = "client!fr", name = "l", descriptor = "I")
	public int anInt1951;

	@OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
	public int anInt1948 = 8;

	@OriginalMember(owner = "client!fr", name = "m", descriptor = "I")
	public int anInt1952 = 16777215;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!eb;II)V")
	public void method1803(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method3141();
			if (local5 == 0) {
				return;
			}
			this.method1805(local5, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BILclient!eb;I)V")
	private void method1805(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt1948 = arg1.method3115();
		} else if (arg0 == 2) {
			this.aBoolean170 = true;
		} else if (arg0 == 3) {
			this.anInt1951 = arg1.method3090();
			this.anInt1943 = arg1.method3090();
			this.anInt1947 = arg1.method3090();
		} else if (arg0 == 4) {
			this.anInt1945 = arg1.method3141();
		} else if (arg0 == 5) {
			this.anInt1949 = arg1.method3115();
		} else if (arg0 == 6) {
			this.anInt1952 = arg1.method3137();
			return;
		}
	}
}
