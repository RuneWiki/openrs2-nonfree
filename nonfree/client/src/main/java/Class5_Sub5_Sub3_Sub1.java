import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public final class Class5_Sub5_Sub3_Sub1 extends Class5_Sub5_Sub3 {

	@OriginalMember(owner = "client!ee", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!eq;Ljava/lang/Object;I)V")
	public Class5_Sub5_Sub3_Sub1(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method6059() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method6061() {
		return true;
	}
}
