import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public final class Class77 {

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "J")
	public final long aLong69;

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "Lclient!ih;")
	private final Class106_Sub2 aClass106_Sub2_11;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Lclient!ih;J[Lclient!aj;)V")
	public Class77(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class10[] arg2) {
		this.aLong69 = arg1;
		this.aClass106_Sub2_11 = arg0;
	}

	@OriginalMember(owner = "client!eq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass106_Sub2_11.method2855(this.aLong69);
		super.finalize();
	}
}
