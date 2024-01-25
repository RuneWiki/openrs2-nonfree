import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public final class Class10 {

	@OriginalMember(owner = "client!aj", name = "h", descriptor = "J")
	public final long aLong7;

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "Lclient!ih;")
	private final Class106_Sub2 aClass106_Sub2_5;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lclient!ih;JI)V")
	public Class10(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong7 = arg1;
		this.aClass106_Sub2_5 = arg0;
	}

	@OriginalMember(owner = "client!aj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass106_Sub2_5.method2855(this.aLong7);
		super.finalize();
	}
}
