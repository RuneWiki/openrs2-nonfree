import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public final class Class5_Sub1_Sub6_Sub2 extends Class5_Sub1_Sub6 {

	@OriginalMember(owner = "client!ru", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lclient!nba;Ljava/lang/Object;I)V")
	public Class5_Sub1_Sub6_Sub2(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method7257() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7256() {
		return true;
	}
}
