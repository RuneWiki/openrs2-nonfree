import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public final class Class67 {

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "Lclient!bea;")
	private final Class31_Sub1_Sub1 aClass31_Sub1_Sub1_5;

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "J")
	public final long aLong40;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!bea;JI)V")
	public Class67(@OriginalArg(0) Class31_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass31_Sub1_Sub1_5 = arg0;
		this.aLong40 = arg1;
	}

	@OriginalMember(owner = "client!dg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass31_Sub1_Sub1_5.method1016(this.aLong40);
		super.finalize();
	}
}
