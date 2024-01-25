import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class165 implements Interface10 {

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
	public int anInt5074;

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
	public int anInt5077;

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "Z")
	public boolean aBoolean379;

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
	public int anInt5080;

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
	public int anInt5082;

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
	public int anInt5083;

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
	public int anInt5084;

	static {
		new Class106("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)J")
	@Override
	public long method4694() {
		@Pc(5) long[] local5 = Class64.aLongArray5;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) (((long) this.anInt5082 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local22 >>> 8 ^ local5[(int) ((local22 ^ (long) (this.anInt5084 >> 8)) & 0xFFL)];
		@Pc(54) long local54 = local5[(int) (((long) this.anInt5084 ^ local39) & 0xFFL)] ^ local39 >>> 8;
		@Pc(71) long local71 = local5[(int) (((long) (this.anInt5080 >> 24) ^ local54) & 0xFFL)] ^ local54 >>> 8;
		@Pc(88) long local88 = local5[(int) ((local71 ^ (long) (this.anInt5080 >> 16)) & 0xFFL)] ^ local71 >>> 8;
		@Pc(105) long local105 = local88 >>> 8 ^ local5[(int) (((long) (this.anInt5080 >> 8) ^ local88) & 0xFFL)];
		@Pc(120) long local120 = local5[(int) ((local105 ^ (long) this.anInt5080) & 0xFFL)] ^ local105 >>> 8;
		@Pc(135) long local135 = local120 >>> 8 ^ local5[(int) ((local120 ^ (long) this.anInt5083) & 0xFFL)];
		@Pc(159) long local159 = local135 >>> 8 ^ local5[(int) ((local135 ^ (long) (this.anInt5077 >> 24)) & 0xFFL)];
		@Pc(176) long local176 = local5[(int) ((local159 ^ (long) (this.anInt5077 >> 16)) & 0xFFL)] ^ local159 >>> 8;
		@Pc(193) long local193 = local176 >>> 8 ^ local5[(int) ((local176 ^ (long) (this.anInt5077 >> 8)) & 0xFFL)];
		@Pc(208) long local208 = local193 >>> 8 ^ local5[(int) ((local193 ^ (long) this.anInt5077) & 0xFFL)];
		@Pc(223) long local223 = local5[(int) (((long) this.anInt5074 ^ local208) & 0xFFL)] ^ local208 >>> 8;
		return local223 >>> 8 ^ local5[(int) ((local223 ^ (long) (this.aBoolean379 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BLclient!ur;)Z")
	@Override
	public boolean method4695(@OriginalArg(1) Interface10 arg0) {
		if (!(arg0 instanceof Class165)) {
			return false;
		}
		@Pc(18) Class165 local18 = (Class165) arg0;
		if (local18.anInt5082 != this.anInt5082) {
			return false;
		} else if (this.anInt5084 != local18.anInt5084) {
			return false;
		} else if (this.anInt5080 != local18.anInt5080) {
			return false;
		} else if (this.anInt5083 != local18.anInt5083) {
			return false;
		} else if (local18.anInt5077 != this.anInt5077) {
			return false;
		} else if (local18.anInt5074 == this.anInt5074) {
			return this.aBoolean379 == local18.aBoolean379;
		} else {
			return false;
		}
	}
}
