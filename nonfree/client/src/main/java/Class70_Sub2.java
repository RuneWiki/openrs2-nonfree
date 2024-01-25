import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class70_Sub2 extends Class70 {

	@OriginalMember(owner = "client!et", name = "C", descriptor = "F")
	private float aFloat138 = 0.0F;

	@OriginalMember(owner = "client!et", name = "q", descriptor = "Lclient!om;")
	private final Class222 aClass222_3;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!nd;Lclient!om;)V")
	public Class70_Sub2(@OriginalArg(0) Class62_Sub1 arg0, @OriginalArg(1) Class222 arg1) {
		super(arg0);
		this.aClass222_3 = arg1;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7311(@OriginalArg(0) boolean arg0) {
		super.aClass62_Sub1_20.method4785(1);
		super.aClass62_Sub1_20.method4685(Static344.aClass98_4, Static148.aClass98_1);
		super.aClass62_Sub1_20.method4732(false, true, Static24.aClass63_4, 0);
		super.aClass62_Sub1_20.method4661(Static233.aClass63_5, 0);
		super.aClass62_Sub1_20.method4700(0);
		super.aClass62_Sub1_20.method4785(0);
		super.aClass62_Sub1_20.method4671(-16777216);
		super.aClass62_Sub1_20.method4661(Static429.aClass63_6, 0);
		this.method7307();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7301() {
		return this.aClass222_3.method5524();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ZII)V")
	@Override
	public void method7300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.aClass62_Sub1_20.method4785(1);
		if ((arg1 & 0x80) != 0) {
			super.aClass62_Sub1_20.method4676(null);
		} else if ((arg0 & 0x1) == 1) {
			if (this.aClass222_3.aBoolean476) {
				this.aFloat138 = (float) (super.aClass62_Sub1_20.anInt5698 % 4000) / 4000.0F;
				super.aClass62_Sub1_20.method4676(this.aClass222_3.anInterface17_1);
			} else {
				@Pc(40) int local40 = super.aClass62_Sub1_20.anInt5698 % 4000 * 16 / 4000;
				super.aClass62_Sub1_20.method4676(this.aClass222_3.anInterface3Array2[local40]);
			}
		} else if (this.aClass222_3.aBoolean476) {
			super.aClass62_Sub1_20.method4676(this.aClass222_3.anInterface17_1);
		} else {
			super.aClass62_Sub1_20.method4676(this.aClass222_3.anInterface3Array2[0]);
		}
		super.aClass62_Sub1_20.method4785(0);
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(B)V")
	@Override
	public void method7306() {
		super.aClass62_Sub1_20.method4785(1);
		super.aClass62_Sub1_20.method4685(Static165.aClass98_2, Static165.aClass98_2);
		super.aClass62_Sub1_20.method4715(Static24.aClass63_4, 0);
		super.aClass62_Sub1_20.method4661(Static24.aClass63_4, 0);
		super.aClass62_Sub1_20.method4700(1);
		super.aClass62_Sub1_20.method4676(null);
		super.aClass62_Sub1_20.method4785(0);
		super.aClass62_Sub1_20.method4661(Static24.aClass63_4, 0);
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(I)V")
	@Override
	public void method7307() {
		if (super.aClass62_Sub1_20.method4781() != 0) {
			return;
		}
		@Pc(12) Class78_Sub1 local12 = super.aClass62_Sub1_20.method4764();
		super.aClass62_Sub1_20.method4785(1);
		@Pc(22) Class78_Sub1 local22 = super.aClass62_Sub1_20.method4705();
		local22.EA(local12);
		local22.method2188(0.125F, 0.125F, 1.0F);
		local22.method2192(0.0F, 0.0F, this.aFloat138);
		super.aClass62_Sub1_20.method4741(Static274.aClass273_5);
		super.aClass62_Sub1_20.method4785(0);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IILclient!qv;)V")
	@Override
	public void method7313(@OriginalArg(1) int arg0, @OriginalArg(2) Interface12 arg1) {
		super.aClass62_Sub1_20.method4676(arg1);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7303(@OriginalArg(0) boolean arg0) {
		super.aClass62_Sub1_20.method4685(Static165.aClass98_2, Static148.aClass98_1);
	}
}
