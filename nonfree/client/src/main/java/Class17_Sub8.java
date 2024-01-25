import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class17_Sub8 extends Class17 {

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "Z")
	private boolean aBoolean484 = false;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!wga;)V")
	public Class17_Sub8(@OriginalArg(0) Class20_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!du;I)V")
	@Override
	public void method8064(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
		super.aClass20_Sub2_22.method1484(arg1);
		super.aClass20_Sub2_22.method1557(arg0);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8062(@OriginalArg(1) boolean arg0) {
		@Pc(8) Interface19 local8 = super.aClass20_Sub2_22.method1468();
		if (local8 == null || !arg0) {
			super.aClass20_Sub2_22.method1519(0, Static360.aClass177_5);
			return;
		}
		super.aClass20_Sub2_22.method1531(1);
		super.aClass20_Sub2_22.method1484(local8);
		super.aClass20_Sub2_22.method1505(Static570.aClass31_4);
		super.aClass20_Sub2_22.method1531(1);
		super.aClass20_Sub2_22.method1508(Static492.aClass315_4, Static542.aClass315_5);
		super.aClass20_Sub2_22.method1558(true, 2, Static154.aClass177_4, false);
		super.aClass20_Sub2_22.method1519(0, Static360.aClass177_5);
		@Pc(67) Class30_Sub2 local67 = super.aClass20_Sub2_22.method1454();
		local67.method4046(super.aClass20_Sub2_22.method1488());
		super.aClass20_Sub2_22.method1487(Static155.aClass332_2);
		super.aClass20_Sub2_22.method1531(0);
		this.aBoolean484 = true;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	@Override
	public void method8057() {
		if (this.aBoolean484) {
			super.aClass20_Sub2_22.method1531(1);
			super.aClass20_Sub2_22.method1505(Static398.aClass31_3);
			super.aClass20_Sub2_22.method1508(Static425.aClass315_3, Static425.aClass315_3);
			super.aClass20_Sub2_22.method1483(2, Static165.aClass177_3);
			super.aClass20_Sub2_22.method1519(0, Static118.aClass177_1);
			super.aClass20_Sub2_22.method1513();
			super.aClass20_Sub2_22.method1484(null);
			super.aClass20_Sub2_22.method1531(0);
			this.aBoolean484 = false;
		} else {
			super.aClass20_Sub2_22.method1519(0, Static118.aClass177_1);
		}
		super.aClass20_Sub2_22.method1508(Static425.aClass315_3, Static425.aClass315_3);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V")
	@Override
	public void method8063(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8067() {
		return true;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8058(@OriginalArg(0) boolean arg0) {
		super.aClass20_Sub2_22.method1508(Static492.aClass315_4, Static425.aClass315_3);
	}
}
