import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public final class Class153 implements Interface13 {

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "Lclient!ug;")
	private final Class363 aClass363_1;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class153(@OriginalArg(0) Class363 arg0) {
		this.aClass363_1 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8820() {
		return true;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8819() {
		Static103.aClass144_3.aa(0, 0, Static563.anInt4939, Static506.anInt8791, this.aClass363_1.anInt10110, 0);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
	@Override
	public void method8821() {
	}
}
