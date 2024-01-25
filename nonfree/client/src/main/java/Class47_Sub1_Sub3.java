import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class47_Sub1_Sub3 extends Class47_Sub1 {

	@OriginalMember(owner = "client!dm", name = "S", descriptor = "Lclient!rb;")
	private Class36_Sub7 aClass36_Sub7_2;

	@OriginalMember(owner = "client!dm", name = "A", descriptor = "I")
	private int anInt1404 = -32768;

	@OriginalMember(owner = "client!dm", name = "F", descriptor = "I")
	private int anInt1409 = 0;

	@OriginalMember(owner = "client!dm", name = "H", descriptor = "Z")
	public boolean aBoolean120 = false;

	@OriginalMember(owner = "client!dm", name = "E", descriptor = "I")
	private int anInt1408 = 0;

	@OriginalMember(owner = "client!dm", name = "B", descriptor = "I")
	private final int anInt1405 = -1;

	@OriginalMember(owner = "client!dm", name = "Q", descriptor = "I")
	private int anInt1417 = 0;

	@OriginalMember(owner = "client!dm", name = "U", descriptor = "I")
	private final int anInt1420;

	@OriginalMember(owner = "client!dm", name = "D", descriptor = "I")
	private final int anInt1407;

	@OriginalMember(owner = "client!dm", name = "V", descriptor = "I")
	public final int anInt1421;

	@OriginalMember(owner = "client!dm", name = "P", descriptor = "Lclient!dn;")
	private Class58 aClass58_2;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class47_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt1420 = arg4;
		this.anInt1408 = arg12;
		this.anInt1407 = arg0;
		this.anInt1421 = arg2 + arg1;
		@Pc(49) Class166 local49 = Static294.aClass125_2.method2961(this.anInt1407);
		@Pc(52) int local52 = local49.anInt4334;
		if (local52 == -1) {
			this.aBoolean120 = true;
		} else {
			this.aClass58_2 = Static322.aClass45_5.method690(local52);
			this.aBoolean120 = false;
		}
		if (this.anInt1421 == arg2) {
			Static385.method5367(super.aByte97, super.anInt7066, this.anInt1409, this.aClass58_2, false, super.anInt7060);
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZILclient!qa;I)Lclient!c;")
	private Class37 method1124(@OriginalArg(1) int arg0, @OriginalArg(2) Class121 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class166 local8 = Static294.aClass125_2.method2961(arg2);
		@Pc(13) Class70 local13 = Static60.aClass70Array1[super.aByte97];
		@Pc(28) Class70 local28 = this.anInt1420 < 3 ? Static60.aClass70Array1[this.anInt1420 + 1] : null;
		return this.aBoolean120 ? local8.method3598(local13, arg0, super.anInt7066, local28, Static322.aClass45_5, -1, 0, arg1, -1, super.anInt7064, super.anInt7060) : local8.method3598(local13, arg0, super.anInt7066, local28, Static322.aClass45_5, this.anInt1409, this.anInt1417, arg1, this.anInt1405, super.anInt7064, super.anInt7060);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class121 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILclient!qa;)Lclient!bw;")
	@Override
	public Class36_Sub1 method5734(@OriginalArg(1) Class121 arg0) {
		@Pc(21) Class37 local21 = this.method1124((this.anInt1408 == 0 ? 0 : 5) | 0x800, arg0, this.anInt1407);
		if (local21 == null) {
			return null;
		}
		if (this.anInt1408 != 0) {
			local21.k(this.anInt1408 * 2048);
		}
		@Pc(46) Class43 local46 = arg0.method4588();
		local46.R(super.anInt7060, super.anInt7064, super.anInt7066);
		if (this.aClass36_Sub7_2 == null) {
			local21.method4167(local46, null, 0);
		} else {
			@Pc(68) Class101 local68 = this.aClass36_Sub7_2.method4874();
			arg0.method4574(local21, local68, local46, null);
		}
		this.anInt1404 = local21.b();
		this.method1128(arg0, local21);
		return null;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
	public void method1125() {
		if (this.aClass36_Sub7_2 != null) {
			this.aClass36_Sub7_2.method4883();
		}
	}

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)V")
	@Override
	public void method5723() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILclient!qa;IZLclient!ha;I)V")
	@Override
	public void method5733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class47 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5725() {
		return false;
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(Z)I")
	@Override
	public int method5447() {
		return this.anInt1404;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!qa;Lclient!c;I)V")
	private void method1128(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class37 arg1) {
		@Pc(6) Class203[] local6 = arg1.method4169();
		@Pc(14) Class265[] local14 = arg1.method4157();
		if ((this.aClass36_Sub7_2 == null || this.aClass36_Sub7_2.aBoolean500) && (local6 != null || local14 != null)) {
			this.aClass36_Sub7_2 = new Class36_Sub7(Static123.anInt2333);
		}
		if (this.aClass36_Sub7_2 != null) {
			this.aClass36_Sub7_2.method4873(arg0, (long) Static123.anInt2333, local6, local14);
			this.aClass36_Sub7_2.method4884(super.aByte97, super.aShort104, super.aShort107, super.aShort105, super.aShort106);
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(II)V")
	public void method1129(@OriginalArg(1) int arg0) {
		if (this.aBoolean120) {
			return;
		}
		this.anInt1417 += arg0;
		while (this.anInt1417 > this.aClass58_2.anIntArray66[this.anInt1409]) {
			this.anInt1417 -= this.aClass58_2.anIntArray66[this.anInt1409];
			this.anInt1409++;
			if (this.anInt1409 >= this.aClass58_2.anIntArray65.length) {
				this.aBoolean120 = true;
				break;
			}
		}
		if (!this.aBoolean120) {
			Static385.method5367(super.aByte97, super.anInt7066, this.anInt1409, this.aClass58_2, false, super.anInt7060);
		}
	}

	@OriginalMember(owner = "client!dm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass36_Sub7_2 != null) {
			this.aClass36_Sub7_2.method4883();
		}
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5732(@OriginalArg(0) Class121 arg0) {
		@Pc(11) Class37 local11 = this.method1124(0, arg0, this.anInt1407);
		if (local11 != null) {
			this.method1128(arg0, local11);
		}
	}
}
