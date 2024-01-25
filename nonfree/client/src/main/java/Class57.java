import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public final class Class57 {

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "J")
	public final long aLong52;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "Lclient!lea;")
	private final Class101_Sub2 aClass101_Sub2_9;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!lea;JI)V")
	public Class57(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong52 = arg1;
		this.aClass101_Sub2_9 = arg0;
	}

	@OriginalMember(owner = "client!ck", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass101_Sub2_9.method5634(this.aLong52);
		super.finalize();
	}
}
