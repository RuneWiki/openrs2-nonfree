import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public final class Class154 {

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "Lclient!eea;")
	private final Class87_Sub1_Sub1 aClass87_Sub1_Sub1_3;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "J")
	public final long aLong129;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!eea;JI)V")
	public Class154(@OriginalArg(0) Class87_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass87_Sub1_Sub1_3 = arg0;
		this.aLong129 = arg1;
	}

	@OriginalMember(owner = "client!ib", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass87_Sub1_Sub1_3.method2402(this.aLong129);
		super.finalize();
	}
}
