import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public final class Class150 {

	@OriginalMember(owner = "client!ifa", name = "d", descriptor = "J")
	public final long aLong111;

	@OriginalMember(owner = "client!ifa", name = "f", descriptor = "Lclient!bga;")
	private final Class20_Sub2_Sub2 aClass20_Sub2_Sub2_5;

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Lclient!bga;JI)V")
	public Class150(@OriginalArg(0) Class20_Sub2_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong111 = arg1;
		this.aClass20_Sub2_Sub2_5 = arg0;
	}

	@OriginalMember(owner = "client!ifa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass20_Sub2_Sub2_5.method1586(this.aLong111);
		super.finalize();
	}
}
