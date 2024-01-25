import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public final class Class1_Sub3_Sub7_Sub1 extends Class1_Sub3_Sub7 {

	@OriginalMember(owner = "client!ir", name = "M", descriptor = "Ljava/lang/Object;")
	private final Object anObject4;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub3_Sub7_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject4 = arg0;
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method2916() {
		return false;
	}

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method2918() {
		return this.anObject4;
	}
}
