import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public final class Class119 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Lclient!ig;")
	private final Class47_Sub2 aClass47_Sub2_24;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	public final int anInt3793;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!ig;II)V")
	public Class119(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass47_Sub2_24 = arg0;
		this.anInt3793 = arg2;
	}

	@OriginalMember(owner = "client!lc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass47_Sub2_24.method2817(this.anInt3793);
		super.finalize();
	}
}
