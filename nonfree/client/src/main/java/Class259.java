import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class259 implements Interface11 {

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "Lclient!wa;")
	private Class257 aClass257_37 = new Class257(128);

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "[I")
	private final int[] anIntArray486 = new int[Static183.aClass269_3.anInt7426];

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "[I")
	public final int[] anIntArray487 = new int[Static183.aClass269_3.anInt7426];

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	public void method5521() {
		for (@Pc(7) int local7 = 0; local7 < Static183.aClass269_3.anInt7426; local7++) {
			@Pc(14) Class245 local14 = Static183.aClass269_3.method5607(local7);
			if (local14 != null && local14.anInt6813 == 0) {
				this.anIntArray486[local7] = 0;
				this.anIntArray487[local7] = 0;
			}
		}
		this.aClass257_37 = new Class257(128);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
	public void method5522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray487[arg0] = arg1;
		@Pc(21) Class1_Sub34 local21 = (Class1_Sub34) this.aClass257_37.method5503((long) arg0);
		if (local21 == null) {
			local21 = new Class1_Sub34(Static232.method3058() + 500L);
			this.aClass257_37.method5504(local21, (long) arg0);
		} else {
			local21.aLong176 = Static232.method3058() + 500L;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZII)V")
	public void method5523(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray486[arg0] = arg1;
		@Pc(16) Class1_Sub34 local16 = (Class1_Sub34) this.aClass257_37.method5503((long) arg0);
		if (local16 == null) {
			local16 = new Class1_Sub34(4611686018427387905L);
			this.aClass257_37.method5504(local16, (long) arg0);
		} else if (local16.aLong176 != 4611686018427387905L) {
			local16.aLong176 = Static232.method3058() + 500L | 0x4000000000000000L;
			return;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)I")
	@Override
	public int method5520(@OriginalArg(0) int arg0) {
		return this.anIntArray487[arg0];
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I")
	@Override
	public int method5519(@OriginalArg(1) int arg0) {
		@Pc(8) Class41 local8 = Static182.aClass205_1.method4215(arg0);
		@Pc(11) int local11 = local8.anInt981;
		@Pc(14) int local14 = local8.anInt978;
		@Pc(17) int local17 = local8.anInt979;
		@Pc(32) int local32 = Class19.anIntArray24[local17 - local14];
		return this.anIntArray487[local11] >> local14 & local32;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)V")
	public void method5527(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class41 local8 = Static182.aClass205_1.method4215(arg1);
		@Pc(11) int local11 = local8.anInt981;
		@Pc(14) int local14 = local8.anInt978;
		@Pc(17) int local17 = local8.anInt979;
		@Pc(24) int local24 = Class19.anIntArray24[local17 - local14];
		if (arg0 < 0 || arg0 > local24) {
			arg0 = 0;
		}
		local24 <<= local14;
		this.method5523(local11, ~local24 & this.anIntArray486[local11] | arg0 << local14 & local24);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)I")
	public int method5529(@OriginalArg(1) boolean arg0) {
		@Pc(14) long local14 = Static232.method3058();
		for (@Pc(28) Class1_Sub34 local28 = arg0 ? (Class1_Sub34) this.aClass257_37.method5506() : (Class1_Sub34) this.aClass257_37.method5501(); local28 != null; local28 = (Class1_Sub34) this.aClass257_37.method5501()) {
			if ((local28.aLong176 & 0x3FFFFFFFFFFFFFFFL) < local14) {
				if ((local28.aLong176 & 0x4000000000000000L) != 0L) {
					@Pc(61) int local61 = (int) local28.aLong226;
					this.anIntArray487[local61] = this.anIntArray486[local61];
					local28.method5617();
					return local61;
				}
				local28.method5617();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(III)V")
	public void method5530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class41 local10 = Static182.aClass205_1.method4215(arg1);
		@Pc(13) int local13 = local10.anInt981;
		@Pc(16) int local16 = local10.anInt978;
		@Pc(19) int local19 = local10.anInt979;
		@Pc(26) int local26 = Class19.anIntArray24[local19 - local16];
		if (arg0 < 0 || local26 < arg0) {
			arg0 = 0;
		}
		local26 <<= local16;
		this.method5522(local13, local26 & arg0 << local16 | ~local26 & this.anIntArray487[local13]);
	}
}
