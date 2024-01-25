import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class4_Sub11 extends Class4 {

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "Z")
	private boolean aBoolean723 = false;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!ee;)V")
	public Class4_Sub11(@OriginalArg(0) Class95_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)V")
	@Override
	public void method8494() {
		if (this.aBoolean723) {
			super.aClass95_Sub1_23.method8153(1);
			super.aClass95_Sub1_23.method8199(Static253.aClass323_4);
			super.aClass95_Sub1_23.method8195(Static617.aClass112_28, Static617.aClass112_28);
			super.aClass95_Sub1_23.method8108(2, Static576.aClass235_3);
			super.aClass95_Sub1_23.method8122(Static665.aClass235_4, 0);
			super.aClass95_Sub1_23.method8142();
			super.aClass95_Sub1_23.method8147((Interface1) null);
			super.aClass95_Sub1_23.method8153(0);
			this.aBoolean723 = false;
		} else {
			super.aClass95_Sub1_23.method8122(Static665.aClass235_4, 0);
		}
		super.aClass95_Sub1_23.method8195(Static617.aClass112_28, Static617.aClass112_28);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8482(@OriginalArg(1) boolean arg0) {
		super.aClass95_Sub1_23.method8195(Static134.aClass112_9, Static617.aClass112_28);
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8493() {
		return true;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8481(@OriginalArg(1) boolean arg0) {
		@Pc(8) Interface7 local8 = super.aClass95_Sub1_23.method8120();
		if (local8 == null || !arg0) {
			super.aClass95_Sub1_23.method8122(Static189.aClass235_1, 0);
			return;
		}
		super.aClass95_Sub1_23.method8153(1);
		super.aClass95_Sub1_23.method8147(local8);
		super.aClass95_Sub1_23.method8199(Static44.aClass323_1);
		super.aClass95_Sub1_23.method8153(1);
		super.aClass95_Sub1_23.method8195(Static134.aClass112_9, Static315.aClass112_22);
		super.aClass95_Sub1_23.method8101(2, false, Static383.aClass235_2, true);
		super.aClass95_Sub1_23.method8122(Static189.aClass235_1, 0);
		@Pc(65) Class17_Sub2 local65 = super.aClass95_Sub1_23.method8141();
		local65.method5848(super.aClass95_Sub1_23.method8172());
		super.aClass95_Sub1_23.method8148(Static210.aClass366_3);
		super.aClass95_Sub1_23.method8153(0);
		this.aBoolean723 = true;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLclient!b;I)V")
	@Override
	public void method8484(@OriginalArg(1) Interface1 arg0, @OriginalArg(2) int arg1) {
		super.aClass95_Sub1_23.method8147(arg0);
		super.aClass95_Sub1_23.method8129(arg1);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)V")
	@Override
	public void method8483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
