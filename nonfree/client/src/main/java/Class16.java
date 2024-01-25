import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public final class Class16 {

	@OriginalMember(owner = "client!am", name = "a", descriptor = "Lclient!dw;")
	private final Class82_Sub1 aClass82_Sub1_3;

	@OriginalMember(owner = "client!am", name = "c", descriptor = "I")
	public final int anInt254;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!dw;II)V")
	public Class16(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass82_Sub1_3 = arg0;
		this.anInt254 = arg2;
	}

	@OriginalMember(owner = "client!am", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass82_Sub1_3.method2033(this.anInt254);
		super.finalize();
	}
}
