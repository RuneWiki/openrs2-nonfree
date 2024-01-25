import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public final class Class238 {

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
	public final int anInt6300;

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "Lclient!ug;")
	private final Class135_Sub2 aClass135_Sub2_36;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!ug;II)V")
	public Class238(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6300 = arg2;
		this.aClass135_Sub2_36 = arg0;
	}

	@OriginalMember(owner = "client!ti", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass135_Sub2_36.method5459(this.anInt6300);
		super.finalize();
	}
}
