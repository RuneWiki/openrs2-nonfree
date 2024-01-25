import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class31 implements Interface9 {

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "Lclient!dea;")
	private Class68 aClass68_8 = new Class68(128);

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "[I")
	public final int[] anIntArray117 = new int[Static367.aClass146_1.anInt4592];

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "[I")
	private final int[] anIntArray118 = new int[Static367.aClass146_1.anInt4592];

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BII)V")
	public void method789(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class161 local8 = Static64.aClass296_10.method7298(arg0);
		@Pc(11) int local11 = local8.anInt4893;
		@Pc(14) int local14 = local8.anInt4892;
		@Pc(17) int local17 = local8.anInt4895;
		@Pc(32) int local32 = Class150.anIntArray343[local17 - local14];
		if (arg1 < 0 || local32 < arg1) {
			arg1 = 0;
		}
		local32 <<= local14;
		this.method790(arg1 << local14 & local32 | ~local32 & this.anIntArray118[local11], local11);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
	public void method790(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray118[arg1] = arg0;
		@Pc(24) Class12_Sub40 local24 = (Class12_Sub40) this.aClass68_8.method1917((long) arg1);
		if (local24 == null) {
			local24 = new Class12_Sub40(4611686018427387905L);
			this.aClass68_8.method1916(local24, (long) arg1);
		} else if (local24.aLong171 != 4611686018427387905L) {
			local24.aLong171 = Static76.method1679() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)V")
	public void method791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class161 local8 = Static64.aClass296_10.method7298(arg1);
		@Pc(11) int local11 = local8.anInt4893;
		@Pc(14) int local14 = local8.anInt4892;
		@Pc(17) int local17 = local8.anInt4895;
		@Pc(24) int local24 = Class150.anIntArray343[local17 - local14];
		if (arg0 < 0 || arg0 > local24) {
			arg0 = 0;
		}
		local24 <<= local14;
		this.method793(local11, arg0 << local14 & local24 | this.anIntArray117[local11] & ~local24);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)I")
	@Override
	public int method788(@OriginalArg(1) int arg0) {
		@Pc(8) Class161 local8 = Static64.aClass296_10.method7298(arg0);
		@Pc(11) int local11 = local8.anInt4893;
		@Pc(19) int local19 = local8.anInt4892;
		@Pc(22) int local22 = local8.anInt4895;
		@Pc(29) int local29 = Class150.anIntArray343[local22 - local19];
		return this.anIntArray117[local11] >> local19 & local29;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BZ)I")
	public int method792(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static76.method1679();
		for (@Pc(28) Class12_Sub40 local28 = arg0 ? (Class12_Sub40) this.aClass68_8.method1923() : (Class12_Sub40) this.aClass68_8.method1920(); local28 != null; local28 = (Class12_Sub40) this.aClass68_8.method1920()) {
			if (local8 > (local28.aLong171 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local28.aLong171 & 0x4000000000000000L) != 0L) {
					@Pc(57) int local57 = (int) local28.aLong248;
					this.anIntArray117[local57] = this.anIntArray118[local57];
					local28.method7967();
					return local57;
				}
				local28.method7967();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(III)V")
	public void method793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray117[arg0] = arg1;
		@Pc(16) Class12_Sub40 local16 = (Class12_Sub40) this.aClass68_8.method1917((long) arg0);
		if (local16 == null) {
			local16 = new Class12_Sub40(Static76.method1679() + 500L);
			this.aClass68_8.method1916(local16, (long) arg0);
		} else {
			local16.aLong171 = Static76.method1679() + 500L;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)I")
	@Override
	public int method787(@OriginalArg(0) int arg0) {
		return this.anIntArray117[arg0];
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
	public void method794() {
		for (@Pc(3) int local3 = 0; local3 < Static367.aClass146_1.anInt4592; local3++) {
			@Pc(10) Class286 local10 = Static367.aClass146_1.method3868(local3);
			if (local10 != null && local10.anInt8682 == 0) {
				this.anIntArray118[local3] = 0;
				this.anIntArray117[local3] = 0;
			}
		}
		this.aClass68_8 = new Class68(128);
	}
}
