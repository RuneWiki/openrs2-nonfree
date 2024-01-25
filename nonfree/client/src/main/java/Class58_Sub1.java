import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class58_Sub1 extends Class58 {

	@OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
	private int anInt1413 = 0;

	@OriginalMember(owner = "client!dm", name = "i", descriptor = "Lclient!ii;")
	private final Class111 aClass111_1 = new Class111();

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)V")
	@Override
	public void method3493(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	@Override
	public void method3491() {
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!ya;FZII)V")
	@Override
	public void method3495(@OriginalArg(0) Class157 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		super.aByteArray53[super.anInt4410] = (byte) (arg2 ? arg3 + 40 : arg3 + 30);
		super.anObjectArray35[super.anInt4410] = arg0;
		super.aFloatArray19[super.anInt4410] = arg1;
		super.anInt4410++;
		if (super.anInt4410 >= 5000) {
			super.anInt4410 = 0;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLclient!no;)V")
	@Override
	public void method3492(@OriginalArg(1) Class169 arg0) {
		super.aByteArray53[super.anInt4410] = 20;
		super.anObjectArray35[super.anInt4410] = arg0;
		super.anInt4410++;
		if (super.anInt4410 >= 5000) {
			super.anInt4410 = 0;
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(II)V")
	@Override
	public void method3497(@OriginalArg(1) int arg0) {
		super.aByteArray53[super.anInt4410] = (byte) arg0;
		super.anInt4410++;
		if (super.anInt4410 >= 5000) {
			super.anInt4410 = 0;
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(BLclient!no;)V")
	@Override
	public void method3494(@OriginalArg(1) Class169 arg0) {
		super.anInt4409--;
		if (super.anInt4409 < 0) {
			super.anInt4409 = 4999;
		}
		super.aByteArray53[super.anInt4409] = 21;
		super.anObjectArray35[super.anInt4409] = arg0;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
	private void method1268() {
		@Pc(15) int local15 = super.anInt4409++;
		if (super.anInt4409 >= 5000) {
			super.anInt4409 = 0;
		}
		this.anInt1413 = super.aByteArray53[local15];
		@Pc(41) Object local41 = super.anObjectArray35[local15];
		super.anObjectArray35[local15] = null;
		if (this.anInt1413 == 21) {
			Static254.method3670(this.aClass111_1, (Class169) local41);
		} else if (this.anInt1413 == 20) {
			@Pc(65) Class169 local65 = (Class169) local41;
			if (local65.aClass25_Sub4_2 != null) {
				local65.aClass25_Sub4_2.method4606(Static52.aClass34_1);
			}
			if (local65.aClass25_Sub4_1 != null) {
				local65.aClass25_Sub4_1.method4606(Static52.aClass34_1);
			}
			if (local65.aClass25_Sub1_2 != null) {
				local65.aClass25_Sub1_2.method4606(Static52.aClass34_1);
			}
			if (local65.aClass25_Sub1_3 != null) {
				local65.aClass25_Sub1_3.method4606(Static52.aClass34_1);
			}
			if (local65.aClass25_Sub2_2 != null) {
				local65.aClass25_Sub2_2.method4606(Static52.aClass34_1);
			}
			for (@Pc(108) Class27 local108 = local65.aClass27_3; local108 != null; local108 = local108.aClass27_1) {
				local108.aClass25_Sub5_1.method4606(Static52.aClass34_1);
			}
		} else if (this.anInt1413 >= 30 && this.anInt1413 <= 33) {
			Static52.aClass34_1.da(3000.0F, super.aFloatArray19[local15] * 1.5F);
			((Class157) local41).method4944(Static321.anInt5494, Static64.anInt1211, Static179.anInt3132, Static44.aBooleanArrayArray1, this.anInt1413 - 30 == 0);
		} else if (this.anInt1413 >= 40 && this.anInt1413 <= 43) {
			Static52.aClass34_1.da(3000.0F, super.aFloatArray19[local15] * 1.5F);
			((Class157) local41).method4944(Static321.anInt5494, Static64.anInt1211, Static179.anInt3132, Static431.aBooleanArrayArray6, this.anInt1413 - 40 == 0);
		} else if (this.anInt1413 == 22) {
			Static52.aClass34_1.s(-1, 1583160, 40, 127);
		} else if (this.anInt1413 == 23) {
			Static52.aClass34_1.n();
			return;
		} else if (this.anInt1413 == 24) {
			Static52.aClass34_1.method5730(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!no;B)V")
	@Override
	public void method3489(@OriginalArg(0) Class169 arg0) {
		super.aByteArray53[super.anInt4410] = 21;
		super.anObjectArray35[super.anInt4410] = arg0;
		super.anInt4410++;
		if (super.anInt4410 >= 5000) {
			super.anInt4410 = 0;
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
	@Override
	public void method3496() {
		while (super.anInt4410 != super.anInt4409) {
			this.method1268();
		}
	}
}
