import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public final class Class4_Sub1_Sub12_Sub1 extends Class4_Sub1_Sub12 {

	@OriginalMember(owner = "client!ip", name = "G", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class4_Sub1_Sub12_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5269() {
		return true;
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5267() {
		return this.aSoftReference2.get();
	}
}
