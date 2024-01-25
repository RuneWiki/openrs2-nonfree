import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public final class Class281 {

	@OriginalMember(owner = "client!qea", name = "c", descriptor = "Lclient!pa;")
	private final Class13_Sub1_Sub1 aClass13_Sub1_Sub1_9;

	@OriginalMember(owner = "client!qea", name = "h", descriptor = "J")
	public final long aLong241;

	@OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(Lclient!pa;JI)V")
	public Class281(@OriginalArg(0) Class13_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass13_Sub1_Sub1_9 = arg0;
		this.aLong241 = arg1;
	}

	@OriginalMember(owner = "client!qea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass13_Sub1_Sub1_9.method6535(this.aLong241);
		super.finalize();
	}
}
