import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class83 implements Interface11 {

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
	public int anInt2547;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
	public int anInt2548;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Z")
	public boolean aBoolean215;

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
	public int anInt2549;

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
	public int anInt2550;

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
	public int anInt2555;

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
	public int anInt2557;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)J")
	@Override
	public long method2309() {
		@Pc(5) long[] local5 = Class108_Sub1.aLongArray2;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) ((local7 ^ (long) this.anInt2547) & 0xFFL)];
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) (((long) (this.anInt2557 >> 8) ^ local22) & 0xFFL)];
		@Pc(54) long local54 = local5[(int) (((long) this.anInt2557 ^ local39) & 0xFFL)] ^ local39 >>> 8;
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) (((long) (this.anInt2548 >> 24) ^ local54) & 0xFFL)];
		@Pc(88) long local88 = local71 >>> 8 ^ local5[(int) ((local71 ^ (long) (this.anInt2548 >> 16)) & 0xFFL)];
		@Pc(105) long local105 = local5[(int) ((local88 ^ (long) (this.anInt2548 >> 8)) & 0xFFL)] ^ local88 >>> 8;
		@Pc(120) long local120 = local5[(int) ((local105 ^ (long) this.anInt2548) & 0xFFL)] ^ local105 >>> 8;
		@Pc(135) long local135 = local5[(int) ((local120 ^ (long) this.anInt2550) & 0xFFL)] ^ local120 >>> 8;
		@Pc(152) long local152 = local5[(int) (((long) (this.anInt2555 >> 24) ^ local135) & 0xFFL)] ^ local135 >>> 8;
		@Pc(169) long local169 = local5[(int) ((local152 ^ (long) (this.anInt2555 >> 16)) & 0xFFL)] ^ local152 >>> 8;
		@Pc(186) long local186 = local169 >>> 8 ^ local5[(int) ((local169 ^ (long) (this.anInt2555 >> 8)) & 0xFFL)];
		@Pc(201) long local201 = local186 >>> 8 ^ local5[(int) ((local186 ^ (long) this.anInt2555) & 0xFFL)];
		@Pc(216) long local216 = local201 >>> 8 ^ local5[(int) (((long) this.anInt2549 ^ local201) & 0xFFL)];
		return local216 >>> 8 ^ local5[(int) ((local216 ^ (long) (this.aBoolean215 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLclient!lo;)Z")
	@Override
	public boolean method2308(@OriginalArg(1) Interface11 arg0) {
		if (!(arg0 instanceof Class83)) {
			return false;
		}
		@Pc(11) Class83 local11 = (Class83) arg0;
		if (local11.anInt2547 != this.anInt2547) {
			return false;
		} else if (local11.anInt2557 != this.anInt2557) {
			return false;
		} else if (this.anInt2548 != local11.anInt2548) {
			return false;
		} else if (local11.anInt2550 != this.anInt2550) {
			return false;
		} else if (local11.anInt2555 != this.anInt2555) {
			return false;
		} else if (this.anInt2549 == local11.anInt2549) {
			return this.aBoolean215 == local11.aBoolean215;
		} else {
			return false;
		}
	}
}
