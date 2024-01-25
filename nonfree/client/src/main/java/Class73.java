import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public final class Class73 {

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "Lclient!qi;")
	private final Class82_Sub2 aClass82_Sub2_15;

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
	public final int anInt1793;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lclient!qi;II)V")
	public Class73(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass82_Sub2_15 = arg0;
		this.anInt1793 = arg1;
	}

	@OriginalMember(owner = "client!fg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass82_Sub2_15.method4625(this.anInt1793);
		super.finalize();
	}
}
