import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class166 implements Interface6 {

	@OriginalMember(owner = "client!js", name = "c", descriptor = "Lclient!sga;")
	private Class307 aClass307_29 = new Class307(128);

	@OriginalMember(owner = "client!js", name = "g", descriptor = "[I")
	public final int[] anIntArray337 = new int[Static90.aClass335_1.anInt9684];

	@OriginalMember(owner = "client!js", name = "e", descriptor = "[I")
	private final int[] anIntArray336 = new int[Static90.aClass335_1.anInt9684];

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(III)V")
	public void method4930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class297 local8 = Static390.aClass359_1.method8269(arg0);
		@Pc(11) int local11 = local8.anInt8869;
		@Pc(14) int local14 = local8.anInt8870;
		@Pc(17) int local17 = local8.anInt8868;
		@Pc(23) int local23 = Class3_Sub2_Sub9.anIntArray186[local17 - local14];
		if (arg1 < 0 || arg1 > local23) {
			arg1 = 0;
		}
		local23 <<= local14;
		this.method4935(local23 & arg1 << local14 | this.anIntArray336[local11] & ~local23, local11);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
	public void method4931() {
		for (@Pc(3) int local3 = 0; local3 < Static90.aClass335_1.anInt9684; local3++) {
			@Pc(10) Class155 local10 = Static90.aClass335_1.method8003(local3);
			if (local10 != null && local10.anInt5594 == 0) {
				this.anIntArray336[local3] = 0;
				this.anIntArray337[local3] = 0;
			}
		}
		this.aClass307_29 = new Class307(128);
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(II)I")
	@Override
	public int method4928(@OriginalArg(1) int arg0) {
		@Pc(8) Class297 local8 = Static390.aClass359_1.method8269(arg0);
		@Pc(11) int local11 = local8.anInt8869;
		@Pc(18) int local18 = local8.anInt8870;
		@Pc(21) int local21 = local8.anInt8868;
		@Pc(28) int local28 = Class3_Sub2_Sub9.anIntArray186[local21 - local18];
		return this.anIntArray337[local11] >> local18 & local28;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IZ)I")
	public int method4932(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static444.method6719();
		for (@Pc(24) Class3_Sub41 local24 = arg0 ? (Class3_Sub41) this.aClass307_29.method7421() : (Class3_Sub41) this.aClass307_29.method7428(); local24 != null; local24 = (Class3_Sub41) this.aClass307_29.method7428()) {
			if (local8 > (local24.aLong224 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local24.aLong224 & 0x4000000000000000L) != 0L) {
					@Pc(48) int local48 = (int) local24.aLong277;
					this.anIntArray337[local48] = this.anIntArray336[local48];
					local24.method8671();
					return local48;
				}
				local24.method8671();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ZII)V")
	public void method4933(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class297 local16 = Static390.aClass359_1.method8269(arg1);
		@Pc(19) int local19 = local16.anInt8869;
		@Pc(22) int local22 = local16.anInt8870;
		@Pc(25) int local25 = local16.anInt8868;
		@Pc(32) int local32 = Class3_Sub2_Sub9.anIntArray186[local25 - local22];
		if (arg0 < 0 || arg0 > local32) {
			arg0 = 0;
		}
		local32 <<= local22;
		this.method4936(arg0 << local22 & local32 | this.anIntArray337[local19] & ~local32, local19);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(BII)V")
	public void method4935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray336[arg1] = arg0;
		@Pc(24) Class3_Sub41 local24 = (Class3_Sub41) this.aClass307_29.method7424((long) arg1);
		if (local24 == null) {
			local24 = new Class3_Sub41(4611686018427387905L);
			this.aClass307_29.method7425((long) arg1, local24);
		} else if (local24.aLong224 != 4611686018427387905L) {
			local24.aLong224 = Static444.method6719() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(III)V")
	public void method4936(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray337[arg1] = arg0;
		@Pc(16) Class3_Sub41 local16 = (Class3_Sub41) this.aClass307_29.method7424((long) arg1);
		if (local16 == null) {
			local16 = new Class3_Sub41(Static444.method6719() + 500L);
			this.aClass307_29.method7425((long) arg1, local16);
		} else {
			local16.aLong224 = Static444.method6719() + 500L;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II)I")
	@Override
	public int method4927(@OriginalArg(1) int arg0) {
		return this.anIntArray337[arg0];
	}
}
