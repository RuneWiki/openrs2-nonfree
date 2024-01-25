import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public final class Class3_Sub10_Sub16 extends Class3_Sub10 {

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
	public int anInt7556;

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
	public int anInt7557;

	@OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
	public int anInt7561;

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "Ljava/lang/String;")
	public String aString61;

	static {
		new Class67("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(II)V")
	public Class3_Sub10_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong285 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
	public void method6211() {
		super.aLong277 |= Long.MIN_VALUE;
		if (this.method6216() == 0L) {
			Static250.aClass279_8.method6910(this);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public void method6212() {
		super.aLong277 = super.aLong277 & Long.MIN_VALUE | Static12.method647() + 500L;
		Static510.aClass279_10.method6910(this);
	}

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "(I)I")
	public int method6215() {
		return (int) super.aLong285;
	}

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "(I)J")
	public long method6216() {
		return super.aLong277 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)I")
	public int method6217() {
		return (int) (super.aLong285 >>> 32 & 0xFFL);
	}
}
