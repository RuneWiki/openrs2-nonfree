import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rka")
public final class Class328 {

	@OriginalMember(owner = "client!rka", name = "a", descriptor = "J")
	public final long aLong291;

	@OriginalMember(owner = "client!rka", name = "f", descriptor = "Lclient!aq;")
	private final Class22_Sub1 aClass22_Sub1_34;

	@OriginalMember(owner = "client!rka", name = "<init>", descriptor = "(Lclient!aq;JI)V")
	public Class328(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong291 = arg1;
		this.aClass22_Sub1_34 = arg0;
	}

	@OriginalMember(owner = "client!rka", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass22_Sub1_34.method947(this.aLong291);
		super.finalize();
	}
}
