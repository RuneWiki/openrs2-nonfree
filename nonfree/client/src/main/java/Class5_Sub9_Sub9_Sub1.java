import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public final class Class5_Sub9_Sub9_Sub1 extends Class5_Sub9_Sub9 {

	@OriginalMember(owner = "client!ho", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class5_Sub9_Sub9_Sub1(@OriginalArg(0) Object arg0) {
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method4683() {
		return true;
	}

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method4684() {
		return this.aSoftReference2.get();
	}
}
