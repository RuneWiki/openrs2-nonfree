import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class45_Sub1 extends Class45 {

	@OriginalMember(owner = "client!ct", name = "u", descriptor = "I")
	private int anInt1155 = 0;

	@OriginalMember(owner = "client!ct", name = "n", descriptor = "Lclient!mb;")
	private final Class25 aClass25_1 = new Class25();

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILclient!wr;)V")
	@Override
	public void method5053(@OriginalArg(1) Class270 arg0) {
		super.aByteArray80[super.anInt6514] = 21;
		super.anObjectArray35[super.anInt6514] = arg0;
		super.anInt6514++;
		if (super.anInt6514 >= 5000) {
			super.anInt6514 = 0;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!wr;I)V")
	@Override
	public void method5051(@OriginalArg(0) Class270 arg0) {
		super.aByteArray80[super.anInt6514] = 20;
		super.anObjectArray35[super.anInt6514] = arg0;
		super.anInt6514++;
		if (super.anInt6514 >= 5000) {
			super.anInt6514 = 0;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IB)V")
	@Override
	public void method5056(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(B)V")
	private void method925() {
		@Pc(8) int local8 = super.anInt6512++;
		if (super.anInt6512 >= 5000) {
			super.anInt6512 = 0;
		}
		this.anInt1155 = super.aByteArray80[local8];
		@Pc(34) Object local34 = super.anObjectArray35[local8];
		super.anObjectArray35[local8] = null;
		if (this.anInt1155 == 21) {
			Static206.method2750(this.aClass25_1, (Class270) local34);
		} else if (this.anInt1155 == 20) {
			@Pc(56) Class270 local56 = (Class270) local34;
			if (local56.aClass3_Sub2_3 != null) {
				local56.aClass3_Sub2_3.method5285(Static307.aClass163_7);
			}
			if (local56.aClass3_Sub2_2 != null) {
				local56.aClass3_Sub2_2.method5285(Static307.aClass163_7);
			}
			if (local56.aClass3_Sub3_2 != null) {
				local56.aClass3_Sub3_2.method5285(Static307.aClass163_7);
			}
			if (local56.aClass3_Sub3_3 != null) {
				local56.aClass3_Sub3_3.method5285(Static307.aClass163_7);
			}
			if (local56.aClass3_Sub5_2 != null) {
				local56.aClass3_Sub5_2.method5285(Static307.aClass163_7);
			}
			for (@Pc(103) Class241 local103 = local56.aClass241_2; local103 != null; local103 = local103.aClass241_1) {
				local103.aClass3_Sub4_2.method5285(Static307.aClass163_7);
			}
		} else if (this.anInt1155 >= 30 && this.anInt1155 <= 33) {
			Static307.aClass163_7.da(3000.0F, super.aFloatArray31[local8] * 1.5F);
			((Class162) local34).method3277(Static352.anInt5986, Static411.anInt6740, Static453.anInt7270, Static356.aBooleanArrayArray6, this.anInt1155 - 30 == 0);
		} else if (this.anInt1155 >= 40 && this.anInt1155 <= 43) {
			Static307.aClass163_7.da(3000.0F, super.aFloatArray31[local8] * 1.5F);
			((Class162) local34).method3277(Static352.anInt5986, Static411.anInt6740, Static453.anInt7270, Static19.aBooleanArrayArray1, this.anInt1155 - 40 == 0);
		} else if (this.anInt1155 == 22) {
			Static307.aClass163_7.s(-1, 1583160, 40, 127);
		} else if (this.anInt1155 == 23) {
			Static307.aClass163_7.n();
			return;
		} else if (this.anInt1155 == 24) {
			Static307.aClass163_7.method5536(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!ya;IZZF)V")
	@Override
	public void method5052(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) float arg3) {
		super.aByteArray80[super.anInt6514] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
		super.anObjectArray35[super.anInt6514] = arg0;
		super.aFloatArray31[super.anInt6514] = arg3;
		super.anInt6514++;
		if (super.anInt6514 >= 5000) {
			super.anInt6514 = 0;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(BI)V")
	@Override
	public void method5054(@OriginalArg(1) int arg0) {
		super.aByteArray80[super.anInt6514] = (byte) arg0;
		super.anInt6514++;
		if (super.anInt6514 >= 5000) {
			super.anInt6514 = 0;
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(BLclient!wr;)V")
	@Override
	public void method5058(@OriginalArg(1) Class270 arg0) {
		super.anInt6512--;
		if (super.anInt6512 < 0) {
			super.anInt6512 = 4999;
		}
		super.aByteArray80[super.anInt6512] = 21;
		super.anObjectArray35[super.anInt6512] = arg0;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V")
	@Override
	public void method5059() {
		while (super.anInt6514 != super.anInt6512) {
			this.method925();
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
	@Override
	public void method5057() {
	}
}
