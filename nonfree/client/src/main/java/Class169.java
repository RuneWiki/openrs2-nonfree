import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public final class Class169 {

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "I")
	public final int anInt4445;

	@OriginalMember(owner = "client!jea", name = "e", descriptor = "Lclient!ok;")
	private final Class134_Sub2 aClass134_Sub2_19;

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Lclient!ok;II)V")
	public Class169(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4445 = arg2;
		this.aClass134_Sub2_19 = arg0;
	}

	@OriginalMember(owner = "client!jea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass134_Sub2_19.method5212(this.anInt4445);
		super.finalize();
	}
}
