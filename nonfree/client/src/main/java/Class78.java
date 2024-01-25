import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class78 implements Interface9 {

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "Lclient!il;")
	private Class162 aClass162_14 = new Class162(128);

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "[I")
	private final int[] anIntArray103 = new int[Static146.aClass7_1.anInt296];

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "[I")
	public final int[] anIntArray104 = new int[Static146.aClass7_1.anInt296];

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZII)V")
	public void method1461(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray104[arg1] = arg0;
		@Pc(25) Class2_Sub34 local25 = (Class2_Sub34) this.aClass162_14.method3519((long) arg1);
		if (local25 == null) {
			local25 = new Class2_Sub34(Static548.method7437() + 500L);
			this.aClass162_14.method3522(local25, (long) arg1);
		} else {
			local25.aLong165 = Static548.method7437() + 500L;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V")
	public void method1462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class264 local8 = Static49.aClass282_1.method6474(arg0);
		@Pc(17) int local17 = local8.anInt7243;
		@Pc(20) int local20 = local8.anInt7244;
		@Pc(23) int local23 = local8.anInt7242;
		@Pc(30) int local30 = Class264.anIntArray496[local23 - local20];
		if (arg1 < 0 || local30 < arg1) {
			arg1 = 0;
		}
		local30 <<= local20;
		this.method1463(local17, ~local30 & this.anIntArray103[local17] | arg1 << local20 & local30);
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)I")
	@Override
	public int method1460(@OriginalArg(0) int arg0) {
		return this.anIntArray104[arg0];
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(III)V")
	public void method1463(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray103[arg0] = arg1;
		@Pc(21) Class2_Sub34 local21 = (Class2_Sub34) this.aClass162_14.method3519((long) arg0);
		if (local21 == null) {
			local21 = new Class2_Sub34(4611686018427387905L);
			this.aClass162_14.method3522(local21, (long) arg0);
		} else if (local21.aLong165 != 4611686018427387905L) {
			local21.aLong165 = Static548.method7437() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)I")
	@Override
	public int method1459(@OriginalArg(1) int arg0) {
		@Pc(13) Class264 local13 = Static49.aClass282_1.method6474(arg0);
		@Pc(16) int local16 = local13.anInt7243;
		@Pc(19) int local19 = local13.anInt7244;
		@Pc(22) int local22 = local13.anInt7242;
		@Pc(29) int local29 = Class264.anIntArray496[local22 - local19];
		return local29 & this.anIntArray104[local16] >> local19;
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(III)V")
	public void method1464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class264 local8 = Static49.aClass282_1.method6474(arg0);
		@Pc(11) int local11 = local8.anInt7243;
		@Pc(18) int local18 = local8.anInt7244;
		@Pc(21) int local21 = local8.anInt7242;
		@Pc(28) int local28 = Class264.anIntArray496[local21 - local18];
		if (arg1 < 0 || arg1 > local28) {
			arg1 = 0;
		}
		local28 <<= local18;
		this.method1461(arg1 << local18 & local28 | ~local28 & this.anIntArray104[local11], local11);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
	public void method1465() {
		for (@Pc(3) int local3 = 0; local3 < Static146.aClass7_1.anInt296; local3++) {
			@Pc(10) Class138 local10 = Static146.aClass7_1.method171(local3);
			if (local10 != null && local10.anInt3903 == 0) {
				this.anIntArray103[local3] = 0;
				this.anIntArray104[local3] = 0;
			}
		}
		this.aClass162_14 = new Class162(128);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BZ)I")
	public int method1467(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static548.method7437();
		for (@Pc(30) Class2_Sub34 local30 = arg0 ? (Class2_Sub34) this.aClass162_14.method3527() : (Class2_Sub34) this.aClass162_14.method3523(); local30 != null; local30 = (Class2_Sub34) this.aClass162_14.method3523()) {
			if ((local30.aLong165 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local30.aLong165 & 0x4000000000000000L) != 0L) {
					@Pc(50) int local50 = (int) local30.aLong268;
					this.anIntArray104[local50] = this.anIntArray103[local50];
					local30.method7966();
					return local50;
				}
				local30.method7966();
			}
		}
		return -1;
	}
}
