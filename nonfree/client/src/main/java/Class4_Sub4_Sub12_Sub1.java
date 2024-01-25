import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class4_Sub4_Sub12_Sub1 extends Class4_Sub4_Sub12 {

	@OriginalMember(owner = "client!pd", name = "K", descriptor = "Ljava/lang/Object;")
	private final Object anObject2;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!aa;Ljava/lang/Object;)V")
	public Class4_Sub4_Sub12_Sub1(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.anObject2 = arg1;
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5307() {
		return this.anObject2;
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5306() {
		return false;
	}
}
