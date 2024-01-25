import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public final class Class139_Sub1 extends Class139 {

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "Z")
	public boolean aBoolean238;

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
	public int anInt3573;

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "Lclient!kg;")
	public Class139_Sub1 aClass139_Sub1_4;

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
	public int anInt3576;

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "J")
	public long aLong109;

	static {
		new Class231("Select", "Auswählen", "Sélectionner", "Selecionar");
		new Class231("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)J")
	@Override
	public long method3203() {
		return this.aLong109;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)C")
	@Override
	public char method3201() {
		return this.aChar1;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method3204() {
		return this.aBoolean238;
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)I")
	@Override
	public int method3202() {
		return this.anInt3573;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)I")
	@Override
	public int method3200() {
		return this.anInt3576;
	}
}
