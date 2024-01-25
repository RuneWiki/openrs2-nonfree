import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public final class Class3_Sub5_Sub1_Sub2 extends Class3_Sub5_Sub1 {

	@OriginalMember(owner = "client!wu", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lclient!st;Ljava/lang/Object;I)V")
	public Class3_Sub5_Sub1_Sub2(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method9015() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method9018() {
		return true;
	}
}
