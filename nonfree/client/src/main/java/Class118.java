import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class118 implements Interface7 {

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "Lclient!qha;")
	private Class291 aClass291_13 = new Class291(128);

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "[I")
	private final int[] anIntArray138 = new int[Static637.aClass301_1.anInt8327];

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "[I")
	public final int[] anIntArray137 = new int[Static637.aClass301_1.anInt8327];

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(IIZ)V")
	public void method2142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class300 local8 = Static519.aClass199_1.method4687(arg0);
		@Pc(11) int local11 = local8.anInt8316;
		@Pc(24) int local24 = local8.anInt8315;
		@Pc(27) int local27 = local8.anInt8321;
		@Pc(33) int local33 = Class272.anIntArray457[local27 - local24];
		if (arg1 < 0 || local33 < arg1) {
			arg1 = 0;
		}
		local33 <<= local24;
		this.method2147(local11, arg1 << local24 & local33 | ~local33 & this.anIntArray138[local11]);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V")
	public void method2143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray137[arg0] = arg1;
		@Pc(24) Class5_Sub13 local24 = (Class5_Sub13) this.aClass291_13.method6993((long) arg0, 1);
		if (local24 == null) {
			local24 = new Class5_Sub13(Static515.method7499(103) + 500L);
			this.aClass291_13.method6984((long) arg0, local24);
		} else {
			local24.aLong62 = Static515.method7499(121) + 500L;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public void method2144() {
		for (@Pc(3) int local3 = 0; local3 < Static637.aClass301_1.anInt8327; local3++) {
			@Pc(10) Class319 local10 = Static637.aClass301_1.method7170(local3);
			if (local10 != null && local10.anInt9217 == 0) {
				this.anIntArray138[local3] = 0;
				this.anIntArray137[local3] = 0;
			}
		}
		this.aClass291_13 = new Class291(128);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIZ)V")
	public void method2145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class300 local8 = Static519.aClass199_1.method4687(arg1);
		@Pc(11) int local11 = local8.anInt8316;
		@Pc(14) int local14 = local8.anInt8315;
		@Pc(17) int local17 = local8.anInt8321;
		@Pc(23) int local23 = Class272.anIntArray457[local17 - local14];
		if (arg0 < 0 || local23 < arg0) {
			arg0 = 0;
		}
		local23 <<= local14;
		this.method2143(local11, local23 & arg0 << local14 | ~local23 & this.anIntArray137[local11]);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBI)V")
	public void method2147(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray138[arg0] = arg1;
		@Pc(26) Class5_Sub13 local26 = (Class5_Sub13) this.aClass291_13.method6993((long) arg0, 1);
		if (local26 == null) {
			local26 = new Class5_Sub13(4611686018427387905L);
			this.aClass291_13.method6984((long) arg0, local26);
		} else if (local26.aLong62 != 4611686018427387905L) {
			local26.aLong62 = Static515.method7499(126) + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)I")
	@Override
	public int method2141(@OriginalArg(1) int arg0) {
		@Pc(8) Class300 local8 = Static519.aClass199_1.method4687(arg0);
		@Pc(11) int local11 = local8.anInt8316;
		@Pc(20) int local20 = local8.anInt8315;
		@Pc(23) int local23 = local8.anInt8321;
		@Pc(29) int local29 = Class272.anIntArray457[local23 - local20];
		return local29 & this.anIntArray137[local11] >> local20;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)I")
	public int method2148(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static515.method7499(85);
		for (@Pc(23) Class5_Sub13 local23 = arg0 ? (Class5_Sub13) this.aClass291_13.method6987() : (Class5_Sub13) this.aClass291_13.method6989(); local23 != null; local23 = (Class5_Sub13) this.aClass291_13.method6989()) {
			if ((local23.aLong62 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local23.aLong62 & 0x4000000000000000L) != 0L) {
					@Pc(54) int local54 = (int) local23.aLong314;
					this.anIntArray137[local54] = this.anIntArray138[local54];
					local23.method9327(1);
					return local54;
				}
				local23.method9327(1);
			}
		}
		if (21279 != 21279) {
			Static156.anInterface1_3 = null;
		}
		return -1;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)I")
	@Override
	public int method2140(@OriginalArg(1) int arg0) {
		return this.anIntArray137[arg0];
	}
}
