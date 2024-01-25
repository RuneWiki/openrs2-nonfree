import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public abstract class Class4_Sub31 extends Class4 {

	@OriginalMember(owner = "client!kea", name = "h", descriptor = "I")
	public int anInt4804;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "()V")
	private Class4_Sub31() {
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!tp;)I")
	public abstract int method4286(@OriginalArg(0) Class4_Sub3_Sub5 arg0);

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "()V")
	public abstract void method4287();
}
