import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public final class Class3_Sub6_Sub2 extends Class3_Sub6 {

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
	public int anInt6324;

	@OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
	public int anInt6325;

	@OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
	public int anInt6326;

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
	public int anInt6327;

	@OriginalMember(owner = "client!mk", name = "p", descriptor = "J")
	public long aLong175;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)I")
	@Override
	public int method5324() {
		return this.anInt6326;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)I")
	@Override
	public int method5326() {
		return this.anInt6327;
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)I")
	@Override
	public int method5325() {
		return this.anInt6324;
	}

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(B)J")
	@Override
	public long method5327() {
		return this.aLong175;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)I")
	@Override
	public int method5323() {
		return this.anInt6325;
	}
}
