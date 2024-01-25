import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class32_Sub2 extends Class32 {

	@OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
	private int anInt7425 = 0;

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "Lclient!nt;")
	private final Class177 aClass177_1 = new Class177();

	static {
		new Class131("", 76);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	@Override
	public void method5962() {
		while (super.anInt7420 != super.anInt7415) {
			this.method5968();
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)V")
	@Override
	public void method5963(@OriginalArg(0) int arg0) {
		super.aByteArray92[super.anInt7415] = (byte) arg0;
		super.anInt7415++;
		if (super.anInt7415 >= 5000) {
			super.anInt7415 = 0;
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
	private void method5968() {
		@Pc(8) int local8 = super.anInt7420++;
		if (super.anInt7420 >= 5000) {
			super.anInt7420 = 0;
		}
		this.anInt7425 = super.aByteArray92[local8];
		@Pc(34) Object local34 = super.anObjectArray36[local8];
		super.anObjectArray36[local8] = null;
		if (this.anInt7425 == 21) {
			Static220.method3819(this.aClass177_1, (Class162) local34);
		} else if (this.anInt7425 == 20) {
			@Pc(161) Class162 local161 = (Class162) local34;
			if (local161.aClass11_Sub2_2 != null) {
				local161.aClass11_Sub2_2.method6303(Static367.aClass30_20);
			}
			if (local161.aClass11_Sub2_1 != null) {
				local161.aClass11_Sub2_1.method6303(Static367.aClass30_20);
			}
			if (local161.aClass11_Sub3_1 != null) {
				local161.aClass11_Sub3_1.method6303(Static367.aClass30_20);
			}
			if (local161.aClass11_Sub3_2 != null) {
				local161.aClass11_Sub3_2.method6303(Static367.aClass30_20);
			}
			if (local161.aClass11_Sub1_2 != null) {
				local161.aClass11_Sub1_2.method6303(Static367.aClass30_20);
			}
			for (@Pc(204) Class199 local204 = local161.aClass199_1; local204 != null; local204 = local204.aClass199_2) {
				local204.aClass11_Sub5_1.method6303(Static367.aClass30_20);
			}
		} else if (this.anInt7425 < 30 || this.anInt7425 > 33) {
			if (this.anInt7425 >= 40 && this.anInt7425 <= 43) {
				Static367.aClass30_20.PA(3000.0F, super.aFloatArray41[local8] * 1.5F);
				((Class14) local34).method2553(Static243.anInt4735, Static140.anInt2891, Static120.anInt2511, Static262.aBooleanArrayArray9, this.anInt7425 - 40 == 0);
				return;
			}
			if (this.anInt7425 == 22) {
				Static367.aClass30_20.q(-1, 1583160, 40, 127);
				return;
			}
			if (this.anInt7425 == 23) {
				Static367.aClass30_20.r();
				return;
			}
			if (this.anInt7425 == 24) {
				Static367.aClass30_20.method2081(0, null);
				return;
			}
		} else {
			Static367.aClass30_20.PA(3000.0F, super.aFloatArray41[local8] * 1.5F);
			((Class14) local34).method2553(Static243.anInt4735, Static140.anInt2891, Static120.anInt2511, Static327.aBooleanArrayArray10, this.anInt7425 - 30 == 0);
			return;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!mm;Z)V")
	@Override
	public void method5960(@OriginalArg(0) Class162 arg0) {
		super.aByteArray92[super.anInt7415] = 20;
		super.anObjectArray36[super.anInt7415] = arg0;
		super.anInt7415++;
		if (super.anInt7415 >= 5000) {
			super.anInt7415 = 0;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLclient!mm;)V")
	@Override
	public void method5958(@OriginalArg(1) Class162 arg0) {
		super.aByteArray92[super.anInt7415] = 21;
		super.anObjectArray36[super.anInt7415] = arg0;
		super.anInt7415++;
		if (super.anInt7415 >= 5000) {
			super.anInt7415 = 0;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILclient!mm;)V")
	@Override
	public void method5966(@OriginalArg(1) Class162 arg0) {
		super.anInt7420--;
		if (super.anInt7420 < 0) {
			super.anInt7420 = 4999;
		}
		super.aByteArray92[super.anInt7420] = 21;
		super.anObjectArray36[super.anInt7420] = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
	@Override
	public void method5957() {
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!o;ZFII)V")
	@Override
	public void method5955(@OriginalArg(0) Class14 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3) {
		super.aByteArray92[super.anInt7415] = (byte) (arg1 ? arg3 + 40 : arg3 + 30);
		super.anObjectArray36[super.anInt7415] = arg0;
		super.aFloatArray41[super.anInt7415] = arg2;
		super.anInt7415++;
		if (super.anInt7415 >= 5000) {
			super.anInt7415 = 0;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
	@Override
	public void method5959(@OriginalArg(1) int arg0) {
	}
}
