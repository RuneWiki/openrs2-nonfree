import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public final class Class12 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "J")
	public final long aLong4;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "Lclient!hk;")
	private final Class16_Sub2 aClass16_Sub2_1;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!hk;J[Lclient!hv;)V")
	public Class12(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class166[] arg2) {
		this.aLong4 = arg1;
		this.aClass16_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!ag", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass16_Sub2_1.method3679(this.aLong4);
		super.finalize();
	}
}
