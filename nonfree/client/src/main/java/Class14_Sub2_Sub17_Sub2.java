import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public final class Class14_Sub2_Sub17_Sub2 extends Class14_Sub2_Sub17 {

	@OriginalMember(owner = "client!vk", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!vh;Ljava/lang/Object;)V")
	public Class14_Sub2_Sub17_Sub2(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5762() {
		return true;
	}

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method5767() {
		return this.aSoftReference2.get();
	}
}
