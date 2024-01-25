import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class119 implements Interface16 {

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "Lclient!ba;")
	private Class17 aClass17_14 = new Class17(128);

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "[I")
	private final int[] anIntArray293 = new int[Static463.aClass108_1.anInt2927];

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "[I")
	public final int[] anIntArray292 = new int[Static463.aClass108_1.anInt2927];

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIZ)V")
	public void method2646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class203 local8 = Static37.aClass247_1.method5888(arg1);
		@Pc(11) int local11 = local8.anInt5850;
		@Pc(14) int local14 = local8.anInt5854;
		@Pc(17) int local17 = local8.anInt5855;
		@Pc(24) int local24 = Class73_Sub2.anIntArray464[local17 - local14];
		if (arg0 < 0 || local24 < arg0) {
			arg0 = 0;
		}
		local24 <<= local14;
		this.method2650(local11, this.anIntArray293[local11] & ~local24 | arg0 << local14 & local24);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)I")
	@Override
	public int method2642(@OriginalArg(0) int arg0) {
		return this.anIntArray292[arg0];
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)I")
	public int method2648(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static60.method1119();
		for (@Pc(30) Class1_Sub47 local30 = arg0 ? (Class1_Sub47) this.aClass17_14.method735() : (Class1_Sub47) this.aClass17_14.method740(); local30 != null; local30 = (Class1_Sub47) this.aClass17_14.method740()) {
			if ((local30.aLong349 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local30.aLong349 & 0x4000000000000000L) != 0L) {
					@Pc(57) int local57 = (int) local30.aLong392;
					this.anIntArray292[local57] = this.anIntArray293[local57];
					local30.method7525();
					return local57;
				}
				local30.method7525();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public void method2649() {
		for (@Pc(3) int local3 = 0; local3 < Static463.aClass108_1.anInt2927; local3++) {
			@Pc(10) Class245 local10 = Static463.aClass108_1.method2494(local3);
			if (local10 != null && local10.anInt7026 == 0) {
				this.anIntArray293[local3] = 0;
				this.anIntArray292[local3] = 0;
			}
		}
		this.aClass17_14 = new Class17(128);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
	public void method2650(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray293[arg0] = arg1;
		@Pc(21) Class1_Sub47 local21 = (Class1_Sub47) this.aClass17_14.method738((long) arg0);
		if (local21 == null) {
			local21 = new Class1_Sub47(4611686018427387905L);
			this.aClass17_14.method737(local21, (long) arg0);
		} else if (local21.aLong349 != 4611686018427387905L) {
			local21.aLong349 = Static60.method1119() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BII)V")
	public void method2652(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray292[arg1] = arg0;
		@Pc(24) Class1_Sub47 local24 = (Class1_Sub47) this.aClass17_14.method738((long) arg1);
		if (local24 == null) {
			local24 = new Class1_Sub47(Static60.method1119() + 500L);
			this.aClass17_14.method737(local24, (long) arg1);
		} else {
			local24.aLong349 = Static60.method1119() + 500L;
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)V")
	public void method2653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class203 local8 = Static37.aClass247_1.method5888(arg1);
		@Pc(11) int local11 = local8.anInt5850;
		@Pc(22) int local22 = local8.anInt5854;
		@Pc(25) int local25 = local8.anInt5855;
		@Pc(31) int local31 = Class73_Sub2.anIntArray464[local25 - local22];
		if (arg0 < 0 || arg0 > local31) {
			arg0 = 0;
		}
		local31 <<= local22;
		this.method2652(this.anIntArray292[local11] & ~local31 | arg0 << local22 & local31, local11);
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)I")
	@Override
	public int method2643(@OriginalArg(1) int arg0) {
		@Pc(8) Class203 local8 = Static37.aClass247_1.method5888(arg0);
		@Pc(11) int local11 = local8.anInt5850;
		@Pc(19) int local19 = local8.anInt5854;
		@Pc(22) int local22 = local8.anInt5855;
		@Pc(28) int local28 = Class73_Sub2.anIntArray464[local22 - local19];
		return local28 & this.anIntArray292[local11] >> local19;
	}
}
