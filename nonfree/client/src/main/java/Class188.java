import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public final class Class188 {

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "Lclient!tb;")
	private final Class129_Sub2 aClass129_Sub2_38;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
	public final int anInt5970;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!tb;I[Lclient!i;)V")
	public Class188(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class99[] arg2) {
		this.aClass129_Sub2_38 = arg0;
		this.anInt5970 = arg1;
	}

	@OriginalMember(owner = "client!tf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass129_Sub2_38.method5101(this.anInt5970);
		super.finalize();
	}
}
