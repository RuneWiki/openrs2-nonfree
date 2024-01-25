import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class10 implements Interface19 {

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "Lclient!pt;")
	private Class230 aClass230_6 = new Class230(128);

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "[I")
	private final int[] anIntArray28 = new int[Static292.aClass255_1.anInt7413];

	@OriginalMember(owner = "client!ak", name = "l", descriptor = "[I")
	public final int[] anIntArray29 = new int[Static292.aClass255_1.anInt7413];

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)I")
	@Override
	public int method523(@OriginalArg(0) int arg0) {
		@Pc(16) Class297 local16 = Static363.aClass118_1.method2937(arg0);
		@Pc(19) int local19 = local16.anInt8655;
		@Pc(22) int local22 = local16.anInt8659;
		@Pc(25) int local25 = local16.anInt8661;
		@Pc(32) int local32 = Class30.anIntArray73[local25 - local22];
		return this.anIntArray29[local19] >> local22 & local32;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBI)V")
	public void method524(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray28[arg0] = arg1;
		@Pc(24) Class1_Sub18 local24 = (Class1_Sub18) this.aClass230_6.method6144((long) arg0);
		if (local24 == null) {
			local24 = new Class1_Sub18(4611686018427387905L);
			this.aClass230_6.method6139((long) arg0, local24);
		} else if (local24.aLong92 != 4611686018427387905L) {
			local24.aLong92 = Static110.method2222() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)I")
	@Override
	public int method522(@OriginalArg(0) int arg0) {
		return this.anIntArray29[arg0];
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)V")
	public void method525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class297 local8 = Static363.aClass118_1.method2937(arg1);
		@Pc(11) int local11 = local8.anInt8655;
		@Pc(14) int local14 = local8.anInt8659;
		@Pc(17) int local17 = local8.anInt8661;
		@Pc(23) int local23 = Class30.anIntArray73[local17 - local14];
		if (arg0 < 0 || arg0 > local23) {
			arg0 = 0;
		}
		local23 <<= local14;
		this.method524(local11, local23 & arg0 << local14 | this.anIntArray28[local11] & ~local23);
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(III)V")
	public void method526(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray29[arg1] = arg0;
		@Pc(16) Class1_Sub18 local16 = (Class1_Sub18) this.aClass230_6.method6144((long) arg1);
		if (local16 == null) {
			local16 = new Class1_Sub18(Static110.method2222() + 500L);
			this.aClass230_6.method6139((long) arg1, local16);
		} else {
			local16.aLong92 = Static110.method2222() + 500L;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)I")
	public int method528(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static110.method2222();
		for (@Pc(22) Class1_Sub18 local22 = arg0 ? (Class1_Sub18) this.aClass230_6.method6137() : (Class1_Sub18) this.aClass230_6.method6140(); local22 != null; local22 = (Class1_Sub18) this.aClass230_6.method6140()) {
			if (local8 > (local22.aLong92 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local22.aLong92 & 0x4000000000000000L) != 0L) {
					@Pc(46) int local46 = (int) local22.aLong251;
					this.anIntArray29[local46] = this.anIntArray28[local46];
					local22.method8239();
					return local46;
				}
				local22.method8239();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BII)V")
	public void method530(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class297 local8 = Static363.aClass118_1.method2937(arg0);
		@Pc(11) int local11 = local8.anInt8655;
		@Pc(14) int local14 = local8.anInt8659;
		@Pc(22) int local22 = local8.anInt8661;
		@Pc(28) int local28 = Class30.anIntArray73[local22 - local14];
		if (arg1 < 0 || local28 < arg1) {
			arg1 = 0;
		}
		local28 <<= local14;
		this.method526(this.anIntArray29[local11] & ~local28 | local28 & arg1 << local14, local11);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
	public void method531() {
		for (@Pc(15) int local15 = 0; local15 < Static292.aClass255_1.anInt7413; local15++) {
			@Pc(22) Class244 local22 = Static292.aClass255_1.method6634(local15);
			if (local22 != null && local22.anInt7215 == 0) {
				this.anIntArray28[local15] = 0;
				this.anIntArray29[local15] = 0;
			}
		}
		this.aClass230_6 = new Class230(128);
	}
}
