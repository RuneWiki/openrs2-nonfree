import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class250 {

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "[Lclient!re;")
	public static final Class199[] aClass199Array1 = new Class199[5];

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
	public int anInt7088;

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
	public int anInt7090;

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
	public int anInt7095;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass199Array1.length; local4++) {
			aClass199Array1[local4] = new Class199();
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILclient!vt;Z)V")
	private void method6104(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub24 arg1) {
		if (arg0 == 1) {
			this.anInt7090 = arg1.method5753();
			this.anInt7095 = arg1.method5732();
			this.anInt7088 = arg1.method5732();
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZLclient!vt;)V")
	public void method6105(@OriginalArg(1) Class2_Sub24 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5732();
			if (local14 == 0) {
				return;
			}
			this.method6104(local14, arg0);
		}
	}
}
