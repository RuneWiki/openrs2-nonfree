import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class54_Sub1 extends Class54 {

	@OriginalMember(owner = "client!de", name = "B", descriptor = "I")
	private int anInt1231 = 0;

	@OriginalMember(owner = "client!de", name = "y", descriptor = "Lclient!ak;")
	private final Class10 aClass10_1 = new Class10();

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
	@Override
	public void method1117() {
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BLclient!ke;)V")
	@Override
	public void method1115(@OriginalArg(1) Class132 arg0) {
		super.anInt1352--;
		if (super.anInt1352 < 0) {
			super.anInt1352 = 4999;
		}
		super.aByteArray28[super.anInt1352] = 21;
		super.anObjectArray3[super.anInt1352] = arg0;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!cl;ZIF)V")
	@Override
	public void method1114(@OriginalArg(0) int arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) float arg3) {
		super.aByteArray28[super.anInt1354] = (byte) (arg2 ? arg0 + 40 : arg0 + 30);
		super.anObjectArray3[super.anInt1354] = arg1;
		super.aFloatArray6[super.anInt1354] = arg3;
		super.anInt1354++;
		if (super.anInt1354 >= 5000) {
			super.anInt1354 = 0;
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
	private void method1002() {
		@Pc(8) int local8 = super.anInt1352++;
		if (super.anInt1352 >= 5000) {
			super.anInt1352 = 0;
		}
		this.anInt1231 = super.aByteArray28[local8];
		@Pc(32) Object local32 = super.anObjectArray3[local8];
		super.anObjectArray3[local8] = null;
		if (this.anInt1231 == 21) {
			Static348.method5091(this.aClass10_1, (Class132) local32);
		} else if (this.anInt1231 == 20) {
			@Pc(160) Class132 local160 = (Class132) local32;
			if (local160.aClass25_Sub5_1 != null) {
				local160.aClass25_Sub5_1.method5232(Static90.aClass164_3);
			}
			if (local160.aClass25_Sub5_2 != null) {
				local160.aClass25_Sub5_2.method5232(Static90.aClass164_3);
			}
			if (local160.aClass25_Sub3_2 != null) {
				local160.aClass25_Sub3_2.method5232(Static90.aClass164_3);
			}
			if (local160.aClass25_Sub3_1 != null) {
				local160.aClass25_Sub3_1.method5232(Static90.aClass164_3);
			}
			if (local160.aClass25_Sub4_2 != null) {
				local160.aClass25_Sub4_2.method5232(Static90.aClass164_3);
			}
			for (@Pc(203) Class116 local203 = local160.aClass116_3; local203 != null; local203 = local203.aClass116_2) {
				local203.aClass25_Sub1_1.method5232(Static90.aClass164_3);
			}
		} else if (this.anInt1231 >= 30 && this.anInt1231 <= 33) {
			Static90.aClass164_3.method5314(3000.0F, super.aFloatArray6[local8] * 1.5F);
			((Class42) local32).method3053(Static266.anInt4625, Static249.anInt4358, Static32.anInt647, Static54.aBooleanArrayArray1, this.anInt1231 - 30 == 0);
		} else if (this.anInt1231 >= 40 && this.anInt1231 <= 43) {
			Static90.aClass164_3.method5314(3000.0F, super.aFloatArray6[local8] * 1.5F);
			((Class42) local32).method3053(Static266.anInt4625, Static249.anInt4358, Static32.anInt647, Static63.aBooleanArrayArray5, this.anInt1231 - 40 == 0);
		} else if (this.anInt1231 == 22) {
			Static90.aClass164_3.method5330();
		} else if (this.anInt1231 == 23) {
			Static90.aClass164_3.method5324();
		} else if (this.anInt1231 == 24) {
			Static90.aClass164_3.method5355(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	@Override
	public void method1109() {
		while (super.anInt1352 != super.anInt1354) {
			this.method1002();
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(BLclient!ke;)V")
	@Override
	public void method1120(@OriginalArg(1) Class132 arg0) {
		super.aByteArray28[super.anInt1354] = 20;
		super.anObjectArray3[super.anInt1354] = arg0;
		super.anInt1354++;
		if (super.anInt1354 >= 5000) {
			super.anInt1354 = 0;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V")
	@Override
	public void method1111(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)V")
	@Override
	public void method1110(@OriginalArg(0) int arg0) {
		super.aByteArray28[super.anInt1354] = (byte) arg0;
		super.anInt1354++;
		if (super.anInt1354 >= 5000) {
			super.anInt1354 = 0;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ke;I)V")
	@Override
	public void method1116(@OriginalArg(0) Class132 arg0) {
		super.aByteArray28[super.anInt1354] = 21;
		super.anObjectArray3[super.anInt1354] = arg0;
		super.anInt1354++;
		if (super.anInt1354 >= 5000) {
			super.anInt1354 = 0;
		}
	}
}
