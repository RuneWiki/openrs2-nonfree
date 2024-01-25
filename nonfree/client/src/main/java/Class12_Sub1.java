import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!ar", name = "z", descriptor = "I")
	private int anInt248 = 0;

	@OriginalMember(owner = "client!ar", name = "s", descriptor = "Lclient!kw;")
	private final Class135 aClass135_1 = new Class135();

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(B)V")
	private void method263() {
		@Pc(8) int local8 = super.anInt3613++;
		if (super.anInt3613 >= 5000) {
			super.anInt3613 = 0;
		}
		this.anInt248 = super.aByteArray72[local8];
		@Pc(32) Object local32 = super.anObjectArray35[local8];
		super.anObjectArray35[local8] = null;
		if (this.anInt248 == 21) {
			Static442.method6042(this.aClass135_1, (Class227) local32);
		} else if (this.anInt248 == 20) {
			@Pc(154) Class227 local154 = (Class227) local32;
			if (local154.aClass1_Sub3_3 != null) {
				local154.aClass1_Sub3_3.method6241(Static157.aClass167_7);
			}
			if (local154.aClass1_Sub3_2 != null) {
				local154.aClass1_Sub3_2.method6241(Static157.aClass167_7);
			}
			if (local154.aClass1_Sub1_1 != null) {
				local154.aClass1_Sub1_1.method6241(Static157.aClass167_7);
			}
			if (local154.aClass1_Sub1_2 != null) {
				local154.aClass1_Sub1_2.method6241(Static157.aClass167_7);
			}
			if (local154.aClass1_Sub4_2 != null) {
				local154.aClass1_Sub4_2.method6241(Static157.aClass167_7);
			}
			for (@Pc(197) Class114 local197 = local154.aClass114_2; local197 != null; local197 = local197.aClass114_1) {
				local197.aClass1_Sub2_1.method6241(Static157.aClass167_7);
			}
		} else if (this.anInt248 >= 30 && this.anInt248 <= 33) {
			Static157.aClass167_7.PA(3000.0F, super.aFloatArray20[local8] * 1.5F);
			((Class55) local32).method3816(Static366.anInt6203, Static465.anInt3909, Static24.anInt2908, Static39.aBooleanArrayArray1, this.anInt248 - 30 == 0);
		} else if (this.anInt248 >= 40 && this.anInt248 <= 43) {
			Static157.aClass167_7.PA(3000.0F, super.aFloatArray20[local8] * 1.5F);
			((Class55) local32).method3816(Static366.anInt6203, Static465.anInt3909, Static24.anInt2908, Static111.aBooleanArrayArray4, this.anInt248 - 40 == 0);
		} else if (this.anInt248 == 22) {
			Static157.aClass167_7.q(-1, 1583160, 40, 127);
		} else if (this.anInt248 == 23) {
			Static157.aClass167_7.r();
		} else if (this.anInt248 == 24) {
			Static157.aClass167_7.method5985(0, null);
		}
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(Lclient!sn;I)V")
	@Override
	public void method3105(@OriginalArg(0) Class227 arg0) {
		super.aByteArray72[super.anInt3611] = 20;
		super.anObjectArray35[super.anInt3611] = arg0;
		super.anInt3611++;
		if (super.anInt3611 >= 5000) {
			super.anInt3611 = 0;
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZLclient!sn;)V")
	@Override
	public void method3109(@OriginalArg(1) Class227 arg0) {
		super.anInt3613--;
		if (super.anInt3613 < 0) {
			super.anInt3613 = 4999;
		}
		super.aByteArray72[super.anInt3613] = 21;
		super.anObjectArray35[super.anInt3613] = arg0;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)V")
	@Override
	public void method3103(@OriginalArg(1) int arg0) {
		super.aByteArray72[super.anInt3611] = (byte) arg0;
		super.anInt3611++;
		if (super.anInt3611 >= 5000) {
			super.anInt3611 = 0;
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!sn;I)V")
	@Override
	public void method3101(@OriginalArg(0) Class227 arg0) {
		super.aByteArray72[super.anInt3611] = 21;
		super.anObjectArray35[super.anInt3611] = arg0;
		super.anInt3611++;
		if (super.anInt3611 >= 5000) {
			super.anInt3611 = 0;
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)V")
	@Override
	public void method3107() {
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZFIILclient!o;)V")
	@Override
	public void method3110(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class55 arg3) {
		super.aByteArray72[super.anInt3611] = (byte) (arg0 ? arg2 + 40 : arg2 + 30);
		super.anObjectArray35[super.anInt3611] = arg3;
		super.aFloatArray20[super.anInt3611] = arg1;
		super.anInt3611++;
		if (super.anInt3611 >= 5000) {
			super.anInt3611 = 0;
		}
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(II)V")
	@Override
	public void method3108(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(B)V")
	@Override
	public void method3111() {
		while (super.anInt3611 != super.anInt3613) {
			this.method263();
		}
	}
}
