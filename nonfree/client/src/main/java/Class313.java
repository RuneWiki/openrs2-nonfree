import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public final class Class313 implements Interface27 {

	@OriginalMember(owner = "client!sba", name = "i", descriptor = "Lclient!aia;")
	private final Class14 aClass14_1;

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Lclient!aia;)V")
	public Class313(@OriginalArg(0) Class14 arg0) {
		this.aClass14_1 = arg0;
	}

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7759() {
		return true;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7760() {
		Static674.aClass13_22.aa(0, 0, Static312.anInt5191, Static222.anInt4196, this.aClass14_1.anInt393, 0);
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V")
	@Override
	public void method7758() {
	}
}
