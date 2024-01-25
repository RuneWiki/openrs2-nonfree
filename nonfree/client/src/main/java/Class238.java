import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mja")
public final class Class238 implements Interface2 {

	@OriginalMember(owner = "client!mja", name = "k", descriptor = "Lclient!fw;")
	private Class125 aClass125_25 = new Class125(128);

	@OriginalMember(owner = "client!mja", name = "e", descriptor = "[I")
	private final int[] anIntArray348 = new int[Static144.aClass379_2.anInt10685];

	@OriginalMember(owner = "client!mja", name = "b", descriptor = "[I")
	public final int[] anIntArray347 = new int[Static144.aClass379_2.anInt10685];

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(B)V")
	public void method5866() {
		for (@Pc(5) int local5 = 0; local5 < Static144.aClass379_2.anInt10685; local5++) {
			@Pc(11) Class149 local11 = Static144.aClass379_2.method9125(local5);
			if (local11 != null && local11.anInt4239 == 0) {
				this.anIntArray348[local5] = 0;
				this.anIntArray347[local5] = 0;
			}
		}
		this.aClass125_25 = new Class125(128);
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(IZI)V")
	public void method5868(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray347[arg0] = arg1;
		@Pc(16) Class14_Sub46 local16 = (Class14_Sub46) this.aClass125_25.method2630((long) arg0);
		if (local16 == null) {
			local16 = new Class14_Sub46(Static26.method382() + 500L);
			this.aClass125_25.method2626(local16, (long) arg0);
		} else {
			local16.aLong284 = Static26.method382() + 500L;
		}
	}

	@OriginalMember(owner = "client!mja", name = "b", descriptor = "(III)V")
	public void method5869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray348[arg1] = arg0;
		@Pc(16) Class14_Sub46 local16 = (Class14_Sub46) this.aClass125_25.method2630((long) arg1);
		if (local16 == null) {
			local16 = new Class14_Sub46(4611686018427387905L);
			this.aClass125_25.method2626(local16, (long) arg1);
		} else if (local16.aLong284 != 4611686018427387905L) {
			local16.aLong284 = Static26.method382() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!mja", name = "c", descriptor = "(III)V")
	public void method5870(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class112 local8 = Static431.aClass18_1.method281(arg1);
		@Pc(11) int local11 = local8.anInt2389;
		@Pc(14) int local14 = local8.anInt2390;
		@Pc(17) int local17 = local8.anInt2393;
		@Pc(24) int local24 = Class67_Sub1_Sub1.anIntArray82[local17 - local14];
		if (arg0 < 0 || local24 < arg0) {
			arg0 = 0;
		}
		local24 <<= local14;
		this.method5869(local24 & arg0 << local14 | this.anIntArray348[local11] & ~local24, local11);
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(ZI)I")
	@Override
	public int method5865(@OriginalArg(1) int arg0) {
		return this.anIntArray347[arg0];
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(II)I")
	@Override
	public int method5864(@OriginalArg(1) int arg0) {
		@Pc(8) Class112 local8 = Static431.aClass18_1.method281(arg0);
		@Pc(11) int local11 = local8.anInt2389;
		@Pc(21) int local21 = local8.anInt2390;
		@Pc(24) int local24 = local8.anInt2393;
		@Pc(30) int local30 = Class67_Sub1_Sub1.anIntArray82[local24 - local21];
		return local30 & this.anIntArray347[local11] >> local21;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(III)V")
	public void method5871(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class112 local8 = Static431.aClass18_1.method281(arg1);
		@Pc(11) int local11 = local8.anInt2389;
		@Pc(14) int local14 = local8.anInt2390;
		@Pc(17) int local17 = local8.anInt2393;
		@Pc(33) int local33 = Class67_Sub1_Sub1.anIntArray82[local17 - local14];
		if (arg0 < 0 || local33 < arg0) {
			arg0 = 0;
		}
		local33 <<= local14;
		this.method5868(local11, arg0 << local14 & local33 | ~local33 & this.anIntArray347[local11]);
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(ZB)I")
	public int method5872(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static26.method382();
		for (@Pc(29) Class14_Sub46 local29 = arg0 ? (Class14_Sub46) this.aClass125_25.method2633() : (Class14_Sub46) this.aClass125_25.method2627(); local29 != null; local29 = (Class14_Sub46) this.aClass125_25.method2627()) {
			if (local8 > (local29.aLong284 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local29.aLong284 & 0x4000000000000000L) != 0L) {
					@Pc(62) int local62 = (int) local29.aLong324;
					this.anIntArray347[local62] = this.anIntArray348[local62];
					local29.method9513();
					return local62;
				}
				local29.method9513();
			}
		}
		return -1;
	}
}
