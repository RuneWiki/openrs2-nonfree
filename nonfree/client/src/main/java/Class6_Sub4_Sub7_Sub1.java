import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public final class Class6_Sub4_Sub7_Sub1 extends Class6_Sub4_Sub7 {

	@OriginalMember(owner = "client!kl", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class6_Sub4_Sub7_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4575() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method4574() {
		return true;
	}
}
