import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public final class Class362 {

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
	public final int anInt9603;

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "Lclient!hp;")
	private final Class134_Sub1_Sub1 aClass134_Sub1_Sub1_12;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!hp;II)V")
	public Class362(@OriginalArg(0) Class134_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9603 = arg2;
		this.aClass134_Sub1_Sub1_12 = arg0;
	}

	@OriginalMember(owner = "client!wq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass134_Sub1_Sub1_12.method3210(this.anInt9603);
		super.finalize();
	}
}
