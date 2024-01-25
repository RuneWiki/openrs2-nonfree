import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public final class Class3_Sub4_Sub6_Sub1 extends Class3_Sub4_Sub6 {

	@OriginalMember(owner = "client!fca", name = "w", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lclient!ut;Ljava/lang/Object;I)V")
	public Class3_Sub4_Sub6_Sub1(@OriginalArg(0) Interface26 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method3848() {
		return true;
	}

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3849() {
		return this.aSoftReference2.get();
	}
}
