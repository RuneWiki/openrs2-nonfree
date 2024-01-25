import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class4_Sub2_Sub22 extends Class4_Sub2 {

	@OriginalMember(owner = "client!pp", name = "M", descriptor = "I")
	private int anInt7478;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(I)V")
	public Class4_Sub2_Sub22(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt7478 = 4096;
		this.anInt7478 = arg0;
	}

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub22() {
		this(4096);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt7478 = (arg1.method8865() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			Static685.method6467(local9, 0, Static269.anInt4330, this.anInt7478);
		}
		return local9;
	}
}
