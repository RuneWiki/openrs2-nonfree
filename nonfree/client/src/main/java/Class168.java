import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public final class Class168 {

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "J")
	public final long aLong137;

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "Lclient!ck;")
	private final Class33_Sub1_Sub1 aClass33_Sub1_Sub1_6;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lclient!ck;JI)V")
	public Class168(@OriginalArg(0) Class33_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong137 = arg1;
		this.aClass33_Sub1_Sub1_6 = arg0;
	}

	@OriginalMember(owner = "client!ju", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass33_Sub1_Sub1_6.method1729(this.aLong137);
		super.finalize();
	}
}
