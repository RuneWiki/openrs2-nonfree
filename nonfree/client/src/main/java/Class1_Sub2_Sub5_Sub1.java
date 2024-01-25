import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public final class Class1_Sub2_Sub5_Sub1 extends Class1_Sub2_Sub5 {

	@OriginalMember(owner = "client!dj", name = "E", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!cp;Ljava/lang/Object;I)V")
	public Class1_Sub2_Sub5_Sub1(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5815() {
		return true;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method5818() {
		return this.aSoftReference1.get();
	}
}
