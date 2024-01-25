import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class148 {

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "J")
	public final long aLong117;

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "Lclient!ad;")
	private final Class7_Sub1_Sub1 aClass7_Sub1_Sub1_6;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!ad;J[Lclient!sk;)V")
	public Class148(@OriginalArg(0) Class7_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class304[] arg2) {
		this.aLong117 = arg1;
		this.aClass7_Sub1_Sub1_6 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass7_Sub1_Sub1_6.method635(this.aLong117);
		super.finalize();
	}
}
