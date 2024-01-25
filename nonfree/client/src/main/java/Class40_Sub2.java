import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class40_Sub2 extends Class40 {

	@OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
	private int anInt9391 = 0;

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "Lclient!dw;")
	private final Class78 aClass78_1 = new Class78();

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
	private void method7717() {
		@Pc(8) int local8 = super.anInt9384++;
		if (super.anInt9384 >= 5000) {
			super.anInt9384 = 0;
		}
		this.anInt9391 = super.aByteArray116[local8];
		@Pc(32) Object local32 = super.anObjectArray36[local8];
		super.anObjectArray36[local8] = null;
		if (this.anInt9391 == 21) {
			Static439.method7891(this.aClass78_1, (Class100) local32);
		} else if (this.anInt9391 == 20) {
			@Pc(64) Class100 local64 = (Class100) local32;
			if (local64.aClass10_Sub2_3 != null) {
				local64.aClass10_Sub2_3.method7729(Static474.aClass66_8);
			}
			if (local64.aClass10_Sub2_2 != null) {
				local64.aClass10_Sub2_2.method7729(Static474.aClass66_8);
			}
			if (local64.aClass10_Sub4_1 != null) {
				local64.aClass10_Sub4_1.method7729(Static474.aClass66_8);
			}
			if (local64.aClass10_Sub4_2 != null) {
				local64.aClass10_Sub4_2.method7729(Static474.aClass66_8);
			}
			if (local64.aClass10_Sub5_1 != null) {
				local64.aClass10_Sub5_1.method7729(Static474.aClass66_8);
			}
			for (@Pc(107) Class35 local107 = local64.aClass35_2; local107 != null; local107 = local107.aClass35_1) {
				local107.aClass10_Sub1_1.method7729(Static474.aClass66_8);
			}
		} else if (this.anInt9391 >= 30 && this.anInt9391 <= 33) {
			((Class16) local32).method8041(Static22.anInt439, Static140.anInt3150, Static415.anInt7175, Static56.aBooleanArrayArray1, this.anInt9391 - 30 == 0);
		} else if (this.anInt9391 >= 40 && this.anInt9391 <= 43) {
			((Class16) local32).method8041(Static22.anInt439, Static140.anInt3150, Static415.anInt7175, Static575.aBooleanArrayArray6, this.anInt9391 - 40 == 0);
		} else if (this.anInt9391 == 22) {
			Static474.aClass66_8.AA(-1, 1583160, 40, 127);
		} else if (this.anInt9391 == 23) {
			Static474.aClass66_8.k();
		} else if (this.anInt9391 == 24) {
			Static474.aClass66_8.method6785(0, null);
			return;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLclient!d;IZ)V")
	@Override
	public void method7709(@OriginalArg(1) Class16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		super.aByteArray116[super.anInt9379] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
		super.anObjectArray36[super.anInt9379] = arg0;
		super.anInt9379++;
		if (super.anInt9379 >= 5000) {
			super.anInt9379 = 0;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7714(@OriginalArg(1) int arg0) {
		super.aByteArray116[super.anInt9379] = (byte) arg0;
		super.anInt9379++;
		if (super.anInt9379 >= 5000) {
			super.anInt9379 = 0;
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)V")
	@Override
	public void method7713() {
		while (super.anInt9379 != super.anInt9384) {
			this.method7717();
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)V")
	@Override
	public void method7708(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!fba;I)V")
	@Override
	public void method7716(@OriginalArg(0) Class100 arg0) {
		super.aByteArray116[super.anInt9379] = 21;
		super.anObjectArray36[super.anInt9379] = arg0;
		super.anInt9379++;
		if (super.anInt9379 >= 5000) {
			super.anInt9379 = 0;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!fba;)V")
	@Override
	public void method7707(@OriginalArg(1) Class100 arg0) {
		super.aByteArray116[super.anInt9379] = 20;
		super.anObjectArray36[super.anInt9379] = arg0;
		super.anInt9379++;
		if (super.anInt9379 >= 5000) {
			super.anInt9379 = 0;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V")
	@Override
	public void method7712() {
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!fba;B)V")
	@Override
	public void method7711(@OriginalArg(0) Class100 arg0) {
		super.anInt9384--;
		if (super.anInt9384 < 0) {
			super.anInt9384 = 4999;
		}
		super.aByteArray116[super.anInt9384] = 21;
		super.anObjectArray36[super.anInt9384] = arg0;
	}
}
