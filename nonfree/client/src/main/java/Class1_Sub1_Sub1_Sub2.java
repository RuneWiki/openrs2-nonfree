import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!mq", name = "t", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!maa;Ljava/lang/Object;I)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4834() {
		return true;
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method4835() {
		return this.aSoftReference1.get();
	}
}
