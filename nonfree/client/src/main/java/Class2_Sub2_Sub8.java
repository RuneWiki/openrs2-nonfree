import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class2_Sub2_Sub8 extends Class2_Sub2 {

	@OriginalMember(owner = "client!hl", name = "H", descriptor = "Lclient!hu;")
	public static final Class98 aClass98_17 = new Class98(4);

	@OriginalMember(owner = "client!hl", name = "I", descriptor = "Lclient!h;")
	public static final Class89 aClass89_103 = new Class89(61, 4);

	@OriginalMember(owner = "client!hl", name = "J", descriptor = "Lclient!se;")
	public static final Class2_Sub33 aClass2_Sub33_1 = new Class2_Sub33(0, 0);

	@OriginalMember(owner = "client!hl", name = "K", descriptor = "I")
	public static final int anInt2486 = 1406;

	@OriginalMember(owner = "client!hl", name = "G", descriptor = "I")
	public int anInt2485 = 0;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!bt;I)V", line = 17)
	public void method2503(@OriginalArg(0) Class2_Sub4 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method4816();
			if (local10 == 0) {
				return;
			}
			this.method2504(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!bt;I)V", line = 44)
	private void method2504(@OriginalArg(1) Class2_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 2) {
			this.anInt2485 = arg0.method4830();
		}
	}
}
