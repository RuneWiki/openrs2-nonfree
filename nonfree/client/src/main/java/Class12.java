import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public final class Class12 implements Interface13 {

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "Lclient!tu;")
	private final Class346 aClass346_1;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!tu;)V")
	public Class12(@OriginalArg(0) Class346 arg0) {
		this.aClass346_1 = arg0;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
	@Override
	public void method8562() {
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8561() {
		Static563.aClass143_13.aa(0, 0, Static563.anInt9176, Static316.anInt8165, this.aClass346_1.anInt9576, 0);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8563() {
		return true;
	}
}
