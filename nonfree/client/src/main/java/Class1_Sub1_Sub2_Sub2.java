import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public final class Class1_Sub1_Sub2_Sub2 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!sr", name = "A", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lclient!qo;Ljava/lang/Object;I)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5252() {
		return this.aSoftReference2.get();
	}

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5251() {
		return true;
	}
}
