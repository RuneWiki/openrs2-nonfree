import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class8_Sub2_Sub6 extends Class8_Sub2 {

	@OriginalMember(owner = "client!cb", name = "H", descriptor = "I")
	private int anInt1931;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub6() {
		this(4096);
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(I)V")
	public Class8_Sub2_Sub6(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt1931 = 4096;
		this.anInt1931 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1931 = (arg1.method8525() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			Static649.method5534(local9, 0, Static538.anInt9297, this.anInt1931);
		}
		return local9;
	}
}
