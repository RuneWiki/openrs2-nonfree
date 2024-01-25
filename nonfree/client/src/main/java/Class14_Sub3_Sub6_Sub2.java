import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public final class Class14_Sub3_Sub6_Sub2 extends Class14_Sub3_Sub6 {

	@OriginalMember(owner = "client!qea", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class14_Sub3_Sub6_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6921() {
		return true;
	}

	@OriginalMember(owner = "client!qea", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method6923() {
		return this.aSoftReference2.get();
	}
}
