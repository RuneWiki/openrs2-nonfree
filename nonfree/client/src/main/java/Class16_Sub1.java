import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public final class Class16_Sub1 extends Class16 {

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "Z")
	public boolean aBoolean416;

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
	public int anInt6430;

	@OriginalMember(owner = "client!uh", name = "q", descriptor = "J")
	public long aLong204;

	@OriginalMember(owner = "client!uh", name = "w", descriptor = "Lclient!uh;")
	public Class16_Sub1 aClass16_Sub1_4;

	@OriginalMember(owner = "client!uh", name = "y", descriptor = "I")
	public int anInt6436;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5099() {
		return this.aBoolean416;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)I")
	@Override
	public int method5108() {
		return this.anInt6436;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)C")
	@Override
	public char method5102() {
		return this.aChar4;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)I")
	@Override
	public int method5100() {
		return this.anInt6430;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)J")
	@Override
	public long method5103() {
		return this.aLong204;
	}
}
