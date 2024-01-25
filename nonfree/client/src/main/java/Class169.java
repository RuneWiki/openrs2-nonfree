import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public final class Class169 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "Lclient!ao;")
	private final Class4_Sub1 aClass4_Sub1_31;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
	public final int anInt5482;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!ao;II)V")
	public Class169(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub1_31 = arg0;
		this.anInt5482 = arg2;
	}

	@OriginalMember(owner = "client!rf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass4_Sub1_31.method560(this.anInt5482);
		super.finalize();
	}
}
