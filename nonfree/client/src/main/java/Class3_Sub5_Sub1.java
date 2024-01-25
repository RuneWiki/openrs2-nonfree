import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public final class Class3_Sub5_Sub1 extends Class3_Sub5 {

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
	public int anInt143;

	@OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
	public int anInt144;

	@OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
	public int anInt145;

	@OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
	public int anInt146;

	@OriginalMember(owner = "client!ak", name = "r", descriptor = "J")
	public long aLong14;

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)I")
	@Override
	public int method5406() {
		return this.anInt145;
	}

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "(I)J")
	@Override
	public long method5410() {
		return this.aLong14;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)I")
	@Override
	public int method5404() {
		return this.anInt144;
	}

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "(I)I")
	@Override
	public int method5409() {
		return this.anInt143;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)I")
	@Override
	public int method5408() {
		return this.anInt146;
	}
}
