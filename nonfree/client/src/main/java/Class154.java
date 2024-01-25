import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public final class Class154 {

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "Lclient!lea;")
	private final Class101_Sub2 aClass101_Sub2_15;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
	public final int anInt4716;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lclient!lea;II)V")
	public Class154(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass101_Sub2_15 = arg0;
		this.anInt4716 = arg2;
	}

	@OriginalMember(owner = "client!hu", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass101_Sub2_15.method5682(this.anInt4716);
		super.finalize();
	}
}
