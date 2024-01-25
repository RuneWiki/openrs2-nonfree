import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class3_Sub1_Sub14_Sub1 extends Class3_Sub1_Sub14 {

	@OriginalMember(owner = "client!le", name = "w", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub1_Sub14_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!le", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7618() {
		return true;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7617() {
		return this.aSoftReference1.get();
	}
}
