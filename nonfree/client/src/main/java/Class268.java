import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class268 implements Interface12 {

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "Lclient!ew;")
	private Class72 aClass72_48 = new Class72(128);

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "[I")
	private final int[] anIntArray636 = new int[Static275.aClass138_1.anInt3503];

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "[I")
	public final int[] anIntArray638 = new int[Static275.aClass138_1.anInt3503];

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)V")
	public void method5651(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class99 local8 = Static291.aClass8_1.method148(arg1);
		@Pc(11) int local11 = local8.anInt2607;
		@Pc(14) int local14 = local8.anInt2612;
		@Pc(17) int local17 = local8.anInt2606;
		@Pc(24) int local24 = Class2_Sub1_Sub1.anIntArray4[local17 - local14];
		if (arg0 < 0 || arg0 > local24) {
			arg0 = 0;
		}
		local24 <<= local14;
		this.method5656(local24 & arg0 << local14 | ~local24 & this.anIntArray636[local11], local11);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(BII)V")
	public void method5652(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class99 local8 = Static291.aClass8_1.method148(arg1);
		@Pc(11) int local11 = local8.anInt2607;
		@Pc(14) int local14 = local8.anInt2612;
		@Pc(17) int local17 = local8.anInt2606;
		@Pc(24) int local24 = Class2_Sub1_Sub1.anIntArray4[local17 - local14];
		if (arg0 < 0 || local24 < arg0) {
			arg0 = 0;
		}
		local24 <<= local14;
		this.method5657(this.anIntArray638[local11] & ~local24 | local24 & arg0 << local14, local11);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZI)I")
	public int method5653(@OriginalArg(0) boolean arg0) {
		@Pc(14) long local14 = Static110.method1702();
		for (@Pc(30) Class2_Sub42 local30 = arg0 ? (Class2_Sub42) this.aClass72_48.method1655() : (Class2_Sub42) this.aClass72_48.method1649(); local30 != null; local30 = (Class2_Sub42) this.aClass72_48.method1649()) {
			if ((local30.aLong217 & 0x3FFFFFFFFFFFFFFFL) < local14) {
				if ((local30.aLong217 & 0x4000000000000000L) != 0L) {
					@Pc(57) int local57 = (int) local30.aLong225;
					this.anIntArray638[local57] = this.anIntArray636[local57];
					local30.method5703();
					return local57;
				}
				local30.method5703();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)I")
	@Override
	public int method5649(@OriginalArg(1) int arg0) {
		return this.anIntArray638[arg0];
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	public void method5654() {
		for (@Pc(15) int local15 = 0; local15 < Static275.aClass138_1.anInt3503; local15++) {
			@Pc(22) Class88 local22 = Static275.aClass138_1.method2812(local15);
			if (local22 != null && local22.anInt2410 == 0) {
				this.anIntArray636[local15] = 0;
				this.anIntArray638[local15] = 0;
			}
		}
		this.aClass72_48 = new Class72(128);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIB)V")
	public void method5656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray636[arg1] = arg0;
		@Pc(24) Class2_Sub42 local24 = (Class2_Sub42) this.aClass72_48.method1659((long) arg1);
		if (local24 == null) {
			local24 = new Class2_Sub42(4611686018427387905L);
			this.aClass72_48.method1653(local24, (long) arg1);
		} else if (local24.aLong217 != 4611686018427387905L) {
			local24.aLong217 = Static110.method1702() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)I")
	@Override
	public int method5650(@OriginalArg(0) int arg0) {
		@Pc(8) Class99 local8 = Static291.aClass8_1.method148(arg0);
		@Pc(19) int local19 = local8.anInt2607;
		@Pc(22) int local22 = local8.anInt2612;
		@Pc(25) int local25 = local8.anInt2606;
		@Pc(31) int local31 = Class2_Sub1_Sub1.anIntArray4[local25 - local22];
		return local31 & this.anIntArray638[local19] >> local22;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(III)V")
	public void method5657(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray638[arg1] = arg0;
		@Pc(16) Class2_Sub42 local16 = (Class2_Sub42) this.aClass72_48.method1659((long) arg1);
		if (local16 == null) {
			local16 = new Class2_Sub42(Static110.method1702() + 500L);
			this.aClass72_48.method1653(local16, (long) arg1);
		} else {
			local16.aLong217 = Static110.method1702() + 500L;
		}
	}
}
