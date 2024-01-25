import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public final class Class1_Sub2_Sub3_Sub1 extends Class1_Sub2_Sub3 {

	@OriginalMember(owner = "client!l", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub2_Sub3_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5995() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method5996() {
		return true;
	}
}
