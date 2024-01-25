import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public final class Class264 {

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
	public final int anInt7803;

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "Lclient!oea;")
	private final Class87_Sub2 aClass87_Sub2_29;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!oea;II)V")
	public Class264(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7803 = arg2;
		this.aClass87_Sub2_29 = arg0;
	}

	@OriginalMember(owner = "client!pp", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass87_Sub2_29.method6168(this.anInt7803);
		super.finalize();
	}
}
