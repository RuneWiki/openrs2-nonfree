import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class3_Sub3_Sub11_Sub1 extends Class3_Sub3_Sub11 {

	@OriginalMember(owner = "client!hl", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!bga;Ljava/lang/Object;I)V")
	public Class3_Sub3_Sub11_Sub1(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method6452() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method6453() {
		return true;
	}
}
