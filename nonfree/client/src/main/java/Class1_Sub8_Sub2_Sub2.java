import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public final class Class1_Sub8_Sub2_Sub2 extends Class1_Sub8_Sub2 {

	@OriginalMember(owner = "client!qj", name = "G", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!oga;Ljava/lang/Object;I)V")
	public Class1_Sub8_Sub2_Sub2(@OriginalArg(0) Interface18 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method6115() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method6118() {
		return true;
	}
}
