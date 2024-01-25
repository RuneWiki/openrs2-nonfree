import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public final class Class12_Sub4_Sub11_Sub1 extends Class12_Sub4_Sub11 {

	@OriginalMember(owner = "client!ov", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class12_Sub4_Sub11_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7117() {
		return true;
	}

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7120() {
		return this.aSoftReference2.get();
	}
}
