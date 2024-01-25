import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cca")
public final class Class51 {

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "I")
	public int anInt1250;

	@OriginalMember(owner = "client!cca", name = "g", descriptor = "I")
	public int anInt1255;

	@OriginalMember(owner = "client!cca", name = "h", descriptor = "I")
	public int anInt1256;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lclient!jp;II)V")
	private void method1301(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1250 = arg0.method8593();
			this.anInt1255 = arg0.method8632();
			this.anInt1256 = arg0.method8632();
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lclient!jp;Z)V")
	public void method1306(@OriginalArg(0) Class3_Sub25 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8632();
			if (local13 == 0) {
				return;
			}
			this.method1301(arg0, local13);
		}
	}
}
