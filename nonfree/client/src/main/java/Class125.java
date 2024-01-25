import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class125 implements Interface2 {

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "Lclient!sq;")
	private Class214 aClass214_16 = new Class214(128);

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "[I")
	private final int[] anIntArray337 = new int[Static235.aClass25_1.anInt617];

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "[I")
	public final int[] anIntArray338 = new int[Static235.aClass25_1.anInt617];

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIZ)V")
	public void method2735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6 local8 = Static130.aClass162_1.method3876(arg1);
		@Pc(11) int local11 = local8.anInt166;
		@Pc(14) int local14 = local8.anInt168;
		@Pc(17) int local17 = local8.anInt167;
		@Pc(24) int local24 = Class181.anIntArray619[local17 - local14];
		if (arg0 < 0 || local24 < arg0) {
			arg0 = 0;
		}
		local24 <<= local14;
		this.method2739(local11, local24 & arg0 << local14 | ~local24 & this.anIntArray337[local11]);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIB)V")
	public void method2737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6 local8 = Static130.aClass162_1.method3876(arg0);
		@Pc(11) int local11 = local8.anInt166;
		@Pc(14) int local14 = local8.anInt168;
		@Pc(17) int local17 = local8.anInt167;
		@Pc(24) int local24 = Class181.anIntArray619[local17 - local14];
		if (arg1 < 0 || arg1 > local24) {
			arg1 = 0;
		}
		local24 <<= local14;
		this.method2743(local11, local24 & arg1 << local14 | ~local24 & this.anIntArray338[local11]);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)V")
	public void method2739(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray337[arg0] = arg1;
		@Pc(21) Class2_Sub36 local21 = (Class2_Sub36) this.aClass214_16.method5059((long) arg0);
		if (local21 == null) {
			local21 = new Class2_Sub36(4611686018427387905L);
			this.aClass214_16.method5065((long) arg0, local21);
		} else if (local21.aLong187 != 4611686018427387905L) {
			local21.aLong187 = Static51.method979() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V")
	public void method2741() {
		for (@Pc(3) int local3 = 0; local3 < Static235.aClass25_1.anInt617; local3++) {
			@Pc(10) Class87 local10 = Static235.aClass25_1.method681(local3);
			if (local10 != null && local10.anInt2252 == 0) {
				this.anIntArray337[local3] = 0;
				this.anIntArray338[local3] = 0;
			}
		}
		this.aClass214_16 = new Class214(128);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)I")
	public int method2742(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static51.method979();
		for (@Pc(30) Class2_Sub36 local30 = arg0 ? (Class2_Sub36) this.aClass214_16.method5060() : (Class2_Sub36) this.aClass214_16.method5064(); local30 != null; local30 = (Class2_Sub36) this.aClass214_16.method5064()) {
			if (local8 > (local30.aLong187 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local30.aLong187 & 0x4000000000000000L) != 0L) {
					@Pc(57) int local57 = (int) local30.aLong208;
					this.anIntArray338[local57] = this.anIntArray337[local57];
					local30.method5745();
					return local57;
				}
				local30.method5745();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I")
	@Override
	public int method2734(@OriginalArg(0) int arg0) {
		return this.anIntArray338[arg0];
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)I")
	@Override
	public int method2733(@OriginalArg(1) int arg0) {
		@Pc(10) Class6 local10 = Static130.aClass162_1.method3876(arg0);
		@Pc(13) int local13 = local10.anInt166;
		@Pc(16) int local16 = local10.anInt168;
		@Pc(25) int local25 = local10.anInt167;
		@Pc(31) int local31 = Class181.anIntArray619[local25 - local16];
		return this.anIntArray338[local13] >> local16 & local31;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBI)V")
	public void method2743(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray338[arg0] = arg1;
		@Pc(21) Class2_Sub36 local21 = (Class2_Sub36) this.aClass214_16.method5059((long) arg0);
		if (local21 == null) {
			local21 = new Class2_Sub36(Static51.method979() + 500L);
			this.aClass214_16.method5065((long) arg0, local21);
		} else {
			local21.aLong187 = Static51.method979() + 500L;
		}
	}
}
