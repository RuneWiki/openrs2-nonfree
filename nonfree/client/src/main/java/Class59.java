import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public final class Class59 {

	@OriginalMember(owner = "client!es", name = "c", descriptor = "Lclient!ao;")
	private final Class4_Sub1 aClass4_Sub1_11;

	@OriginalMember(owner = "client!es", name = "b", descriptor = "I")
	public final int anInt1749;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!ao;II)V")
	public Class59(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub1_11 = arg0;
		this.anInt1749 = arg1;
	}

	@OriginalMember(owner = "client!es", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass4_Sub1_11.method570(this.anInt1749);
		super.finalize();
	}
}
