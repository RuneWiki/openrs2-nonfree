import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class3_Sub2_Sub33 extends Class3_Sub2 {

	@OriginalMember(owner = "client!sr", name = "O", descriptor = "I")
	private int anInt6342;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(I)V")
	public Class3_Sub2_Sub33(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt6342 = 4096;
		this.anInt6342 = arg0;
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub33() {
		this(4096);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass62_41.method1670(arg0);
		if (super.aClass62_41.aBoolean169) {
			Static462.method4617(local9, 0, Static406.anInt6694, this.anInt6342);
		}
		return local9;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6342 = (arg0.method2582() << 12) / 255;
		}
	}
}
