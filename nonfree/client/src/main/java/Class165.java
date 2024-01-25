import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class165 implements Interface8 {

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
	public int anInt5174;

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
	public int anInt5175;

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "Z")
	public boolean aBoolean337;

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
	public int anInt5176;

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
	public int anInt5178;

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
	public int anInt5179;

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
	public int anInt5181;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)J")
	@Override
	public long method4452() {
		@Pc(10) long[] local10 = Class27_Sub4.aLongArray9;
		@Pc(12) long local12 = -1L;
		@Pc(27) long local27 = local10[(int) (((long) this.anInt5174 ^ local12) & 0xFFL)] ^ local12 >>> 8;
		@Pc(44) long local44 = local10[(int) ((local27 ^ (long) (this.anInt5179 >> 8)) & 0xFFL)] ^ local27 >>> 8;
		@Pc(59) long local59 = local10[(int) ((local44 ^ (long) this.anInt5179) & 0xFFL)] ^ local44 >>> 8;
		@Pc(76) long local76 = local10[(int) (((long) (this.anInt5176 >> 24) ^ local59) & 0xFFL)] ^ local59 >>> 8;
		@Pc(93) long local93 = local10[(int) ((local76 ^ (long) (this.anInt5176 >> 16)) & 0xFFL)] ^ local76 >>> 8;
		@Pc(110) long local110 = local93 >>> 8 ^ local10[(int) ((local93 ^ (long) (this.anInt5176 >> 8)) & 0xFFL)];
		@Pc(125) long local125 = local110 >>> 8 ^ local10[(int) (((long) this.anInt5176 ^ local110) & 0xFFL)];
		@Pc(140) long local140 = local10[(int) (((long) this.anInt5175 ^ local125) & 0xFFL)] ^ local125 >>> 8;
		@Pc(157) long local157 = local10[(int) (((long) (this.anInt5181 >> 24) ^ local140) & 0xFFL)] ^ local140 >>> 8;
		@Pc(174) long local174 = local157 >>> 8 ^ local10[(int) ((local157 ^ (long) (this.anInt5181 >> 16)) & 0xFFL)];
		@Pc(191) long local191 = local174 >>> 8 ^ local10[(int) ((local174 ^ (long) (this.anInt5181 >> 8)) & 0xFFL)];
		@Pc(206) long local206 = local10[(int) (((long) this.anInt5181 ^ local191) & 0xFFL)] ^ local191 >>> 8;
		@Pc(221) long local221 = local10[(int) (((long) this.anInt5178 ^ local206) & 0xFFL)] ^ local206 >>> 8;
		return local221 >>> 8 ^ local10[(int) (((long) (this.aBoolean337 ? 1 : 0) ^ local221) & 0xFFL)];
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!t;)Z")
	@Override
	public boolean method4453(@OriginalArg(1) Interface8 arg0) {
		if (!(arg0 instanceof Class165)) {
			return false;
		}
		@Pc(11) Class165 local11 = (Class165) arg0;
		if (this.anInt5174 != local11.anInt5174) {
			return false;
		} else if (this.anInt5179 != local11.anInt5179) {
			return false;
		} else if (this.anInt5176 != local11.anInt5176) {
			return false;
		} else if (this.anInt5175 != local11.anInt5175) {
			return false;
		} else if (this.anInt5181 != local11.anInt5181) {
			return false;
		} else if (this.anInt5178 == local11.anInt5178) {
			return this.aBoolean337 == local11.aBoolean337;
		} else {
			return false;
		}
	}
}
