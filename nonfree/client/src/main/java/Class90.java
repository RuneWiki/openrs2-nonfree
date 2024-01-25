import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class90 implements Interface7 {

	@OriginalMember(owner = "client!go", name = "a", descriptor = "I")
	public int anInt2433;

	@OriginalMember(owner = "client!go", name = "b", descriptor = "I")
	public int anInt2434;

	@OriginalMember(owner = "client!go", name = "c", descriptor = "Z")
	public boolean aBoolean161;

	@OriginalMember(owner = "client!go", name = "e", descriptor = "I")
	public int anInt2435;

	@OriginalMember(owner = "client!go", name = "f", descriptor = "I")
	public int anInt2436;

	@OriginalMember(owner = "client!go", name = "j", descriptor = "I")
	public int anInt2439;

	@OriginalMember(owner = "client!go", name = "l", descriptor = "I")
	public int anInt2441;

	static {
		new Class134(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)J")
	@Override
	public long method2023() {
		@Pc(10) long[] local10 = Class109_Sub1.aLongArray10;
		@Pc(12) long local12 = -1L;
		@Pc(27) long local27 = local10[(int) ((local12 ^ (long) this.anInt2435) & 0xFFL)] ^ local12 >>> 8;
		@Pc(44) long local44 = local10[(int) (((long) (this.anInt2434 >> 8) ^ local27) & 0xFFL)] ^ local27 >>> 8;
		@Pc(59) long local59 = local44 >>> 8 ^ local10[(int) (((long) this.anInt2434 ^ local44) & 0xFFL)];
		@Pc(76) long local76 = local59 >>> 8 ^ local10[(int) (((long) (this.anInt2441 >> 24) ^ local59) & 0xFFL)];
		@Pc(93) long local93 = local10[(int) ((local76 ^ (long) (this.anInt2441 >> 16)) & 0xFFL)] ^ local76 >>> 8;
		@Pc(110) long local110 = local93 >>> 8 ^ local10[(int) (((long) (this.anInt2441 >> 8) ^ local93) & 0xFFL)];
		@Pc(125) long local125 = local10[(int) ((local110 ^ (long) this.anInt2441) & 0xFFL)] ^ local110 >>> 8;
		@Pc(140) long local140 = local125 >>> 8 ^ local10[(int) (((long) this.anInt2439 ^ local125) & 0xFFL)];
		@Pc(157) long local157 = local140 >>> 8 ^ local10[(int) ((local140 ^ (long) (this.anInt2436 >> 24)) & 0xFFL)];
		@Pc(174) long local174 = local157 >>> 8 ^ local10[(int) (((long) (this.anInt2436 >> 16) ^ local157) & 0xFFL)];
		@Pc(191) long local191 = local174 >>> 8 ^ local10[(int) ((local174 ^ (long) (this.anInt2436 >> 8)) & 0xFFL)];
		@Pc(206) long local206 = local191 >>> 8 ^ local10[(int) ((local191 ^ (long) this.anInt2436) & 0xFFL)];
		@Pc(221) long local221 = local10[(int) (((long) this.anInt2433 ^ local206) & 0xFFL)] ^ local206 >>> 8;
		return local221 >>> 8 ^ local10[(int) (((long) (this.aBoolean161 ? 1 : 0) ^ local221) & 0xFFL)];
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILclient!jo;)Z")
	@Override
	public boolean method2022(@OriginalArg(1) Interface7 arg0) {
		if (!(arg0 instanceof Class90)) {
			return false;
		}
		@Pc(16) Class90 local16 = (Class90) arg0;
		if (local16.anInt2435 != this.anInt2435) {
			return false;
		} else if (local16.anInt2434 != this.anInt2434) {
			return false;
		} else if (local16.anInt2441 != this.anInt2441) {
			return false;
		} else if (local16.anInt2439 != this.anInt2439) {
			return false;
		} else if (local16.anInt2436 != this.anInt2436) {
			return false;
		} else if (this.anInt2433 == local16.anInt2433) {
			return local16.aBoolean161 == this.aBoolean161;
		} else {
			return false;
		}
	}
}
