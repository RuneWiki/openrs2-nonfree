import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public final class Class4_Sub4_Sub12_Sub2 extends Class4_Sub4_Sub12 {

	@OriginalMember(owner = "client!uo", name = "G", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lclient!aa;Ljava/lang/Object;)V")
	public Class4_Sub4_Sub12_Sub2(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5307() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5306() {
		return true;
	}
}
