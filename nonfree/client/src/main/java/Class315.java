import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public final class Class315 {

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "Lclient!us;")
	private final Class43_Sub3 aClass43_Sub3_37;

	@OriginalMember(owner = "client!taa", name = "e", descriptor = "J")
	public final long aLong230;

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Lclient!us;J[Lclient!jfa;)V")
	public Class315(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class165[] arg2) {
		this.aClass43_Sub3_37 = arg0;
		this.aLong230 = arg1;
	}

	@OriginalMember(owner = "client!taa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass43_Sub3_37.method7237(this.aLong230);
		super.finalize();
	}
}
