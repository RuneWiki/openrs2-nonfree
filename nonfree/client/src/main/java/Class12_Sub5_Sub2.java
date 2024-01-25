import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class12_Sub5_Sub2 extends Class12_Sub5 implements Interface11 {

	@OriginalMember(owner = "client!pq", name = "A", descriptor = "Z")
	private final boolean aBoolean355;

	@OriginalMember(owner = "client!pq", name = "Q", descriptor = "Z")
	private final boolean aBoolean357;

	@OriginalMember(owner = "client!pq", name = "J", descriptor = "B")
	private final byte aByte45;

	@OriginalMember(owner = "client!pq", name = "v", descriptor = "Z")
	private boolean aBoolean354;

	@OriginalMember(owner = "client!pq", name = "K", descriptor = "B")
	private final byte aByte46;

	@OriginalMember(owner = "client!pq", name = "N", descriptor = "S")
	private final short aShort69;

	@OriginalMember(owner = "client!pq", name = "O", descriptor = "Z")
	private final boolean aBoolean356;

	@OriginalMember(owner = "client!pq", name = "L", descriptor = "Lclient!ab;")
	private Class3 aClass3_6;

	@OriginalMember(owner = "client!pq", name = "E", descriptor = "Lclient!mr;")
	private Class2_Sub1_Sub6 aClass2_Sub1_Sub6_6;

	static {
		new Class221("Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.");
	}

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!km;Lclient!cj;IIIIZIZ)V")
	public Class12_Sub5_Sub2(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean68, arg1.aBoolean57);
		super.anInt5657 = (short) arg5;
		super.anInt5658 = (short) arg3;
		this.aBoolean355 = arg1.anInt788 != 0 && !arg6;
		this.aBoolean357 = arg6;
		this.aByte45 = (byte) arg7;
		this.aBoolean354 = arg8;
		this.aByte46 = (byte) arg2;
		this.aShort69 = (short) arg1.anInt802;
		this.aBoolean356 = arg0.method4527() && arg1.aBoolean65 && !this.aBoolean357 && Static193.anInt6663 != 0;
		@Pc(66) int local66 = 1024;
		if (this.aBoolean354) {
			local66 |= 0x8000;
		}
		@Pc(81) Class146 local81 = this.method4347(arg0, local66, this.aBoolean356);
		if (local81 != null) {
			this.aClass3_6 = local81.aClass3_5;
			this.aClass2_Sub1_Sub6_6 = local81.aClass2_Sub1_Sub6_5;
			if (this.aBoolean354) {
				this.aClass3_6 = this.aClass3_6.method3481((byte) 0, local66, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!km;II)Lclient!ab;")
	@Override
	public Class3 method5023(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1) {
		return this.method4348(arg1, arg0);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!km;BII)Z")
	@Override
	public boolean method5450(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class3 local9 = this.method4348(65536, arg0);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class54 local14 = arg0.method4556();
			local14.method4789(super.anInt5658, super.anInt5653, super.anInt5657);
			return local9.method3444(arg2, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5455() {
		return this.aBoolean354;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5021(@OriginalArg(0) Class82 arg0) {
		@Pc(33) Class2_Sub1_Sub6 local33;
		if (this.aClass2_Sub1_Sub6_6 == null && this.aBoolean356) {
			@Pc(26) Class146 local26 = this.method4347(arg0, 131072, true);
			local33 = local26 == null ? null : local26.aClass2_Sub1_Sub6_5;
		} else {
			local33 = this.aClass2_Sub1_Sub6_6;
			this.aClass2_Sub1_Sub6_6 = null;
		}
		if (local33 != null) {
			Static197.method3302(local33, this.aByte46, super.anInt5658, super.anInt5657, null);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)I")
	@Override
	public int method5024() {
		return this.aByte45;
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5449(@OriginalArg(0) Class82 arg0) {
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)I")
	@Override
	public int method5027() {
		return 22;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!km;IIZ)Lclient!lt;")
	private Class146 method4347(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) Class34 local18 = Static11.aClass123_5.method2703(this.aShort69 & 0xFFFF);
		@Pc(26) Class33 local26;
		@Pc(30) Class33 local30;
		if (this.aBoolean357) {
			local26 = Static345.aClass33Array3[this.aByte46];
			local30 = Static39.aClass33Array2[0];
		} else {
			if (this.aByte46 < 3) {
				local30 = Static39.aClass33Array2[this.aByte46 + 1];
			} else {
				local30 = null;
			}
			local26 = Static39.aClass33Array2[this.aByte46];
		}
		return local18.method827(local30, super.anInt5658, 22, local26, this.aByte45, arg0, arg1, arg2, super.anInt5657, super.anInt5653);
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5028(@OriginalArg(0) Class82 arg0) {
		@Pc(25) Class2_Sub1_Sub6 local25;
		if (this.aClass2_Sub1_Sub6_6 == null && this.aBoolean356) {
			@Pc(18) Class146 local18 = this.method4347(arg0, 131072, true);
			local25 = local18 == null ? null : local18.aClass2_Sub1_Sub6_5;
		} else {
			local25 = this.aClass2_Sub1_Sub6_6;
			this.aClass2_Sub1_Sub6_6 = null;
		}
		if (local25 != null) {
			Static64.method1166(local25, this.aByte46, super.anInt5658, super.anInt5657, null);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V")
	@Override
	public void method5022() {
		if (this.aClass3_6 != null) {
			this.aClass3_6.method3435();
		}
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5026() {
		return this.aBoolean356;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(Z)I")
	@Override
	public int method5025() {
		return this.aShort69 & 0xFFFF;
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(Lclient!km;I)Lclient!to;")
	@Override
	public Class22_Sub8 method5451(@OriginalArg(0) Class82 arg0) {
		if (this.aClass3_6 == null) {
			return null;
		}
		@Pc(20) Class54 local20 = arg0.method4556();
		local20.method4789(super.anInt5658, super.anInt5653, super.anInt5657);
		@Pc(30) Class22_Sub8 local30 = null;
		if (this.aBoolean355) {
			local30 = Static128.method2279(1);
		}
		this.aClass3_6.method3443(local20, local30 == null ? null : local30.aClass22_Sub1Array1[0], 0);
		return local30;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V")
	@Override
	public void method5456() {
		this.aBoolean354 = false;
		if (this.aClass3_6 != null) {
			this.aClass3_6.method3473(this.aClass3_6.method3474() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILclient!km;IZILclient!kj;B)V")
	@Override
	public void method5454(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class12 arg5) {
		if (!(arg5 instanceof Class12_Sub5_Sub2)) {
			return;
		}
		@Pc(14) Class12_Sub5_Sub2 local14 = (Class12_Sub5_Sub2) arg5;
		if (this.aClass3_6 != null && local14.aClass3_6 != null) {
			this.aClass3_6.method3475(local14.aClass3_6, arg0, arg2, arg4, arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILclient!km;I)Lclient!ab;")
	private Class3 method4348(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1) {
		if (this.aClass3_6 != null && arg1.method4499(this.aClass3_6.method3474(), arg0) == 0) {
			return this.aClass3_6;
		} else {
			@Pc(26) Class146 local26 = this.method4347(arg1, arg0, false);
			return local26 == null ? null : local26.aClass3_5;
		}
	}
}
