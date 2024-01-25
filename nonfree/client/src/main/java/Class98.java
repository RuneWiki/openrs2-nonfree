import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public final class Class98 {

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "Lclient!sq;")
	private final Class46_Sub2 aClass46_Sub2_17;

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
	public final int anInt2949;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!sq;II)V")
	public Class98(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass46_Sub2_17 = arg0;
		this.anInt2949 = arg1;
	}

	@OriginalMember(owner = "client!iq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass46_Sub2_17.method5238(this.anInt2949);
		super.finalize();
	}
}
