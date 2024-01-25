import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public final class Class1_Sub2_Sub4_Sub2 extends Class1_Sub2_Sub4 {

	@OriginalMember(owner = "client!to", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!ada;Ljava/lang/Object;I)V")
	public Class1_Sub2_Sub4_Sub2(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!to", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7397() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7396() {
		return true;
	}
}
