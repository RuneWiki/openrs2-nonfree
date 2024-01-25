import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class81 implements Interface12 {

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "Lclient!ek;")
	private Class67 aClass67_9 = new Class67(128);

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "[I")
	public final int[] anIntArray159 = new int[Static438.aClass143_5.anInt3566];

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "[I")
	private final int[] anIntArray158 = new int[Static438.aClass143_5.anInt3566];

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BII)V")
	public void method1662(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray159[arg1] = arg0;
		@Pc(21) Class4_Sub29 local21 = (Class4_Sub29) this.aClass67_9.method1429((long) arg1);
		if (local21 == null) {
			local21 = new Class4_Sub29(Static266.method3498() + 500L);
			this.aClass67_9.method1426(local21, (long) arg1);
		} else {
			local21.aLong134 = Static266.method3498() + 500L;
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
	public void method1663() {
		for (@Pc(14) int local14 = 0; local14 < Static438.aClass143_5.anInt3566; local14++) {
			@Pc(21) Class262 local21 = Static438.aClass143_5.method2848(local14);
			if (local21 != null && local21.anInt7333 == 0) {
				this.anIntArray158[local14] = 0;
				this.anIntArray159[local14] = 0;
			}
		}
		this.aClass67_9 = new Class67(128);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)I")
	@Override
	public int method1659(@OriginalArg(1) int arg0) {
		return this.anIntArray159[arg0];
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IZI)V")
	public void method1665(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class102 local13 = Static426.aClass156_2.method3019(arg1);
		@Pc(16) int local16 = local13.anInt2498;
		@Pc(19) int local19 = local13.anInt2499;
		@Pc(22) int local22 = local13.anInt2501;
		@Pc(29) int local29 = Class4_Sub5.anIntArray19[local22 - local19];
		if (arg0 < 0 || arg0 > local29) {
			arg0 = 0;
		}
		local29 <<= local19;
		this.method1669(local16, arg0 << local19 & local29 | ~local29 & this.anIntArray158[local16]);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)V")
	public void method1666(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class102 local10 = Static426.aClass156_2.method3019(arg0);
		@Pc(13) int local13 = local10.anInt2498;
		@Pc(16) int local16 = local10.anInt2499;
		@Pc(19) int local19 = local10.anInt2501;
		@Pc(26) int local26 = Class4_Sub5.anIntArray19[local19 - local16];
		if (arg1 < 0 || local26 < arg1) {
			arg1 = 0;
		}
		local26 <<= local16;
		this.method1662(local26 & arg1 << local16 | this.anIntArray159[local13] & ~local26, local13);
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)I")
	@Override
	public int method1660(@OriginalArg(1) int arg0) {
		@Pc(13) Class102 local13 = Static426.aClass156_2.method3019(arg0);
		@Pc(16) int local16 = local13.anInt2498;
		@Pc(19) int local19 = local13.anInt2499;
		@Pc(22) int local22 = local13.anInt2501;
		@Pc(29) int local29 = Class4_Sub5.anIntArray19[local22 - local19];
		return local29 & this.anIntArray159[local16] >> local19;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BZ)I")
	public int method1668(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static266.method3498();
		for (@Pc(27) Class4_Sub29 local27 = arg0 ? (Class4_Sub29) this.aClass67_9.method1428() : (Class4_Sub29) this.aClass67_9.method1424(); local27 != null; local27 = (Class4_Sub29) this.aClass67_9.method1424()) {
			if ((local27.aLong134 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local27.aLong134 & 0x4000000000000000L) != 0L) {
					@Pc(53) int local53 = (int) local27.aLong227;
					this.anIntArray159[local53] = this.anIntArray158[local53];
					local27.method6059();
					return local53;
				}
				local27.method6059();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZII)V")
	public void method1669(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray158[arg0] = arg1;
		@Pc(24) Class4_Sub29 local24 = (Class4_Sub29) this.aClass67_9.method1429((long) arg0);
		if (local24 == null) {
			local24 = new Class4_Sub29(4611686018427387905L);
			this.aClass67_9.method1426(local24, (long) arg0);
		} else if (local24.aLong134 != 4611686018427387905L) {
			local24.aLong134 = Static266.method3498() + 500L | 0x4000000000000000L;
		}
	}
}
