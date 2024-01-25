import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class189 implements Interface18 {

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
	public int anInt5835;

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
	public int anInt5836;

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
	public int anInt5839;

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
	public int anInt5841;

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "Z")
	public boolean aBoolean406;

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "I")
	public int anInt5842;

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
	public int anInt5843;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)J")
	@Override
	public long method4836() {
		@Pc(11) long[] local11 = Class273.aLongArray8;
		@Pc(13) long local13 = -1L;
		@Pc(28) long local28 = local11[(int) (((long) this.anInt5836 ^ local13) & 0xFFL)] ^ local13 >>> 8;
		@Pc(45) long local45 = local11[(int) ((local28 ^ (long) (this.anInt5843 >> 8)) & 0xFFL)] ^ local28 >>> 8;
		@Pc(60) long local60 = local11[(int) ((local45 ^ (long) this.anInt5843) & 0xFFL)] ^ local45 >>> 8;
		@Pc(77) long local77 = local11[(int) ((local60 ^ (long) (this.anInt5842 >> 24)) & 0xFFL)] ^ local60 >>> 8;
		@Pc(94) long local94 = local11[(int) ((local77 ^ (long) (this.anInt5842 >> 16)) & 0xFFL)] ^ local77 >>> 8;
		@Pc(111) long local111 = local94 >>> 8 ^ local11[(int) (((long) (this.anInt5842 >> 8) ^ local94) & 0xFFL)];
		@Pc(126) long local126 = local111 >>> 8 ^ local11[(int) (((long) this.anInt5842 ^ local111) & 0xFFL)];
		@Pc(141) long local141 = local126 >>> 8 ^ local11[(int) ((local126 ^ (long) this.anInt5835) & 0xFFL)];
		@Pc(158) long local158 = local11[(int) (((long) (this.anInt5841 >> 24) ^ local141) & 0xFFL)] ^ local141 >>> 8;
		@Pc(175) long local175 = local158 >>> 8 ^ local11[(int) ((local158 ^ (long) (this.anInt5841 >> 16)) & 0xFFL)];
		@Pc(192) long local192 = local11[(int) ((local175 ^ (long) (this.anInt5841 >> 8)) & 0xFFL)] ^ local175 >>> 8;
		@Pc(207) long local207 = local192 >>> 8 ^ local11[(int) (((long) this.anInt5841 ^ local192) & 0xFFL)];
		@Pc(222) long local222 = local11[(int) ((local207 ^ (long) this.anInt5839) & 0xFFL)] ^ local207 >>> 8;
		return local222 >>> 8 ^ local11[(int) (((long) (this.aBoolean406 ? 1 : 0) ^ local222) & 0xFFL)];
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!vp;Z)Z")
	@Override
	public boolean method4835(@OriginalArg(0) Interface18 arg0) {
		if (!(arg0 instanceof Class189)) {
			return false;
		}
		@Pc(19) Class189 local19 = (Class189) arg0;
		if (this.anInt5836 != local19.anInt5836) {
			return false;
		} else if (local19.anInt5843 != this.anInt5843) {
			return false;
		} else if (this.anInt5842 != local19.anInt5842) {
			return false;
		} else if (local19.anInt5835 != this.anInt5835) {
			return false;
		} else if (this.anInt5841 != local19.anInt5841) {
			return false;
		} else if (local19.anInt5839 == this.anInt5839) {
			return local19.aBoolean406 == this.aBoolean406;
		} else {
			return false;
		}
	}
}
