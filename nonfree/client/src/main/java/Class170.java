import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public final class Class170 {

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "Lclient!ks;")
	private final Class63_Sub1 aClass63_Sub1_35;

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
	public final int anInt5176;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lclient!ks;II)V")
	public Class170(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass63_Sub1_35 = arg0;
		this.anInt5176 = arg1;
	}

	@OriginalMember(owner = "client!qg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass63_Sub1_35.method3348(this.anInt5176);
		super.finalize();
	}
}
