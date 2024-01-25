import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public final class Class8_Sub5_Sub1_Sub1 extends Class8_Sub5_Sub1 {

	@OriginalMember(owner = "client!b", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class8_Sub5_Sub1_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7577() {
		return true;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method7578() {
		return this.aSoftReference1.get();
	}
}
