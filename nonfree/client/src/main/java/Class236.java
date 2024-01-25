import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public final class Class236 {

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
	public final int anInt6426;

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "Lclient!lj;")
	private final Class78_Sub3 aClass78_Sub3_27;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lclient!lj;II)V")
	public Class236(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6426 = arg2;
		this.aClass78_Sub3_27 = arg0;
	}

	@OriginalMember(owner = "client!nj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass78_Sub3_27.method4519(this.anInt6426);
		super.finalize();
	}
}
