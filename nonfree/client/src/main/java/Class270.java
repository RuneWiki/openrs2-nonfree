import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public final class Class270 implements Interface1 {

	@OriginalMember(owner = "client!pu", name = "i", descriptor = "Lclient!jca;")
	private final Class162 aClass162_1;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!jca;)V")
	public Class270(@OriginalArg(0) Class162 arg0) {
		this.aClass162_1 = arg0;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(BZ)V")
	@Override
	public void method9233() {
		Static186.aClass20_4.aa(0, 0, Static81.anInt2497, Static423.anInt7984, this.aClass162_1.anInt5464, 0);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
	@Override
	public void method9231() {
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9232() {
		return true;
	}
}
