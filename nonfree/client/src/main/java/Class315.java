import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public final class Class315 {

	@OriginalMember(owner = "client!sea", name = "c", descriptor = "Lclient!ep;")
	private final Class95_Sub1 aClass95_Sub1_37;

	@OriginalMember(owner = "client!sea", name = "e", descriptor = "I")
	public final int anInt8563;

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lclient!ep;II)V")
	public Class315(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass95_Sub1_37 = arg0;
		this.anInt8563 = arg2;
	}

	@OriginalMember(owner = "client!sea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass95_Sub1_37.method2043(this.anInt8563);
		super.finalize();
	}
}
