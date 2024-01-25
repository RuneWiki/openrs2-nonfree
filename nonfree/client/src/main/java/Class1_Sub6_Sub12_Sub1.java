import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public final class Class1_Sub6_Sub12_Sub1 extends Class1_Sub6_Sub12 {

	@OriginalMember(owner = "client!qga", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub6_Sub12_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!qga", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method7763() {
		return true;
	}

	@OriginalMember(owner = "client!qga", name = "e", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method7761() {
		return this.aSoftReference2.get();
	}
}
