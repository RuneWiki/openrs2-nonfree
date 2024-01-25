import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public final class Class70 {

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "Lclient!no;")
	private final Class100_Sub1_Sub2 aClass100_Sub1_Sub2_1;

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "I")
	public final int anInt2258;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lclient!no;II)V")
	public Class70(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass100_Sub1_Sub2_1 = arg0;
		this.anInt2258 = arg2;
	}

	@OriginalMember(owner = "client!dw", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass100_Sub1_Sub2_1.method6170(this.anInt2258);
		super.finalize();
	}
}
