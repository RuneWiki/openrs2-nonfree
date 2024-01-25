import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public final class Class225 {

	@OriginalMember(owner = "client!td", name = "c", descriptor = "I")
	public final int anInt6405;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Lclient!fd;")
	private final Class19_Sub2 aClass19_Sub2_36;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!fd;II)V")
	public Class225(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6405 = arg2;
		this.aClass19_Sub2_36 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass19_Sub2_36.method1908(this.anInt6405);
		super.finalize();
	}
}
