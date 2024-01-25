import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class1_Sub2_Sub3_Sub2 extends Class1_Sub2_Sub3 {

	@OriginalMember(owner = "client!ph", name = "G", descriptor = "Ljava/lang/Object;")
	private final Object anObject11;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub2_Sub3_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject11 = arg0;
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method5996() {
		return false;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5995() {
		return this.anObject11;
	}
}
