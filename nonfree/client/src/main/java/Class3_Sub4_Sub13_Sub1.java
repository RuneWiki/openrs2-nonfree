import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public final class Class3_Sub4_Sub13_Sub1 extends Class3_Sub4_Sub13 {

	@OriginalMember(owner = "client!qs", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub4_Sub13_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8057() {
		return true;
	}

	@OriginalMember(owner = "client!qs", name = "i", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method8058() {
		return this.aSoftReference2.get();
	}
}
