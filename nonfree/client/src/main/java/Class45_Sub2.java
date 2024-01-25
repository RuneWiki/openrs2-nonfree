import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class45_Sub2 extends Class45 {

	@OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
	private int anInt4438 = 0;

	@OriginalMember(owner = "client!nm", name = "y", descriptor = "Lclient!pl;")
	private final Class158 aClass158_1 = new Class158();

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(FBIZLclient!uh;)V")
	@Override
	public void method3945(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class60 arg3) {
		super.aByteArray58[super.anInt4430] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
		super.anObjectArray33[super.anInt4430] = arg3;
		super.aFloatArray25[super.anInt4430] = arg0;
		super.anInt4430++;
		if (super.anInt4430 >= 5000) {
			super.anInt4430 = 0;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!ls;Z)V")
	@Override
	public void method3941(@OriginalArg(0) Class128 arg0) {
		super.aByteArray58[super.anInt4430] = 21;
		super.anObjectArray33[super.anInt4430] = arg0;
		super.anInt4430++;
		if (super.anInt4430 >= 5000) {
			super.anInt4430 = 0;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V")
	@Override
	public void method3950() {
		while (super.anInt4430 != super.anInt4432) {
			this.method3954();
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!ls;B)V")
	@Override
	public void method3952(@OriginalArg(0) Class128 arg0) {
		super.anInt4432--;
		if (super.anInt4432 < 0) {
			super.anInt4432 = 4999;
		}
		super.aByteArray58[super.anInt4432] = 21;
		super.anObjectArray33[super.anInt4432] = arg0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IB)V")
	@Override
	public void method3951(@OriginalArg(0) int arg0) {
		super.aByteArray58[super.anInt4430] = (byte) arg0;
		super.anInt4430++;
		if (super.anInt4430 >= 5000) {
			super.anInt4430 = 0;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)V")
	@Override
	public void method3938(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V")
	@Override
	public void method3946() {
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILclient!ls;)V")
	@Override
	public void method3947(@OriginalArg(1) Class128 arg0) {
		super.aByteArray58[super.anInt4430] = 20;
		super.anObjectArray33[super.anInt4430] = arg0;
		super.anInt4430++;
		if (super.anInt4430 >= 5000) {
			super.anInt4430 = 0;
		}
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
	private void method3954() {
		@Pc(13) int local13 = super.anInt4432++;
		if (super.anInt4432 >= 5000) {
			super.anInt4432 = 0;
		}
		this.anInt4438 = super.aByteArray58[local13];
		@Pc(37) Object local37 = super.anObjectArray33[local13];
		super.anObjectArray33[local13] = null;
		if (this.anInt4438 == 21) {
			Static127.method2628(this.aClass158_1, (Class128) local37);
		} else if (this.anInt4438 == 20) {
			@Pc(61) Class128 local61 = (Class128) local37;
			if (local61.aClass8_Sub4_1 != null) {
				local61.aClass8_Sub4_1.method5627(Static170.aClass47_5);
			}
			if (local61.aClass8_Sub4_2 != null) {
				local61.aClass8_Sub4_2.method5627(Static170.aClass47_5);
			}
			if (local61.aClass8_Sub2_1 != null) {
				local61.aClass8_Sub2_1.method5627(Static170.aClass47_5);
			}
			if (local61.aClass8_Sub2_2 != null) {
				local61.aClass8_Sub2_2.method5627(Static170.aClass47_5);
			}
			if (local61.aClass8_Sub5_1 != null) {
				local61.aClass8_Sub5_1.method5627(Static170.aClass47_5);
			}
			for (@Pc(104) Class117 local104 = local61.aClass117_2; local104 != null; local104 = local104.aClass117_1) {
				local104.aClass8_Sub1_1.method5627(Static170.aClass47_5);
			}
		} else if (this.anInt4438 >= 30 && this.anInt4438 <= 33) {
			Static170.aClass47_5.method2701(3000.0F, super.aFloatArray25[local13] * 1.5F);
			((Class60) local37).method2268(Static61.anInt1578, Static246.anInt5043, Static328.anInt6272, Static339.aBooleanArrayArray2, this.anInt4438 - 30 == 0);
		} else if (this.anInt4438 >= 40 && this.anInt4438 <= 43) {
			Static170.aClass47_5.method2701(3000.0F, super.aFloatArray25[local13] * 1.5F);
			((Class60) local37).method2268(Static61.anInt1578, Static246.anInt5043, Static328.anInt6272, Static229.aBooleanArrayArray6, this.anInt4438 - 40 == 0);
		} else if (this.anInt4438 == 22) {
			Static170.aClass47_5.method2689();
		} else if (this.anInt4438 == 23) {
			Static170.aClass47_5.method2719();
		} else if (this.anInt4438 == 24) {
			Static170.aClass47_5.method2716(0, null);
			return;
		}
	}
}
