import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public final class Class48 {

	@OriginalMember(owner = "client!cca", name = "e", descriptor = "Lclient!pq;")
	private final Class132_Sub3 aClass132_Sub3_6;

	@OriginalMember(owner = "client!cca", name = "f", descriptor = "I")
	public final int anInt1211;

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lclient!pq;II)V")
	public Class48(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass132_Sub3_6 = arg0;
		this.anInt1211 = arg2;
	}

	@OriginalMember(owner = "client!cca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass132_Sub3_6.method6761(this.anInt1211);
		super.finalize();
	}
}
