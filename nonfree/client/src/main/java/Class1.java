import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public final class Class1 {

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
	public int anInt19;

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
	public int anInt20;

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "I")
	public int anInt21;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "()V")
	public Class1() {
	}

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!aaa;)V")
	public Class1(@OriginalArg(0) Class1 arg0) {
		this.anInt21 = arg0.anInt21;
		this.anInt20 = arg0.anInt20;
		this.anInt19 = arg0.anInt19;
	}
}
