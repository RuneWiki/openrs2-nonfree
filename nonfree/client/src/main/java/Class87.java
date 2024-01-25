import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class87 implements Interface19 {

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
	public int anInt1994;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
	public int anInt1996;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
	public int anInt1997;

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
	public int anInt2001;

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "Z")
	public boolean aBoolean130;

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
	public int anInt2002;

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
	public int anInt2003;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)J")
	@Override
	public long method1668() {
		@Pc(5) long[] local5 = Class289.aLongArray13;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) ((local7 ^ (long) this.anInt1994) & 0xFFL)];
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) (((long) (this.anInt1997 >> 8) ^ local22) & 0xFFL)];
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) (((long) this.anInt1997 ^ local39) & 0xFFL)];
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) ((local54 ^ (long) (this.anInt2001 >> 24)) & 0xFFL)];
		@Pc(93) long local93 = local71 >>> 8 ^ local5[(int) (((long) (this.anInt2001 >> 16) ^ local71) & 0xFFL)];
		@Pc(110) long local110 = local5[(int) ((local93 ^ (long) (this.anInt2001 >> 8)) & 0xFFL)] ^ local93 >>> 8;
		@Pc(125) long local125 = local5[(int) ((local110 ^ (long) this.anInt2001) & 0xFFL)] ^ local110 >>> 8;
		@Pc(140) long local140 = local5[(int) ((local125 ^ (long) this.anInt1996) & 0xFFL)] ^ local125 >>> 8;
		@Pc(157) long local157 = local140 >>> 8 ^ local5[(int) ((local140 ^ (long) (this.anInt2003 >> 24)) & 0xFFL)];
		@Pc(174) long local174 = local157 >>> 8 ^ local5[(int) (((long) (this.anInt2003 >> 16) ^ local157) & 0xFFL)];
		@Pc(191) long local191 = local174 >>> 8 ^ local5[(int) ((local174 ^ (long) (this.anInt2003 >> 8)) & 0xFFL)];
		@Pc(206) long local206 = local5[(int) (((long) this.anInt2003 ^ local191) & 0xFFL)] ^ local191 >>> 8;
		@Pc(221) long local221 = local206 >>> 8 ^ local5[(int) ((local206 ^ (long) this.anInt2002) & 0xFFL)];
		return local221 >>> 8 ^ local5[(int) (((long) (this.aBoolean130 ? 1 : 0) ^ local221) & 0xFFL)];
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!pe;B)Z")
	@Override
	public boolean method1667(@OriginalArg(0) Interface19 arg0) {
		if (!(arg0 instanceof Class87)) {
			return false;
		}
		@Pc(11) Class87 local11 = (Class87) arg0;
		if (this.anInt1994 != local11.anInt1994) {
			return false;
		} else if (local11.anInt1997 != this.anInt1997) {
			return false;
		} else if (this.anInt2001 != local11.anInt2001) {
			return false;
		} else if (this.anInt1996 != local11.anInt1996) {
			return false;
		} else if (local11.anInt2003 != this.anInt2003) {
			return false;
		} else if (this.anInt2002 == local11.anInt2002) {
			return local11.aBoolean130 == this.aBoolean130;
		} else {
			return false;
		}
	}
}
