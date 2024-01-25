import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public final class Class6_Sub5_Sub3_Sub1 extends Class6_Sub5_Sub3 {

	@OriginalMember(owner = "client!faa", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class6_Sub5_Sub3_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method2977() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method2980() {
		return true;
	}
}
