import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class Class4_Sub3_Sub4_Sub1 extends Class4_Sub3_Sub4 {

	@OriginalMember(owner = "client!ei", name = "I", descriptor = "Ljava/lang/Object;")
	private Object anObject1;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class4_Sub3_Sub4_Sub1(@OriginalArg(0) Object arg0) {
		this.anObject1 = arg0;
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method2327() {
		return false;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method2326() {
		return this.anObject1;
	}
}
