import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public final class Class168 {

	@OriginalMember(owner = "client!me", name = "i", descriptor = "Lclient!ug;")
	private final Class135_Sub2 aClass135_Sub2_19;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "J")
	public final long aLong114;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!ug;J[Lclient!sl;)V")
	public Class168(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class228[] arg2) {
		this.aClass135_Sub2_19 = arg0;
		this.aLong114 = arg1;
	}

	@OriginalMember(owner = "client!me", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass135_Sub2_19.method5456(this.aLong114);
		super.finalize();
	}
}
