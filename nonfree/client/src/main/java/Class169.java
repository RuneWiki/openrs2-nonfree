import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public final class Class169 {

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "Lclient!mm;")
	private final Class55_Sub1 aClass55_Sub1_36;

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
	public final int anInt5237;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!mm;II)V")
	public Class169(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass55_Sub1_36 = arg0;
		this.anInt5237 = arg1;
	}

	@OriginalMember(owner = "client!qn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass55_Sub1_36.method3705(this.anInt5237);
		super.finalize();
	}
}
