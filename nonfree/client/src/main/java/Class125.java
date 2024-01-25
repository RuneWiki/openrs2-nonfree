import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public final class Class125 {

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "J")
	public final long aLong111;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "Lclient!kv;")
	private final Class143_Sub2 aClass143_Sub2_17;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!kv;J[Lclient!lv;)V")
	public Class125(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class227[] arg2) {
		this.aLong111 = arg1;
		this.aClass143_Sub2_17 = arg0;
	}

	@OriginalMember(owner = "client!gb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass143_Sub2_17.method4962(this.aLong111);
		super.finalize();
	}
}
