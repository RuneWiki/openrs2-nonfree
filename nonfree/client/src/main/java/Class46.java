import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class46 {

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "J")
	public final long aLong37;

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "Lclient!lm;")
	private final Class100_Sub1_Sub2 aClass100_Sub1_Sub2_3;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!lm;JI)V")
	public Class46(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong37 = arg1;
		this.aClass100_Sub1_Sub2_3 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass100_Sub1_Sub2_3.method4886(this.aLong37);
		super.finalize();
	}
}
