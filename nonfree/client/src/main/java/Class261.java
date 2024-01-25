import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public final class Class261 {

	@OriginalMember(owner = "client!oga", name = "i", descriptor = "Lclient!fc;")
	private final Class101_Sub1_Sub1 aClass101_Sub1_Sub1_10;

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "I")
	public final int anInt7847;

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Lclient!fc;II)V")
	public Class261(@OriginalArg(0) Class101_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass101_Sub1_Sub1_10 = arg0;
		this.anInt7847 = arg2;
	}

	@OriginalMember(owner = "client!oga", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass101_Sub1_Sub1_10.method3142(this.anInt7847);
		super.finalize();
	}
}
