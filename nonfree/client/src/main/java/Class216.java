import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public final class Class216 {

	@OriginalMember(owner = "client!on", name = "b", descriptor = "Lclient!qba;")
	private final Class39_Sub2_Sub2 aClass39_Sub2_Sub2_7;

	@OriginalMember(owner = "client!on", name = "c", descriptor = "I")
	public final int anInt6455;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!qba;II)V")
	public Class216(@OriginalArg(0) Class39_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass39_Sub2_Sub2_7 = arg0;
		this.anInt6455 = arg2;
	}

	@OriginalMember(owner = "client!on", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass39_Sub2_Sub2_7.method6223(this.anInt6455);
		super.finalize();
	}
}
