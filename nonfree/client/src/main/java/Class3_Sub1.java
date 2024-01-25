import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!li", name = "f", descriptor = "J")
	public long aLong139;

	@OriginalMember(owner = "client!li", name = "g", descriptor = "Z")
	public boolean aBoolean286;

	@OriginalMember(owner = "client!li", name = "j", descriptor = "I")
	public int anInt4284;

	@OriginalMember(owner = "client!li", name = "k", descriptor = "I")
	public int anInt4285;

	@OriginalMember(owner = "client!li", name = "o", descriptor = "Lclient!li;")
	public Class3_Sub1 aClass3_Sub1_1;

	@OriginalMember(owner = "client!li", name = "q", descriptor = "C")
	public char aChar4;

	static {
		new Class182("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!li", name = "d", descriptor = "(I)J")
	@Override
	public long method3435() {
		return this.aLong139;
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method3432() {
		return this.aBoolean286;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)I")
	@Override
	public int method3433() {
		return this.anInt4284;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(Z)I")
	@Override
	public int method3434() {
		return this.anInt4285;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)C")
	@Override
	public char method3429() {
		return this.aChar4;
	}
}
