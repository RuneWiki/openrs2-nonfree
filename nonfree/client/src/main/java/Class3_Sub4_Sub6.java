import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class3_Sub4_Sub6 extends Class3_Sub4 {

	@OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
	private int anInt1264;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub6() {
		this(4096);
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(I)V")
	public Class3_Sub4_Sub6(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt1264 = 4096;
		this.anInt1264 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			Static466.method206(local17, 0, Static148.anInt2687, this.anInt1264);
		}
		return local17;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1264 = (arg0.method4096() << 12) / 255;
		}
	}
}
