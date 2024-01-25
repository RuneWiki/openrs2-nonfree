import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public final class Class268 implements Interface20 {

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "Lclient!ga;")
	private final Class111 aClass111_104;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!ga;)V")
	public Class268(@OriginalArg(0) Class111 arg0) {
		this.aClass111_104 = arg0;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)I")
	@Override
	public int method7282() {
		return this.aClass111_104.method2456() ? 100 : this.aClass111_104.method2438();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)Lclient!rba;")
	@Override
	public Class277 method7281() {
		return Static450.aClass277_2;
	}
}
