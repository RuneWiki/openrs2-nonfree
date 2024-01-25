import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public final class Class243 {

	@OriginalMember(owner = "client!qca", name = "e", descriptor = "J")
	public final long aLong296;

	@OriginalMember(owner = "client!qca", name = "d", descriptor = "Lclient!uq;")
	private final Class122_Sub3 aClass122_Sub3_29;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lclient!uq;J[Lclient!op;)V")
	public Class243(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class221[] arg2) {
		this.aLong296 = arg1;
		this.aClass122_Sub3_29 = arg0;
	}

	@OriginalMember(owner = "client!qca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass122_Sub3_29.method6929(this.aLong296);
		super.finalize();
	}
}
