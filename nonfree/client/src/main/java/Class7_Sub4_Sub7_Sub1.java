import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public final class Class7_Sub4_Sub7_Sub1 extends Class7_Sub4_Sub7 {

	@OriginalMember(owner = "client!gt", name = "w", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class7_Sub4_Sub7_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4298() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method4299() {
		return true;
	}
}
