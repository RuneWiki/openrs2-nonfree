import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class4_Sub5 extends Class4 {

	@OriginalMember(owner = "client!gv", name = "y", descriptor = "F")
	private float aFloat68 = 0.0F;

	@OriginalMember(owner = "client!gv", name = "v", descriptor = "Lclient!gaa;")
	private final Class123 aClass123_3;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!ee;Lclient!gaa;)V")
	public Class4_Sub5(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) Class123 arg1) {
		super(arg0);
		this.aClass123_3 = arg1;
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V")
	@Override
	public void method8485() {
		if (super.aClass95_Sub1_23.method8092() != 0) {
			return;
		}
		@Pc(16) Class17_Sub2 local16 = super.aClass95_Sub1_23.method8102();
		super.aClass95_Sub1_23.method8153(1);
		@Pc(26) Class17_Sub2 local26 = super.aClass95_Sub1_23.method8141();
		local26.method6233(local16);
		local26.method5842(0.125F, 0.125F, 1.0F);
		local26.method5856(0.0F, this.aFloat68, 0.0F);
		super.aClass95_Sub1_23.method8148(Static210.aClass366_3);
		super.aClass95_Sub1_23.method8153(0);
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8493() {
		return this.aClass123_3.method2906();
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(III)V")
	@Override
	public void method8483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.aClass95_Sub1_23.method8153(1);
		if ((arg1 & 0x80) != 0) {
			super.aClass95_Sub1_23.method8147((Interface1) null);
		} else if ((arg0 & 0x1) == 1) {
			if (this.aClass123_3.aBoolean250) {
				this.aFloat68 = (float) (super.aClass95_Sub1_23.anInt10064 % 4000) / 4000.0F;
				super.aClass95_Sub1_23.method8147(this.aClass123_3.anInterface20_1);
			} else {
				@Pc(86) int local86 = super.aClass95_Sub1_23.anInt10064 % 4000 * 16 / 4000;
				super.aClass95_Sub1_23.method8147(this.aClass123_3.anInterface8Array1[local86]);
			}
		} else if (this.aClass123_3.aBoolean250) {
			super.aClass95_Sub1_23.method8147(this.aClass123_3.anInterface20_1);
		} else {
			super.aClass95_Sub1_23.method8147(this.aClass123_3.anInterface8Array1[0]);
		}
		super.aClass95_Sub1_23.method8153(0);
	}

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "(I)V")
	@Override
	public void method8494() {
		super.aClass95_Sub1_23.method8153(1);
		super.aClass95_Sub1_23.method8195(Static617.aClass112_28, Static617.aClass112_28);
		super.aClass95_Sub1_23.method8108(0, Static665.aClass235_4);
		super.aClass95_Sub1_23.method8122(Static665.aClass235_4, 0);
		super.aClass95_Sub1_23.method8146(1);
		super.aClass95_Sub1_23.method8147((Interface1) null);
		super.aClass95_Sub1_23.method8153(0);
		super.aClass95_Sub1_23.method8122(Static665.aClass235_4, 0);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8482(@OriginalArg(1) boolean arg0) {
		super.aClass95_Sub1_23.method8195(Static134.aClass112_9, Static617.aClass112_28);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8481(@OriginalArg(1) boolean arg0) {
		super.aClass95_Sub1_23.method8153(1);
		super.aClass95_Sub1_23.method8195(Static134.aClass112_9, Static461.aClass112_52);
		super.aClass95_Sub1_23.method8101(0, false, Static665.aClass235_4, true);
		super.aClass95_Sub1_23.method8122(Static383.aClass235_2, 0);
		super.aClass95_Sub1_23.method8146(0);
		super.aClass95_Sub1_23.method8153(0);
		super.aClass95_Sub1_23.method8078(-16777216);
		super.aClass95_Sub1_23.method8122(Static576.aClass235_3, 0);
		this.method8485();
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZLclient!b;I)V")
	@Override
	public void method8484(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) int arg1) {
		super.aClass95_Sub1_23.method8147(arg0);
	}
}
