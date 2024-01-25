import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public final class Class164 {

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "J")
	public final long aLong99;

	@OriginalMember(owner = "client!kba", name = "g", descriptor = "Lclient!en;")
	private final Class90_Sub1 aClass90_Sub1_23;

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Lclient!en;J[Lclient!hba;)V")
	public Class164(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class123[] arg2) {
		this.aLong99 = arg1;
		this.aClass90_Sub1_23 = arg0;
	}

	@OriginalMember(owner = "client!kba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass90_Sub1_23.method2110(this.aLong99);
		super.finalize();
	}
}
