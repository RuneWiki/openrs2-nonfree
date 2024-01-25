import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class3_Sub2_Sub14 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ho", name = "G", descriptor = "I")
	private int anInt5030;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(I)V")
	public Class3_Sub2_Sub14(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt5030 = 4096;
		this.anInt5030 = arg0;
	}

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub14() {
		this(4096);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IBLclient!tn;)V")
	@Override
	public void method8335(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt5030 = (arg1.method8401() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8336(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass330_41.method7983(arg0);
		if (super.aClass330_41.aBoolean806) {
			Static655.method6405(local9, 0, Static164.anInt8839, this.anInt5030);
		}
		return local9;
	}
}
