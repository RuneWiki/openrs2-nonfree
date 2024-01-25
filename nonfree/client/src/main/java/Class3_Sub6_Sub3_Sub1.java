import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public final class Class3_Sub6_Sub3_Sub1 extends Class3_Sub6_Sub3 {

	@OriginalMember(owner = "client!hi", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub6_Sub3_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference2 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7028() {
		return true;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method7027() {
		return this.aSoftReference2.get();
	}
}
