import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public final class Class2_Sub7_Sub7_Sub1 extends Class2_Sub7_Sub7 {

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!hh;Ljava/lang/Object;I)V")
	public Class2_Sub7_Sub7_Sub1(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method4730() {
		return true;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4728() {
		return this.aSoftReference1.get();
	}
}
