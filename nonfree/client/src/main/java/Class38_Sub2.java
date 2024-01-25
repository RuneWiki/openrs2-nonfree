import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class38_Sub2 extends Class38 {

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
	private int anInt4729 = 0;

	@OriginalMember(owner = "client!pb", name = "C", descriptor = "Lclient!gr;")
	private final Class88 aClass88_1 = new Class88();

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
	@Override
	public void method4168(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V")
	private void method4172() {
		@Pc(12) int local12 = super.anInt4722++;
		if (super.anInt4722 >= 5000) {
			super.anInt4722 = 0;
		}
		this.anInt4729 = super.aByteArray82[local12];
		@Pc(38) Object local38 = super.anObjectArray35[local12];
		super.anObjectArray35[local12] = null;
		if (this.anInt4729 == 21) {
			Static343.method5591(this.aClass88_1, (Class106) local38);
		} else if (this.anInt4729 == 20) {
			@Pc(58) Class106 local58 = (Class106) local38;
			if (local58.aClass67_Sub2_1 != null) {
				local58.aClass67_Sub2_1.method5395(Static174.aClass129_5);
			}
			if (local58.aClass67_Sub2_2 != null) {
				local58.aClass67_Sub2_2.method5395(Static174.aClass129_5);
			}
			if (local58.aClass67_Sub1_1 != null) {
				local58.aClass67_Sub1_1.method5395(Static174.aClass129_5);
			}
			if (local58.aClass67_Sub1_2 != null) {
				local58.aClass67_Sub1_2.method5395(Static174.aClass129_5);
			}
			if (local58.aClass67_Sub4_1 != null) {
				local58.aClass67_Sub4_1.method5395(Static174.aClass129_5);
			}
			for (@Pc(101) Class64 local101 = local58.aClass64_4; local101 != null; local101 = local101.aClass64_2) {
				local101.aClass67_Sub3_1.method5395(Static174.aClass129_5);
			}
			return;
		} else if (this.anInt4729 < 30 || this.anInt4729 > 33) {
			if (this.anInt4729 >= 40 && this.anInt4729 <= 43) {
				Static174.aClass129_5.method4986(3000.0F, super.aFloatArray23[local12] * 1.5F);
				((Class77) local38).method4134(Static6.anInt4021, Static104.anInt1932, Static209.anInt4263, Static195.aBooleanArrayArray6, this.anInt4729 - 40 == 0);
				return;
			}
			if (this.anInt4729 == 22) {
				Static174.aClass129_5.method5019();
				return;
			}
			if (this.anInt4729 == 23) {
				Static174.aClass129_5.method4950();
				return;
			}
			if (this.anInt4729 == 24) {
				Static174.aClass129_5.method4963(0, null);
				return;
			}
		} else {
			Static174.aClass129_5.method4986(3000.0F, super.aFloatArray23[local12] * 1.5F);
			((Class77) local38).method4134(Static6.anInt4021, Static104.anInt1932, Static209.anInt4263, Static8.aBooleanArrayArray1, this.anInt4729 - 30 == 0);
			return;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!jd;)V")
	@Override
	public void method4166(@OriginalArg(1) Class106 arg0) {
		super.anInt4722--;
		if (super.anInt4722 < 0) {
			super.anInt4722 = 4999;
		}
		super.aByteArray82[super.anInt4722] = 21;
		super.anObjectArray35[super.anInt4722] = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(FILclient!ij;ZI)V")
	@Override
	public void method4165(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77 arg2, @OriginalArg(3) boolean arg3) {
		super.aByteArray82[super.anInt4723] = (byte) (arg3 ? arg1 + 40 : arg1 + 30);
		super.anObjectArray35[super.anInt4723] = arg2;
		super.aFloatArray23[super.anInt4723] = arg0;
		super.anInt4723++;
		if (super.anInt4723 >= 5000) {
			super.anInt4723 = 0;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)V")
	@Override
	public void method4167(@OriginalArg(1) int arg0) {
		super.aByteArray82[super.anInt4723] = (byte) arg0;
		super.anInt4723++;
		if (super.anInt4723 >= 5000) {
			super.anInt4723 = 0;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!jd;Z)V")
	@Override
	public void method4163(@OriginalArg(0) Class106 arg0) {
		super.aByteArray82[super.anInt4723] = 21;
		super.anObjectArray35[super.anInt4723] = arg0;
		super.anInt4723++;
		if (super.anInt4723 >= 5000) {
			super.anInt4723 = 0;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
	@Override
	public void method4169() {
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	@Override
	public void method4170() {
		while (super.anInt4723 != super.anInt4722) {
			this.method4172();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLclient!jd;)V")
	@Override
	public void method4164(@OriginalArg(1) Class106 arg0) {
		super.aByteArray82[super.anInt4723] = 20;
		super.anObjectArray35[super.anInt4723] = arg0;
		super.anInt4723++;
		if (super.anInt4723 >= 5000) {
			super.anInt4723 = 0;
		}
	}
}
