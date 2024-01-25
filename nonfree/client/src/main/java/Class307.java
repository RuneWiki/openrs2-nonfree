import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public final class Class307 {

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "J")
	public final long aLong233;

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "Lclient!tia;")
	private final Class100_Sub1_Sub2 aClass100_Sub1_Sub2_9;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!tia;J[Lclient!taa;)V")
	public Class307(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class342[] arg2) {
		this.aLong233 = arg1;
		this.aClass100_Sub1_Sub2_9 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass100_Sub1_Sub2_9.method7995(this.aLong233);
		super.finalize();
	}
}
