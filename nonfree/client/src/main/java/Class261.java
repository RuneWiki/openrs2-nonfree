import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public final class Class261 {

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "Lclient!ck;")
	private final Class65_Sub1 aClass65_Sub1_22;

	@OriginalMember(owner = "client!oca", name = "e", descriptor = "I")
	public final int anInt7333;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(Lclient!ck;II)V")
	public Class261(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass65_Sub1_22 = arg0;
		this.anInt7333 = arg2;
	}

	@OriginalMember(owner = "client!oca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass65_Sub1_22.method1221(this.anInt7333);
		super.finalize();
	}
}
