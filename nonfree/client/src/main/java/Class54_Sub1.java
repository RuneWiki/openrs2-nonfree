import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class54_Sub1 extends Class54 {

	@OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
	private int anInt1452 = 0;

	@OriginalMember(owner = "client!dk", name = "n", descriptor = "Lclient!pp;")
	private final Class91 aClass91_1 = new Class91();

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
	@Override
	public void method4337() {
		while (super.anInt5394 != super.anInt5391) {
			this.method1241();
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!sd;B)V")
	@Override
	public void method4347(@OriginalArg(0) Class211 arg0) {
		super.aByteArray71[super.anInt5391] = 20;
		super.anObjectArray4[super.anInt5391] = arg0;
		super.anInt5391++;
		if (super.anInt5391 >= 5000) {
			super.anInt5391 = 0;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)V")
	@Override
	public void method4343(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V")
	private void method1241() {
		@Pc(8) int local8 = super.anInt5394++;
		if (super.anInt5394 >= 5000) {
			super.anInt5394 = 0;
		}
		this.anInt1452 = super.aByteArray71[local8];
		@Pc(42) Object local42 = super.anObjectArray4[local8];
		super.anObjectArray4[local8] = null;
		if (this.anInt1452 == 21) {
			Static251.method3700(this.aClass91_1, (Class211) local42);
		} else if (this.anInt1452 == 20) {
			@Pc(58) Class211 local58 = (Class211) local42;
			if (local58.aClass26_Sub1_2 != null) {
				local58.aClass26_Sub1_2.method5519(Static233.aClass109_7);
			}
			if (local58.aClass26_Sub1_3 != null) {
				local58.aClass26_Sub1_3.method5519(Static233.aClass109_7);
			}
			if (local58.aClass26_Sub3_3 != null) {
				local58.aClass26_Sub3_3.method5519(Static233.aClass109_7);
			}
			if (local58.aClass26_Sub3_2 != null) {
				local58.aClass26_Sub3_2.method5519(Static233.aClass109_7);
			}
			if (local58.aClass26_Sub4_2 != null) {
				local58.aClass26_Sub4_2.method5519(Static233.aClass109_7);
			}
			for (@Pc(101) Class125 local101 = local58.aClass125_3; local101 != null; local101 = local101.aClass125_1) {
				local101.aClass26_Sub2_1.method5519(Static233.aClass109_7);
			}
		} else if (this.anInt1452 >= 30 && this.anInt1452 <= 33) {
			Static233.aClass109_7.o(3000.0F, super.aFloatArray31[local8] * 1.5F);
			((Class136) local42).method5977(Static384.anInt6665, Static379.anInt6498, Static11.anInt315, Static250.aBooleanArrayArray3, this.anInt1452 - 30 == 0);
		} else if (this.anInt1452 >= 40 && this.anInt1452 <= 43) {
			Static233.aClass109_7.o(3000.0F, super.aFloatArray31[local8] * 1.5F);
			((Class136) local42).method5977(Static384.anInt6665, Static379.anInt6498, Static11.anInt315, Static420.aBooleanArrayArray6, this.anInt1452 - 40 == 0);
		} else if (this.anInt1452 == 22) {
			Static233.aClass109_7.fa(-1, 1583160, 40, 127);
		} else if (this.anInt1452 == 23) {
			Static233.aClass109_7.S();
		} else if (this.anInt1452 == 24) {
			Static233.aClass109_7.method4726(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	@Override
	public void method4340() {
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!sd;)V")
	@Override
	public void method4348(@OriginalArg(1) Class211 arg0) {
		super.aByteArray71[super.anInt5391] = 21;
		super.anObjectArray4[super.anInt5391] = arg0;
		super.anInt5391++;
		if (super.anInt5391 >= 5000) {
			super.anInt5391 = 0;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZLclient!sd;)V")
	@Override
	public void method4344(@OriginalArg(1) Class211 arg0) {
		super.anInt5394--;
		if (super.anInt5394 < 0) {
			super.anInt5394 = 4999;
		}
		super.aByteArray71[super.anInt5394] = 21;
		super.anObjectArray4[super.anInt5394] = arg0;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZ)V")
	@Override
	public void method4339(@OriginalArg(0) int arg0) {
		super.aByteArray71[super.anInt5391] = (byte) arg0;
		super.anInt5391++;
		if (super.anInt5391 >= 5000) {
			super.anInt5391 = 0;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZLclient!na;FII)V")
	@Override
	public void method4351(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3) {
		super.aByteArray71[super.anInt5391] = (byte) (arg0 ? arg3 + 40 : arg3 + 30);
		super.anObjectArray4[super.anInt5391] = arg1;
		super.aFloatArray31[super.anInt5391] = arg2;
		super.anInt5391++;
		if (super.anInt5391 >= 5000) {
			super.anInt5391 = 0;
		}
	}
}
