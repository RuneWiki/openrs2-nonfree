import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class38_Sub4 extends Class38 {

	@OriginalMember(owner = "client!oq", name = "r", descriptor = "F")
	private float aFloat201 = 0.0F;

	@OriginalMember(owner = "client!oq", name = "u", descriptor = "Lclient!vt;")
	private final Class348 aClass348_6;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lclient!ifa;Lclient!vt;)V")
	public Class38_Sub4(@OriginalArg(0) Class44_Sub2 arg0, @OriginalArg(1) Class348 arg1) {
		super(arg0);
		this.aClass348_6 = arg1;
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(B)V")
	@Override
	public void method7441() {
		if (super.aClass44_Sub2_21.method4367() != 0) {
			return;
		}
		@Pc(9) Class8_Sub3 local9 = super.aClass44_Sub2_21.method4254();
		super.aClass44_Sub2_21.method4267(1);
		@Pc(19) Class8_Sub3 local19 = super.aClass44_Sub2_21.method4353();
		local19.M(local9);
		local19.method1582(1.0F, 0.125F, 0.125F);
		local19.method1576(this.aFloat201, 0.0F, 0.0F);
		super.aClass44_Sub2_21.method4268(Static282.aClass340_4);
		super.aClass44_Sub2_21.method4267(0);
	}

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)V")
	@Override
	public void method7434() {
		super.aClass44_Sub2_21.method4267(1);
		super.aClass44_Sub2_21.method4243(Static573.aClass117_9, Static573.aClass117_9);
		super.aClass44_Sub2_21.method4241(0, Static519.aClass328_4);
		super.aClass44_Sub2_21.method4312(0, Static519.aClass328_4);
		super.aClass44_Sub2_21.method4330(1);
		super.aClass44_Sub2_21.method4265(null);
		super.aClass44_Sub2_21.method4267(0);
		super.aClass44_Sub2_21.method4312(0, Static519.aClass328_4);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7427() {
		return this.aClass348_6.method8144();
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILclient!oa;B)V")
	@Override
	public void method7440(@OriginalArg(0) int arg0, @OriginalArg(1) Interface16 arg1) {
		super.aClass44_Sub2_21.method4265(arg1);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7433(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.aClass44_Sub2_21.method4267(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass44_Sub2_21.method4265(null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass348_6.aBoolean705) {
				this.aFloat201 = (float) (super.aClass44_Sub2_21.anInt4957 % 4000) / 4000.0F;
				super.aClass44_Sub2_21.method4265(this.aClass348_6.anInterface4_2);
			} else {
				@Pc(62) int local62 = super.aClass44_Sub2_21.anInt4957 % 4000 * 16 / 4000;
				super.aClass44_Sub2_21.method4265(this.aClass348_6.anInterface6Array2[local62]);
			}
		} else if (this.aClass348_6.aBoolean705) {
			super.aClass44_Sub2_21.method4265(this.aClass348_6.anInterface4_2);
		} else {
			super.aClass44_Sub2_21.method4265(this.aClass348_6.anInterface6Array2[0]);
		}
		super.aClass44_Sub2_21.method4267(0);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7439(@OriginalArg(1) boolean arg0) {
		super.aClass44_Sub2_21.method4267(1);
		super.aClass44_Sub2_21.method4243(Static379.aClass117_7, Static341.aClass117_4);
		super.aClass44_Sub2_21.method4258(true, 0, Static519.aClass328_4, false);
		super.aClass44_Sub2_21.method4312(0, Static283.aClass328_5);
		super.aClass44_Sub2_21.method4330(0);
		super.aClass44_Sub2_21.method4267(0);
		super.aClass44_Sub2_21.method4285(-16777216);
		super.aClass44_Sub2_21.method4312(0, Static447.aClass328_3);
		this.method7441();
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7431(@OriginalArg(0) boolean arg0) {
		super.aClass44_Sub2_21.method4243(Static379.aClass117_7, Static573.aClass117_9);
	}
}
