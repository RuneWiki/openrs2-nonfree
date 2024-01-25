import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class261 {

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
	public int anInt7363;

	@OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
	public int anInt7366;

	@OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
	public int anInt7371;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IILclient!cu;)V")
	private void method5727(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt7371 = arg1.method2588();
			this.anInt7363 = arg1.method2582();
			this.anInt7366 = arg1.method2582();
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!cu;B)V")
	public void method5731(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2582();
			if (local3 == 0) {
				return;
			}
			this.method5727(local3, arg0);
		}
	}
}
