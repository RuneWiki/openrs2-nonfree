import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public final class Class3_Sub7_Sub3_Sub2 extends Class3_Sub7_Sub3 {

	@OriginalMember(owner = "client!mq", name = "x", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!cr;Ljava/lang/Object;I)V")
	public Class3_Sub7_Sub3_Sub2(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5775() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5774() {
		return true;
	}
}
