import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public final class Class267 {

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "Lclient!fd;")
	private final Class19_Sub2 aClass19_Sub2_43;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "J")
	public final long aLong220;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!fd;JI)V")
	public Class267(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass19_Sub2_43 = arg0;
		this.aLong220 = arg1;
	}

	@OriginalMember(owner = "client!wl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass19_Sub2_43.method1973(this.aLong220);
		super.finalize();
	}
}
