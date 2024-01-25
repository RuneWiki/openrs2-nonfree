import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public final class Class1_Sub2_Sub17_Sub2 extends Class1_Sub2_Sub17 {

	@OriginalMember(owner = "client!vo", name = "E", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub2_Sub17_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method5738() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method5741() {
		return true;
	}
}
