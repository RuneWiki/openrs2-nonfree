import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class8_Sub3_Sub29 extends Class8_Sub3 {

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(10) int[] local10 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			Static301.method500(local10, 0, Static239.anInt4789, Static33.anIntArray50[arg0]);
		}
		return local10;
	}
}
