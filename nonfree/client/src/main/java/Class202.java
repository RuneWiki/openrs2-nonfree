import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class202 {

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "Lclient!h;")
	private final Class32_Sub2 aClass32_Sub2_40;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
	public final int anInt6130;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!h;I[Lclient!dr;)V")
	public Class202(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class46[] arg2) {
		this.aClass32_Sub2_40 = arg0;
		this.anInt6130 = arg1;
	}

	@OriginalMember(owner = "client!ud", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass32_Sub2_40.method2296(this.anInt6130);
		super.finalize();
	}
}
