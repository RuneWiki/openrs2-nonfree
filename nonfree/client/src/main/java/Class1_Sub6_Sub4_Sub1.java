import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public final class Class1_Sub6_Sub4_Sub1 extends Class1_Sub6_Sub4 {

	@OriginalMember(owner = "client!ev", name = "x", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lclient!qt;Ljava/lang/Object;I)V")
	public Class1_Sub6_Sub4_Sub1(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5584() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!ev", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5583() {
		return true;
	}
}
