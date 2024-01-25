import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class199 {

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "Lclient!se;")
	private final Class122_Sub2 aClass122_Sub2_41;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
	public final int anInt6192;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!se;II)V")
	public Class199(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass122_Sub2_41 = arg0;
		this.anInt6192 = arg2;
	}

	@OriginalMember(owner = "client!ud", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass122_Sub2_41.method4866(this.anInt6192);
		super.finalize();
	}
}
