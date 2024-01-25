import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class2_Sub7_Sub5_Sub2 extends Class2_Sub7_Sub5 {

	@OriginalMember(owner = "client!sb", name = "M", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!vl;Ljava/lang/Object;I)V")
	public Class2_Sub7_Sub5_Sub2(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5095() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5096() {
		return true;
	}
}
