import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public abstract class Class3_Sub34 extends Class3 {

	@OriginalMember(owner = "client!mia", name = "j", descriptor = "I")
	public int anInt7074;

	@OriginalMember(owner = "client!mia", name = "<init>", descriptor = "()V")
	private Class3_Sub34() {
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "()V")
	public abstract void method5933();

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(Lclient!vn;)I")
	public abstract int method5934(@OriginalArg(0) Class3_Sub22_Sub4 arg0);
}
