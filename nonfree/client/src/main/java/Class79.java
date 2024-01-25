import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class79 implements Interface12 {

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "Lclient!bj;")
	private Class27 aClass27_13 = new Class27(128);

	@OriginalMember(owner = "client!ew", name = "l", descriptor = "[I")
	public final int[] anIntArray161 = new int[Static80.aClass258_1.anInt7474];

	@OriginalMember(owner = "client!ew", name = "i", descriptor = "[I")
	private final int[] anIntArray160 = new int[Static80.aClass258_1.anInt7474];

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(II)I")
	@Override
	public int method1570(@OriginalArg(0) int arg0) {
		return this.anIntArray161[arg0];
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(II)I")
	@Override
	public int method1571(@OriginalArg(0) int arg0) {
		@Pc(8) Class82 local8 = Static111.aClass170_1.method3952(arg0);
		@Pc(17) int local17 = local8.anInt1975;
		@Pc(20) int local20 = local8.anInt1966;
		@Pc(23) int local23 = local8.anInt1965;
		@Pc(30) int local30 = Class1_Sub27.anIntArray450[local23 - local20];
		return this.anIntArray161[local17] >> local20 & local30;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIZ)V")
	public void method1574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class82 local8 = Static111.aClass170_1.method3952(arg1);
		@Pc(11) int local11 = local8.anInt1975;
		@Pc(14) int local14 = local8.anInt1966;
		@Pc(17) int local17 = local8.anInt1965;
		@Pc(24) int local24 = Class1_Sub27.anIntArray450[local17 - local14];
		if (arg0 < 0 || local24 < arg0) {
			arg0 = 0;
		}
		local24 <<= local14;
		this.method1580(local11, arg0 << local14 & local24 | this.anIntArray161[local11] & ~local24);
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(IIZ)V")
	public void method1575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray160[arg1] = arg0;
		@Pc(16) Class1_Sub31 local16 = (Class1_Sub31) this.aClass27_13.method553((long) arg1);
		if (local16 == null) {
			local16 = new Class1_Sub31(4611686018427387905L);
			this.aClass27_13.method564((long) arg1, local16);
		} else if (local16.aLong147 != 4611686018427387905L) {
			local16.aLong147 = Static101.method1557() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(BZ)I")
	public int method1576(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static101.method1557();
		for (@Pc(22) Class1_Sub31 local22 = arg0 ? (Class1_Sub31) this.aClass27_13.method555() : (Class1_Sub31) this.aClass27_13.method563(); local22 != null; local22 = (Class1_Sub31) this.aClass27_13.method563()) {
			if (local8 > (local22.aLong147 & 0x3FFFFFFFFFFFFFFFL)) {
				if ((local22.aLong147 & 0x4000000000000000L) != 0L) {
					@Pc(52) int local52 = (int) local22.aLong227;
					this.anIntArray161[local52] = this.anIntArray160[local52];
					local22.method6071();
					return local52;
				}
				local22.method6071();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(III)V")
	public void method1578(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class82 local8 = Static111.aClass170_1.method3952(arg0);
		@Pc(11) int local11 = local8.anInt1975;
		@Pc(14) int local14 = local8.anInt1966;
		@Pc(28) int local28 = local8.anInt1965;
		@Pc(35) int local35 = Class1_Sub27.anIntArray450[local28 - local14];
		if (arg1 < 0 || arg1 > local35) {
			arg1 = 0;
		}
		local35 <<= local14;
		this.method1575(this.anIntArray160[local11] & ~local35 | local35 & arg1 << local14, local11);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
	public void method1579() {
		for (@Pc(7) int local7 = 0; local7 < Static80.aClass258_1.anInt7474; local7++) {
			@Pc(16) Class99 local16 = Static80.aClass258_1.method5794(local7);
			if (local16 != null && local16.anInt2361 == 0) {
				this.anIntArray160[local7] = 0;
				this.anIntArray161[local7] = 0;
			}
		}
		this.aClass27_13 = new Class27(128);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(BII)V")
	public void method1580(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray161[arg0] = arg1;
		@Pc(20) Class1_Sub31 local20 = (Class1_Sub31) this.aClass27_13.method553((long) arg0);
		if (local20 == null) {
			local20 = new Class1_Sub31(Static101.method1557() + 500L);
			this.aClass27_13.method564((long) arg0, local20);
		} else {
			local20.aLong147 = Static101.method1557() + 500L;
		}
	}
}
