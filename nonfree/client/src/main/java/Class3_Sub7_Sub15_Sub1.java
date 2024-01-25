import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public final class Class3_Sub7_Sub15_Sub1 extends Class3_Sub7_Sub15 {

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "Ljava/lang/Object;")
	private final Object anObject13;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub7_Sub15_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject13 = arg0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6724() {
		return false;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method6730() {
		return this.anObject13;
	}
}
