import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class64 implements Interface6 {

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
	public int anInt2014;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
	public int anInt2015;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
	public int anInt2017;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
	public int anInt2018;

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
	public int anInt2019;

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
	public int anInt2021;

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "Z")
	public boolean aBoolean177;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)J")
	@Override
	public long method1490() {
		@Pc(5) long[] local5 = Class2_Sub2_Sub12_Sub2.aLongArray6;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) (((long) this.anInt2019 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local5[(int) (((long) (this.anInt2018 >> 8) ^ local22) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) ((local39 ^ (long) this.anInt2018) & 0xFFL)];
		@Pc(71) long local71 = local5[(int) (((long) (this.anInt2021 >> 24) ^ local54) & 0xFFL)] ^ local54 >>> 8;
		@Pc(88) long local88 = local5[(int) (((long) (this.anInt2021 >> 16) ^ local71) & 0xFFL)] ^ local71 >>> 8;
		@Pc(105) long local105 = local5[(int) (((long) (this.anInt2021 >> 8) ^ local88) & 0xFFL)] ^ local88 >>> 8;
		@Pc(120) long local120 = local5[(int) (((long) this.anInt2021 ^ local105) & 0xFFL)] ^ local105 >>> 8;
		@Pc(135) long local135 = local120 >>> 8 ^ local5[(int) (((long) this.anInt2014 ^ local120) & 0xFFL)];
		@Pc(152) long local152 = local135 >>> 8 ^ local5[(int) ((local135 ^ (long) (this.anInt2017 >> 24)) & 0xFFL)];
		@Pc(169) long local169 = local5[(int) ((local152 ^ (long) (this.anInt2017 >> 16)) & 0xFFL)] ^ local152 >>> 8;
		@Pc(186) long local186 = local5[(int) (((long) (this.anInt2017 >> 8) ^ local169) & 0xFFL)] ^ local169 >>> 8;
		@Pc(201) long local201 = local5[(int) (((long) this.anInt2017 ^ local186) & 0xFFL)] ^ local186 >>> 8;
		@Pc(216) long local216 = local201 >>> 8 ^ local5[(int) ((local201 ^ (long) this.anInt2015) & 0xFFL)];
		return local216 >>> 8 ^ local5[(int) ((local216 ^ (long) (this.aBoolean177 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!kr;B)Z")
	@Override
	public boolean method1491(@OriginalArg(0) Interface6 arg0) {
		if (!(arg0 instanceof Class64)) {
			return false;
		}
		@Pc(11) Class64 local11 = (Class64) arg0;
		if (local11.anInt2019 != this.anInt2019) {
			return false;
		} else if (this.anInt2018 != local11.anInt2018) {
			return false;
		} else if (this.anInt2021 != local11.anInt2021) {
			return false;
		} else if (this.anInt2014 != local11.anInt2014) {
			return false;
		} else if (this.anInt2017 != local11.anInt2017) {
			return false;
		} else if (local11.anInt2015 == this.anInt2015) {
			return local11.aBoolean177 == this.aBoolean177;
		} else {
			return false;
		}
	}
}
