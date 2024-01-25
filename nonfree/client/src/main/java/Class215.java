import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public final class Class215 {

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "Lclient!tm;")
	private final Class4_Sub2_Sub2 aClass4_Sub2_Sub2_7;

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
	public final int anInt6345;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!tm;II)V")
	public Class215(@OriginalArg(0) Class4_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass4_Sub2_Sub2_7 = arg0;
		this.anInt6345 = arg2;
	}

	@OriginalMember(owner = "client!oi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass4_Sub2_Sub2_7.method7366(this.anInt6345);
		super.finalize();
	}
}
