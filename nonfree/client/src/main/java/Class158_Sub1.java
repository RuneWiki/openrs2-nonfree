import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class158_Sub1 extends Class158 {

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
	private int anInt3950 = 0;

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "Lclient!cga;")
	private final Class2 aClass2_1 = new Class2();

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!d;IZI)V")
	@Override
	public void method5358(@OriginalArg(0) Class60 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		super.aByteArray79[super.anInt6301] = (byte) (arg1 ? arg2 + 40 : arg2 + 30);
		super.anObjectArray35[super.anInt6301] = arg0;
		super.anInt6301++;
		if (super.anInt6301 >= 5000) {
			super.anInt6301 = 0;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
	@Override
	public void method5357() {
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(Lclient!af;I)V")
	@Override
	public void method5355(@OriginalArg(0) Class9 arg0) {
		super.anInt6302--;
		if (super.anInt6302 < 0) {
			super.anInt6302 = 4999;
		}
		super.aByteArray79[super.anInt6302] = 21;
		super.anObjectArray35[super.anInt6302] = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
	private void method3412() {
		@Pc(8) int local8 = super.anInt6302++;
		if (super.anInt6302 >= 5000) {
			super.anInt6302 = 0;
		}
		this.anInt3950 = super.aByteArray79[local8];
		@Pc(37) Object local37 = super.anObjectArray35[local8];
		super.anObjectArray35[local8] = null;
		if (this.anInt3950 == 21) {
			Static75.method7891(this.aClass2_1, (Class9) local37);
		} else if (this.anInt3950 == 20) {
			@Pc(57) Class9 local57 = (Class9) local37;
			if (local57.aClass29_Sub5_1 != null) {
				local57.aClass29_Sub5_1.method7544(Static432.aClass121_14);
			}
			if (local57.aClass29_Sub5_2 != null) {
				local57.aClass29_Sub5_2.method7544(Static432.aClass121_14);
			}
			if (local57.aClass29_Sub1_2 != null) {
				local57.aClass29_Sub1_2.method7544(Static432.aClass121_14);
			}
			if (local57.aClass29_Sub1_1 != null) {
				local57.aClass29_Sub1_1.method7544(Static432.aClass121_14);
			}
			if (local57.aClass29_Sub3_1 != null) {
				local57.aClass29_Sub3_1.method7544(Static432.aClass121_14);
			}
			for (@Pc(100) Class66 local100 = local57.aClass66_1; local100 != null; local100 = local100.aClass66_2) {
				local100.aClass29_Sub2_1.method7544(Static432.aClass121_14);
			}
		} else if (this.anInt3950 >= 30 && this.anInt3950 <= 33) {
			((Class60) local37).method7896(Static325.anInt5850, Static486.anInt8128, Static387.anInt6907, Static6.aBooleanArrayArray3, this.anInt3950 - 30 == 0);
		} else if (this.anInt3950 >= 40 && this.anInt3950 <= 43) {
			((Class60) local37).method7896(Static325.anInt5850, Static486.anInt8128, Static387.anInt6907, Static286.aBooleanArrayArray5, this.anInt3950 - 40 == 0);
		} else if (this.anInt3950 == 22) {
			Static432.aClass121_14.AA(-1, 1583160, 40, 127);
		} else if (this.anInt3950 == 23) {
			Static432.aClass121_14.k();
			return;
		} else if (this.anInt3950 == 24) {
			Static432.aClass121_14.method7158(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!af;I)V")
	@Override
	public void method5354(@OriginalArg(0) Class9 arg0) {
		super.aByteArray79[super.anInt6301] = 20;
		super.anObjectArray35[super.anInt6301] = arg0;
		super.anInt6301++;
		if (super.anInt6301 >= 5000) {
			super.anInt6301 = 0;
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5359(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
	@Override
	public void method5352() {
		while (super.anInt6302 != super.anInt6301) {
			this.method3412();
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5351(@OriginalArg(1) int arg0) {
		super.aByteArray79[super.anInt6301] = (byte) arg0;
		super.anInt6301++;
		if (super.anInt6301 >= 5000) {
			super.anInt6301 = 0;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!af;)V")
	@Override
	public void method5353(@OriginalArg(1) Class9 arg0) {
		super.aByteArray79[super.anInt6301] = 21;
		super.anObjectArray35[super.anInt6301] = arg0;
		super.anInt6301++;
		if (super.anInt6301 >= 5000) {
			super.anInt6301 = 0;
		}
	}
}
