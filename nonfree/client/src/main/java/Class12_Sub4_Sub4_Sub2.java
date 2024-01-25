import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public final class Class12_Sub4_Sub4_Sub2 extends Class12_Sub4_Sub4 {

	@OriginalMember(owner = "client!ew", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lclient!fw;Ljava/lang/Object;I)V")
	public Class12_Sub4_Sub4_Sub2(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method2650() {
		return true;
	}

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method2653() {
		return this.aSoftReference1.get();
	}
}
