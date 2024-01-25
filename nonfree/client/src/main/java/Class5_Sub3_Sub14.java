import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class5_Sub3_Sub14 extends Class5_Sub3 {

	@OriginalMember(owner = "client!fp", name = "K", descriptor = "I")
	private int anInt3235;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(I)V")
	public Class5_Sub3_Sub14(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt3235 = 4096;
		this.anInt3235 = arg0;
	}

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub14() {
		this(4096);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3235 = (arg0.method7291() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			Static693.method8318(local17, 0, Static7.anInt102, this.anInt3235);
		}
		return local17;
	}
}
