import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public final class Class191 {

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "Lclient!aq;")
	private final Class22_Sub1 aClass22_Sub1_22;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
	public final int anInt4877;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!aq;II)V")
	public Class191(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass22_Sub1_22 = arg0;
		this.anInt4877 = arg2;
	}

	@OriginalMember(owner = "client!jf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass22_Sub1_22.method948(this.anInt4877);
		super.finalize();
	}
}
