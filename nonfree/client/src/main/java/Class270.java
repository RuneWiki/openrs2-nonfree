import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class Class270 {

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
	public final int anInt7873;

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "Lclient!dda;")
	private final Class44_Sub2_Sub1 aClass44_Sub2_Sub1_10;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!dda;II)V")
	public Class270(@OriginalArg(0) Class44_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7873 = arg2;
		this.aClass44_Sub2_Sub1_10 = arg0;
	}

	@OriginalMember(owner = "client!qd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass44_Sub2_Sub1_10.method2018(this.anInt7873);
		super.finalize();
	}
}
