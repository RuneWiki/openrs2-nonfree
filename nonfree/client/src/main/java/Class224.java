import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public final class Class224 {

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "Lclient!sha;")
	private final Class95_Sub1_Sub1 aClass95_Sub1_Sub1_7;

	@OriginalMember(owner = "client!mca", name = "i", descriptor = "J")
	public final long aLong168;

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(Lclient!sha;JI)V")
	public Class224(@OriginalArg(0) Class95_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass95_Sub1_Sub1_7 = arg0;
		this.aLong168 = arg1;
	}

	@OriginalMember(owner = "client!mca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass95_Sub1_Sub1_7.method7306(this.aLong168);
		super.finalize();
	}
}
