import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public final class Class18 {

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "I")
	public final int anInt411;

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "Lclient!na;")
	private final Class75_Sub2 aClass75_Sub2_1;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!na;II)V")
	public Class18(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt411 = arg2;
		this.aClass75_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!aw", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass75_Sub2_1.method3868(this.anInt411);
		super.finalize();
	}
}
