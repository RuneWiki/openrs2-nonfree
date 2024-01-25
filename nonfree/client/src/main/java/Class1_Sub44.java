import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class Class1_Sub44 extends Class1 {

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
	public int anInt7290;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	private Class1_Sub44() {
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!df;)I")
	public abstract int method5511(@OriginalArg(0) Class1_Sub9_Sub2 arg0);

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()V")
	public abstract void method5512();
}
