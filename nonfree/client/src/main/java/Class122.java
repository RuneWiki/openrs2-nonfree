import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public final class Class122 {

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "Lclient!aq;")
	private final Class22_Sub1 aClass22_Sub1_12;

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "J")
	public final long aLong126;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lclient!aq;J[Lclient!rka;)V")
	public Class122(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class328[] arg2) {
		this.aClass22_Sub1_12 = arg0;
		this.aLong126 = arg1;
	}

	@OriginalMember(owner = "client!fp", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass22_Sub1_12.method947(this.aLong126);
		super.finalize();
	}
}
