import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public final class Class2_Sub13_Sub12_Sub2 extends Class2_Sub13_Sub12 {

	@OriginalMember(owner = "client!sd", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub13_Sub12_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6642() {
		return true;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method6647() {
		return this.aSoftReference2.get();
	}
}
