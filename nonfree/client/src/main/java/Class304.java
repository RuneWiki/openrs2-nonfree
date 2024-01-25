import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class Class304 {

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "Lclient!ad;")
	private final Class7_Sub1_Sub1 aClass7_Sub1_Sub1_9;

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "J")
	public final long aLong255;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!ad;JI)V")
	public Class304(@OriginalArg(0) Class7_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass7_Sub1_Sub1_9 = arg0;
		this.aLong255 = arg1;
	}

	@OriginalMember(owner = "client!sk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass7_Sub1_Sub1_9.method635(this.aLong255);
		super.finalize();
	}
}
