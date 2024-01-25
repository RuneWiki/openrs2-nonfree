import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class3_Sub4_Sub5_Sub1 extends Class3_Sub4_Sub5 {

	@OriginalMember(owner = "client!dl", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub4_Sub5_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.aSoftReference1 = new SoftReference(arg0);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method3898() {
		return this.aSoftReference1.get();
	}

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method3899() {
		return true;
	}
}
