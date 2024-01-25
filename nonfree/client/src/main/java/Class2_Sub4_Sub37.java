import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class2_Sub4_Sub37 extends Class2_Sub4 {

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			Static598.method4260(local14, 0, Static143.anInt7434, Static13.anIntArray418[arg0]);
		}
		return local14;
	}
}
