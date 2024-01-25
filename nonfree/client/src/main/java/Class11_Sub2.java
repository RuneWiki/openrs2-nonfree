import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
	private int anInt3216 = 0;

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "Lclient!qf;")
	private final Class128 aClass128_1 = new Class128();

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IFZILclient!sa;)V")
	@Override
	public void method2938(@OriginalArg(1) float arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class8 arg3) {
		super.aByteArray35[super.anInt3200] = (byte) (arg1 ? arg2 + 40 : arg2 + 30);
		super.anObjectArray33[super.anInt3200] = arg3;
		super.aFloatArray16[super.anInt3200] = arg0;
		super.anInt3200++;
		if (super.anInt3200 >= 5000) {
			super.anInt3200 = 0;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!dg;)V")
	@Override
	public void method2937(@OriginalArg(1) Class49 arg0) {
		super.aByteArray35[super.anInt3200] = 21;
		super.anObjectArray33[super.anInt3200] = arg0;
		super.anInt3200++;
		if (super.anInt3200 >= 5000) {
			super.anInt3200 = 0;
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
	@Override
	public void method2944() {
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLclient!dg;)V")
	@Override
	public void method2943(@OriginalArg(1) Class49 arg0) {
		super.aByteArray35[super.anInt3200] = 20;
		super.anObjectArray33[super.anInt3200] = arg0;
		super.anInt3200++;
		if (super.anInt3200 >= 5000) {
			super.anInt3200 = 0;
		}
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
	private void method2947() {
		@Pc(8) int local8 = super.anInt3204++;
		if (super.anInt3204 >= 5000) {
			super.anInt3204 = 0;
		}
		this.anInt3216 = super.aByteArray35[local8];
		@Pc(34) Object local34 = super.anObjectArray33[local8];
		super.anObjectArray33[local8] = null;
		if (this.anInt3216 == 21) {
			Static292.method4787(this.aClass128_1, (Class49) local34);
		} else if (this.anInt3216 == 20) {
			@Pc(61) Class49 local61 = (Class49) local34;
			if (local61.aClass22_Sub4_1 != null) {
				local61.aClass22_Sub4_1.method5341(Static331.aClass89_8);
			}
			if (local61.aClass22_Sub4_2 != null) {
				local61.aClass22_Sub4_2.method5341(Static331.aClass89_8);
			}
			if (local61.aClass22_Sub5_2 != null) {
				local61.aClass22_Sub5_2.method5341(Static331.aClass89_8);
			}
			if (local61.aClass22_Sub5_1 != null) {
				local61.aClass22_Sub5_1.method5341(Static331.aClass89_8);
			}
			if (local61.aClass22_Sub1_1 != null) {
				local61.aClass22_Sub1_1.method5341(Static331.aClass89_8);
			}
			for (@Pc(104) Class47 local104 = local61.aClass47_3; local104 != null; local104 = local104.aClass47_2) {
				local104.aClass22_Sub2_1.method5341(Static331.aClass89_8);
			}
		} else if (this.anInt3216 >= 30 && this.anInt3216 <= 33) {
			Static331.aClass89_8.method5463(3000.0F, super.aFloatArray16[local8] * 1.5F);
			((Class8) local34).method4166(Static314.anInt6028, Static206.anInt4117, Static52.anInt1395, Static65.aBooleanArrayArray1, this.anInt3216 - 30 == 0);
		} else if (this.anInt3216 >= 40 && this.anInt3216 <= 43) {
			Static331.aClass89_8.method5463(3000.0F, super.aFloatArray16[local8] * 1.5F);
			((Class8) local34).method4166(Static314.anInt6028, Static206.anInt4117, Static52.anInt1395, Static86.aBooleanArrayArray2, this.anInt3216 - 40 == 0);
		} else if (this.anInt3216 == 22) {
			Static331.aClass89_8.method5452();
		} else if (this.anInt3216 == 23) {
			Static331.aClass89_8.method5474();
		} else if (this.anInt3216 == 24) {
			Static331.aClass89_8.method5470(0, null);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!dg;I)V")
	@Override
	public void method2939(@OriginalArg(0) Class49 arg0) {
		super.anInt3204--;
		if (super.anInt3204 < 0) {
			super.anInt3204 = 4999;
		}
		super.aByteArray35[super.anInt3204] = 21;
		super.anObjectArray33[super.anInt3204] = arg0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZI)V")
	@Override
	public void method2940(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V")
	@Override
	public void method2936(@OriginalArg(1) int arg0) {
		super.aByteArray35[super.anInt3200] = (byte) arg0;
		super.anInt3200++;
		if (super.anInt3200 >= 5000) {
			super.anInt3200 = 0;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
	@Override
	public void method2942() {
		while (super.anInt3200 != super.anInt3204) {
			this.method2947();
		}
	}
}
