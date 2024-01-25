import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class100 {

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "Lclient!cg;")
	private final Class37_Sub1 aClass37_Sub1_17;

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
	public final int anInt2912;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!cg;I[Lclient!gt;)V")
	public Class100(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class86[] arg2) {
		this.aClass37_Sub1_17 = arg0;
		this.anInt2912 = arg1;
	}

	@OriginalMember(owner = "client!ig", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass37_Sub1_17.method799(this.anInt2912);
		super.finalize();
	}
}
