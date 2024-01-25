import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public final class Class1_Sub2_Sub3_Sub2 extends Class1_Sub2_Sub3 {

	@OriginalMember(owner = "client!ho", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub2_Sub3_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method2528() {
		return true;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method2525() {
		return this.aSoftReference2.get();
	}
}
