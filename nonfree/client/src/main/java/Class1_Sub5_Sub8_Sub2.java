import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public final class Class1_Sub5_Sub8_Sub2 extends Class1_Sub5_Sub8 {

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub5_Sub8_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method2923() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method2924() {
		return true;
	}
}
