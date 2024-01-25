import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class78 {

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Lclient!ao;")
	private final Class4_Sub1 aClass4_Sub1_13;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
	public final int anInt2555;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!ao;I[Lclient!es;)V")
	public Class78(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class59[] arg2) {
		this.aClass4_Sub1_13 = arg0;
		this.anInt2555 = arg1;
	}

	@OriginalMember(owner = "client!hc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass4_Sub1_13.method570(this.anInt2555);
		super.finalize();
	}
}
