import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public final class Class83 {

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "J")
	public final long aLong66;

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "Lclient!ep;")
	private final Class95_Sub1 aClass95_Sub1_11;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!ep;JI)V")
	public Class83(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong66 = arg1;
		this.aClass95_Sub1_11 = arg0;
	}

	@OriginalMember(owner = "client!ee", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass95_Sub1_11.method2061(this.aLong66);
		super.finalize();
	}
}
