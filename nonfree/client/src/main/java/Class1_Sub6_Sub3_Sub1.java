import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public final class Class1_Sub6_Sub3_Sub1 extends Class1_Sub6_Sub3 {

	@OriginalMember(owner = "client!eo", name = "E", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub6_Sub3_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method2160() {
		return true;
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method2161() {
		return this.aSoftReference2.get();
	}
}
