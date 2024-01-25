import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public final class Class1_Sub33 extends Class1 {

	@OriginalMember(owner = "client!ov", name = "q", descriptor = "I")
	public int anInt5633;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "()V")
	private Class1_Sub33() {
	}

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(I)V")
	public Class1_Sub33(@OriginalArg(0) int arg0) {
		this.anInt5633 = arg0;
	}
}
