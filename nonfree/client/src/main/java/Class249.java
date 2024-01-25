import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public final class Class249 {

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
	public final int anInt6550;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "Lclient!ih;")
	private final Class117_Sub1 aClass117_Sub1_40;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lclient!ih;II)V")
	public Class249(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6550 = arg2;
		this.aClass117_Sub1_40 = arg0;
	}

	@OriginalMember(owner = "client!ug", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass117_Sub1_40.method2457(this.anInt6550);
		super.finalize();
	}
}
