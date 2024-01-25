import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public final class Class286 {

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
	public final int anInt8415;

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "Lclient!hl;")
	private final Class5_Sub2_Sub2 aClass5_Sub2_Sub2_8;

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lclient!hl;II)V")
	public Class286(@OriginalArg(0) Class5_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8415 = arg2;
		this.aClass5_Sub2_Sub2_8 = arg0;
	}

	@OriginalMember(owner = "client!qv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass5_Sub2_Sub2_8.method4075(this.anInt8415);
		super.finalize();
	}
}
