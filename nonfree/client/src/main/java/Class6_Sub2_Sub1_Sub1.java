import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public final class Class6_Sub2_Sub1_Sub1 extends Class6_Sub2_Sub1 {

	@OriginalMember(owner = "client!hh", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class6_Sub2_Sub1_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method3518() {
		return true;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method3516() {
		return this.aSoftReference1.get();
	}
}
