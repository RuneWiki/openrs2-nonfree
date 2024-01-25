import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class6_Sub2_Sub4 extends Class6_Sub2 {

	@OriginalMember(owner = "client!ei", name = "I", descriptor = "Lclient!li;")
	private Class41_Sub1 aClass41_Sub1_3;

	@OriginalMember(owner = "client!ei", name = "H", descriptor = "I")
	private int anInt2035 = -32768;

	@OriginalMember(owner = "client!ei", name = "A", descriptor = "I")
	private int anInt2029 = 0;

	@OriginalMember(owner = "client!ei", name = "B", descriptor = "I")
	private int anInt2030 = 0;

	@OriginalMember(owner = "client!ei", name = "D", descriptor = "I")
	private int anInt2031 = 0;

	@OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
	private final int anInt2036 = -1;

	@OriginalMember(owner = "client!ei", name = "Q", descriptor = "Z")
	public boolean aBoolean139 = false;

	@OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
	private final int anInt2022;

	@OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
	public final int anInt2039;

	@OriginalMember(owner = "client!ei", name = "y", descriptor = "I")
	private final int anInt2027;

	@OriginalMember(owner = "client!ei", name = "C", descriptor = "Lclient!tq;")
	private Class233 aClass233_1;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class6_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt2022 = arg4;
		this.anInt2039 = arg1 + arg2;
		this.anInt2027 = arg0;
		this.anInt2030 = arg12;
		@Pc(49) Class161 local49 = Static92.aClass89_1.method1918(this.anInt2027);
		@Pc(52) int local52 = local49.anInt4699;
		if (local52 == -1) {
			this.aBoolean139 = true;
		} else {
			this.aClass233_1 = Static269.aClass10_1.method286(local52);
			this.aBoolean139 = false;
		}
		if (this.anInt2039 == arg2) {
			Static374.method5106(false, this.anInt2029, super.aByte86, this.aClass233_1, super.anInt6062, super.anInt6061);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILclient!qa;Lclient!c;)V")
	private void method1539(@OriginalArg(1) Class30 arg0, @OriginalArg(2) Class7 arg1) {
		@Pc(10) Class56[] local10 = arg1.method4092();
		@Pc(13) Class120[] local13 = arg1.method4088();
		if ((this.aClass41_Sub1_3 == null || this.aClass41_Sub1_3.aBoolean308) && (local10 != null || local13 != null)) {
			this.aClass41_Sub1_3 = new Class41_Sub1(Static175.anInt3261);
		}
		if (this.aClass41_Sub1_3 != null) {
			this.aClass41_Sub1_3.method3165(arg0, (long) Static175.anInt3261, local10, local13);
			this.aClass41_Sub1_3.method3158(super.aByte86, super.aShort82, super.aShort84, super.aShort85, super.aShort83);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!qa;I)Lclient!pj;")
	@Override
	public Class41_Sub6 method5630(@OriginalArg(0) Class30 arg0) {
		@Pc(23) Class7 local23 = this.method1542((this.anInt2030 == 0 ? 0 : 5) | 0x800, this.anInt2027, arg0);
		if (local23 == null) {
			return null;
		}
		if (this.anInt2030 != 0) {
			local23.k(this.anInt2030 * 2048);
		}
		@Pc(42) Class116 local42 = arg0.method4678();
		local42.R(super.anInt6062, super.anInt6067, super.anInt6061);
		if (this.aClass41_Sub1_3 == null) {
			local23.method4091(local42, null, 0);
		} else {
			@Pc(64) Class256 local64 = this.aClass41_Sub1_3.method3166();
			arg0.method4676(local23, local64, local42, null);
		}
		this.anInt2035 = local23.b();
		this.method1539(arg0, local23);
		return null;
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(B)I")
	@Override
	public int method4752() {
		return this.anInt2035;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(IB)V")
	public void method1541(@OriginalArg(0) int arg0) {
		if (this.aBoolean139) {
			return;
		}
		this.anInt2031 += arg0;
		while (this.anInt2031 > this.aClass233_1.anIntArray591[this.anInt2029]) {
			this.anInt2031 -= this.aClass233_1.anIntArray591[this.anInt2029];
			this.anInt2029++;
			if (this.aClass233_1.anIntArray593.length <= this.anInt2029) {
				this.aBoolean139 = true;
				break;
			}
		}
		if (!this.aBoolean139) {
			Static374.method5106(false, this.anInt2029, super.aByte86, this.aClass233_1, super.anInt6062, super.anInt6061);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILclient!qa;I)Lclient!c;")
	private Class7 method1542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class30 arg2) {
		@Pc(8) Class161 local8 = Static92.aClass89_1.method1918(arg1);
		@Pc(13) Class146 local13 = Static422.aClass146Array3[super.aByte86];
		@Pc(26) Class146 local26 = this.anInt2022 >= 3 ? null : Static422.aClass146Array3[this.anInt2022 + 1];
		return this.aBoolean139 ? local8.method3580(Static269.aClass10_1, local26, super.anInt6062, super.anInt6061, arg0, -1, super.anInt6067, local13, 0, -1, arg2) : local8.method3580(Static269.aClass10_1, local26, super.anInt6062, super.anInt6061, arg0, this.anInt2036, super.anInt6067, local13, this.anInt2031, this.anInt2029, arg2);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V")
	public void method1543() {
		if (this.aClass41_Sub1_3 != null) {
			this.aClass41_Sub1_3.method3168();
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!qv;BLclient!qa;IZII)V")
	@Override
	public void method5636(@OriginalArg(0) Class6 arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ei", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass41_Sub1_3 != null) {
			this.aClass41_Sub1_3.method3168();
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V")
	@Override
	public void method5634() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5637(@OriginalArg(1) Class30 arg0) {
		@Pc(18) Class7 local18 = this.method1542(0, this.anInt2027, arg0);
		if (local18 != null) {
			this.method1539(arg0, local18);
		}
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5633() {
		return false;
	}
}
