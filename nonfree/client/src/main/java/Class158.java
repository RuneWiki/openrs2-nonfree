import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class158 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "Lclient!dw;")
	private final Class82_Sub1 aClass82_Sub1_24;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "J")
	public final long aLong120;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!dw;JI)V")
	public Class158(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass82_Sub1_24 = arg0;
		this.aLong120 = arg1;
	}

	@OriginalMember(owner = "client!ie", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass82_Sub1_24.method2041(this.aLong120);
		super.finalize();
	}
}
