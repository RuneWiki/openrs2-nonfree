import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public final class Class109 {

	@OriginalMember(owner = "client!in", name = "b", descriptor = "Lclient!fu;")
	private final Class63_Sub2 aClass63_Sub2_21;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "I")
	public final int anInt2921;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!fu;I[Lclient!fs;)V")
	public Class109(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76[] arg2) {
		this.aClass63_Sub2_21 = arg0;
		this.anInt2921 = arg1;
	}

	@OriginalMember(owner = "client!in", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass63_Sub2_21.method2094(this.anInt2921);
		super.finalize();
	}
}
