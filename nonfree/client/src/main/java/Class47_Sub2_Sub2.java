import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class47_Sub2_Sub2 extends Class47_Sub2 {

	@OriginalMember(owner = "client!cv", name = "fb", descriptor = "Lclient!dea;")
	private Class2_Sub3 aClass2_Sub3_2;

	@OriginalMember(owner = "client!cv", name = "C", descriptor = "I")
	private int anInt2006 = 0;

	@OriginalMember(owner = "client!cv", name = "T", descriptor = "I")
	private int anInt2020 = 0;

	@OriginalMember(owner = "client!cv", name = "I", descriptor = "I")
	private int anInt2011 = -32768;

	@OriginalMember(owner = "client!cv", name = "V", descriptor = "Z")
	public boolean aBoolean150 = false;

	@OriginalMember(owner = "client!cv", name = "bb", descriptor = "I")
	private int anInt2026 = 0;

	@OriginalMember(owner = "client!cv", name = "ab", descriptor = "I")
	private final int anInt2025 = -1;

	@OriginalMember(owner = "client!cv", name = "U", descriptor = "I")
	public final int anInt2021;

	@OriginalMember(owner = "client!cv", name = "M", descriptor = "I")
	private final int anInt2014;

	@OriginalMember(owner = "client!cv", name = "db", descriptor = "I")
	private final int anInt2027;

	@OriginalMember(owner = "client!cv", name = "D", descriptor = "Lclient!tt;")
	private Class280 aClass280_1;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class47_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt2021 = arg1 + arg2;
		this.anInt2014 = arg0;
		this.anInt2027 = arg4;
		this.anInt2006 = arg12;
		@Pc(49) Class112 local49 = Static529.aClass90_2.method2963(this.anInt2014);
		@Pc(52) int local52 = local49.anInt3703;
		if (local52 == -1) {
			this.aBoolean150 = true;
		} else {
			this.aClass280_1 = Static6.aClass126_1.method3574(local52);
			this.aBoolean150 = false;
		}
		if (this.anInt2021 == arg2) {
			Static351.method5589(super.anInt8189, this.aClass280_1, false, super.aByte94, super.anInt8191, this.anInt2026);
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V")
	public void method1936() {
		if (this.aClass2_Sub3_2 != null) {
			this.aClass2_Sub3_2.method2079();
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)V")
	public void method1937(@OriginalArg(0) int arg0) {
		if (this.aBoolean150) {
			return;
		}
		this.anInt2020 += arg0;
		while (this.anInt2020 > this.aClass280_1.anIntArray630[this.anInt2026]) {
			this.anInt2020 -= this.aClass280_1.anIntArray630[this.anInt2026];
			this.anInt2026++;
			if (this.anInt2026 >= this.aClass280_1.anIntArray629.length) {
				this.aBoolean150 = true;
				break;
			}
		}
		if (!this.aBoolean150) {
			Static351.method5589(super.anInt8189, this.aClass280_1, false, super.aByte94, super.anInt8191, this.anInt2026);
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7161(@OriginalArg(1) Class9 arg0) {
		@Pc(11) Class19 local11 = this.method1939(arg0, this.anInt2014, 0);
		if (local11 != null) {
			this.method1941(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!qa;I)Lclient!pl;")
	@Override
	public Class231 method7163(@OriginalArg(0) Class9 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILclient!qa;II)Lclient!r;")
	private Class19 method1939(@OriginalArg(1) Class9 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class112 local16 = Static529.aClass90_2.method2963(arg1);
		@Pc(21) Class10 local21 = Static53.aClass10Array3[super.aByte94];
		@Pc(34) Class10 local34 = this.anInt2027 >= 3 ? null : Static53.aClass10Array3[this.anInt2027 + 1];
		return this.aBoolean150 ? local16.method3313(-1, arg0, super.anInt8189, local21, -1, 0, Static6.aClass126_1, super.anInt8191, local34, super.anInt8192, arg2) : local16.method3313(this.anInt2026, arg0, super.anInt8189, local21, this.anInt2025, this.anInt2020, Static6.aClass126_1, super.anInt8191, local34, super.anInt8192, arg2);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7157(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "(I)V")
	@Override
	public void method7162() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass2_Sub3_2 != null) {
			this.aClass2_Sub3_2.method2079();
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!qa;BLclient!r;)V")
	private void method1941(@OriginalArg(0) Class9 arg0, @OriginalArg(2) Class19 arg1) {
		@Pc(6) Class178[] local6 = arg1.method7251();
		@Pc(9) Class129[] local9 = arg1.method7246();
		if ((this.aClass2_Sub3_2 == null || this.aClass2_Sub3_2.aBoolean161) && (local6 != null || local9 != null)) {
			this.aClass2_Sub3_2 = Static84.method2069(Static416.anInt7252);
		}
		if (this.aClass2_Sub3_2 != null) {
			this.aClass2_Sub3_2.method2077(arg0, (long) Static416.anInt7252, local6, local9);
			this.aClass2_Sub3_2.method2071(super.aByte94, super.aShort115, super.aShort116, super.aShort117, super.aShort114);
		}
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(ILclient!qa;)Lclient!in;")
	@Override
	public Class2_Sub6 method7165(@OriginalArg(1) Class9 arg0) {
		@Pc(18) Class19 local18 = this.method1939(arg0, this.anInt2014, (this.anInt2006 == 0 ? 0 : 5) | 0x800);
		if (local18 == null) {
			return null;
		}
		if (this.anInt2006 != 0) {
			local18.OA(this.anInt2006 * 2048);
		}
		@Pc(37) Class22 local37 = arg0.method7642();
		local37.oa(super.anInt8189, super.anInt8192, super.anInt8191);
		if (this.aClass2_Sub3_2 == null) {
			local18.method7258(local37, null, 0);
		} else {
			@Pc(65) Class249 local65 = this.aClass2_Sub3_2.method2067();
			arg0.method7573(local18, local65, local37, null);
		}
		this.anInt2011 = local18.TA();
		this.method1941(arg0, local18);
		return null;
	}

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "(B)I")
	@Override
	public int method6953() {
		return this.anInt2011;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!qa;IZIILclient!co;I)V")
	@Override
	public void method7166(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class47 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7156() {
		return false;
	}
}
