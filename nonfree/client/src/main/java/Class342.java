import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public final class Class342 {

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "J")
	public final long aLong257;

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "Lclient!ac;")
	private final Class5_Sub1 aClass5_Sub1_38;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lclient!ac;J[Lclient!v;)V")
	public Class342(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class349[] arg2) {
		this.aLong257 = arg1;
		this.aClass5_Sub1_38 = arg0;
	}

	@OriginalMember(owner = "client!uj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass5_Sub1_38.method344(this.aLong257);
		super.finalize();
	}
}
