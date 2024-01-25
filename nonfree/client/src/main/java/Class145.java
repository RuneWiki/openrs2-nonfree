import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public final class Class145 {

	@OriginalMember(owner = "client!haa", name = "d", descriptor = "J")
	public final long aLong122;

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "Lclient!dga;")
	private final Class75_Sub1_Sub1 aClass75_Sub1_Sub1_9;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lclient!dga;J[Lclient!fb;)V")
	public Class145(@OriginalArg(0) Class75_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class108[] arg2) {
		this.aLong122 = arg1;
		this.aClass75_Sub1_Sub1_9 = arg0;
	}

	@OriginalMember(owner = "client!haa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass75_Sub1_Sub1_9.method1955(this.aLong122);
		super.finalize();
	}
}
