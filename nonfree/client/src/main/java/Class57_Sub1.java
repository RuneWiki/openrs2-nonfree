import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class57_Sub1 extends Class57 {

	@OriginalMember(owner = "client!es", name = "D", descriptor = "I")
	private int anInt1892 = 0;

	@OriginalMember(owner = "client!es", name = "A", descriptor = "Lclient!kk;")
	private final Class117 aClass117_1 = new Class117();

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BI)V")
	@Override
	public void method2406(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!we;I)V")
	@Override
	public void method2405(@OriginalArg(0) Class213 arg0) {
		super.aByteArray67[super.anInt2497] = 21;
		super.anObjectArray4[super.anInt2497] = arg0;
		super.anInt2497++;
		if (super.anInt2497 >= 5000) {
			super.anInt2497 = 0;
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(B)V")
	private void method1944() {
		@Pc(8) int local8 = super.anInt2495++;
		if (super.anInt2495 >= 5000) {
			super.anInt2495 = 0;
		}
		this.anInt1892 = super.aByteArray67[local8];
		@Pc(32) Object local32 = super.anObjectArray4[local8];
		super.anObjectArray4[local8] = null;
		if (this.anInt1892 == 21) {
			Static335.method5775(this.aClass117_1, (Class213) local32);
		} else if (this.anInt1892 == 20) {
			@Pc(154) Class213 local154 = (Class213) local32;
			if (local154.aClass10_Sub2_2 != null) {
				local154.aClass10_Sub2_2.method5343(Static160.aClass46_4);
			}
			if (local154.aClass10_Sub2_1 != null) {
				local154.aClass10_Sub2_1.method5343(Static160.aClass46_4);
			}
			if (local154.aClass10_Sub4_1 != null) {
				local154.aClass10_Sub4_1.method5343(Static160.aClass46_4);
			}
			if (local154.aClass10_Sub4_2 != null) {
				local154.aClass10_Sub4_2.method5343(Static160.aClass46_4);
			}
			if (local154.aClass10_Sub5_1 != null) {
				local154.aClass10_Sub5_1.method5343(Static160.aClass46_4);
			}
			for (@Pc(197) Class81 local197 = local154.aClass81_4; local197 != null; local197 = local197.aClass81_3) {
				local197.aClass10_Sub3_1.method5343(Static160.aClass46_4);
			}
		} else if (this.anInt1892 >= 30 && this.anInt1892 <= 33) {
			Static160.aClass46_4.method5161(3000.0F, super.aFloatArray8[local8] * 1.5F);
			((Class114) local32).method3608(Static93.anInt2184, Static18.anInt373, Static312.anInt6032, Static134.aBooleanArrayArray1, this.anInt1892 - 30 == 0);
		} else if (this.anInt1892 >= 40 && this.anInt1892 <= 43) {
			Static160.aClass46_4.method5161(3000.0F, super.aFloatArray8[local8] * 1.5F);
			((Class114) local32).method3608(Static93.anInt2184, Static18.anInt373, Static312.anInt6032, Static272.aBooleanArrayArray4, this.anInt1892 - 40 == 0);
		} else if (this.anInt1892 == 22) {
			Static160.aClass46_4.method5126();
		} else if (this.anInt1892 == 23) {
			Static160.aClass46_4.method5131();
		} else if (this.anInt1892 == 24) {
			Static160.aClass46_4.method5124(0, null);
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V")
	@Override
	public void method2404() {
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!lf;ZFIZ)V")
	@Override
	public void method2408(@OriginalArg(0) Class114 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		super.aByteArray67[super.anInt2497] = (byte) (arg3 ? arg2 + 40 : arg2 + 30);
		super.anObjectArray4[super.anInt2497] = arg0;
		super.aFloatArray8[super.anInt2497] = arg1;
		super.anInt2497++;
		if (super.anInt2497 >= 5000) {
			super.anInt2497 = 0;
		}
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(Lclient!we;I)V")
	@Override
	public void method2411(@OriginalArg(0) Class213 arg0) {
		super.aByteArray67[super.anInt2497] = 20;
		super.anObjectArray4[super.anInt2497] = arg0;
		super.anInt2497++;
		if (super.anInt2497 >= 5000) {
			super.anInt2497 = 0;
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BLclient!we;)V")
	@Override
	public void method2409(@OriginalArg(1) Class213 arg0) {
		super.anInt2495--;
		if (super.anInt2495 < 0) {
			super.anInt2495 = 4999;
		}
		super.aByteArray67[super.anInt2495] = 21;
		super.anObjectArray4[super.anInt2495] = arg0;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V")
	@Override
	public void method2403(@OriginalArg(0) int arg0) {
		super.aByteArray67[super.anInt2497] = (byte) arg0;
		super.anInt2497++;
		if (super.anInt2497 >= 5000) {
			super.anInt2497 = 0;
		}
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(I)V")
	@Override
	public void method2407() {
		while (super.anInt2495 != super.anInt2497) {
			this.method1944();
		}
	}
}
