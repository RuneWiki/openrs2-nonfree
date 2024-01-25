import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public final class Class186 {

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "Lclient!eq;")
	private final Class33_Sub3 aClass33_Sub3_24;

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
	public final int anInt6029;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lclient!eq;II)V")
	public Class186(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass33_Sub3_24 = arg0;
		this.anInt6029 = arg2;
	}

	@OriginalMember(owner = "client!kn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass33_Sub3_24.method3006(this.anInt6029);
		super.finalize();
	}
}
