import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public final class Class276 {

	@OriginalMember(owner = "client!pt", name = "g", descriptor = "J")
	public final long aLong236;

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "Lclient!oaa;")
	private final Class132_Sub1_Sub1 aClass132_Sub1_Sub1_10;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!oaa;J[Lclient!su;)V")
	public Class276(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class327[] arg2) {
		this.aLong236 = arg1;
		this.aClass132_Sub1_Sub1_10 = arg0;
	}

	@OriginalMember(owner = "client!pt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass132_Sub1_Sub1_10.method6163(this.aLong236);
		super.finalize();
	}
}
