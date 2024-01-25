import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!fs", name = "x", descriptor = "I")
	private int anInt3314 = 0;

	@OriginalMember(owner = "client!fs", name = "s", descriptor = "Lclient!fw;")
	private final Class96 aClass96_1 = new Class96();

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(II)V")
	@Override
	public void method3640(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V")
	@Override
	public void method3633() {
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(Lclient!nj;B)V")
	@Override
	public void method3643(@OriginalArg(0) Class206 arg0) {
		super.aByteArray62[super.anInt4078] = 21;
		super.anObjectArray3[super.anInt4078] = arg0;
		super.anInt4078++;
		if (super.anInt4078 >= 5000) {
			super.anInt4078 = 0;
		}
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)V")
	@Override
	public void method3636() {
		while (super.anInt4085 != super.anInt4078) {
			this.method2986();
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IFLclient!sa;ZI)V")
	@Override
	public void method3634(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) boolean arg3) {
		super.aByteArray62[super.anInt4078] = (byte) (arg3 ? arg0 + 40 : arg0 + 30);
		super.anObjectArray3[super.anInt4078] = arg2;
		super.aFloatArray35[super.anInt4078] = arg1;
		super.anInt4078++;
		if (super.anInt4078 >= 5000) {
			super.anInt4078 = 0;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)V")
	@Override
	public void method3639(@OriginalArg(1) int arg0) {
		super.aByteArray62[super.anInt4078] = (byte) arg0;
		super.anInt4078++;
		if (super.anInt4078 >= 5000) {
			super.anInt4078 = 0;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!nj;B)V")
	@Override
	public void method3638(@OriginalArg(0) Class206 arg0) {
		super.anInt4085--;
		if (super.anInt4085 < 0) {
			super.anInt4085 = 4999;
		}
		super.aByteArray62[super.anInt4085] = 21;
		super.anObjectArray3[super.anInt4085] = arg0;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!nj;I)V")
	@Override
	public void method3642(@OriginalArg(0) Class206 arg0) {
		super.aByteArray62[super.anInt4078] = 20;
		super.anObjectArray3[super.anInt4078] = arg0;
		super.anInt4078++;
		if (super.anInt4078 >= 5000) {
			super.anInt4078 = 0;
		}
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)V")
	private void method2986() {
		@Pc(18) int local18 = super.anInt4085++;
		if (super.anInt4085 >= 5000) {
			super.anInt4085 = 0;
		}
		this.anInt3314 = super.aByteArray62[local18];
		@Pc(44) Object local44 = super.anObjectArray3[local18];
		super.anObjectArray3[local18] = null;
		if (this.anInt3314 == 21) {
			Static248.method4195(this.aClass96_1, (Class206) local44);
		} else if (this.anInt3314 == 20) {
			@Pc(60) Class206 local60 = (Class206) local44;
			if (local60.aClass47_Sub4_2 != null) {
				local60.aClass47_Sub4_2.method7161(Static423.aClass9_12);
			}
			if (local60.aClass47_Sub4_1 != null) {
				local60.aClass47_Sub4_1.method7161(Static423.aClass9_12);
			}
			if (local60.aClass47_Sub5_1 != null) {
				local60.aClass47_Sub5_1.method7161(Static423.aClass9_12);
			}
			if (local60.aClass47_Sub5_2 != null) {
				local60.aClass47_Sub5_2.method7161(Static423.aClass9_12);
			}
			if (local60.aClass47_Sub3_1 != null) {
				local60.aClass47_Sub3_1.method7161(Static423.aClass9_12);
			}
			for (@Pc(103) Class168 local103 = local60.aClass168_2; local103 != null; local103 = local103.aClass168_1) {
				local103.aClass47_Sub2_2.method7161(Static423.aClass9_12);
			}
		} else if (this.anInt3314 >= 30 && this.anInt3314 <= 33) {
			Static423.aClass9_12.la(3000.0F, super.aFloatArray35[local18] * 1.5F);
			((Class10) local44).method6332(Static406.anInt7107, Static265.anInt5150, Static278.anInt5506, Static339.aBooleanArrayArray4, this.anInt3314 - 30 == 0);
		} else if (this.anInt3314 >= 40 && this.anInt3314 <= 43) {
			Static423.aClass9_12.la(3000.0F, super.aFloatArray35[local18] * 1.5F);
			((Class10) local44).method6332(Static406.anInt7107, Static265.anInt5150, Static278.anInt5506, Static213.aBooleanArrayArray2, this.anInt3314 - 40 == 0);
		} else if (this.anInt3314 == 22) {
			Static423.aClass9_12.q(-1, 1583160, 40, 127);
		} else if (this.anInt3314 == 23) {
			Static423.aClass9_12.xa();
		} else if (this.anInt3314 == 24) {
			Static423.aClass9_12.method7588(0, null);
			return;
		}
	}
}
