import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public final class Class1_Sub6_Sub2_Sub1 extends Class1_Sub6_Sub2 {

	@OriginalMember(owner = "client!em", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!vk;Ljava/lang/Object;I)V")
	public Class1_Sub6_Sub2_Sub1(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!em", name = "g", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3188() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method3184() {
		return true;
	}
}
