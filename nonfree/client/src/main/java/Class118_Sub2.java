import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class118_Sub2 extends Class118 {

	@OriginalMember(owner = "client!vd", name = "C", descriptor = "[Lclient!tg;")
	public static final Class195[] aClass195Array1 = new Class195[5];

	@OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
	private int anInt6403 = 0;

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "Lclient!uk;")
	private final Class172 aClass172_1 = new Class172();

	static {
		for (@Pc(8) int local8 = 0; local8 < aClass195Array1.length; local8++) {
			aClass195Array1[local8] = new Class195();
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)V")
	@Override
	public void method5668(@OriginalArg(0) int arg0) {
		super.aByteArray93[super.anInt6398] = (byte) arg0;
		super.anInt6398++;
		if (super.anInt6398 >= 5000) {
			super.anInt6398 = 0;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
	@Override
	public void method5664(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
	private void method5673() {
		@Pc(8) int local8 = super.anInt6395++;
		if (super.anInt6395 >= 5000) {
			super.anInt6395 = 0;
		}
		this.anInt6403 = super.aByteArray93[local8];
		@Pc(32) Object local32 = super.anObjectArray35[local8];
		super.anObjectArray35[local8] = null;
		if (this.anInt6403 == 21) {
			Static66.method1518(this.aClass172_1, (Class155) local32);
		} else if (this.anInt6403 == 20) {
			@Pc(158) Class155 local158 = (Class155) local32;
			if (local158.aClass11_Sub5_2 != null) {
				local158.aClass11_Sub5_2.method5912(Static368.aClass63_9);
			}
			if (local158.aClass11_Sub5_1 != null) {
				local158.aClass11_Sub5_1.method5912(Static368.aClass63_9);
			}
			if (local158.aClass11_Sub4_1 != null) {
				local158.aClass11_Sub4_1.method5912(Static368.aClass63_9);
			}
			if (local158.aClass11_Sub4_2 != null) {
				local158.aClass11_Sub4_2.method5912(Static368.aClass63_9);
			}
			if (local158.aClass11_Sub1_2 != null) {
				local158.aClass11_Sub1_2.method5912(Static368.aClass63_9);
			}
			for (@Pc(201) Class187 local201 = local158.aClass187_2; local201 != null; local201 = local201.aClass187_3) {
				local201.aClass11_Sub2_2.method5912(Static368.aClass63_9);
			}
		} else if (this.anInt6403 >= 30 && this.anInt6403 <= 33) {
			Static368.aClass63_9.method4570(3000.0F, super.aFloatArray29[local8] * 1.5F);
			((Class36) local32).method4437(Static79.anInt1760, Static42.anInt1018, Static87.anInt1923, Static28.aBooleanArrayArray1, this.anInt6403 - 30 == 0);
		} else if (this.anInt6403 >= 40 && this.anInt6403 <= 43) {
			Static368.aClass63_9.method4570(3000.0F, super.aFloatArray29[local8] * 1.5F);
			((Class36) local32).method4437(Static79.anInt1760, Static42.anInt1018, Static87.anInt1923, Static75.aBooleanArrayArray5, this.anInt6403 - 40 == 0);
		} else if (this.anInt6403 == 22) {
			Static368.aClass63_9.method4643();
		} else if (this.anInt6403 == 23) {
			Static368.aClass63_9.method4561();
		} else if (this.anInt6403 == 24) {
			Static368.aClass63_9.method4557(0, null);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	@Override
	public void method5665() {
		while (super.anInt6398 != super.anInt6395) {
			this.method5673();
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!og;B)V")
	@Override
	public void method5662(@OriginalArg(0) Class155 arg0) {
		super.aByteArray93[super.anInt6398] = 21;
		super.anObjectArray35[super.anInt6398] = arg0;
		super.anInt6398++;
		if (super.anInt6398 >= 5000) {
			super.anInt6398 = 0;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!og;)V")
	@Override
	public void method5666(@OriginalArg(1) Class155 arg0) {
		super.anInt6395--;
		if (super.anInt6395 < 0) {
			super.anInt6395 = 4999;
		}
		super.aByteArray93[super.anInt6395] = 21;
		super.anObjectArray35[super.anInt6395] = arg0;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IFZILclient!ui;)V")
	@Override
	public void method5667(@OriginalArg(1) float arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class36 arg3) {
		super.aByteArray93[super.anInt6398] = (byte) (arg1 ? arg2 + 40 : arg2 + 30);
		super.anObjectArray35[super.anInt6398] = arg3;
		super.aFloatArray29[super.anInt6398] = arg0;
		super.anInt6398++;
		if (super.anInt6398 >= 5000) {
			super.anInt6398 = 0;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!og;I)V")
	@Override
	public void method5660(@OriginalArg(0) Class155 arg0) {
		super.aByteArray93[super.anInt6398] = 20;
		super.anObjectArray35[super.anInt6398] = arg0;
		super.anInt6398++;
		if (super.anInt6398 >= 5000) {
			super.anInt6398 = 0;
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
	@Override
	public void method5669() {
	}
}
