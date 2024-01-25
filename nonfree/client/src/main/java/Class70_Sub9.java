import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class70_Sub9 extends Class70 {

	@OriginalMember(owner = "client!wi", name = "v", descriptor = "Z")
	private boolean aBoolean657 = false;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!nd;)V")
	public Class70_Sub9(@OriginalArg(0) Class62_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7311(@OriginalArg(0) boolean arg0) {
		@Pc(17) Interface15 local17 = super.aClass62_Sub1_20.method4737();
		if (local17 == null || !arg0) {
			super.aClass62_Sub1_20.method4661(Static44.aClass63_2, 0);
			return;
		}
		super.aClass62_Sub1_20.method4785(1);
		super.aClass62_Sub1_20.method4676(local17);
		super.aClass62_Sub1_20.method4694(Static276.aClass206_3);
		super.aClass62_Sub1_20.method4785(1);
		super.aClass62_Sub1_20.method4685(Static395.aClass98_5, Static148.aClass98_1);
		super.aClass62_Sub1_20.method4732(false, true, Static233.aClass63_5, 2);
		super.aClass62_Sub1_20.method4661(Static44.aClass63_2, 0);
		@Pc(68) Class78_Sub1 local68 = super.aClass62_Sub1_20.method4705();
		local68.method2191(super.aClass62_Sub1_20.method4765());
		super.aClass62_Sub1_20.method4741(Static203.aClass273_2);
		super.aClass62_Sub1_20.method4785(0);
		this.aBoolean657 = true;
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V")
	@Override
	public void method7306() {
		if (this.aBoolean657) {
			super.aClass62_Sub1_20.method4785(1);
			super.aClass62_Sub1_20.method4694(Static77.aClass206_4);
			super.aClass62_Sub1_20.method4685(Static165.aClass98_2, Static165.aClass98_2);
			super.aClass62_Sub1_20.method4715(Static429.aClass63_6, 2);
			super.aClass62_Sub1_20.method4661(Static24.aClass63_4, 0);
			super.aClass62_Sub1_20.method4757();
			super.aClass62_Sub1_20.method4676(null);
			super.aClass62_Sub1_20.method4785(0);
			this.aBoolean657 = false;
		} else {
			super.aClass62_Sub1_20.method4661(Static24.aClass63_4, 0);
		}
		super.aClass62_Sub1_20.method4685(Static165.aClass98_2, Static165.aClass98_2);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7301() {
		return true;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IILclient!qv;)V")
	@Override
	public void method7313(@OriginalArg(1) int arg0, @OriginalArg(2) Interface12 arg1) {
		super.aClass62_Sub1_20.method4676(arg1);
		super.aClass62_Sub1_20.method4714(arg0);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZII)V")
	@Override
	public void method7300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7303(@OriginalArg(0) boolean arg0) {
		super.aClass62_Sub1_20.method4685(Static165.aClass98_2, Static148.aClass98_1);
	}
}
