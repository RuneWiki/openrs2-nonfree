import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public final class Class1_Sub5_Sub3_Sub2 extends Class1_Sub5_Sub3 {

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!fr;Ljava/lang/Object;I)V")
	public Class1_Sub5_Sub3_Sub2(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method1628() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method1629() {
		return true;
	}
}
