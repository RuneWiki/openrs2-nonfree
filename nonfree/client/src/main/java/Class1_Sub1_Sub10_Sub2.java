import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public final class Class1_Sub1_Sub10_Sub2 extends Class1_Sub1_Sub10 {

	@OriginalMember(owner = "client!tk", name = "Q", descriptor = "Ljava/lang/Object;")
	private final Object anObject8;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!c;Ljava/lang/Object;)V")
	public Class1_Sub1_Sub10_Sub2(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.anObject8 = arg1;
	}

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5108() {
		return this.anObject8;
	}

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method5109() {
		return false;
	}
}
