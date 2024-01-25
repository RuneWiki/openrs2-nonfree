import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class5_Sub2_Sub38 extends Class5_Sub2 {

	@OriginalMember(owner = "client!wp", name = "G", descriptor = "I")
	private int anInt10591;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(I)V")
	public Class5_Sub2_Sub38(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt10591 = 4096;
		this.anInt10591 = arg0;
	}

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub38() {
		this(4096);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt10591 = (arg0.method5966() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			Static652.method4544(local11, 0, Static597.anInt10025, this.anInt10591);
		}
		return local11;
	}
}
