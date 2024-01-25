import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public final class Class23 {

	@OriginalMember(owner = "client!av", name = "d", descriptor = "J")
	public final long aLong15;

	@OriginalMember(owner = "client!av", name = "e", descriptor = "Lclient!dda;")
	private final Class44_Sub2_Sub1 aClass44_Sub2_Sub1_1;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lclient!dda;JI)V")
	public Class23(@OriginalArg(0) Class44_Sub2_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong15 = arg1;
		this.aClass44_Sub2_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!av", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass44_Sub2_Sub1_1.method2019(this.aLong15);
		super.finalize();
	}
}
