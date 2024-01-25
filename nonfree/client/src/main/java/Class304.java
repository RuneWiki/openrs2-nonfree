import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class304 implements Interface4 {

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "Lclient!du;")
	private Class81 aClass81_60 = new Class81(128);

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "[I")
	private final int[] anIntArray665 = new int[Static520.aClass381_1.anInt10359];

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "[I")
	public final int[] anIntArray666 = new int[Static520.aClass381_1.anInt10359];

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
	public void method7290() {
		for (@Pc(7) int local7 = 0; local7 < Static520.aClass381_1.anInt10359; local7++) {
			@Pc(14) Class198 local14 = Static520.aClass381_1.method8802(local7);
			if (local14 != null && local14.anInt4818 == 0) {
				this.anIntArray665[local7] = 0;
				this.anIntArray666[local7] = 0;
			}
		}
		this.aClass81_60 = new Class81(128);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZ)I")
	public int method7291(@OriginalArg(1) boolean arg0) {
		@Pc(16) long local16 = Static205.method3179();
		for (@Pc(30) Class5_Sub7 local30 = arg0 ? (Class5_Sub7) this.aClass81_60.method1608() : (Class5_Sub7) this.aClass81_60.method1610(); local30 != null; local30 = (Class5_Sub7) this.aClass81_60.method1610()) {
			if ((local30.aLong27 & 0x3FFFFFFFFFFFFFFFL) < local16) {
				if ((local30.aLong27 & 0x4000000000000000L) != 0L) {
					@Pc(50) int local50 = (int) local30.aLong282;
					this.anIntArray666[local50] = this.anIntArray665[local50];
					local30.method8911();
					return local50;
				}
				local30.method8911();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIB)V")
	public void method7292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class267 local10 = Static386.aClass338_1.method8030(arg1);
		@Pc(13) int local13 = local10.anInt7202;
		@Pc(24) int local24 = local10.anInt7201;
		@Pc(27) int local27 = local10.anInt7206;
		@Pc(34) int local34 = Class14_Sub1_Sub4_Sub1.anIntArray175[local27 - local24];
		if (arg0 < 0 || arg0 > local34) {
			arg0 = 0;
		}
		local34 <<= local24;
		this.method7295(local34 & arg0 << local24 | ~local34 & this.anIntArray666[local13], local13);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)V")
	public void method7294(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray665[arg0] = arg1;
		@Pc(24) Class5_Sub7 local24 = (Class5_Sub7) this.aClass81_60.method1599((long) arg0);
		if (local24 == null) {
			local24 = new Class5_Sub7(4611686018427387905L);
			this.aClass81_60.method1607(local24, (long) arg0);
		} else if (local24.aLong27 != 4611686018427387905L) {
			local24.aLong27 = Static205.method3179() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(III)V")
	public void method7295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray666[arg1] = arg0;
		@Pc(23) Class5_Sub7 local23 = (Class5_Sub7) this.aClass81_60.method1599((long) arg1);
		if (local23 == null) {
			local23 = new Class5_Sub7(Static205.method3179() + 500L);
			this.aClass81_60.method1607(local23, (long) arg1);
		} else {
			local23.aLong27 = Static205.method3179() + 500L;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB)I")
	@Override
	public int method7288(@OriginalArg(0) int arg0) {
		@Pc(8) Class267 local8 = Static386.aClass338_1.method8030(arg0);
		@Pc(16) int local16 = local8.anInt7202;
		@Pc(19) int local19 = local8.anInt7201;
		@Pc(22) int local22 = local8.anInt7206;
		@Pc(29) int local29 = Class14_Sub1_Sub4_Sub1.anIntArray175[local22 - local19];
		return local29 & this.anIntArray666[local16] >> local19;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(IB)I")
	@Override
	public int method7289(@OriginalArg(0) int arg0) {
		return this.anIntArray666[arg0];
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(III)V")
	public void method7297(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class267 local16 = Static386.aClass338_1.method8030(arg0);
		@Pc(19) int local19 = local16.anInt7202;
		@Pc(22) int local22 = local16.anInt7201;
		@Pc(25) int local25 = local16.anInt7206;
		@Pc(32) int local32 = Class14_Sub1_Sub4_Sub1.anIntArray175[local25 - local22];
		if (arg1 < 0 || arg1 > local32) {
			arg1 = 0;
		}
		local32 <<= local22;
		this.method7294(local19, arg1 << local22 & local32 | this.anIntArray665[local19] & ~local32);
	}
}
