import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public final class Class261 {

	@OriginalMember(owner = "client!os", name = "d", descriptor = "J")
	public final long aLong221;

	@OriginalMember(owner = "client!os", name = "g", descriptor = "Lclient!pa;")
	private final Class13_Sub1_Sub1 aClass13_Sub1_Sub1_8;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lclient!pa;J[Lclient!qea;)V")
	public Class261(@OriginalArg(0) Class13_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class281[] arg2) {
		this.aLong221 = arg1;
		this.aClass13_Sub1_Sub1_8 = arg0;
	}

	@OriginalMember(owner = "client!os", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass13_Sub1_Sub1_8.method6535(this.aLong221);
		super.finalize();
	}
}
