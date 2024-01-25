import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public final class Class21 {

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "Lclient!tk;")
	private final Class13_Sub3_Sub1 aClass13_Sub3_Sub1_1;

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
	public final int anInt471;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!tk;II)V")
	public Class21(@OriginalArg(0) Class13_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass13_Sub3_Sub1_1 = arg0;
		this.anInt471 = arg2;
	}

	@OriginalMember(owner = "client!ap", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass13_Sub3_Sub1_1.method7814(this.anInt471);
		super.finalize();
	}
}
