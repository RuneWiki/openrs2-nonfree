import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class12_Sub1_Sub6 extends Class12_Sub1 {

	@OriginalMember(owner = "client!us", name = "U", descriptor = "Lclient!m;")
	private Class22_Sub6 aClass22_Sub6_7;

	@OriginalMember(owner = "client!us", name = "R", descriptor = "I")
	private final int anInt6335 = -1;

	@OriginalMember(owner = "client!us", name = "I", descriptor = "I")
	private int anInt6331 = 0;

	@OriginalMember(owner = "client!us", name = "db", descriptor = "I")
	private int anInt6346 = 0;

	@OriginalMember(owner = "client!us", name = "gb", descriptor = "Z")
	public boolean aBoolean475 = false;

	@OriginalMember(owner = "client!us", name = "Z", descriptor = "I")
	private int anInt6342 = -32768;

	@OriginalMember(owner = "client!us", name = "fb", descriptor = "I")
	public final int anInt6348;

	@OriginalMember(owner = "client!us", name = "ab", descriptor = "I")
	private final int anInt6343;

	@OriginalMember(owner = "client!us", name = "Q", descriptor = "Lclient!qg;")
	private Class189 aClass189_3;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class12_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt6348 = arg1 + arg2;
		this.anInt6343 = arg0;
		@Pc(41) int local41 = Static168.aClass74_1.method1772(this.anInt6343).anInt6020;
		if (local41 == -1) {
			this.aBoolean475 = true;
		} else {
			this.aBoolean475 = false;
			this.aClass189_3 = Static351.aClass175_3.method4107(local41);
		}
		if (this.anInt6348 == arg2) {
			Static369.method5563(super.aByte74, this.aClass189_3, false, super.anInt6328, super.anInt6317, this.anInt6346);
		}
	}

	@OriginalMember(owner = "client!us", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass22_Sub6_7 != null) {
			this.aClass22_Sub6_7.method3561();
		}
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5449(@OriginalArg(0) Class82 arg0) {
		@Pc(9) Class3 local9 = this.method5473(arg0, 0);
		if (local9 != null) {
			this.method5469(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V")
	@Override
	public void method5456() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!km;BII)Z")
	@Override
	public boolean method5450(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
	public void method5467() {
		if (this.aClass22_Sub6_7 != null) {
			this.aClass22_Sub6_7.method3561();
		}
	}

	@OriginalMember(owner = "client!us", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5455() {
		return false;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILclient!ab;Lclient!km;)V")
	private void method5469(@OriginalArg(1) Class3 arg0, @OriginalArg(2) Class82 arg1) {
		@Pc(6) Class191[] local6 = arg0.method3476();
		@Pc(9) Class218[] local9 = arg0.method3441();
		if ((this.aClass22_Sub6_7 == null || this.aClass22_Sub6_7.aBoolean289) && (local6 != null || local9 != null)) {
			this.aClass22_Sub6_7 = new Class22_Sub6(Static295.anInt5281);
		}
		if (this.aClass22_Sub6_7 != null) {
			this.aClass22_Sub6_7.method3564(arg1, (long) Static295.anInt5281, local6, local9);
			this.aClass22_Sub6_7.method3560(super.aByte74, super.aShort97, super.aShort96, super.aShort94, super.aShort95);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IZ)V")
	public void method5470(@OriginalArg(0) int arg0) {
		if (this.aBoolean475) {
			return;
		}
		this.anInt6331 += arg0;
		while (this.anInt6331 > this.aClass189_3.anIntArray640[this.anInt6346]) {
			this.anInt6331 -= this.aClass189_3.anIntArray640[this.anInt6346];
			this.anInt6346++;
			if (this.anInt6346 >= this.aClass189_3.anIntArray639.length) {
				this.aBoolean475 = true;
				break;
			}
		}
		if (!this.aBoolean475) {
			Static369.method5563(super.aByte74, this.aClass189_3, false, super.anInt6328, super.anInt6317, this.anInt6346);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILclient!km;IZILclient!kj;B)V")
	@Override
	public void method5454(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class12 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(B)I")
	@Override
	public int method5459() {
		return this.anInt6342;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!km;II)Lclient!ab;")
	private Class3 method5473(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class220 local14 = Static168.aClass74_1.method1772(this.anInt6343);
		return this.aBoolean475 ? local14.method5219(Static351.aClass175_3, arg0, arg1, -1, -1, 0) : local14.method5219(Static351.aClass175_3, arg0, arg1, this.anInt6346, this.anInt6335, this.anInt6331);
	}

	@OriginalMember(owner = "client!us", name = "d", descriptor = "(Lclient!km;I)Lclient!to;")
	@Override
	public Class22_Sub8 method5451(@OriginalArg(0) Class82 arg0) {
		@Pc(9) Class3 local9 = this.method5473(arg0, 1024);
		if (local9 == null) {
			return null;
		}
		@Pc(21) Class54 local21 = arg0.method4556();
		local21.method4789(super.anInt6328, super.anInt6322, super.anInt6317);
		if (this.aClass22_Sub6_7 == null) {
			local9.method3443(local21, null, 0);
		} else {
			@Pc(43) Class157 local43 = this.aClass22_Sub6_7.method3555();
			arg0.method4485(local9, local43, local21, null);
		}
		this.anInt6342 = local9.method3459();
		this.method5469(local9, arg0);
		return null;
	}
}
