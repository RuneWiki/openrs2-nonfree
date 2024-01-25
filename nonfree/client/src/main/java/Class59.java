import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class59 implements Interface12 {

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "Lclient!pl;")
	private Class273 aClass273_2 = new Class273(128);

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "[I")
	public final int[] anIntArray110 = new int[Static299.aClass110_1.anInt2639];

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "[I")
	private final int[] anIntArray111 = new int[Static299.aClass110_1.anInt2639];

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIB)V")
	public void method1305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray110[arg0] = arg1;
		@Pc(16) Class5_Sub50 local16 = (Class5_Sub50) this.aClass273_2.method6581((long) arg0);
		if (local16 == null) {
			local16 = new Class5_Sub50(Static95.method1587() + 500L);
			this.aClass273_2.method6585((long) arg0, local16);
		} else {
			local16.aLong237 = Static95.method1587() + 500L;
		}
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)I")
	@Override
	public int method1304(@OriginalArg(0) int arg0) {
		return this.anIntArray110[arg0];
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IBI)V")
	public void method1307(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class324 local10 = Static475.aClass370_1.method8787(arg1);
		@Pc(13) int local13 = local10.anInt9061;
		@Pc(24) int local24 = local10.anInt9060;
		@Pc(27) int local27 = local10.anInt9057;
		@Pc(34) int local34 = Class5_Sub9.anIntArray80[local27 - local24];
		if (arg0 < 0 || arg0 > local34) {
			arg0 = 0;
		}
		local34 <<= local24;
		this.method1305(local13, local34 & arg0 << local24 | ~local34 & this.anIntArray110[local13]);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZZ)I")
	public int method1308(@OriginalArg(0) boolean arg0) {
		@Pc(16) long local16 = Static95.method1587();
		for (@Pc(30) Class5_Sub50 local30 = arg0 ? (Class5_Sub50) this.aClass273_2.method6577() : (Class5_Sub50) this.aClass273_2.method6589(); local30 != null; local30 = (Class5_Sub50) this.aClass273_2.method6589()) {
			if (local16 > (local30.aLong237 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local30.aLong237 & 0x4000000000000000L) != 0L) {
					@Pc(55) int local55 = (int) local30.aLong278;
					this.anIntArray110[local55] = this.anIntArray111[local55];
					local30.method9047();
					return local55;
				}
				local30.method9047();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)I")
	@Override
	public int method1303(@OriginalArg(1) int arg0) {
		@Pc(16) Class324 local16 = Static475.aClass370_1.method8787(arg0);
		@Pc(19) int local19 = local16.anInt9061;
		@Pc(22) int local22 = local16.anInt9060;
		@Pc(25) int local25 = local16.anInt9057;
		@Pc(32) int local32 = Class5_Sub9.anIntArray80[local25 - local22];
		return local32 & this.anIntArray110[local19] >> local22;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)V")
	public void method1309(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class324 local8 = Static475.aClass370_1.method8787(arg1);
		@Pc(11) int local11 = local8.anInt9061;
		@Pc(18) int local18 = local8.anInt9060;
		@Pc(21) int local21 = local8.anInt9057;
		@Pc(28) int local28 = Class5_Sub9.anIntArray80[local21 - local18];
		if (arg0 < 0 || arg0 > local28) {
			arg0 = 0;
		}
		local28 <<= local18;
		this.method1311(arg0 << local18 & local28 | ~local28 & this.anIntArray111[local11], local11);
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)V")
	public void method1310() {
		for (@Pc(3) int local3 = 0; local3 < Static299.aClass110_1.anInt2639; local3++) {
			@Pc(10) Class127 local10 = Static299.aClass110_1.method2242(local3);
			if (local10 != null && local10.anInt3248 == 0) {
				this.anIntArray111[local3] = 0;
				this.anIntArray110[local3] = 0;
			}
		}
		this.aClass273_2 = new Class273(128);
	}

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(IIB)V")
	public void method1311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray111[arg1] = arg0;
		@Pc(16) Class5_Sub50 local16 = (Class5_Sub50) this.aClass273_2.method6581((long) arg1);
		if (local16 == null) {
			local16 = new Class5_Sub50(4611686018427387905L);
			this.aClass273_2.method6585((long) arg1, local16);
		} else if (local16.aLong237 != 4611686018427387905L) {
			local16.aLong237 = Static95.method1587() + 500L | 0x4000000000000000L;
		}
	}
}
