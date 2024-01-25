import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class212 implements Interface4 {

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
	public int anInt6913;

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "Z")
	public boolean aBoolean607;

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
	public int anInt6914;

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
	public int anInt6916;

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
	public int anInt6917;

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
	public int anInt6918;

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
	public int anInt6921;

	static {
		new Class93("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)J")
	@Override
	public long method5954() {
		@Pc(10) long[] local10 = Class2_Sub2_Sub34.aLongArray7;
		@Pc(12) long local12 = -1L;
		@Pc(27) long local27 = local10[(int) (((long) this.anInt6914 ^ local12) & 0xFFL)] ^ local12 >>> 8;
		@Pc(44) long local44 = local27 >>> 8 ^ local10[(int) (((long) (this.anInt6921 >> 8) ^ local27) & 0xFFL)];
		@Pc(59) long local59 = local10[(int) ((local44 ^ (long) this.anInt6921) & 0xFFL)] ^ local44 >>> 8;
		@Pc(76) long local76 = local10[(int) (((long) (this.anInt6917 >> 24) ^ local59) & 0xFFL)] ^ local59 >>> 8;
		@Pc(93) long local93 = local10[(int) ((local76 ^ (long) (this.anInt6917 >> 16)) & 0xFFL)] ^ local76 >>> 8;
		@Pc(110) long local110 = local10[(int) (((long) (this.anInt6917 >> 8) ^ local93) & 0xFFL)] ^ local93 >>> 8;
		@Pc(125) long local125 = local110 >>> 8 ^ local10[(int) (((long) this.anInt6917 ^ local110) & 0xFFL)];
		@Pc(140) long local140 = local10[(int) (((long) this.anInt6916 ^ local125) & 0xFFL)] ^ local125 >>> 8;
		@Pc(157) long local157 = local10[(int) ((local140 ^ (long) (this.anInt6913 >> 24)) & 0xFFL)] ^ local140 >>> 8;
		@Pc(174) long local174 = local10[(int) ((local157 ^ (long) (this.anInt6913 >> 16)) & 0xFFL)] ^ local157 >>> 8;
		@Pc(191) long local191 = local10[(int) (((long) (this.anInt6913 >> 8) ^ local174) & 0xFFL)] ^ local174 >>> 8;
		@Pc(206) long local206 = local10[(int) (((long) this.anInt6913 ^ local191) & 0xFFL)] ^ local191 >>> 8;
		@Pc(221) long local221 = local206 >>> 8 ^ local10[(int) ((local206 ^ (long) this.anInt6918) & 0xFFL)];
		return local10[(int) (((long) (this.aBoolean607 ? 1 : 0) ^ local221) & 0xFFL)] ^ local221 >>> 8;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!mn;)Z")
	@Override
	public boolean method5955(@OriginalArg(1) Interface4 arg0) {
		if (!(arg0 instanceof Class212)) {
			return false;
		}
		@Pc(11) Class212 local11 = (Class212) arg0;
		if (this.anInt6914 != local11.anInt6914) {
			return false;
		} else if (local11.anInt6921 != this.anInt6921) {
			return false;
		} else if (this.anInt6917 != local11.anInt6917) {
			return false;
		} else if (this.anInt6916 != local11.anInt6916) {
			return false;
		} else if (this.anInt6913 != local11.anInt6913) {
			return false;
		} else if (local11.anInt6918 == this.anInt6918) {
			return local11.aBoolean607 == this.aBoolean607;
		} else {
			return false;
		}
	}
}
