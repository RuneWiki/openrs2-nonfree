import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public final class Class6_Sub2_Sub1_Sub2 extends Class6_Sub2_Sub1 {

	@OriginalMember(owner = "client!aj", name = "J", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class6_Sub2_Sub1_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method300() {
		return true;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method302() {
		return this.aSoftReference1.get();
	}
}
