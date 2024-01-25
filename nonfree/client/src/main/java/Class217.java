import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public final class Class217 {

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "J")
	public final long aLong255;

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "Lclient!qi;")
	private final Class12_Sub2_Sub2 aClass12_Sub2_Sub2_7;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!qi;JI)V")
	public Class217(@OriginalArg(0) Class12_Sub2_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong255 = arg1;
		this.aClass12_Sub2_Sub2_7 = arg0;
	}

	@OriginalMember(owner = "client!mn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass12_Sub2_Sub2_7.method6294(this.aLong255);
		super.finalize();
	}
}
