import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class20_Sub3_Sub4 extends Class20_Sub3 {

	@OriginalMember(owner = "client!nu", name = "S", descriptor = "Lclient!ce;")
	private Class13_Sub2 aClass13_Sub2_4;

	@OriginalMember(owner = "client!nu", name = "D", descriptor = "I")
	private final int anInt4368 = -1;

	@OriginalMember(owner = "client!nu", name = "H", descriptor = "I")
	private int anInt4371 = 0;

	@OriginalMember(owner = "client!nu", name = "L", descriptor = "I")
	private int anInt4374 = -32768;

	@OriginalMember(owner = "client!nu", name = "R", descriptor = "Z")
	public boolean aBoolean347 = false;

	@OriginalMember(owner = "client!nu", name = "N", descriptor = "I")
	private int anInt4376 = 0;

	@OriginalMember(owner = "client!nu", name = "C", descriptor = "I")
	private int anInt4367 = 0;

	@OriginalMember(owner = "client!nu", name = "W", descriptor = "I")
	private final int anInt4382;

	@OriginalMember(owner = "client!nu", name = "K", descriptor = "I")
	public final int anInt4373;

	@OriginalMember(owner = "client!nu", name = "M", descriptor = "I")
	private final int anInt4375;

	@OriginalMember(owner = "client!nu", name = "z", descriptor = "Lclient!nm;")
	private Class171 aClass171_3;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class20_Sub3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt4382 = arg4;
		this.anInt4373 = arg2 + arg1;
		this.anInt4375 = arg0;
		this.anInt4367 = arg12;
		@Pc(49) Class14 local49 = Static44.aClass190_2.method4005(this.anInt4375);
		@Pc(52) int local52 = local49.anInt325;
		if (local52 == -1) {
			this.aBoolean347 = true;
		} else {
			this.aClass171_3 = Static152.aClass213_1.method4410(local52);
			this.aBoolean347 = false;
		}
		if (arg2 == this.anInt4373) {
			Static7.method4909(super.anInt6616, super.anInt6613, super.aByte89, false, this.aClass171_3, this.anInt4376);
		}
	}

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5110() {
		return false;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5114(@OriginalArg(1) Class128 arg0) {
		@Pc(11) Class33 local11 = this.method3512(this.anInt4375, arg0, 0);
		if (local11 != null) {
			this.method3513(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(Z)V")
	public void method3511() {
		if (this.aClass13_Sub2_4 != null) {
			this.aClass13_Sub2_4.method699();
		}
	}

	@OriginalMember(owner = "client!nu", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass13_Sub2_4 != null) {
			this.aClass13_Sub2_4.method699();
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILclient!qa;IB)Lclient!c;")
	private Class33 method3512(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2) {
		@Pc(20) Class14 local20 = Static44.aClass190_2.method4005(arg0);
		@Pc(25) Class163 local25 = Static240.aClass163Array3[super.aByte89];
		@Pc(38) Class163 local38 = this.anInt4382 < 3 ? Static240.aClass163Array3[this.anInt4382 + 1] : null;
		return this.aBoolean347 ? local20.method267(local25, super.anInt6616, 0, Static152.aClass213_1, super.anInt6615, arg2, super.anInt6613, arg1, -1, local38, -1) : local20.method267(local25, super.anInt6616, this.anInt4371, Static152.aClass213_1, super.anInt6615, arg2, super.anInt6613, arg1, this.anInt4376, local38, this.anInt4368);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lclient!c;BLclient!qa;)V")
	private void method3513(@OriginalArg(0) Class33 arg0, @OriginalArg(2) Class128 arg1) {
		@Pc(10) Class239[] local10 = arg0.method5380();
		@Pc(13) Class15[] local13 = arg0.method5385();
		if ((this.aClass13_Sub2_4 == null || this.aClass13_Sub2_4.aBoolean61) && (local10 != null || local13 != null)) {
			this.aClass13_Sub2_4 = new Class13_Sub2(Static368.anInt6250);
		}
		if (this.aClass13_Sub2_4 != null) {
			this.aClass13_Sub2_4.method700(arg1, (long) Static368.anInt6250, local10, local13);
			this.aClass13_Sub2_4.method704(super.aByte89, super.aShort85, super.aShort87, super.aShort88, super.aShort86);
		}
	}

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "(I)I")
	@Override
	public int method5097() {
		return this.anInt4374;
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(ILclient!qa;)Lclient!nf;")
	@Override
	public Class13_Sub4 method5115(@OriginalArg(1) Class128 arg0) {
		@Pc(21) Class33 local21 = this.method3512(this.anInt4375, arg0, (this.anInt4367 == 0 ? 0 : 5) | 0x800);
		if (local21 == null) {
			return null;
		}
		if (this.anInt4367 != 0) {
			local21.k(this.anInt4367 * 2048);
		}
		@Pc(42) Class40 local42 = arg0.method3600();
		local42.R(super.anInt6613, super.anInt6615, super.anInt6616);
		if (this.aClass13_Sub2_4 == null) {
			local21.method5391(local42, null, 0);
		} else {
			@Pc(57) Class194 local57 = this.aClass13_Sub2_4.method702();
			arg0.method3557(local21, local57, local42, null);
		}
		this.anInt4374 = local21.b();
		this.method3513(local21, arg0);
		return null;
	}

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "(B)V")
	@Override
	public void method5111() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IILclient!qa;B)Z")
	@Override
	public boolean method5112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class128 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZIILclient!er;Lclient!qa;IB)V")
	@Override
	public void method5116(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) Class128 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)V")
	public void method3516(@OriginalArg(1) int arg0) {
		if (this.aBoolean347) {
			return;
		}
		this.anInt4371 += arg0;
		while (this.aClass171_3.anIntArray234[this.anInt4376] < this.anInt4371) {
			this.anInt4371 -= this.aClass171_3.anIntArray234[this.anInt4376];
			this.anInt4376++;
			if (this.anInt4376 >= this.aClass171_3.anIntArray235.length) {
				this.aBoolean347 = true;
				break;
			}
		}
		if (!this.aBoolean347) {
			Static7.method4909(super.anInt6616, super.anInt6613, super.aByte89, false, this.aClass171_3, this.anInt4376);
		}
	}
}
