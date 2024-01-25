import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class246 implements Interface2 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "Z")
	public boolean aBoolean568;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
	public int anInt6518;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
	public int anInt6519;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
	public int anInt6521;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
	public int anInt6522;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
	public int anInt6523;

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
	public int anInt6524;

	static {
		new Class142("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)J")
	@Override
	public long method5235() {
		@Pc(5) long[] local5 = Class148.aLongArray5;
		@Pc(7) long local7 = -1L;
		@Pc(22) long local22 = local5[(int) (((long) this.anInt6523 ^ local7) & 0xFFL)] ^ local7 >>> 8;
		@Pc(39) long local39 = local5[(int) (((long) (this.anInt6519 >> 8) ^ local22) & 0xFFL)] ^ local22 >>> 8;
		@Pc(54) long local54 = local39 >>> 8 ^ local5[(int) (((long) this.anInt6519 ^ local39) & 0xFFL)];
		@Pc(71) long local71 = local54 >>> 8 ^ local5[(int) ((local54 ^ (long) (this.anInt6521 >> 24)) & 0xFFL)];
		@Pc(88) long local88 = local71 >>> 8 ^ local5[(int) (((long) (this.anInt6521 >> 16) ^ local71) & 0xFFL)];
		@Pc(105) long local105 = local5[(int) (((long) (this.anInt6521 >> 8) ^ local88) & 0xFFL)] ^ local88 >>> 8;
		@Pc(120) long local120 = local5[(int) ((local105 ^ (long) this.anInt6521) & 0xFFL)] ^ local105 >>> 8;
		@Pc(135) long local135 = local5[(int) (((long) this.anInt6524 ^ local120) & 0xFFL)] ^ local120 >>> 8;
		@Pc(152) long local152 = local135 >>> 8 ^ local5[(int) ((local135 ^ (long) (this.anInt6518 >> 24)) & 0xFFL)];
		@Pc(169) long local169 = local5[(int) (((long) (this.anInt6518 >> 16) ^ local152) & 0xFFL)] ^ local152 >>> 8;
		@Pc(186) long local186 = local169 >>> 8 ^ local5[(int) ((local169 ^ (long) (this.anInt6518 >> 8)) & 0xFFL)];
		@Pc(201) long local201 = local186 >>> 8 ^ local5[(int) (((long) this.anInt6518 ^ local186) & 0xFFL)];
		@Pc(223) long local223 = local201 >>> 8 ^ local5[(int) ((local201 ^ (long) this.anInt6522) & 0xFFL)];
		return local5[(int) ((local223 ^ (long) (this.aBoolean568 ? 1 : 0)) & 0xFFL)] ^ local223 >>> 8;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!go;)Z")
	@Override
	public boolean method5234(@OriginalArg(1) Interface2 arg0) {
		if (!(arg0 instanceof Class246)) {
			return false;
		}
		@Pc(11) Class246 local11 = (Class246) arg0;
		if (local11.anInt6523 != this.anInt6523) {
			return false;
		} else if (this.anInt6519 != local11.anInt6519) {
			return false;
		} else if (this.anInt6521 != local11.anInt6521) {
			return false;
		} else if (this.anInt6524 != local11.anInt6524) {
			return false;
		} else if (local11.anInt6518 != this.anInt6518) {
			return false;
		} else if (local11.anInt6522 == this.anInt6522) {
			return this.aBoolean568 == local11.aBoolean568;
		} else {
			return false;
		}
	}
}
