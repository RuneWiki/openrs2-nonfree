import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class34_Sub5 extends Class34 {

	@OriginalMember(owner = "client!ji", name = "s", descriptor = "F")
	private float aFloat125 = 0.0F;

	@OriginalMember(owner = "client!ji", name = "z", descriptor = "Lclient!gb;")
	private final Class120 aClass120_5;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!um;Lclient!gb;)V")
	public Class34_Sub5(@OriginalArg(0) Class162_Sub1 arg0, @OriginalArg(1) Class120 arg1) {
		super(arg0);
		this.aClass120_5 = arg1;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILclient!qda;I)V")
	@Override
	public void method7363(@OriginalArg(1) Interface20 arg0, @OriginalArg(2) int arg1) {
		super.aClass162_Sub1_23.method3865(arg0);
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7362() {
		return this.aClass120_5.method2152();
	}

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V")
	@Override
	public void method7364() {
		if (super.aClass162_Sub1_23.method3848() != 0) {
			return;
		}
		@Pc(24) Class25_Sub2 local24 = super.aClass162_Sub1_23.method3956();
		super.aClass162_Sub1_23.method3926(1);
		@Pc(34) Class25_Sub2 local34 = super.aClass162_Sub1_23.method3899();
		local34.M(local24);
		local34.method2714(0.125F, 0.125F, 1.0F);
		local34.method2699(this.aFloat125, 0.0F, 0.0F);
		super.aClass162_Sub1_23.method3919(Static14.aClass348_3);
		super.aClass162_Sub1_23.method3926(0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.aClass162_Sub1_23.method3926(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass162_Sub1_23.method3865(null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass120_5.aBoolean180) {
				this.aFloat125 = (float) (super.aClass162_Sub1_23.anInt4612 % 4000) / 4000.0F;
				super.aClass162_Sub1_23.method3865(this.aClass120_5.anInterface15_1);
			} else {
				@Pc(66) int local66 = super.aClass162_Sub1_23.anInt4612 % 4000 * 16 / 4000;
				super.aClass162_Sub1_23.method3865(this.aClass120_5.anInterface11Array1[local66]);
			}
		} else if (this.aClass120_5.aBoolean180) {
			super.aClass162_Sub1_23.method3865(this.aClass120_5.anInterface15_1);
		} else {
			super.aClass162_Sub1_23.method3865(this.aClass120_5.anInterface11Array1[0]);
		}
		super.aClass162_Sub1_23.method3926(0);
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
	@Override
	public void method7357() {
		super.aClass162_Sub1_23.method3926(1);
		super.aClass162_Sub1_23.method3867(Static460.aClass247_4, Static460.aClass247_4);
		super.aClass162_Sub1_23.method3885(Static191.aClass263_2, 0);
		super.aClass162_Sub1_23.method3877(0, Static191.aClass263_2);
		super.aClass162_Sub1_23.method3942(1);
		super.aClass162_Sub1_23.method3865(null);
		super.aClass162_Sub1_23.method3926(0);
		super.aClass162_Sub1_23.method3877(0, Static191.aClass263_2);
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7361(@OriginalArg(1) boolean arg0) {
		super.aClass162_Sub1_23.method3867(Static460.aClass247_4, Static317.aClass247_2);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7355(@OriginalArg(1) boolean arg0) {
		super.aClass162_Sub1_23.method3926(1);
		super.aClass162_Sub1_23.method3867(Static449.aClass247_3, Static317.aClass247_2);
		super.aClass162_Sub1_23.method3828(true, false, Static191.aClass263_2, 0);
		super.aClass162_Sub1_23.method3877(0, Static64.aClass263_1);
		super.aClass162_Sub1_23.method3942(0);
		super.aClass162_Sub1_23.method3926(0);
		super.aClass162_Sub1_23.method3891(-16777216);
		super.aClass162_Sub1_23.method3877(0, Static504.aClass263_4);
		this.method7364();
	}
}
