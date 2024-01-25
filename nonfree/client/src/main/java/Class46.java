import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public final class Class46 {

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "J")
	public final long aLong32;

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "Lclient!rda;")
	private final Class126_Sub3 aClass126_Sub3_7;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lclient!rda;JI)V")
	public Class46(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong32 = arg1;
		this.aClass126_Sub3_7 = arg0;
	}

	@OriginalMember(owner = "client!cba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass126_Sub3_7.method7070(this.aLong32);
		super.finalize();
	}
}
