import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public final class Class157 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "Lclient!er;")
	private final Class31_Sub2 aClass31_Sub2_19;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "J")
	public final long aLong116;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!er;JI)V")
	public Class157(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass31_Sub2_19 = arg0;
		this.aLong116 = arg1;
	}

	@OriginalMember(owner = "client!jf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass31_Sub2_19.method2562(this.aLong116);
		super.finalize();
	}
}
