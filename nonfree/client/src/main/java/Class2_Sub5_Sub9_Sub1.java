import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public final class Class2_Sub5_Sub9_Sub1 extends Class2_Sub5_Sub9 {

	@OriginalMember(owner = "client!sn", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!sl;Ljava/lang/Object;I)V")
	public Class2_Sub5_Sub9_Sub1(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5077() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5075() {
		return true;
	}
}
