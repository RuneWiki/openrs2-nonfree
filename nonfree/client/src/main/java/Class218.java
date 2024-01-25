import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public final class Class218 {

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "Lclient!ac;")
	private final Class5_Sub1 aClass5_Sub1_25;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
	public final int anInt7061;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!ac;II)V")
	public Class218(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass5_Sub1_25 = arg0;
		this.anInt7061 = arg2;
	}

	@OriginalMember(owner = "client!ne", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass5_Sub1_25.method361(this.anInt7061);
		super.finalize();
	}
}
