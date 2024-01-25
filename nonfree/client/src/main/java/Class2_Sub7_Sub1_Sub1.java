import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class Class2_Sub7_Sub1_Sub1 extends Class2_Sub7_Sub1 {

	@OriginalMember(owner = "client!ei", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub7_Sub1_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method2353() {
		return true;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method2352() {
		return this.aSoftReference1.get();
	}
}
