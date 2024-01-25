import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class37_Sub1 extends Class37 {

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
	private int anInt748 = 0;

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "Lclient!eo;")
	private final Class69 aClass69_1 = new Class69();

	static {
		new Class209("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
	@Override
	public void method5282(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!hg;I)V")
	@Override
	public void method5281(@OriginalArg(0) Class106 arg0) {
		super.aByteArray124[super.anInt6678] = 21;
		super.anObjectArray36[super.anInt6678] = arg0;
		super.anInt6678++;
		if (super.anInt6678 >= 5000) {
			super.anInt6678 = 0;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BFILclient!ta;Z)V")
	@Override
	public void method5285(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class64 arg2, @OriginalArg(4) boolean arg3) {
		super.aByteArray124[super.anInt6678] = (byte) (arg3 ? arg1 + 40 : arg1 + 30);
		super.anObjectArray36[super.anInt6678] = arg2;
		super.aFloatArray49[super.anInt6678] = arg0;
		super.anInt6678++;
		if (super.anInt6678 >= 5000) {
			super.anInt6678 = 0;
		}
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
	@Override
	public void method5288() {
		while (super.anInt6677 != super.anInt6678) {
			this.method646();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!hg;Z)V")
	@Override
	public void method5284(@OriginalArg(0) Class106 arg0) {
		super.anInt6677--;
		if (super.anInt6677 < 0) {
			super.anInt6677 = 4999;
		}
		super.aByteArray124[super.anInt6677] = 21;
		super.anObjectArray36[super.anInt6677] = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
	private void method646() {
		@Pc(8) int local8 = super.anInt6677++;
		if (super.anInt6677 >= 5000) {
			super.anInt6677 = 0;
		}
		this.anInt748 = super.aByteArray124[local8];
		@Pc(34) Object local34 = super.anObjectArray36[local8];
		super.anObjectArray36[local8] = null;
		if (this.anInt748 == 21) {
			Static216.method4818(this.aClass69_1, (Class106) local34);
		} else if (this.anInt748 == 20) {
			@Pc(165) Class106 local165 = (Class106) local34;
			if (local165.aClass3_Sub5_1 != null) {
				local165.aClass3_Sub5_1.method5143(Static332.aClass49_10);
			}
			if (local165.aClass3_Sub5_2 != null) {
				local165.aClass3_Sub5_2.method5143(Static332.aClass49_10);
			}
			if (local165.aClass3_Sub3_1 != null) {
				local165.aClass3_Sub3_1.method5143(Static332.aClass49_10);
			}
			if (local165.aClass3_Sub3_2 != null) {
				local165.aClass3_Sub3_2.method5143(Static332.aClass49_10);
			}
			if (local165.aClass3_Sub1_2 != null) {
				local165.aClass3_Sub1_2.method5143(Static332.aClass49_10);
			}
			for (@Pc(208) Class4 local208 = local165.aClass4_3; local208 != null; local208 = local208.aClass4_1) {
				local208.aClass3_Sub2_1.method5143(Static332.aClass49_10);
			}
		} else if (this.anInt748 < 30 || this.anInt748 > 33) {
			if (this.anInt748 >= 40 && this.anInt748 <= 43) {
				Static332.aClass49_10.g(3000.0F, super.aFloatArray49[local8] * 1.5F);
				((Class64) local34).method2355(Static312.anInt5514, Static402.anInt6690, Static182.anInt3568, Static223.aBooleanArrayArray19, this.anInt748 - 40 == 0);
				return;
			}
			if (this.anInt748 == 22) {
				Static332.aClass49_10.AA(-1, 1583160, 40, 127);
				return;
			}
			if (this.anInt748 == 23) {
				Static332.aClass49_10.l();
				return;
			}
			if (this.anInt748 == 24) {
				Static332.aClass49_10.method4428(0, null);
				return;
			}
		} else {
			Static332.aClass49_10.g(3000.0F, super.aFloatArray49[local8] * 1.5F);
			((Class64) local34).method2355(Static312.anInt5514, Static402.anInt6690, Static182.anInt3568, Static281.aBooleanArrayArray41, this.anInt748 - 30 == 0);
			return;
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	@Override
	public void method5286() {
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!hg;)V")
	@Override
	public void method5287(@OriginalArg(1) Class106 arg0) {
		super.aByteArray124[super.anInt6678] = 20;
		super.anObjectArray36[super.anInt6678] = arg0;
		super.anInt6678++;
		if (super.anInt6678 >= 5000) {
			super.anInt6678 = 0;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)V")
	@Override
	public void method5283(@OriginalArg(1) int arg0) {
		super.aByteArray124[super.anInt6678] = (byte) arg0;
		super.anInt6678++;
		if (super.anInt6678 >= 5000) {
			super.anInt6678 = 0;
		}
	}
}
