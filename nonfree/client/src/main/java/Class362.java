import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public final class Class362 {

	@OriginalMember(owner = "client!ut", name = "f", descriptor = "Lclient!og;")
	private final Class143_Sub1_Sub2 aClass143_Sub1_Sub2_12;

	@OriginalMember(owner = "client!ut", name = "e", descriptor = "J")
	public final long aLong302;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!og;JI)V")
	public Class362(@OriginalArg(0) Class143_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass143_Sub1_Sub2_12 = arg0;
		this.aLong302 = arg1;
	}

	@OriginalMember(owner = "client!ut", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass143_Sub1_Sub2_12.method6409(this.aLong302);
		super.finalize();
	}
}
