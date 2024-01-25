import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vga")
public final class Class5_Sub3_Sub36 extends Class5_Sub3 {

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			Static693.method8318(local19, 0, Static7.anInt102, Static458.anIntArray438[arg0]);
		}
		return local19;
	}
}
