import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kja")
public final class Class6_Sub2_Sub3_Sub2 extends Class6_Sub2_Sub3 {

	@OriginalMember(owner = "client!kja", name = "w", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!kja", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class6_Sub2_Sub3_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4998() {
		return true;
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method4999() {
		return this.aSoftReference1.get();
	}
}
