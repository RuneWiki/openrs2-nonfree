import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public final class Class4_Sub1_Sub1_Sub1 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!bg", name = "H", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!tp;Ljava/lang/Object;I)V")
	public Class4_Sub1_Sub1_Sub1(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method1230() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method1229() {
		return true;
	}
}
