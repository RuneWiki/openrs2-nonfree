import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public final class Class201 {

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "J")
	public final long aLong134;

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "Lclient!qj;")
	private final Class100_Sub3 aClass100_Sub3_30;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Lclient!qj;J[Lclient!af;)V")
	public Class201(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class10[] arg2) {
		this.aLong134 = arg1;
		this.aClass100_Sub3_30 = arg0;
	}

	@OriginalMember(owner = "client!laa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass100_Sub3_30.method6293(this.aLong134);
		super.finalize();
	}
}
