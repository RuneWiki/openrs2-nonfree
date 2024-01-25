import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class77 implements Interface17 {

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "Lclient!pfa;")
	private Class253 aClass253_6 = new Class253(128);

	@OriginalMember(owner = "client!dr", name = "o", descriptor = "[I")
	private final int[] anIntArray138 = new int[Static198.aClass161_1.anInt5584];

	@OriginalMember(owner = "client!dr", name = "k", descriptor = "[I")
	public final int[] anIntArray137 = new int[Static198.aClass161_1.anInt5584];

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZI)I")
	public int method2389(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static342.method5463();
		for (@Pc(22) Class8_Sub46 local22 = arg0 ? (Class8_Sub46) this.aClass253_6.method6593() : (Class8_Sub46) this.aClass253_6.method6595(); local22 != null; local22 = (Class8_Sub46) this.aClass253_6.method6595()) {
			if ((local22.aLong258 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local22.aLong258 & 0x4000000000000000L) != 0L) {
					@Pc(42) int local42 = (int) local22.aLong285;
					this.anIntArray137[local42] = this.anIntArray138[local42];
					local22.method8640();
					return local42;
				}
				local22.method8640();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(III)V")
	public void method2390(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray138[arg0] = arg1;
		@Pc(16) Class8_Sub46 local16 = (Class8_Sub46) this.aClass253_6.method6594((long) arg0);
		if (local16 == null) {
			local16 = new Class8_Sub46(4611686018427387905L);
			this.aClass253_6.method6591(local16, (long) arg0);
		} else if (local16.aLong258 != 4611686018427387905L) {
			local16.aLong258 = Static342.method5463() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)I")
	@Override
	public int method2387(@OriginalArg(1) int arg0) {
		return this.anIntArray137[arg0];
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIB)V")
	public void method2392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class214 local8 = Static418.aClass293_1.method7163(arg0);
		@Pc(11) int local11 = local8.anInt6769;
		@Pc(20) int local20 = local8.anInt6770;
		@Pc(23) int local23 = local8.anInt6768;
		@Pc(30) int local30 = Class268.anIntArray443[local23 - local20];
		if (arg1 < 0 || arg1 > local30) {
			arg1 = 0;
		}
		local30 <<= local20;
		this.method2394(local11, arg1 << local20 & local30 | ~local30 & this.anIntArray137[local11]);
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(III)V")
	public void method2394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray137[arg0] = arg1;
		@Pc(16) Class8_Sub46 local16 = (Class8_Sub46) this.aClass253_6.method6594((long) arg0);
		if (local16 == null) {
			local16 = new Class8_Sub46(Static342.method5463() + 500L);
			this.aClass253_6.method6591(local16, (long) arg0);
		} else {
			local16.aLong258 = Static342.method5463() + 500L;
		}
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(III)V")
	public void method2395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class214 local16 = Static418.aClass293_1.method7163(arg1);
		@Pc(19) int local19 = local16.anInt6769;
		@Pc(22) int local22 = local16.anInt6770;
		@Pc(25) int local25 = local16.anInt6768;
		@Pc(32) int local32 = Class268.anIntArray443[local25 - local22];
		if (arg0 < 0 || arg0 > local32) {
			arg0 = 0;
		}
		local32 <<= local22;
		this.method2390(local19, arg0 << local22 & local32 | this.anIntArray138[local19] & ~local32);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BI)I")
	@Override
	public int method2386(@OriginalArg(1) int arg0) {
		@Pc(8) Class214 local8 = Static418.aClass293_1.method7163(arg0);
		@Pc(11) int local11 = local8.anInt6769;
		@Pc(14) int local14 = local8.anInt6770;
		@Pc(17) int local17 = local8.anInt6768;
		@Pc(24) int local24 = Class268.anIntArray443[local17 - local14];
		return local24 & this.anIntArray137[local11] >> local14;
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V")
	public void method2396() {
		for (@Pc(7) int local7 = 0; local7 < Static198.aClass161_1.anInt5584; local7++) {
			@Pc(20) Class322 local20 = Static198.aClass161_1.method4576(local7);
			if (local20 != null && local20.anInt9192 == 0) {
				this.anIntArray138[local7] = 0;
				this.anIntArray137[local7] = 0;
			}
		}
		this.aClass253_6 = new Class253(128);
	}
}
