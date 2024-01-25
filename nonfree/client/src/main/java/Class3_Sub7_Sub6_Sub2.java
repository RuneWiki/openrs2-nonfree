import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public final class Class3_Sub7_Sub6_Sub2 extends Class3_Sub7_Sub6 {

	@OriginalMember(owner = "client!uh", name = "U", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub7_Sub6_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7415() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7412() {
		return true;
	}
}
