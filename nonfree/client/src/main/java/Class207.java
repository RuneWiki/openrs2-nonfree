import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class207 {

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "Lclient!nm;")
	private final Class164_Sub1 aClass164_Sub1_38;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
	public final int anInt5367;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!nm;II)V")
	public Class207(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass164_Sub1_38 = arg0;
		this.anInt5367 = arg2;
	}

	@OriginalMember(owner = "client!sb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass164_Sub1_38.method3617(this.anInt5367);
		super.finalize();
	}
}
