import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public final class Class3_Sub7_Sub4_Sub2 extends Class3_Sub7_Sub4 {

	@OriginalMember(owner = "client!pe", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!so;Ljava/lang/Object;I)V")
	public Class3_Sub7_Sub4_Sub2(@OriginalArg(0) Interface18 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5853() {
		return true;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5851() {
		return this.aSoftReference1.get();
	}
}
