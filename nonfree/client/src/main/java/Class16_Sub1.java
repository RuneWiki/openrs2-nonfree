import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class16_Sub1 extends Class16 {

	@OriginalMember(owner = "client!aw", name = "y", descriptor = "I")
	private int anInt627 = 0;

	@OriginalMember(owner = "client!aw", name = "n", descriptor = "Lclient!co;")
	private final Class37 aClass37_1 = new Class37();

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(Lclient!dr;B)V")
	@Override
	public void method5259(@OriginalArg(0) Class53 arg0) {
		super.aByteArray88[super.anInt6760] = 20;
		super.anObjectArray34[super.anInt6760] = arg0;
		super.anInt6760++;
		if (super.anInt6760 >= 5000) {
			super.anInt6760 = 0;
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!na;ZFIZ)V")
	@Override
	public void method5258(@OriginalArg(0) Class146 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		super.aByteArray88[super.anInt6760] = (byte) (arg3 ? arg2 + 40 : arg2 + 30);
		super.anObjectArray34[super.anInt6760] = arg0;
		super.aFloatArray24[super.anInt6760] = arg1;
		super.anInt6760++;
		if (super.anInt6760 >= 5000) {
			super.anInt6760 = 0;
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
	@Override
	public void method5252() {
		while (super.anInt6762 != super.anInt6760) {
			this.method490();
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!dr;B)V")
	@Override
	public void method5253(@OriginalArg(0) Class53 arg0) {
		super.anInt6762--;
		if (super.anInt6762 < 0) {
			super.anInt6762 = 4999;
		}
		super.aByteArray88[super.anInt6762] = 21;
		super.anObjectArray34[super.anInt6762] = arg0;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(ILclient!dr;)V")
	@Override
	public void method5251(@OriginalArg(1) Class53 arg0) {
		super.aByteArray88[super.anInt6760] = 21;
		super.anObjectArray34[super.anInt6760] = arg0;
		super.anInt6760++;
		if (super.anInt6760 >= 5000) {
			super.anInt6760 = 0;
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)V")
	@Override
	public void method5257() {
	}

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "(I)V")
	private void method490() {
		@Pc(8) int local8 = super.anInt6762++;
		if (super.anInt6762 >= 5000) {
			super.anInt6762 = 0;
		}
		this.anInt627 = super.aByteArray88[local8];
		@Pc(37) Object local37 = super.anObjectArray34[local8];
		super.anObjectArray34[local8] = null;
		if (this.anInt627 == 21) {
			Static54.method5869(this.aClass37_1, (Class53) local37);
		} else if (this.anInt627 == 20) {
			@Pc(154) Class53 local154 = (Class53) local37;
			if (local154.aClass6_Sub1_1 != null) {
				local154.aClass6_Sub1_1.method5637(Static42.aClass30_3);
			}
			if (local154.aClass6_Sub1_2 != null) {
				local154.aClass6_Sub1_2.method5637(Static42.aClass30_3);
			}
			if (local154.aClass6_Sub3_1 != null) {
				local154.aClass6_Sub3_1.method5637(Static42.aClass30_3);
			}
			if (local154.aClass6_Sub3_2 != null) {
				local154.aClass6_Sub3_2.method5637(Static42.aClass30_3);
			}
			if (local154.aClass6_Sub4_1 != null) {
				local154.aClass6_Sub4_1.method5637(Static42.aClass30_3);
			}
			for (@Pc(197) Class165 local197 = local154.aClass165_1; local197 != null; local197 = local197.aClass165_2) {
				local197.aClass6_Sub2_2.method5637(Static42.aClass30_3);
			}
		} else if (this.anInt627 >= 30 && this.anInt627 <= 33) {
			Static42.aClass30_3.o(3000.0F, super.aFloatArray24[local8] * 1.5F);
			((Class146) local37).method3600(Static50.anInt1363, Static354.anInt6362, Static116.anInt2459, Static282.aBooleanArrayArray5, this.anInt627 - 30 == 0);
		} else if (this.anInt627 >= 40 && this.anInt627 <= 43) {
			Static42.aClass30_3.o(3000.0F, super.aFloatArray24[local8] * 1.5F);
			((Class146) local37).method3600(Static50.anInt1363, Static354.anInt6362, Static116.anInt2459, Static249.aBooleanArrayArray4, this.anInt627 - 40 == 0);
		} else if (this.anInt627 == 22) {
			Static42.aClass30_3.fa(-1, 1583160, 40, 127);
		} else if (this.anInt627 == 23) {
			Static42.aClass30_3.S();
		} else if (this.anInt627 == 24) {
			Static42.aClass30_3.method4706(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)V")
	@Override
	public void method5256(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5250(@OriginalArg(1) int arg0) {
		super.aByteArray88[super.anInt6760] = (byte) arg0;
		super.anInt6760++;
		if (super.anInt6760 >= 5000) {
			super.anInt6760 = 0;
		}
	}
}
