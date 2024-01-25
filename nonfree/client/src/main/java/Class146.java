import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hka")
public final class Class146 {

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "Lclient!ko;")
	private final Class137_Sub1_Sub1 aClass137_Sub1_Sub1_5;

	@OriginalMember(owner = "client!hka", name = "g", descriptor = "I")
	public final int anInt4171;

	@OriginalMember(owner = "client!hka", name = "<init>", descriptor = "(Lclient!ko;II)V")
	public Class146(@OriginalArg(0) Class137_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass137_Sub1_Sub1_5 = arg0;
		this.anInt4171 = arg2;
	}

	@OriginalMember(owner = "client!hka", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass137_Sub1_Sub1_5.method4976(this.anInt4171);
		super.finalize();
	}
}
