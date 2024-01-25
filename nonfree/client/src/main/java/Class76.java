import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public final class Class76 {

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "Lclient!fu;")
	private final Class63_Sub2 aClass63_Sub2_16;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
	public final int anInt2061;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!fu;II)V")
	public Class76(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass63_Sub2_16 = arg0;
		this.anInt2061 = arg1;
	}

	@OriginalMember(owner = "client!fs", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass63_Sub2_16.method2094(this.anInt2061);
		super.finalize();
	}
}
