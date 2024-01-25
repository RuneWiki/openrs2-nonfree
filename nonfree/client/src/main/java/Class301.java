import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public final class Class301 implements Interface27 {

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "Lclient!vaa;")
	private final Class372 aClass372_1;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lclient!vaa;)V")
	public Class301(@OriginalArg(0) Class372 arg0) {
		this.aClass372_1 = arg0;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8039() {
		Static202.aClass75_5.aa(0, 0, Static535.anInt4128, Static274.anInt3226, this.aClass372_1.anInt9924, 0);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8038() {
		return true;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
	@Override
	public void method8040() {
	}
}
