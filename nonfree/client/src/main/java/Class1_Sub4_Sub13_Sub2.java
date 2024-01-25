import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public final class Class1_Sub4_Sub13_Sub2 extends Class1_Sub4_Sub13 {

	@OriginalMember(owner = "client!vd", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!uk;Ljava/lang/Object;)V")
	public Class1_Sub4_Sub13_Sub2(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5355() {
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5357() {
		return this.aSoftReference2.get();
	}
}
