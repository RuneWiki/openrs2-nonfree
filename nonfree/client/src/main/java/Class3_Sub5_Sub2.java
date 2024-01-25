import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public final class Class3_Sub5_Sub2 extends Class3_Sub5 {

	@OriginalMember(owner = "client!td", name = "q", descriptor = "I")
	public int anInt6527;

	@OriginalMember(owner = "client!td", name = "r", descriptor = "I")
	public int anInt6528;

	@OriginalMember(owner = "client!td", name = "x", descriptor = "I")
	public int anInt6533;

	@OriginalMember(owner = "client!td", name = "z", descriptor = "J")
	public long aLong220;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)I")
	@Override
	public int method5408() {
		return this.anInt6528;
	}

	@OriginalMember(owner = "client!td", name = "g", descriptor = "(I)I")
	@Override
	public int method5409() {
		return 0;
	}

	@OriginalMember(owner = "client!td", name = "f", descriptor = "(I)I")
	@Override
	public int method5406() {
		return this.anInt6533;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)I")
	@Override
	public int method5404() {
		return this.anInt6527;
	}

	@OriginalMember(owner = "client!td", name = "h", descriptor = "(I)J")
	@Override
	public long method5410() {
		return this.aLong220;
	}
}
