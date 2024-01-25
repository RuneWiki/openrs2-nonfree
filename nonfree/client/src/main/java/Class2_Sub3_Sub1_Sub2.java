import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class2_Sub3_Sub1_Sub2 extends Class2_Sub3_Sub1 {

	@OriginalMember(owner = "client!sb", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!gj;Ljava/lang/Object;I)V")
	public Class2_Sub3_Sub1_Sub2(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method6758() {
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method6757() {
		return this.aSoftReference2.get();
	}
}
