import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public final class Class123 {

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "J")
	public final long aLong79;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "Lclient!en;")
	private final Class90_Sub1 aClass90_Sub1_14;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Lclient!en;JI)V")
	public Class123(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong79 = arg1;
		this.aClass90_Sub1_14 = arg0;
	}

	@OriginalMember(owner = "client!hba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass90_Sub1_14.method2110(this.aLong79);
		super.finalize();
	}
}
