import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public final class Class319 {

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
	public final int anInt8005;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "Lclient!kd;")
	private final Class162_Sub1_Sub2 aClass162_Sub1_Sub2_10;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!kd;II)V")
	public Class319(@OriginalArg(0) Class162_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8005 = arg2;
		this.aClass162_Sub1_Sub2_10 = arg0;
	}

	@OriginalMember(owner = "client!tb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass162_Sub1_Sub2_10.method3964(this.anInt8005);
		super.finalize();
	}
}
