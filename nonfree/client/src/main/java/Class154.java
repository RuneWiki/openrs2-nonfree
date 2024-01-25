import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class154 implements Interface2 {

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
	public int anInt4758;

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
	public int anInt4759;

	@OriginalMember(owner = "client!mt", name = "f", descriptor = "I")
	public int anInt4761;

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "I")
	public int anInt4762;

	@OriginalMember(owner = "client!mt", name = "i", descriptor = "Z")
	public boolean aBoolean438;

	@OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
	public int anInt4765;

	@OriginalMember(owner = "client!mt", name = "p", descriptor = "I")
	public int anInt4769;

	static {
		new Class83("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)J")
	@Override
	public long method3685() {
		@Pc(5) long[] local5 = Class80.aLongArray4;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local7 >>> 8 ^ local5[(int) ((local7 ^ (long) this.anInt4762) & 0xFFL)];
		@Pc(45) long local45 = local5[(int) (((long) (this.anInt4759 >> 8) ^ local22) & 0xFFL)] ^ local22 >>> 8;
		@Pc(60) long local60 = local5[(int) (((long) this.anInt4759 ^ local45) & 0xFFL)] ^ local45 >>> 8;
		@Pc(77) long local77 = local60 >>> 8 ^ local5[(int) (((long) (this.anInt4758 >> 24) ^ local60) & 0xFFL)];
		@Pc(94) long local94 = local5[(int) ((local77 ^ (long) (this.anInt4758 >> 16)) & 0xFFL)] ^ local77 >>> 8;
		@Pc(111) long local111 = local94 >>> 8 ^ local5[(int) (((long) (this.anInt4758 >> 8) ^ local94) & 0xFFL)];
		@Pc(126) long local126 = local5[(int) (((long) this.anInt4758 ^ local111) & 0xFFL)] ^ local111 >>> 8;
		@Pc(141) long local141 = local126 >>> 8 ^ local5[(int) ((local126 ^ (long) this.anInt4761) & 0xFFL)];
		@Pc(158) long local158 = local141 >>> 8 ^ local5[(int) ((local141 ^ (long) (this.anInt4765 >> 24)) & 0xFFL)];
		@Pc(175) long local175 = local5[(int) ((local158 ^ (long) (this.anInt4765 >> 16)) & 0xFFL)] ^ local158 >>> 8;
		@Pc(192) long local192 = local5[(int) ((local175 ^ (long) (this.anInt4765 >> 8)) & 0xFFL)] ^ local175 >>> 8;
		@Pc(207) long local207 = local192 >>> 8 ^ local5[(int) (((long) this.anInt4765 ^ local192) & 0xFFL)];
		@Pc(222) long local222 = local5[(int) ((local207 ^ (long) this.anInt4769) & 0xFFL)] ^ local207 >>> 8;
		return local5[(int) (((long) (this.aBoolean438 ? 1 : 0) ^ local222) & 0xFFL)] ^ local222 >>> 8;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!bq;I)Z")
	@Override
	public boolean method3684(@OriginalArg(0) Interface2 arg0) {
		if (!(arg0 instanceof Class154)) {
			return false;
		}
		@Pc(11) Class154 local11 = (Class154) arg0;
		if (this.anInt4762 != local11.anInt4762) {
			return false;
		} else if (this.anInt4759 != local11.anInt4759) {
			return false;
		} else if (this.anInt4758 != local11.anInt4758) {
			return false;
		} else if (local11.anInt4761 != this.anInt4761) {
			return false;
		} else if (this.anInt4765 != local11.anInt4765) {
			return false;
		} else if (local11.anInt4769 == this.anInt4769) {
			return this.aBoolean438 == local11.aBoolean438;
		} else {
			return false;
		}
	}
}
