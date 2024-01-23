import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class8_Sub3_Sub33 extends Class8_Sub3 {

	@OriginalMember(owner = "client!qi", name = "R", descriptor = "I")
	private int anInt4462;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub33() {
		this(4096);
	}

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(I)V")
	private Class8_Sub3_Sub33(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt4462 = 4096;
		this.anInt4462 = arg0;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			Static301.method500(local15, 0, Static239.anInt4789, this.anInt4462);
		}
		return local15;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt4462 = (arg1.method2334() << 12) / 255;
		}
	}
}
