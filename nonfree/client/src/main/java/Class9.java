import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public final class Class9 {

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "Lclient!mi;")
	private final Class155_Sub1 aClass155_Sub1_5;

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
	public final int anInt153;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lclient!mi;II)V")
	public Class9(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass155_Sub1_5 = arg0;
		this.anInt153 = arg2;
	}

	@OriginalMember(owner = "client!aj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass155_Sub1_5.method3630(this.anInt153);
		super.finalize();
	}
}
