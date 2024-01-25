import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public final class Class4_Sub5_Sub6_Sub2 extends Class4_Sub5_Sub6 {

	@OriginalMember(owner = "client!ru", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lclient!we;Ljava/lang/Object;I)V")
	public Class4_Sub5_Sub6_Sub2(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7153() {
		return true;
	}

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7154() {
		return this.aSoftReference1.get();
	}
}
