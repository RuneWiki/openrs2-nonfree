import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public final class Class5_Sub4_Sub16_Sub2 extends Class5_Sub4_Sub16 {

	@OriginalMember(owner = "client!uv", name = "E", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lclient!ek;Ljava/lang/Object;I)V")
	public Class5_Sub4_Sub16_Sub2(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8275() {
		return true;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method8271() {
		return this.aSoftReference2.get();
	}
}
