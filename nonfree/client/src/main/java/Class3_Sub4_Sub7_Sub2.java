import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public final class Class3_Sub4_Sub7_Sub2 extends Class3_Sub4_Sub7 {

	@OriginalMember(owner = "client!ls", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!jh;Ljava/lang/Object;I)V")
	public Class3_Sub4_Sub7_Sub2(@OriginalArg(0) Interface13 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5468() {
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5467() {
		return this.aSoftReference2.get();
	}
}
