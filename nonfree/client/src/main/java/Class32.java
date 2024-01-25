import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public final class Class32 {

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "Lclient!ef;")
	private final Class49_Sub2 aClass49_Sub2_3;

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "J")
	public final long aLong35;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lclient!ef;J[Lclient!ji;)V")
	public Class32(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class130[] arg2) {
		this.aClass49_Sub2_3 = arg0;
		this.aLong35 = arg1;
	}

	@OriginalMember(owner = "client!bt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass49_Sub2_3.method1658(this.aLong35);
		super.finalize();
	}
}
