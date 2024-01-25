import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class61_Sub1 extends Class61 {

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
	public int anInt1360;

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
	public int anInt1361;

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
	public int anInt1362;

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
	public int anInt1363;

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
	public int anInt1364;

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
	public int anInt1365;

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
	public int anInt1366;

	@OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
	public int anInt1367;

	@OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
	public int anInt1368;

	@OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
	public int anInt1369;

	@OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
	public int anInt1370;

	@OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
	public int anInt1371;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	public Class61_Sub1() {
		this.method3663();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(III[I)V")
	@Override
	public void method3656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg3[0] = this.anInt1370 + (this.anInt1369 * arg0 + this.anInt1365 * arg1 + this.anInt1371 * arg2 >> 15);
		arg3[1] = this.anInt1366 + (this.anInt1360 * arg0 + this.anInt1367 * arg1 + this.anInt1364 * arg2 >> 15);
		arg3[2] = this.anInt1361 + (this.anInt1368 * arg0 + this.anInt1363 * arg1 + this.anInt1362 * arg2 >> 15);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "()V")
	@Override
	public void method3663() {
		this.anInt1360 = this.anInt1368 = this.anInt1365 = this.anInt1363 = this.anInt1371 = this.anInt1364 = this.anInt1370 = this.anInt1366 = this.anInt1361 = 0;
		this.anInt1369 = this.anInt1367 = this.anInt1362 = 32768;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method3668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = Class140.anIntArray329[arg3 & 0x3FFF];
		@Pc(11) int local11 = Class140.anIntArray330[arg3 & 0x3FFF];
		@Pc(17) int local17 = Class140.anIntArray329[arg4 & 0x3FFF];
		@Pc(23) int local23 = Class140.anIntArray330[arg4 & 0x3FFF];
		@Pc(29) int local29 = Class140.anIntArray329[arg5 & 0x3FFF];
		@Pc(35) int local35 = Class140.anIntArray330[arg5 & 0x3FFF];
		@Pc(41) int local41 = local11 * local29 >> 15;
		@Pc(47) int local47 = local11 * local35 >> 15;
		this.anInt1369 = local17 * local29 + local23 * local47 >> 15;
		this.anInt1360 = -local17 * local35 + local23 * local41 >> 15;
		this.anInt1368 = local23 * local5 >> 15;
		this.anInt1365 = local5 * local35 >> 15;
		this.anInt1367 = local5 * local29 >> 15;
		this.anInt1363 = -local11;
		this.anInt1371 = -local23 * local29 + local17 * local47 >> 15;
		this.anInt1364 = local23 * local35 + local17 * local41 >> 15;
		this.anInt1362 = local17 * local5 >> 15;
		this.anInt1370 = -arg0 * this.anInt1369 - arg1 * this.anInt1365 - arg2 * this.anInt1371 >> 15;
		this.anInt1366 = -arg0 * this.anInt1360 - arg1 * this.anInt1367 - arg2 * this.anInt1364 >> 15;
		this.anInt1361 = -arg0 * this.anInt1368 - arg1 * this.anInt1363 - arg2 * this.anInt1362 >> 15;
	}

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V")
	@Override
	public void method3664(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class140.anIntArray329[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class140.anIntArray330[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt1360;
		@Pc(17) int local17 = this.anInt1367;
		@Pc(20) int local20 = this.anInt1364;
		@Pc(23) int local23 = this.anInt1366;
		this.anInt1360 = local14 * local5 - this.anInt1368 * local11 >> 15;
		this.anInt1368 = local14 * local11 + this.anInt1368 * local5 >> 15;
		this.anInt1367 = local17 * local5 - this.anInt1363 * local11 >> 15;
		this.anInt1363 = local17 * local11 + this.anInt1363 * local5 >> 15;
		this.anInt1364 = local20 * local5 - this.anInt1362 * local11 >> 15;
		this.anInt1362 = local20 * local11 + this.anInt1362 * local5 >> 15;
		this.anInt1366 = local23 * local5 - this.anInt1361 * local11 >> 15;
		this.anInt1361 = local23 * local11 + this.anInt1361 * local5 >> 15;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)V")
	@Override
	public void method3665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1370 += arg0;
		this.anInt1366 += arg1;
		this.anInt1361 += arg2;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "()Lclient!ei;")
	public Class61_Sub1 method1111() {
		@Pc(3) Class61_Sub1 local3 = new Class61_Sub1();
		local3.anInt1369 = this.anInt1369;
		local3.anInt1365 = this.anInt1365;
		local3.anInt1371 = this.anInt1371;
		local3.anInt1370 = this.anInt1370;
		local3.anInt1360 = this.anInt1360;
		local3.anInt1367 = this.anInt1367;
		local3.anInt1364 = this.anInt1364;
		local3.anInt1366 = this.anInt1366;
		local3.anInt1368 = this.anInt1368;
		local3.anInt1363 = this.anInt1363;
		local3.anInt1362 = this.anInt1362;
		local3.anInt1361 = this.anInt1361;
		return local3;
	}

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)V")
	@Override
	public void method3667(@OriginalArg(0) int arg0) {
		this.anInt1367 = 32768;
		this.anInt1369 = this.anInt1362 = Class140.anIntArray329[arg0 & 0x3FFF];
		this.anInt1371 = Class140.anIntArray330[arg0 & 0x3FFF];
		this.anInt1368 = -this.anInt1371;
		this.anInt1365 = this.anInt1370 = this.anInt1360 = this.anInt1364 = this.anInt1366 = this.anInt1363 = this.anInt1361 = 0;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!ic;)V")
	@Override
	public void method3670(@OriginalArg(0) Class61 arg0) {
		@Pc(2) Class61_Sub1 local2 = (Class61_Sub1) arg0;
		this.anInt1369 = local2.anInt1369;
		this.anInt1365 = local2.anInt1365;
		this.anInt1371 = local2.anInt1371;
		this.anInt1370 = local2.anInt1370;
		this.anInt1360 = local2.anInt1360;
		this.anInt1367 = local2.anInt1367;
		this.anInt1364 = local2.anInt1364;
		this.anInt1366 = local2.anInt1366;
		this.anInt1368 = local2.anInt1368;
		this.anInt1363 = local2.anInt1363;
		this.anInt1362 = local2.anInt1362;
		this.anInt1361 = local2.anInt1361;
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V")
	@Override
	public void method3659(@OriginalArg(0) int arg0) {
		this.anInt1362 = 32768;
		this.anInt1369 = this.anInt1367 = Class140.anIntArray329[arg0 & 0x3FFF];
		this.anInt1360 = Class140.anIntArray330[arg0 & 0x3FFF];
		this.anInt1365 = -this.anInt1360;
		this.anInt1371 = this.anInt1370 = this.anInt1364 = this.anInt1366 = this.anInt1368 = this.anInt1363 = this.anInt1361 = 0;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
	@Override
	public void method3655(@OriginalArg(0) int arg0) {
		this.anInt1369 = 32768;
		this.anInt1367 = this.anInt1362 = Class140.anIntArray329[arg0 & 0x3FFF];
		this.anInt1363 = Class140.anIntArray330[arg0 & 0x3FFF];
		this.anInt1364 = -this.anInt1363;
		this.anInt1365 = this.anInt1371 = this.anInt1370 = this.anInt1360 = this.anInt1366 = this.anInt1368 = this.anInt1361 = 0;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(III)V")
	@Override
	public void method3666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1360 = this.anInt1368 = this.anInt1365 = this.anInt1363 = this.anInt1371 = this.anInt1364 = 0;
		this.anInt1369 = this.anInt1367 = this.anInt1362 = 32768;
		this.anInt1370 = arg0;
		this.anInt1366 = arg1;
		this.anInt1361 = arg2;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "([I)V")
	@Override
	public void method3661(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = arg0[0] - this.anInt1370;
		@Pc(13) int local13 = arg0[1] - this.anInt1366;
		@Pc(20) int local20 = arg0[2] - this.anInt1361;
		arg0[0] = this.anInt1369 * local6 + this.anInt1360 * local13 + this.anInt1368 * local20 >> 15;
		arg0[1] = this.anInt1365 * local6 + this.anInt1367 * local13 + this.anInt1363 * local20 >> 15;
		arg0[2] = this.anInt1371 * local6 + this.anInt1364 * local13 + this.anInt1362 * local20 >> 15;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
	@Override
	public void method3657(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = Class140.anIntArray329[arg0 & 0x3FFF];
		@Pc(11) int local11 = Class140.anIntArray330[arg0 & 0x3FFF];
		@Pc(14) int local14 = this.anInt1369;
		@Pc(17) int local17 = this.anInt1365;
		@Pc(20) int local20 = this.anInt1371;
		@Pc(23) int local23 = this.anInt1370;
		this.anInt1369 = local14 * local5 + this.anInt1368 * local11 >> 15;
		this.anInt1368 = this.anInt1368 * local5 - local14 * local11 >> 15;
		this.anInt1365 = local17 * local5 + this.anInt1363 * local11 >> 15;
		this.anInt1363 = this.anInt1363 * local5 - local17 * local11 >> 15;
		this.anInt1371 = local20 * local5 + this.anInt1362 * local11 >> 15;
		this.anInt1362 = this.anInt1362 * local5 - local20 * local11 >> 15;
		this.anInt1370 = local23 * local5 + this.anInt1361 * local11 >> 15;
		this.anInt1361 = this.anInt1361 * local5 - local23 * local11 >> 15;
	}
}
