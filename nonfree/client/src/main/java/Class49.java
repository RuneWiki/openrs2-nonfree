import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class49 implements Interface9 {

	@OriginalMember(owner = "client!de", name = "f", descriptor = "Lclient!an;")
	private Class11 aClass11_10 = new Class11(128);

	@OriginalMember(owner = "client!de", name = "l", descriptor = "[I")
	private final int[] anIntArray100 = new int[Static20.aClass168_1.anInt5093];

	@OriginalMember(owner = "client!de", name = "b", descriptor = "[I")
	public final int[] anIntArray99 = new int[Static20.aClass168_1.anInt5093];

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IZ)I")
	public int method1313(@OriginalArg(1) boolean arg0) {
		@Pc(16) long local16 = Static118.method1934();
		for (@Pc(30) Class3_Sub30 local30 = arg0 ? (Class3_Sub30) this.aClass11_10.method313() : (Class3_Sub30) this.aClass11_10.method316(); local30 != null; local30 = (Class3_Sub30) this.aClass11_10.method316()) {
			if ((local30.aLong143 & 0x3FFFFFFFFFFFFFFFL) < local16) {
				if ((local30.aLong143 & 0x4000000000000000L) != 0L) {
					@Pc(54) int local54 = (int) local30.aLong234;
					this.anIntArray99[local54] = this.anIntArray100[local54];
					local30.method5977();
					return local54;
				}
				local30.method5977();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(III)V")
	public void method1314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class261 local10 = Static99.aClass36_1.method857(arg1);
		@Pc(13) int local13 = local10.anInt7371;
		@Pc(16) int local16 = local10.anInt7363;
		@Pc(19) int local19 = local10.anInt7366;
		@Pc(26) int local26 = Class7_Sub2.anIntArray283[local19 - local16];
		if (arg0 < 0 || local26 < arg0) {
			arg0 = 0;
		}
		local26 <<= local16;
		this.method1321(local13, arg0 << local16 & local26 | this.anIntArray99[local13] & ~local26);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IBI)V")
	public void method1315(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray100[arg1] = arg0;
		@Pc(24) Class3_Sub30 local24 = (Class3_Sub30) this.aClass11_10.method324((long) arg1);
		if (local24 == null) {
			local24 = new Class3_Sub30(4611686018427387905L);
			this.aClass11_10.method319(local24, (long) arg1);
		} else if (local24.aLong143 != 4611686018427387905L) {
			local24.aLong143 = Static118.method1934() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V")
	public void method1316() {
		for (@Pc(7) int local7 = 0; local7 < Static20.aClass168_1.anInt5093; local7++) {
			@Pc(13) Class137 local13 = Static20.aClass168_1.method3904(local7);
			if (local13 != null && local13.anInt4117 == 0) {
				this.anIntArray100[local7] = 0;
				this.anIntArray99[local7] = 0;
			}
		}
		this.aClass11_10 = new Class11(128);
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(II)I")
	@Override
	public int method1310(@OriginalArg(1) int arg0) {
		@Pc(13) Class261 local13 = Static99.aClass36_1.method857(arg0);
		@Pc(16) int local16 = local13.anInt7371;
		@Pc(19) int local19 = local13.anInt7363;
		@Pc(22) int local22 = local13.anInt7366;
		@Pc(29) int local29 = Class7_Sub2.anIntArray283[local22 - local19];
		return local29 & this.anIntArray99[local16] >> local19;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)I")
	@Override
	public int method1309(@OriginalArg(0) int arg0) {
		return this.anIntArray99[arg0];
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(III)V")
	public void method1320(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class261 local10 = Static99.aClass36_1.method857(arg0);
		@Pc(13) int local13 = local10.anInt7371;
		@Pc(16) int local16 = local10.anInt7363;
		@Pc(19) int local19 = local10.anInt7366;
		@Pc(26) int local26 = Class7_Sub2.anIntArray283[local19 - local16];
		if (arg1 < 0 || local26 < arg1) {
			arg1 = 0;
		}
		local26 <<= local16;
		this.method1315(this.anIntArray100[local13] & ~local26 | local26 & arg1 << local16, local13);
	}

	@OriginalMember(owner = "client!de", name = "c", descriptor = "(III)V")
	public void method1321(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray99[arg0] = arg1;
		@Pc(16) Class3_Sub30 local16 = (Class3_Sub30) this.aClass11_10.method324((long) arg0);
		if (local16 == null) {
			local16 = new Class3_Sub30(Static118.method1934() + 500L);
			this.aClass11_10.method319(local16, (long) arg0);
		} else {
			local16.aLong143 = Static118.method1934() + 500L;
		}
	}
}
