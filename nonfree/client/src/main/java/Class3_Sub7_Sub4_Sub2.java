import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public final class Class3_Sub7_Sub4_Sub2 extends Class3_Sub7_Sub4 {

	@OriginalMember(owner = "client!oh", name = "L", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!kw;Ljava/lang/Object;I)V")
	public Class3_Sub7_Sub4_Sub2(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5377() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5376() {
		return true;
	}
}
