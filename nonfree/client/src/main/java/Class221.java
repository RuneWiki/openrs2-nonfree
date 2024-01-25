import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public final class Class221 {

	@OriginalMember(owner = "client!op", name = "b", descriptor = "Lclient!uq;")
	private final Class122_Sub3 aClass122_Sub3_26;

	@OriginalMember(owner = "client!op", name = "f", descriptor = "J")
	public final long aLong275;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!uq;JI)V")
	public Class221(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass122_Sub3_26 = arg0;
		this.aLong275 = arg1;
	}

	@OriginalMember(owner = "client!op", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass122_Sub3_26.method6929(this.aLong275);
		super.finalize();
	}
}
