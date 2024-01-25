import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class154 {

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "J")
	private long aLong119;

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
	private int anInt4494;

	static {
		new Class45("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!wba;)V")
	public Class154(@OriginalArg(0) Class313 arg0) {
		this.aLong119 = arg0.anInt9289;
		this.anInt4494 = 1;
	}

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "([Lclient!wba;)V")
	public Class154(@OriginalArg(0) Class313[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method4178(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)I")
	private int method4175(@OriginalArg(0) int arg0) {
		return (int) (this.aLong119 >> arg0 * Static525.anInt9290) & 0xF;
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(II)Lclient!wba;")
	public Class313 method4176(@OriginalArg(0) int arg0) {
		return Static525.method8025()[this.method4175(arg0)];
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)I")
	public int method4177() {
		return this.anInt4494;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILclient!wba;)V")
	private void method4178(@OriginalArg(1) Class313 arg0) {
		this.aLong119 |= arg0.anInt9289 << Static525.anInt9290 * this.anInt4494++;
	}
}
