import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public final class Class188 {

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "Lclient!us;")
	private final Class43_Sub3 aClass43_Sub3_20;

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
	public final int anInt5104;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!us;II)V")
	public Class188(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass43_Sub3_20 = arg0;
		this.anInt5104 = arg2;
	}

	@OriginalMember(owner = "client!kk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass43_Sub3_20.method7264(this.anInt5104);
		super.finalize();
	}
}
