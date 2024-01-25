import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public final class Class170 {

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "Lclient!nf;")
	private final Class105_Sub1 aClass105_Sub1_33;

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
	public final int anInt5161;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!nf;II)V")
	public Class170(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass105_Sub1_33 = arg0;
		this.anInt5161 = arg2;
	}

	@OriginalMember(owner = "client!qm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass105_Sub1_33.method3595(this.anInt5161);
		super.finalize();
	}
}
