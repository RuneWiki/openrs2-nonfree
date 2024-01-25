import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public final class Class278 {

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "J")
	public final long aLong199;

	@OriginalMember(owner = "client!pt", name = "g", descriptor = "Lclient!tk;")
	private final Class13_Sub3_Sub1 aClass13_Sub3_Sub1_7;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!tk;J[Lclient!dc;)V")
	public Class278(@OriginalArg(0) Class13_Sub3_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class66[] arg2) {
		this.aLong199 = arg1;
		this.aClass13_Sub3_Sub1_7 = arg0;
	}

	@OriginalMember(owner = "client!pt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass13_Sub3_Sub1_7.method7818(this.aLong199);
		super.finalize();
	}
}
