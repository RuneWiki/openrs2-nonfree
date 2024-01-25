import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public final class Class241 {

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "J")
	public final long aLong184;

	@OriginalMember(owner = "client!nfa", name = "e", descriptor = "Lclient!rda;")
	private final Class126_Sub3 aClass126_Sub3_23;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Lclient!rda;J[Lclient!cba;)V")
	public Class241(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class46[] arg2) {
		this.aLong184 = arg1;
		this.aClass126_Sub3_23 = arg0;
	}

	@OriginalMember(owner = "client!nfa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass126_Sub3_23.method7070(this.aLong184);
		super.finalize();
	}
}
