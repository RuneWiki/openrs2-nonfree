import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public final class Class5_Sub31 extends Class5 implements Interface1 {

	@OriginalMember(owner = "client!me", name = "l", descriptor = "I")
	public int anInt6019;

	@OriginalMember(owner = "client!me", name = "p", descriptor = "I")
	public int anInt6022;

	@OriginalMember(owner = "client!me", name = "u", descriptor = "I")
	public int anInt6027;

	@OriginalMember(owner = "client!me", name = "w", descriptor = "J")
	public long aLong168;

	@OriginalMember(owner = "client!me", name = "y", descriptor = "C")
	public char aChar3;

	static {
		new Class40("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)I")
	@Override
	public int method5006() {
		return this.anInt6019;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)J")
	@Override
	public long method5004() {
		return this.aLong168;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)I")
	@Override
	public int method5005() {
		return this.anInt6027;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)C")
	@Override
	public char method5008() {
		return this.aChar3;
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(I)I")
	@Override
	public int method5007() {
		return this.anInt6022;
	}
}
