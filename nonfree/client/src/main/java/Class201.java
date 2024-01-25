import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class201 implements Interface5 {

	@OriginalMember(owner = "client!qk", name = "n", descriptor = "Lclient!mn;")
	private Class167 aClass167_22 = new Class167(128);

	@OriginalMember(owner = "client!qk", name = "i", descriptor = "[I")
	public final int[] anIntArray549 = new int[Static82.aClass271_1.anInt7591];

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "[I")
	private final int[] anIntArray548 = new int[Static82.aClass271_1.anInt7591];

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)V")
	public void method4479(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray548[arg1] = arg0;
		@Pc(24) Class10_Sub37 local24 = (Class10_Sub37) this.aClass167_22.method3709((long) arg1);
		if (local24 == null) {
			local24 = new Class10_Sub37(4611686018427387905L);
			this.aClass167_22.method3705(local24, (long) arg1);
		} else if (local24.aLong194 != 4611686018427387905L) {
			local24.aLong194 = Static220.method3314() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)I")
	@Override
	public int method4477(@OriginalArg(0) int arg0) {
		@Pc(8) Class212 local8 = Static189.aClass112_1.method2700(arg0);
		@Pc(11) int local11 = local8.anInt6046;
		@Pc(14) int local14 = local8.anInt6051;
		@Pc(17) int local17 = local8.anInt6048;
		@Pc(28) int local28 = Class245_Sub1.anIntArray728[local17 - local14];
		return local28 & this.anIntArray549[local11] >> local14;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)I")
	@Override
	public int method4478(@OriginalArg(0) int arg0) {
		return this.anIntArray549[arg0];
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	public void method4481() {
		for (@Pc(3) int local3 = 0; local3 < Static82.aClass271_1.anInt7591; local3++) {
			@Pc(10) Class73 local10 = Static82.aClass271_1.method6056(local3);
			if (local10 != null && local10.anInt2126 == 0) {
				this.anIntArray548[local3] = 0;
				this.anIntArray549[local3] = 0;
			}
		}
		this.aClass167_22 = new Class167(128);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZZ)I")
	public int method4482(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static220.method3314();
		for (@Pc(27) Class10_Sub37 local27 = arg0 ? (Class10_Sub37) this.aClass167_22.method3702() : (Class10_Sub37) this.aClass167_22.method3708(); local27 != null; local27 = (Class10_Sub37) this.aClass167_22.method3708()) {
			if ((local27.aLong194 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local27.aLong194 & 0x4000000000000000L) != 0L) {
					@Pc(53) int local53 = (int) local27.aLong264;
					this.anIntArray549[local53] = this.anIntArray548[local53];
					local27.method6033();
					return local53;
				}
				local27.method6033();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BII)V")
	public void method4484(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray549[arg1] = arg0;
		@Pc(20) Class10_Sub37 local20 = (Class10_Sub37) this.aClass167_22.method3709((long) arg1);
		if (local20 == null) {
			local20 = new Class10_Sub37(Static220.method3314() + 500L);
			this.aClass167_22.method3705(local20, (long) arg1);
		} else {
			local20.aLong194 = Static220.method3314() + 500L;
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(III)V")
	public void method4485(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class212 local8 = Static189.aClass112_1.method2700(arg1);
		@Pc(11) int local11 = local8.anInt6046;
		@Pc(14) int local14 = local8.anInt6051;
		@Pc(17) int local17 = local8.anInt6048;
		@Pc(24) int local24 = Class245_Sub1.anIntArray728[local17 - local14];
		if (arg0 < 0 || arg0 > local24) {
			arg0 = 0;
		}
		local24 <<= local14;
		this.method4484(~local24 & this.anIntArray549[local11] | local24 & arg0 << local14, local11);
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(III)V")
	public void method4486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class212 local14 = Static189.aClass112_1.method2700(arg0);
		@Pc(17) int local17 = local14.anInt6046;
		@Pc(20) int local20 = local14.anInt6051;
		@Pc(23) int local23 = local14.anInt6048;
		@Pc(30) int local30 = Class245_Sub1.anIntArray728[local23 - local20];
		if (arg1 < 0 || arg1 > local30) {
			arg1 = 0;
		}
		local30 <<= local20;
		this.method4479(local30 & arg1 << local20 | this.anIntArray548[local17] & ~local30, local17);
	}
}
