import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class66 implements Interface16 {

	@OriginalMember(owner = "client!cs", name = "i", descriptor = "Lclient!ee;")
	private Class83 aClass83_4 = new Class83(128);

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "[I")
	private final int[] anIntArray141 = new int[Static411.aClass70_1.anInt1778];

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "[I")
	public final int[] anIntArray143 = new int[Static411.aClass70_1.anInt1778];

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZB)I")
	public int method1631(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static524.method7320();
		for (@Pc(30) Class3_Sub42 local30 = arg0 ? (Class3_Sub42) this.aClass83_4.method2375() : (Class3_Sub42) this.aClass83_4.method2370(); local30 != null; local30 = (Class3_Sub42) this.aClass83_4.method2370()) {
			if (local8 > (local30.aLong197 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local30.aLong197 & 0x4000000000000000L) != 0L) {
					@Pc(59) int local59 = (int) local30.aLong311;
					this.anIntArray143[local59] = this.anIntArray141[local59];
					local30.method9380();
					return local59;
				}
				local30.method9380();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BII)V")
	public void method1632(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class51 local8 = Static264.aClass110_1.method3160(arg0);
		@Pc(11) int local11 = local8.anInt1250;
		@Pc(14) int local14 = local8.anInt1255;
		@Pc(24) int local24 = local8.anInt1256;
		@Pc(30) int local30 = Class364.anIntArray874[local24 - local14];
		if (arg1 < 0 || local30 < arg1) {
			arg1 = 0;
		}
		local30 <<= local14;
		this.method1636(local11, this.anIntArray141[local11] & ~local30 | local30 & arg1 << local14);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIB)V")
	public void method1633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray143[arg0] = arg1;
		@Pc(24) Class3_Sub42 local24 = (Class3_Sub42) this.aClass83_4.method2368((long) arg0);
		if (local24 == null) {
			local24 = new Class3_Sub42(Static524.method7320() + 500L);
			this.aClass83_4.method2377((long) arg0, local24);
		} else {
			local24.aLong197 = Static524.method7320() + 500L;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
	public void method1635() {
		for (@Pc(7) int local7 = 0; local7 < Static411.aClass70_1.anInt1778; local7++) {
			@Pc(14) Class91 local14 = Static411.aClass70_1.method1705(local7);
			if (local14 != null && local14.anInt2781 == 0) {
				this.anIntArray141[local7] = 0;
				this.anIntArray143[local7] = 0;
			}
		}
		this.aClass83_4 = new Class83(128);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)I")
	@Override
	public int method1629(@OriginalArg(0) int arg0) {
		@Pc(8) Class51 local8 = Static264.aClass110_1.method3160(arg0);
		@Pc(11) int local11 = local8.anInt1250;
		@Pc(14) int local14 = local8.anInt1255;
		@Pc(22) int local22 = local8.anInt1256;
		@Pc(29) int local29 = Class364.anIntArray874[local22 - local14];
		return this.anIntArray143[local11] >> local14 & local29;
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(II)I")
	@Override
	public int method1630(@OriginalArg(1) int arg0) {
		return this.anIntArray143[arg0];
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)V")
	public void method1636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray141[arg0] = arg1;
		@Pc(16) Class3_Sub42 local16 = (Class3_Sub42) this.aClass83_4.method2368((long) arg0);
		if (local16 == null) {
			local16 = new Class3_Sub42(4611686018427387905L);
			this.aClass83_4.method2377((long) arg0, local16);
		} else if (local16.aLong197 != 4611686018427387905L) {
			local16.aLong197 = Static524.method7320() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(III)V")
	public void method1637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class51 local8 = Static264.aClass110_1.method3160(arg0);
		@Pc(11) int local11 = local8.anInt1250;
		@Pc(14) int local14 = local8.anInt1255;
		@Pc(17) int local17 = local8.anInt1256;
		@Pc(24) int local24 = Class364.anIntArray874[local17 - local14];
		if (arg1 < 0 || arg1 > local24) {
			arg1 = 0;
		}
		local24 <<= local14;
		this.method1633(local11, this.anIntArray143[local11] & ~local24 | arg1 << local14 & local24);
	}
}
