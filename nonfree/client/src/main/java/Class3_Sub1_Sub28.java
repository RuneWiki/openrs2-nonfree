import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class3_Sub1_Sub28 extends Class3_Sub1 {

	@OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
	private int anInt7843;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub28() {
		this(4096);
	}

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(I)V")
	public Class3_Sub1_Sub28(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt7843 = 4096;
		this.anInt7843 = arg0;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt7843 = (arg1.method6538() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			Static602.method4663(local9, 0, Static131.anInt2935, this.anInt7843);
		}
		return local9;
	}
}
