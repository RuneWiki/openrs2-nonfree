import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public final class Class84 {

	@OriginalMember(owner = "client!de", name = "c", descriptor = "I")
	public final int anInt1604;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "Lclient!rda;")
	private final Class57_Sub3_Sub1 aClass57_Sub3_Sub1_4;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lclient!rda;II)V")
	public Class84(@OriginalArg(0) Class57_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1604 = arg2;
		this.aClass57_Sub3_Sub1_4 = arg0;
	}

	@OriginalMember(owner = "client!de", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass57_Sub3_Sub1_4.method7399(this.anInt1604);
		super.finalize();
	}
}
