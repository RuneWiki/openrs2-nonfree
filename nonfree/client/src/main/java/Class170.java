import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public final class Class170 {

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "Lclient!ql;")
	private final Class92_Sub2 aClass92_Sub2_33;

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
	public final int anInt5424;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!ql;II)V")
	public Class170(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass92_Sub2_33 = arg0;
		this.anInt5424 = arg2;
	}

	@OriginalMember(owner = "client!qn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass92_Sub2_33.method4603(this.anInt5424);
		super.finalize();
	}
}
