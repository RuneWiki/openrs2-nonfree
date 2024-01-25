import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class47 implements Interface15 {

	@OriginalMember(owner = "client!bu", name = "p", descriptor = "Lclient!cja;")
	private Class62 aClass62_5 = new Class62(128);

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "[I")
	public final int[] anIntArray63 = new int[Static281.aClass389_1.anInt10257];

	@OriginalMember(owner = "client!bu", name = "l", descriptor = "[I")
	private final int[] anIntArray64 = new int[Static281.aClass389_1.anInt10257];

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(II)I")
	@Override
	public int method1430(@OriginalArg(1) int arg0) {
		@Pc(8) Class319 local8 = Static442.aClass388_1.method8667(arg0);
		@Pc(11) int local11 = local8.anInt8809;
		@Pc(19) int local19 = local8.anInt8810;
		@Pc(22) int local22 = local8.anInt8807;
		@Pc(29) int local29 = Class381.anIntArray644[local22 - local19];
		return this.anIntArray63[local11] >> local19 & local29;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(III)V")
	public void method1432(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class319 local8 = Static442.aClass388_1.method8667(arg1);
		@Pc(11) int local11 = local8.anInt8809;
		@Pc(14) int local14 = local8.anInt8810;
		@Pc(17) int local17 = local8.anInt8807;
		@Pc(24) int local24 = Class381.anIntArray644[local17 - local14];
		if (arg0 < 0 || local24 < arg0) {
			arg0 = 0;
		}
		local24 <<= local14;
		this.method1435(local11, ~local24 & this.anIntArray64[local11] | arg0 << local14 & local24);
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(III)V")
	public void method1434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class319 local8 = Static442.aClass388_1.method8667(arg0);
		@Pc(11) int local11 = local8.anInt8809;
		@Pc(21) int local21 = local8.anInt8810;
		@Pc(24) int local24 = local8.anInt8807;
		@Pc(31) int local31 = Class381.anIntArray644[local24 - local21];
		if (arg1 < 0 || arg1 > local31) {
			arg1 = 0;
		}
		local31 <<= local21;
		this.method1437(this.anIntArray63[local11] & ~local31 | local31 & arg1 << local21, local11);
	}

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "(III)V")
	public void method1435(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray64[arg0] = arg1;
		@Pc(19) Class3_Sub50 local19 = (Class3_Sub50) this.aClass62_5.method1682((long) arg0);
		if (local19 == null) {
			local19 = new Class3_Sub50(4611686018427387905L);
			this.aClass62_5.method1686((long) arg0, local19);
		} else if (local19.aLong267 != 4611686018427387905L) {
			local19.aLong267 = Static131.method2268() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IZ)I")
	public int method1436(@OriginalArg(1) boolean arg0) {
		@Pc(10) long local10 = Static131.method2268();
		for (@Pc(26) Class3_Sub50 local26 = arg0 ? (Class3_Sub50) this.aClass62_5.method1680() : (Class3_Sub50) this.aClass62_5.method1681(); local26 != null; local26 = (Class3_Sub50) this.aClass62_5.method1681()) {
			if (local10 > (local26.aLong267 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local26.aLong267 & 0x4000000000000000L) != 0L) {
					@Pc(57) int local57 = (int) local26.aLong309;
					this.anIntArray63[local57] = this.anIntArray64[local57];
					local26.method8770();
					return local57;
				}
				local26.method8770();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "(III)V")
	public void method1437(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray63[arg1] = arg0;
		@Pc(16) Class3_Sub50 local16 = (Class3_Sub50) this.aClass62_5.method1682((long) arg1);
		if (local16 == null) {
			local16 = new Class3_Sub50(Static131.method2268() + 500L);
			this.aClass62_5.method1686((long) arg1, local16);
		} else {
			local16.aLong267 = Static131.method2268() + 500L;
		}
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)I")
	@Override
	public int method1429(@OriginalArg(1) int arg0) {
		return this.anIntArray63[arg0];
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V")
	public void method1438() {
		for (@Pc(11) int local11 = 0; local11 < Static281.aClass389_1.anInt10257; local11++) {
			@Pc(18) Class209 local18 = Static281.aClass389_1.method8671(local11);
			if (local18 != null && local18.anInt5682 == 0) {
				this.anIntArray64[local11] = 0;
				this.anIntArray63[local11] = 0;
			}
		}
		this.aClass62_5 = new Class62(128);
	}
}
