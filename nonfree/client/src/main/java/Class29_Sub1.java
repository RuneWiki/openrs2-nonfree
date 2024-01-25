import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bfa")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!bfa", name = "t", descriptor = "F")
	private float aFloat47 = 0.0F;

	@OriginalMember(owner = "client!bfa", name = "r", descriptor = "Lclient!ur;")
	private final Class345 aClass345_1;

	@OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Lclient!ch;Lclient!ur;)V")
	public Class29_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class345 arg1) {
		super(arg0);
		this.aClass345_1 = arg1;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)V")
	@Override
	public void method8071() {
		super.aClass5_Sub1_22.method5571(1);
		super.aClass5_Sub1_22.method5682(Static514.aClass374_5, Static514.aClass374_5);
		super.aClass5_Sub1_22.method5583(Static333.aClass9_2, 0);
		super.aClass5_Sub1_22.method5592(Static333.aClass9_2, 0);
		super.aClass5_Sub1_22.method5566(1);
		super.aClass5_Sub1_22.method5609(null);
		super.aClass5_Sub1_22.method5571(0);
		super.aClass5_Sub1_22.method5592(Static333.aClass9_2, 0);
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8073() {
		return this.aClass345_1.method8240();
	}

	@OriginalMember(owner = "client!bfa", name = "e", descriptor = "(I)V")
	@Override
	public void method8077() {
		if (super.aClass5_Sub1_22.method5567() != 0) {
			return;
		}
		@Pc(20) Class39_Sub1 local20 = super.aClass5_Sub1_22.method5661();
		super.aClass5_Sub1_22.method5571(1);
		@Pc(32) Class39_Sub1 local32 = super.aClass5_Sub1_22.method5678();
		local32.method7236(local20);
		local32.method1566(0.125F, 1.0F, 0.125F);
		local32.method1567(0.0F, 0.0F, this.aFloat47);
		super.aClass5_Sub1_22.method5589(Static96.aClass340_1);
		super.aClass5_Sub1_22.method5571(0);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(III)V")
	@Override
	public void method8083(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.aClass5_Sub1_22.method5571(1);
		if ((arg1 & 0x80) != 0) {
			super.aClass5_Sub1_22.method5609(null);
		} else if ((arg0 & 0x1) == 1) {
			if (this.aClass345_1.aBoolean688) {
				this.aFloat47 = (float) (super.aClass5_Sub1_22.anInt6524 % 4000) / 4000.0F;
				super.aClass5_Sub1_22.method5609(this.aClass345_1.anInterface12_2);
			} else {
				@Pc(79) int local79 = super.aClass5_Sub1_22.anInt6524 % 4000 * 16 / 4000;
				super.aClass5_Sub1_22.method5609(this.aClass345_1.anInterface24Array1[local79]);
			}
		} else if (this.aClass345_1.aBoolean688) {
			super.aClass5_Sub1_22.method5609(this.aClass345_1.anInterface12_2);
		} else {
			super.aClass5_Sub1_22.method5609(this.aClass345_1.anInterface24Array1[0]);
		}
		super.aClass5_Sub1_22.method5571(0);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IILclient!ec;)V")
	@Override
	public void method8072(@OriginalArg(1) int arg0, @OriginalArg(2) Interface10 arg1) {
		super.aClass5_Sub1_22.method5609(arg1);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8067(@OriginalArg(0) boolean arg0) {
		super.aClass5_Sub1_22.method5682(Static314.aClass374_2, Static514.aClass374_5);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8080(@OriginalArg(1) boolean arg0) {
		super.aClass5_Sub1_22.method5571(1);
		super.aClass5_Sub1_22.method5682(Static314.aClass374_2, Static377.aClass374_3);
		super.aClass5_Sub1_22.method5618(false, true, 0, Static333.aClass9_2);
		super.aClass5_Sub1_22.method5592(Static482.aClass9_4, 0);
		super.aClass5_Sub1_22.method5566(0);
		super.aClass5_Sub1_22.method5571(0);
		super.aClass5_Sub1_22.method5574(-16777216);
		super.aClass5_Sub1_22.method5592(Static161.aClass9_3, 0);
		this.method8077();
	}
}
