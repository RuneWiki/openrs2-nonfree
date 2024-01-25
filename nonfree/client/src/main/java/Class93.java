import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public final class Class93 {

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "Lclient!hj;")
	private final Class2_Sub1 aClass2_Sub1_19;

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
	public final int anInt2708;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!hj;II)V")
	public Class93(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub1_19 = arg0;
		this.anInt2708 = arg2;
	}

	@OriginalMember(owner = "client!ii", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass2_Sub1_19.method2321(this.anInt2708);
		super.finalize();
	}
}
