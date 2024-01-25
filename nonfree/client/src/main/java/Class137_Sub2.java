import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class137_Sub2 extends Class137 {

	@OriginalMember(owner = "client!ro", name = "u", descriptor = "I")
	private int anInt7831 = 0;

	@OriginalMember(owner = "client!ro", name = "n", descriptor = "Lclient!haa;")
	private final Class109 aClass109_1 = new Class109();

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(B)V")
	private void method6555() {
		@Pc(15) int local15 = super.anInt7816++;
		if (super.anInt7816 >= 5000) {
			super.anInt7816 = 0;
		}
		this.anInt7831 = super.aByteArray104[local15];
		@Pc(41) Object local41 = super.anObjectArray5[local15];
		super.anObjectArray5[local15] = null;
		if (this.anInt7831 == 21) {
			Static490.method6645(this.aClass109_1, (Class262) local41);
		} else if (this.anInt7831 == 20) {
			@Pc(65) Class262 local65 = (Class262) local41;
			if (local65.aClass1_Sub2_3 != null) {
				local65.aClass1_Sub2_3.method7677(Static452.aClass39_10);
			}
			if (local65.aClass1_Sub2_2 != null) {
				local65.aClass1_Sub2_2.method7677(Static452.aClass39_10);
			}
			if (local65.aClass1_Sub3_2 != null) {
				local65.aClass1_Sub3_2.method7677(Static452.aClass39_10);
			}
			if (local65.aClass1_Sub3_3 != null) {
				local65.aClass1_Sub3_3.method7677(Static452.aClass39_10);
			}
			if (local65.aClass1_Sub4_1 != null) {
				local65.aClass1_Sub4_1.method7677(Static452.aClass39_10);
			}
			for (@Pc(108) Class187 local108 = local65.aClass187_3; local108 != null; local108 = local108.aClass187_1) {
				local108.aClass1_Sub1_1.method7677(Static452.aClass39_10);
			}
		} else if (this.anInt7831 >= 30 && this.anInt7831 <= 33) {
			Static452.aClass39_10.la(3000.0F, super.aFloatArray68[local15] * 1.5F);
			((Class75) local41).method6705(Static364.anInt6864, Static113.anInt2306, Static207.anInt3723, Static533.aBooleanArrayArray6, this.anInt7831 - 30 == 0);
		} else if (this.anInt7831 >= 40 && this.anInt7831 <= 43) {
			Static452.aClass39_10.la(3000.0F, super.aFloatArray68[local15] * 1.5F);
			((Class75) local41).method6705(Static364.anInt6864, Static113.anInt2306, Static207.anInt3723, Static138.aBooleanArrayArray1, this.anInt7831 - 40 == 0);
		} else if (this.anInt7831 == 22) {
			Static452.aClass39_10.q(-1, 1583160, 40, 127);
		} else if (this.anInt7831 == 23) {
			Static452.aClass39_10.xa();
		} else if (this.anInt7831 == 24) {
			Static452.aClass39_10.method6063(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V")
	@Override
	public void method6552() {
		while (super.anInt7816 != super.anInt7820) {
			this.method6555();
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V")
	@Override
	public void method6547() {
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6550(@OriginalArg(0) int arg0) {
		super.aByteArray104[super.anInt7820] = (byte) arg0;
		super.anInt7820++;
		if (super.anInt7820 >= 5000) {
			super.anInt7820 = 0;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(FIIZLclient!sa;)V")
	@Override
	public void method6545(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class75 arg3) {
		super.aByteArray104[super.anInt7820] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
		super.anObjectArray5[super.anInt7820] = arg3;
		super.aFloatArray68[super.anInt7820] = arg0;
		super.anInt7820++;
		if (super.anInt7820 >= 5000) {
			super.anInt7820 = 0;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!sk;B)V")
	@Override
	public void method6554(@OriginalArg(0) Class262 arg0) {
		super.aByteArray104[super.anInt7820] = 20;
		super.anObjectArray5[super.anInt7820] = arg0;
		super.anInt7820++;
		if (super.anInt7820 >= 5000) {
			super.anInt7820 = 0;
		}
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(BLclient!sk;)V")
	@Override
	public void method6551(@OriginalArg(1) Class262 arg0) {
		super.aByteArray104[super.anInt7820] = 21;
		super.anObjectArray5[super.anInt7820] = arg0;
		super.anInt7820++;
		if (super.anInt7820 >= 5000) {
			super.anInt7820 = 0;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BLclient!sk;)V")
	@Override
	public void method6546(@OriginalArg(1) Class262 arg0) {
		super.anInt7816--;
		if (super.anInt7816 < 0) {
			super.anInt7816 = 4999;
		}
		super.aByteArray104[super.anInt7816] = 21;
		super.anObjectArray5[super.anInt7816] = arg0;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)V")
	@Override
	public void method6553(@OriginalArg(1) int arg0) {
	}
}
