import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public final class Class133 {

	@OriginalMember(owner = "client!me", name = "c", descriptor = "Lclient!h;")
	private final Class32_Sub2 aClass32_Sub2_29;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "I")
	public final int anInt3978;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!h;II)V")
	public Class133(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass32_Sub2_29 = arg0;
		this.anInt3978 = arg2;
	}

	@OriginalMember(owner = "client!me", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass32_Sub2_29.method2304(this.anInt3978);
		super.finalize();
	}
}
