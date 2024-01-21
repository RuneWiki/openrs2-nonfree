import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class4_Sub4_Sub12 extends Class4_Sub4 {

	@OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
	public int anInt2072 = 0;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!re;Z)V")
	public void method1519(@OriginalArg(0) Class4_Sub13 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1223();
			if (local13 == 0) {
				return;
			}
			this.method1520(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILclient!re;)V")
	private void method1520(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub13 arg1) {
		if (arg0 == 2) {
			this.anInt2072 = arg1.method1244();
		}
	}
}
