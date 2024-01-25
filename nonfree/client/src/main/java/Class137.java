import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public final class Class137 {

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "J")
	public final long aLong109;

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "Lclient!jaa;")
	private final Class14_Sub3 aClass14_Sub3_19;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!jaa;JI)V")
	public Class137(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong109 = arg1;
		this.aClass14_Sub3_19 = arg0;
	}

	@OriginalMember(owner = "client!hr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass14_Sub3_19.method3909(this.aLong109);
		super.finalize();
	}
}
