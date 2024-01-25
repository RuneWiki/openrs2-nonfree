import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public final class Class259 {

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "Lclient!om;")
	private final Class133_Sub1_Sub2 aClass133_Sub1_Sub2_11;

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "J")
	public final long aLong178;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lclient!om;J[Lclient!kea;)V")
	public Class259(@OriginalArg(0) Class133_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class193[] arg2) {
		this.aClass133_Sub1_Sub2_11 = arg0;
		this.aLong178 = arg1;
	}

	@OriginalMember(owner = "client!oo", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass133_Sub1_Sub2_11.method6288(this.aLong178);
		super.finalize();
	}
}
