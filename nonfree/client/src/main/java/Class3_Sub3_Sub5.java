import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class3_Sub3_Sub5 extends Class3_Sub3 {

	@OriginalMember(owner = "client!pu", name = "w", descriptor = "Lclient!dd;")
	private Class48_Sub1 aClass48_Sub1_4;

	@OriginalMember(owner = "client!pu", name = "D", descriptor = "I")
	private final int anInt5133 = -1;

	@OriginalMember(owner = "client!pu", name = "J", descriptor = "I")
	private int anInt5139 = 0;

	@OriginalMember(owner = "client!pu", name = "B", descriptor = "I")
	private int anInt5132 = 0;

	@OriginalMember(owner = "client!pu", name = "K", descriptor = "Z")
	public boolean aBoolean357 = false;

	@OriginalMember(owner = "client!pu", name = "u", descriptor = "I")
	private int anInt5127 = 0;

	@OriginalMember(owner = "client!pu", name = "A", descriptor = "I")
	private int anInt5131 = -32768;

	@OriginalMember(owner = "client!pu", name = "E", descriptor = "I")
	public final int anInt5134;

	@OriginalMember(owner = "client!pu", name = "x", descriptor = "I")
	private final int anInt5129;

	@OriginalMember(owner = "client!pu", name = "I", descriptor = "I")
	private final int anInt5138;

	@OriginalMember(owner = "client!pu", name = "Q", descriptor = "Lclient!fn;")
	private Class83 aClass83_3;

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class3_Sub3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt5134 = arg2 + arg1;
		this.anInt5132 = arg12;
		this.anInt5129 = arg0;
		this.anInt5138 = arg4;
		@Pc(49) Class250 local49 = Static93.aClass70_1.method1595(this.anInt5129);
		@Pc(52) int local52 = local49.anInt6999;
		if (local52 == -1) {
			this.aBoolean357 = true;
		} else {
			this.aClass83_3 = Static244.aClass174_2.method4011(local52);
			this.aBoolean357 = false;
		}
		if (this.anInt5134 == arg2) {
			Static34.method731(this.aClass83_3, super.aByte93, this.anInt5127, false, super.anInt6675, super.anInt6677);
		}
	}

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5791() {
		return false;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!cd;Lclient!qq;I)V")
	private void method4504(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class28 arg1) {
		@Pc(10) Class192[] local10 = arg0.method4899();
		@Pc(13) Class161[] local13 = arg0.method4885();
		if ((this.aClass48_Sub1_4 == null || this.aClass48_Sub1_4.aBoolean123) && (local10 != null || local13 != null)) {
			this.aClass48_Sub1_4 = new Class48_Sub1(Static125.anInt2225);
		}
		if (this.aClass48_Sub1_4 != null) {
			this.aClass48_Sub1_4.method1290(arg1, (long) Static125.anInt2225, local10, local13);
			this.aClass48_Sub1_4.method1294(super.aByte93, super.aShort97, super.aShort98, super.aShort95, super.aShort96);
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(BLclient!qq;)Lclient!km;")
	@Override
	public Class48_Sub6 method5790(@OriginalArg(1) Class28 arg0) {
		@Pc(21) Class39 local21 = this.method4507((this.anInt5132 == 0 ? 0 : 5) | 0x800, this.anInt5129, arg0);
		if (local21 == null) {
			return null;
		}
		if (this.anInt5132 != 0) {
			local21.method4907(this.anInt5132 * 2048);
		}
		@Pc(40) Class132 local40 = arg0.method3564();
		local40.method3986(super.anInt6675, super.anInt6673, super.anInt6677);
		if (this.aClass48_Sub1_4 == null) {
			local21.method4910(local40, null, 0);
		} else {
			@Pc(60) Class115 local60 = this.aClass48_Sub1_4.method1293();
			arg0.method3571(local21, local60, local40, null);
		}
		this.anInt5131 = local21.method4875();
		this.method4504(local21, arg0);
		return null;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ILclient!qq;Lclient!ps;ZZII)V")
	@Override
	public void method5794(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class3 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!qq;BII)Z")
	@Override
	public boolean method5797(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "(I)V")
	@Override
	public void method5798() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5792(@OriginalArg(1) Class28 arg0) {
		@Pc(16) Class39 local16 = this.method4507(0, this.anInt5129, arg0);
		if (local16 != null) {
			this.method4504(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IBILclient!qq;)Lclient!cd;")
	private Class39 method4507(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class28 arg2) {
		@Pc(8) Class250 local8 = Static93.aClass70_1.method1595(arg1);
		@Pc(23) Class84 local23 = Static93.aClass84Array1[super.aByte93];
		@Pc(36) Class84 local36 = this.anInt5138 < 3 ? Static93.aClass84Array1[this.anInt5138 + 1] : null;
		return this.aBoolean357 ? local8.method5681(arg0, arg2, 0, super.anInt6673, -1, -1, super.anInt6675, local23, Static244.aClass174_2, super.anInt6677, local36) : local8.method5681(arg0, arg2, this.anInt5139, super.anInt6673, this.anInt5127, this.anInt5133, super.anInt6675, local23, Static244.aClass174_2, super.anInt6677, local36);
	}

	@OriginalMember(owner = "client!pu", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass48_Sub1_4 != null) {
			this.aClass48_Sub1_4.method1289();
		}
	}

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "(B)V")
	public void method4508() {
		if (this.aClass48_Sub1_4 != null) {
			this.aClass48_Sub1_4.method1289();
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)V")
	public void method4510(@OriginalArg(1) int arg0) {
		if (this.aBoolean357) {
			return;
		}
		this.anInt5139 += arg0;
		while (this.anInt5139 > this.aClass83_3.anIntArray212[this.anInt5127]) {
			this.anInt5139 -= this.aClass83_3.anIntArray212[this.anInt5127];
			this.anInt5127++;
			if (this.anInt5127 >= this.aClass83_3.anIntArray211.length) {
				this.aBoolean357 = true;
				break;
			}
		}
		if (!this.aBoolean357) {
			Static34.method731(this.aClass83_3, super.aByte93, this.anInt5127, false, super.anInt6675, super.anInt6677);
		}
	}

	@OriginalMember(owner = "client!pu", name = "g", descriptor = "(I)I")
	@Override
	public int method5503() {
		return this.anInt5131;
	}
}
