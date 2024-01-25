import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public final class Class242 {

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "Lclient!lt;")
	private final Class67_Sub1_Sub2 aClass67_Sub1_Sub2_10;

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
	public final int anInt7166;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!lt;II)V")
	public Class242(@OriginalArg(0) Class67_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass67_Sub1_Sub2_10 = arg0;
		this.anInt7166 = arg2;
	}

	@OriginalMember(owner = "client!mn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass67_Sub1_Sub2_10.method5698(this.anInt7166);
		super.finalize();
	}
}
