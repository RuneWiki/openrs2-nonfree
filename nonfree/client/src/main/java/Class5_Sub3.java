import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!faa")
public final class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!faa", name = "l", descriptor = "F")
	private float aFloat18 = 0.0F;

	@OriginalMember(owner = "client!faa", name = "n", descriptor = "Lclient!lj;")
	private final Class223 aClass223_1;

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Lclient!he;Lclient!lj;)V")
	public Class5_Sub3(@OriginalArg(0) Class144_Sub1 arg0, @OriginalArg(1) Class223 arg1) {
		super(arg0);
		this.aClass223_1 = arg1;
	}

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6867() {
		return this.aClass223_1.method5331();
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IILclient!vi;)V")
	@Override
	public void method6877(@OriginalArg(0) int arg0, @OriginalArg(2) Interface25 arg1) {
		super.aClass144_Sub1_20.method5643(arg1);
	}

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "(I)V")
	@Override
	public void method6865() {
		super.aClass144_Sub1_20.method5706(1);
		super.aClass144_Sub1_20.method5653(Static345.aClass287_2, Static345.aClass287_2);
		super.aClass144_Sub1_20.method5740(Static308.aClass138_4, 0);
		super.aClass144_Sub1_20.method5779(0, Static308.aClass138_4);
		super.aClass144_Sub1_20.method5721(1);
		super.aClass144_Sub1_20.method5643((Interface25) null);
		super.aClass144_Sub1_20.method5706(0);
		super.aClass144_Sub1_20.method5779(0, Static308.aClass138_4);
	}

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "(B)V")
	@Override
	public void method6872() {
		if (super.aClass144_Sub1_20.method5770() != 0) {
			return;
		}
		@Pc(15) Class263_Sub2 local15 = super.aClass144_Sub1_20.method5737();
		super.aClass144_Sub1_20.method5706(1);
		@Pc(27) Class263_Sub2 local27 = super.aClass144_Sub1_20.method5724();
		local27.method8437(local15);
		local27.method7284(1.0F, 0.125F, 0.125F);
		local27.method7280(this.aFloat18, 0.0F, 0.0F);
		super.aClass144_Sub1_20.method5750(Static323.aClass199_7);
		super.aClass144_Sub1_20.method5706(0);
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6873(@OriginalArg(1) boolean arg0) {
		super.aClass144_Sub1_20.method5706(1);
		super.aClass144_Sub1_20.method5653(Static284.aClass287_1, Static408.aClass287_3);
		super.aClass144_Sub1_20.method5775(0, Static308.aClass138_4, true, false);
		super.aClass144_Sub1_20.method5779(0, Static225.aClass138_3);
		super.aClass144_Sub1_20.method5721(0);
		super.aClass144_Sub1_20.method5706(0);
		super.aClass144_Sub1_20.method5655(-16777216);
		super.aClass144_Sub1_20.method5779(0, Static216.aClass138_5);
		this.method6872();
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6878(@OriginalArg(0) boolean arg0) {
		super.aClass144_Sub1_20.method5653(Static284.aClass287_1, Static345.aClass287_2);
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6864(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.aClass144_Sub1_20.method5706(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass144_Sub1_20.method5643((Interface25) null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass223_1.aBoolean423) {
				this.aFloat18 = (float) (super.aClass144_Sub1_20.anInt6502 % 4000) / 4000.0F;
				super.aClass144_Sub1_20.method5643(this.aClass223_1.anInterface18_1);
			} else {
				@Pc(58) int local58 = super.aClass144_Sub1_20.anInt6502 % 4000 * 16 / 4000;
				super.aClass144_Sub1_20.method5643(this.aClass223_1.anInterface9Array2[local58]);
			}
		} else if (this.aClass223_1.aBoolean423) {
			super.aClass144_Sub1_20.method5643(this.aClass223_1.anInterface18_1);
		} else {
			super.aClass144_Sub1_20.method5643(this.aClass223_1.anInterface9Array2[0]);
		}
		super.aClass144_Sub1_20.method5706(0);
	}
}
