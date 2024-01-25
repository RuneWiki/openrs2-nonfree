import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public final class Class200 {

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "Lclient!ap;")
	private final Class9_Sub2 aClass9_Sub2_20;

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "J")
	public final long aLong136;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lclient!ap;J[Lclient!dl;)V")
	public Class200(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class72[] arg2) {
		this.aClass9_Sub2_20 = arg0;
		this.aLong136 = arg1;
	}

	@OriginalMember(owner = "client!lj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass9_Sub2_20.method752(this.aLong136);
		super.finalize();
	}
}
