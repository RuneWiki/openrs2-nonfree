import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class2_Sub2_Sub38 extends Class2_Sub2 {

	@OriginalMember(owner = "client!wh", name = "K", descriptor = "I")
	private int anInt9504;

	@OriginalMember(owner = "client!wh", name = "L", descriptor = "I")
	private int anInt9505;

	@OriginalMember(owner = "client!wh", name = "M", descriptor = "I")
	private int anInt9506;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub38() {
		this(0);
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(I)V")
	private Class2_Sub2_Sub38(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method7904(arg0);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)V")
	private void method7904(@OriginalArg(0) int arg0) {
		this.anInt9505 = (arg0 & 0xFF) << 4;
		this.anInt9506 = arg0 >> 4 & 0xFF0;
		this.anInt9504 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method7904(arg0.method4341());
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7946(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass314_41.method7006(arg0);
		if (super.aClass314_41.aBoolean653) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static153.anInt3070; local34++) {
				local24[local34] = this.anInt9504;
				local28[local34] = this.anInt9506;
				local32[local34] = this.anInt9505;
			}
		}
		return local11;
	}
}
