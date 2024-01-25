import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public final class Class132 {

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "Lclient!hd;")
	private final Class89_Sub1 aClass89_Sub1_26;

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
	public final int anInt3821;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!hd;II)V")
	public Class132(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass89_Sub1_26 = arg0;
		this.anInt3821 = arg1;
	}

	@OriginalMember(owner = "client!ln", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass89_Sub1_26.method2411(this.anInt3821);
		super.finalize();
	}
}
