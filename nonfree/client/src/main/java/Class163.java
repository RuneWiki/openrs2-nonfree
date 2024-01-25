import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public final class Class163 {

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "Lclient!qi;")
	private final Class82_Sub2 aClass82_Sub2_28;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
	public final int anInt4379;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!qi;I[Lclient!fg;)V")
	public Class163(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class73[] arg2) {
		this.aClass82_Sub2_28 = arg0;
		this.anInt4379 = arg1;
	}

	@OriginalMember(owner = "client!nn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass82_Sub2_28.method4625(this.anInt4379);
		super.finalize();
	}
}
