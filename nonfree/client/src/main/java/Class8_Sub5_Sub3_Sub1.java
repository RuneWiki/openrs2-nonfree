import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public final class Class8_Sub5_Sub3_Sub1 extends Class8_Sub5_Sub3 {

	@OriginalMember(owner = "client!bba", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lclient!on;Ljava/lang/Object;I)V")
	public Class8_Sub5_Sub3_Sub1(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!bba", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7785() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7784() {
		return true;
	}
}
