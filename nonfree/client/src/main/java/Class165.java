import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public final class Class165 {

	@OriginalMember(owner = "client!jfa", name = "d", descriptor = "J")
	public final long aLong134;

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "Lclient!us;")
	private final Class43_Sub3 aClass43_Sub3_19;

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lclient!us;JI)V")
	public Class165(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong134 = arg1;
		this.aClass43_Sub3_19 = arg0;
	}

	@OriginalMember(owner = "client!jfa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass43_Sub3_19.method7237(this.aLong134);
		super.finalize();
	}
}
