import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public final class Class160 implements Interface13 {

	@OriginalMember(owner = "client!io", name = "b", descriptor = "Lclient!wr;")
	private final Class377 aClass377_1;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!wr;)V")
	public Class160(@OriginalArg(0) Class377 arg0) {
		this.aClass377_1 = arg0;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8398() {
		return true;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V")
	@Override
	public void method8396() {
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8397() {
		Static323.aClass5_9.aa(0, 0, Static109.anInt2357, Static330.anInt6165, this.aClass377_1.anInt10170, 0);
	}
}
