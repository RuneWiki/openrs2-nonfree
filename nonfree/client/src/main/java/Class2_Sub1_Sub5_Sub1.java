import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public final class Class2_Sub1_Sub5_Sub1 extends Class2_Sub1_Sub5 {

	@OriginalMember(owner = "client!eg", name = "H", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub1_Sub5_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method1594() {
		return true;
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method1597() {
		return this.aSoftReference1.get();
	}
}
