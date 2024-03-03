import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!db", name = "l", descriptor = "[I")
	public static final int[] anIntArray102 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!db", name = "n", descriptor = "I")
	public static int anInt1415 = 0;

	@OriginalMember(owner = "client!db", name = "k", descriptor = "I")
	private int anInt1413 = 0;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "Lclient!hc;")
	private final Class90 aClass90_1 = new Class90();

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!f;)V", line = 3)
	@Override
	public void method1586(@OriginalArg(1) Class67 arg0) {
		super.anInt1408--;
		if (super.anInt1408 < 0) {
			super.anInt1408 = 4999;
		}
		super.aByteArray16[super.anInt1408] = 21;
		super.anObjectArray3[super.anInt1408] = arg0;
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V", line = 22)
	private void method1589() {
		@Pc(8) int local8 = super.anInt1408++;
		if (super.anInt1408 >= 5000) {
			super.anInt1408 = 0;
		}
		this.anInt1413 = super.aByteArray16[local8];
		@Pc(34) Object local34 = super.anObjectArray3[local8];
		super.anObjectArray3[local8] = null;
		if (this.anInt1413 == 21) {
			Static84.method5951(this.aClass90_1, (Class67) local34);
		} else if (this.anInt1413 == 20) {
			@Pc(57) Class67 local57 = (Class67) local34;
			if (local57.aClass11_Sub1_3 != null) {
				local57.aClass11_Sub1_3.method6071(Static16.aClass19_10);
			}
			if (local57.aClass11_Sub1_2 != null) {
				local57.aClass11_Sub1_2.method6071(Static16.aClass19_10);
			}
			if (local57.aClass11_Sub3_2 != null) {
				local57.aClass11_Sub3_2.method6071(Static16.aClass19_10);
			}
			if (local57.aClass11_Sub3_3 != null) {
				local57.aClass11_Sub3_3.method6071(Static16.aClass19_10);
			}
			if (local57.aClass11_Sub2_2 != null) {
				local57.aClass11_Sub2_2.method6071(Static16.aClass19_10);
			}
			for (@Pc(100) Class22 local100 = local57.aClass22_2; local100 != null; local100 = local100.aClass22_1) {
				local100.aClass11_Sub5_1.method6071(Static16.aClass19_10);
			}
		} else if (this.anInt1413 >= 30 && this.anInt1413 <= 33) {
			Static16.aClass19_10.method2825(3000.0F, super.aFloatArray11[local8] * 1.5F);
			((Class6) local34).method5730(Static229.anInt4641, Static197.anInt3776, Static198.anInt3784, Static6.aBooleanArrayArray1, this.anInt1413 - 30 == 0);
		} else if (this.anInt1413 >= 40 && this.anInt1413 <= 43) {
			Static16.aClass19_10.method2825(3000.0F, super.aFloatArray11[local8] * 1.5F);
			((Class6) local34).method5730(Static229.anInt4641, Static197.anInt3776, Static198.anInt3784, Static339.aBooleanArrayArray5, this.anInt1413 - 40 == 0);
		} else if (this.anInt1413 == 22) {
			Static16.aClass19_10.method2882();
		} else if (this.anInt1413 == 23) {
			Static16.aClass19_10.method2884();
		} else if (this.anInt1413 == 24) {
			Static16.aClass19_10.method2836(0, null);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!f;B)V", line = 115)
	@Override
	public void method1581(@OriginalArg(0) Class67 arg0) {
		super.aByteArray16[super.anInt1409] = 20;
		super.anObjectArray3[super.anInt1409] = arg0;
		super.anInt1409++;
		if (super.anInt1409 >= 5000) {
			super.anInt1409 = 0;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)V", line = 131)
	@Override
	public void method1584(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!f;I)V", line = 140)
	@Override
	public void method1585(@OriginalArg(0) Class67 arg0) {
		super.aByteArray16[super.anInt1409] = 21;
		super.anObjectArray3[super.anInt1409] = arg0;
		super.anInt1409++;
		if (super.anInt1409 >= 5000) {
			super.anInt1409 = 0;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V", line = 157)
	@Override
	public void method1580(@OriginalArg(0) int arg0) {
		super.aByteArray16[super.anInt1409] = (byte) arg0;
		super.anInt1409++;
		if (super.anInt1409 >= 5000) {
			super.anInt1409 = 0;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!tf;ZFII)V", line = 173)
	@Override
	public void method1579(@OriginalArg(0) Class6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		super.aByteArray16[super.anInt1409] = (byte) (arg1 ? arg3 + 40 : arg3 + 30);
		super.anObjectArray3[super.anInt1409] = arg0;
		super.aFloatArray11[super.anInt1409] = arg2;
		super.anInt1409++;
		if (super.anInt1409 >= 5000) {
			super.anInt1409 = 0;
		}
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V", line = 212)
	@Override
	public void method1588() {
		while (super.anInt1408 != super.anInt1409) {
			this.method1589();
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V", line = 227)
	@Override
	public void method1587() {
	}
}
