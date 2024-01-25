import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public final class Class5 {

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "Lclient!ge;")
	private final Class81_Sub1 aClass81_Sub1_2;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
	public final int anInt53;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!ge;II)V")
	public Class5(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass81_Sub1_2 = arg0;
		this.anInt53 = arg2;
	}

	@OriginalMember(owner = "client!ad", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass81_Sub1_2.method1983(this.anInt53);
		super.finalize();
	}
}
