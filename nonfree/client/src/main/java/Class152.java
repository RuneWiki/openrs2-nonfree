import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public final class Class152 {

	@OriginalMember(owner = "client!hga", name = "j", descriptor = "Lclient!og;")
	private final Class143_Sub1_Sub2 aClass143_Sub1_Sub2_4;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "I")
	public final int anInt3503;

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(Lclient!og;II)V")
	public Class152(@OriginalArg(0) Class143_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass143_Sub1_Sub2_4 = arg0;
		this.anInt3503 = arg2;
	}

	@OriginalMember(owner = "client!hga", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass143_Sub1_Sub2_4.method6410(this.anInt3503);
		super.finalize();
	}
}
