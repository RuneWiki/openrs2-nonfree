import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class1_Sub4_Sub14_Sub1 extends Class1_Sub4_Sub14 {

	@OriginalMember(owner = "client!ph", name = "N", descriptor = "Ljava/lang/Object;")
	private final Object anObject4;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub4_Sub14_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject4 = arg0;
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method4959() {
		return this.anObject4;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method4960() {
		return false;
	}
}
