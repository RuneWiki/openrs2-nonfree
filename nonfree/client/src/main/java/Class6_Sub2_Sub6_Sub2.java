import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public final class Class6_Sub2_Sub6_Sub2 extends Class6_Sub2_Sub6 {

	@OriginalMember(owner = "client!jw", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class6_Sub2_Sub6_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4829() {
		return true;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method4831() {
		return this.aSoftReference2.get();
	}
}
