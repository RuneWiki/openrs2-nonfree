import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class92_Sub8 extends Class92 {

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "F")
	private float aFloat179 = 0.0F;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "Lclient!rba;")
	private final Class269 aClass269_4;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!sv;Lclient!rba;)V")
	public Class92_Sub8(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) Class269 arg1) {
		super(arg0);
		this.aClass269_4 = arg1;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(ZI)V")
	@Override
	public void method7756(@OriginalArg(0) boolean arg0) {
		super.aClass121_Sub2_20.method7198(Static526.aClass59_4, Static241.aClass59_1);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
	@Override
	public void method7751(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.aClass121_Sub2_20.method7245(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass121_Sub2_20.method7167(null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass269_4.aBoolean523) {
				this.aFloat179 = (float) (super.aClass121_Sub2_20.anInt8920 % 4000) / 4000.0F;
				super.aClass121_Sub2_20.method7167(this.aClass269_4.anInterface12_1);
			} else {
				@Pc(70) int local70 = super.aClass121_Sub2_20.anInt8920 % 4000 * 16 / 4000;
				super.aClass121_Sub2_20.method7167(this.aClass269_4.anInterface20Array2[local70]);
			}
		} else if (this.aClass269_4.aBoolean523) {
			super.aClass121_Sub2_20.method7167(this.aClass269_4.anInterface12_1);
		} else {
			super.aClass121_Sub2_20.method7167(this.aClass269_4.anInterface20Array2[0]);
		}
		super.aClass121_Sub2_20.method7245(0);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7749(@OriginalArg(0) boolean arg0) {
		super.aClass121_Sub2_20.method7245(1);
		super.aClass121_Sub2_20.method7198(Static526.aClass59_4, Static570.aClass59_5);
		super.aClass121_Sub2_20.method7282(true, 0, false, Static67.aClass305_1);
		super.aClass121_Sub2_20.method7195(Static197.aClass305_3, 0);
		super.aClass121_Sub2_20.method7265(0);
		super.aClass121_Sub2_20.method7245(0);
		super.aClass121_Sub2_20.method7166(-16777216);
		super.aClass121_Sub2_20.method7195(Static257.aClass305_4, 0);
		this.method7746();
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method7758() {
		return this.aClass269_4.method6276();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILclient!aw;)V")
	@Override
	public void method7754(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1) {
		super.aClass121_Sub2_20.method7167(arg1);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	@Override
	public void method7746() {
		if (super.aClass121_Sub2_20.method7253() != 0) {
			return;
		}
		@Pc(9) Class34_Sub3 local9 = super.aClass121_Sub2_20.method7284();
		super.aClass121_Sub2_20.method7245(1);
		@Pc(19) Class34_Sub3 local19 = super.aClass121_Sub2_20.method7261();
		local19.la(local9);
		local19.method3769(0.125F, 1.0F, 0.125F);
		local19.method3764(0.0F, 0.0F, this.aFloat179);
		super.aClass121_Sub2_20.method7181(Static360.aClass168_5);
		super.aClass121_Sub2_20.method7245(0);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	@Override
	public void method7748() {
		super.aClass121_Sub2_20.method7245(1);
		super.aClass121_Sub2_20.method7198(Static241.aClass59_1, Static241.aClass59_1);
		super.aClass121_Sub2_20.method7270(Static67.aClass305_1, 0);
		super.aClass121_Sub2_20.method7195(Static67.aClass305_1, 0);
		super.aClass121_Sub2_20.method7265(1);
		super.aClass121_Sub2_20.method7167(null);
		super.aClass121_Sub2_20.method7245(0);
		super.aClass121_Sub2_20.method7195(Static67.aClass305_1, 0);
	}
}
