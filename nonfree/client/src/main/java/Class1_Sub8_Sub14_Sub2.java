import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public final class Class1_Sub8_Sub14_Sub2 extends Class1_Sub8_Sub14 {

	@OriginalMember(owner = "client!tda", name = "F", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub8_Sub14_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7012() {
		return true;
	}

	@OriginalMember(owner = "client!tda", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7008() {
		return this.aSoftReference2.get();
	}
}
