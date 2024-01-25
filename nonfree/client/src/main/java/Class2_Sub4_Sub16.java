import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class2_Sub4_Sub16 extends Class2_Sub4 {

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			Static650.method2272(local9, 0, Static395.anInt6816, Static415.anIntArray482[arg0]);
		}
		return local9;
	}
}
