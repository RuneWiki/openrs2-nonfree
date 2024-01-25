import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public final class Class225 {

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "Lclient!dc;")
	private final Class66_Sub1_Sub1 aClass66_Sub1_Sub1_8;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
	public final int anInt5862;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!dc;II)V")
	public Class225(@OriginalArg(0) Class66_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass66_Sub1_Sub1_8 = arg0;
		this.anInt5862 = arg2;
	}

	@OriginalMember(owner = "client!mi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass66_Sub1_Sub1_8.method2039(this.anInt5862);
		super.finalize();
	}
}
