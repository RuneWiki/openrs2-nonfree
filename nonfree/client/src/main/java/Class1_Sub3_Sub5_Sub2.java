import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class1_Sub3_Sub5_Sub2 extends Class1_Sub3_Sub5 {

	@OriginalMember(owner = "client!te", name = "G", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub3_Sub5_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5070() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5072() {
		return true;
	}
}
