import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public final class Class206 {

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "J")
	public final long aLong161;

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "Lclient!laa;")
	private final Class126_Sub2_Sub1 aClass126_Sub2_Sub1_7;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lclient!laa;JI)V")
	public Class206(@OriginalArg(0) Class126_Sub2_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong161 = arg1;
		this.aClass126_Sub2_Sub1_7 = arg0;
	}

	@OriginalMember(owner = "client!lf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass126_Sub2_Sub1_7.method4917(this.aLong161);
		super.finalize();
	}
}
