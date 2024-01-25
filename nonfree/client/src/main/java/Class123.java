import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public final class Class123 {

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "J")
	public final long aLong68;

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "Lclient!ck;")
	private final Class65_Sub1 aClass65_Sub1_7;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lclient!ck;J[Lclient!l;)V")
	public Class123(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class206[] arg2) {
		this.aLong68 = arg1;
		this.aClass65_Sub1_7 = arg0;
	}

	@OriginalMember(owner = "client!fm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass65_Sub1_7.method1277(this.aLong68);
		super.finalize();
	}
}
