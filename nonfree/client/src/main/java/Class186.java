import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class186 implements Interface20 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "I")
	public int anInt5421;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "I")
	public int anInt5422;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "Z")
	public boolean aBoolean403;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "I")
	public int anInt5423;

	@OriginalMember(owner = "client!me", name = "e", descriptor = "I")
	public int anInt5424;

	@OriginalMember(owner = "client!me", name = "f", descriptor = "I")
	public int anInt5425;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "I")
	public int anInt5427;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)J")
	@Override
	public long method4662() {
		@Pc(15) long[] local15 = Class215.aLongArray11;
		@Pc(17) long local17 = -1L;
		@Pc(32) long local32 = local15[(int) ((local17 ^ (long) this.anInt5427) & 0xFFL)] ^ local17 >>> 8;
		@Pc(49) long local49 = local15[(int) (((long) (this.anInt5421 >> 8) ^ local32) & 0xFFL)] ^ local32 >>> 8;
		@Pc(64) long local64 = local15[(int) ((local49 ^ (long) this.anInt5421) & 0xFFL)] ^ local49 >>> 8;
		@Pc(81) long local81 = local64 >>> 8 ^ local15[(int) ((local64 ^ (long) (this.anInt5422 >> 24)) & 0xFFL)];
		@Pc(98) long local98 = local15[(int) ((local81 ^ (long) (this.anInt5422 >> 16)) & 0xFFL)] ^ local81 >>> 8;
		@Pc(115) long local115 = local98 >>> 8 ^ local15[(int) (((long) (this.anInt5422 >> 8) ^ local98) & 0xFFL)];
		@Pc(130) long local130 = local15[(int) ((local115 ^ (long) this.anInt5422) & 0xFFL)] ^ local115 >>> 8;
		@Pc(145) long local145 = local130 >>> 8 ^ local15[(int) (((long) this.anInt5423 ^ local130) & 0xFFL)];
		@Pc(162) long local162 = local15[(int) (((long) (this.anInt5424 >> 24) ^ local145) & 0xFFL)] ^ local145 >>> 8;
		@Pc(179) long local179 = local162 >>> 8 ^ local15[(int) (((long) (this.anInt5424 >> 16) ^ local162) & 0xFFL)];
		@Pc(196) long local196 = local179 >>> 8 ^ local15[(int) (((long) (this.anInt5424 >> 8) ^ local179) & 0xFFL)];
		@Pc(211) long local211 = local15[(int) ((local196 ^ (long) this.anInt5424) & 0xFFL)] ^ local196 >>> 8;
		@Pc(226) long local226 = local15[(int) ((local211 ^ (long) this.anInt5425) & 0xFFL)] ^ local211 >>> 8;
		return local226 >>> 8 ^ local15[(int) (((long) (this.aBoolean403 ? 1 : 0) ^ local226) & 0xFFL)];
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLclient!ws;)Z")
	@Override
	public boolean method4663(@OriginalArg(1) Interface20 arg0) {
		if (!(arg0 instanceof Class186)) {
			return false;
		}
		@Pc(11) Class186 local11 = (Class186) arg0;
		if (this.anInt5427 != local11.anInt5427) {
			return false;
		} else if (local11.anInt5421 != this.anInt5421) {
			return false;
		} else if (local11.anInt5422 != this.anInt5422) {
			return false;
		} else if (this.anInt5423 != local11.anInt5423) {
			return false;
		} else if (this.anInt5424 != local11.anInt5424) {
			return false;
		} else if (local11.anInt5425 == this.anInt5425) {
			return this.aBoolean403 == local11.aBoolean403;
		} else {
			return false;
		}
	}
}
