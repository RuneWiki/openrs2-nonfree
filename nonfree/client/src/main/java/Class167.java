import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public final class Class167 {

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "Lclient!nm;")
	private final Class164_Sub1 aClass164_Sub1_31;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
	public final int anInt4134;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lclient!nm;II)V")
	public Class167(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass164_Sub1_31 = arg0;
		this.anInt4134 = arg1;
	}

	@OriginalMember(owner = "client!nr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass164_Sub1_31.method3625(this.anInt4134);
		super.finalize();
	}
}
