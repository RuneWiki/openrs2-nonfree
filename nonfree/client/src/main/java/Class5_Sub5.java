import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class5_Sub5 extends Class5 {

	@OriginalMember(owner = "client!jr", name = "w", descriptor = "F")
	private float aFloat74 = 0.0F;

	@OriginalMember(owner = "client!jr", name = "v", descriptor = "Lclient!ui;")
	private final Class284 aClass284_2;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!kw;Lclient!ui;)V")
	public Class5_Sub5(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) Class284 arg1) {
		super(arg0);
		this.aClass284_2 = arg1;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(B)V")
	@Override
	public void method7087() {
		super.aClass39_Sub2_20.method6191(1);
		super.aClass39_Sub2_20.method6093(Static389.aClass165_3, Static389.aClass165_3);
		super.aClass39_Sub2_20.method6192(0, Static132.aClass111_1);
		super.aClass39_Sub2_20.method6085(Static132.aClass111_1, 0);
		super.aClass39_Sub2_20.method6104(1);
		super.aClass39_Sub2_20.method6179(null);
		super.aClass39_Sub2_20.method6191(0);
		super.aClass39_Sub2_20.method6085(Static132.aClass111_1, 0);
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7085() {
		return this.aClass284_2.method7212();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7081(@OriginalArg(0) boolean arg0) {
		super.aClass39_Sub2_20.method6191(1);
		super.aClass39_Sub2_20.method6093(Static420.aClass165_4, Static99.aClass165_2);
		super.aClass39_Sub2_20.method6119(Static132.aClass111_1, false, 0, true);
		super.aClass39_Sub2_20.method6085(Static409.aClass111_3, 0);
		super.aClass39_Sub2_20.method6104(0);
		super.aClass39_Sub2_20.method6191(0);
		super.aClass39_Sub2_20.method6203(-16777216);
		super.aClass39_Sub2_20.method6085(Static254.aClass111_2, 0);
		this.method7086();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7092(@OriginalArg(1) boolean arg0) {
		super.aClass39_Sub2_20.method6093(Static389.aClass165_3, Static99.aClass165_2);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7091(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.aClass39_Sub2_20.method6191(1);
		if ((arg1 & 0x80) != 0) {
			super.aClass39_Sub2_20.method6179(null);
		} else if ((arg0 & 0x1) == 1) {
			if (this.aClass284_2.aBoolean618) {
				this.aFloat74 = (float) (super.aClass39_Sub2_20.anInt7297 % 4000) / 4000.0F;
				super.aClass39_Sub2_20.method6179(this.aClass284_2.anInterface15_1);
			} else {
				@Pc(89) int local89 = super.aClass39_Sub2_20.anInt7297 % 4000 * 16 / 4000;
				super.aClass39_Sub2_20.method6179(this.aClass284_2.anInterface8Array2[local89]);
			}
		} else if (this.aClass284_2.aBoolean618) {
			super.aClass39_Sub2_20.method6179(this.aClass284_2.anInterface15_1);
		} else {
			super.aClass39_Sub2_20.method6179(this.aClass284_2.anInterface8Array2[0]);
		}
		super.aClass39_Sub2_20.method6191(0);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZILclient!mn;)V")
	@Override
	public void method7083(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
		super.aClass39_Sub2_20.method6179(arg1);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V")
	@Override
	public void method7086() {
		if (super.aClass39_Sub2_20.method6175() != 0) {
			return;
		}
		@Pc(18) Class181_Sub2 local18 = super.aClass39_Sub2_20.method6116();
		super.aClass39_Sub2_20.method6191(1);
		@Pc(28) Class181_Sub2 local28 = super.aClass39_Sub2_20.method6133();
		local28.EA(local18);
		local28.method5394(0.125F, 1.0F, 0.125F);
		local28.method5402(0.0F, 0.0F, this.aFloat74);
		super.aClass39_Sub2_20.method6091(Static217.aClass224_2);
		super.aClass39_Sub2_20.method6191(0);
	}
}
