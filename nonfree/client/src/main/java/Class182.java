import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public final class Class182 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "Lclient!dda;")
	private final Class44_Sub2_Sub1 aClass44_Sub2_Sub1_5;

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "J")
	public final long aLong137;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lclient!dda;J[Lclient!av;)V")
	public Class182(@OriginalArg(0) Class44_Sub2_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class23[] arg2) {
		this.aClass44_Sub2_Sub1_5 = arg0;
		this.aLong137 = arg1;
	}

	@OriginalMember(owner = "client!ka", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass44_Sub2_Sub1_5.method2019(this.aLong137);
		super.finalize();
	}
}
