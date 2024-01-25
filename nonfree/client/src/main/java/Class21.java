import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public final class Class21 {

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "J")
	public final long aLong20;

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "Lclient!hp;")
	private final Class134_Sub1_Sub1 aClass134_Sub1_Sub1_3;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!hp;J[Lclient!ne;)V")
	public Class21(@OriginalArg(0) Class134_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class234[] arg2) {
		this.aLong20 = arg1;
		this.aClass134_Sub1_Sub1_3 = arg0;
	}

	@OriginalMember(owner = "client!aw", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass134_Sub1_Sub1_3.method3208(this.aLong20);
		super.finalize();
	}
}
