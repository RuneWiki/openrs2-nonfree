import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public final class Class185 {

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "J")
	public final long aLong140;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "Lclient!jq;")
	private final Class43_Sub1_Sub2 aClass43_Sub1_Sub2_4;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!jq;J[Lclient!pm;)V")
	public Class185(@OriginalArg(0) Class43_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class263[] arg2) {
		this.aLong140 = arg1;
		this.aClass43_Sub1_Sub2_4 = arg0;
	}

	@OriginalMember(owner = "client!kg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass43_Sub1_Sub2_4.method4305(this.aLong140);
		super.finalize();
	}
}
