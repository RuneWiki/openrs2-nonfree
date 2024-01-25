import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public final class Class6_Sub1_Sub4_Sub2 extends Class6_Sub1_Sub4 {

	@OriginalMember(owner = "client!lea", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class6_Sub1_Sub4_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4027() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!lea", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method4029() {
		return true;
	}
}
