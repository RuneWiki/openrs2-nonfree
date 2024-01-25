import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public final class Class1_Sub1_Sub16_Sub2 extends Class1_Sub1_Sub16 {

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub1_Sub16_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7391() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7389() {
		return true;
	}
}
