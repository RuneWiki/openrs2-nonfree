import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public final class Class250 {

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "I")
	public final int anInt7351;

	@OriginalMember(owner = "client!nca", name = "d", descriptor = "Lclient!gia;")
	private final Class67_Sub2 aClass67_Sub2_29;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Lclient!gia;II)V")
	public Class250(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7351 = arg2;
		this.aClass67_Sub2_29 = arg0;
	}

	@OriginalMember(owner = "client!nca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass67_Sub2_29.method3260(this.anInt7351);
		super.finalize();
	}
}
