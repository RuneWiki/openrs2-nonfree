import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public final class Class6_Sub5_Sub1_Sub1 extends Class6_Sub5_Sub1 {

	@OriginalMember(owner = "client!ar", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!sn;Ljava/lang/Object;I)V")
	public Class6_Sub5_Sub1_Sub1(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7754() {
		return true;
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7751() {
		return this.aSoftReference1.get();
	}
}
