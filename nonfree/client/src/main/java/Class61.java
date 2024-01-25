import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class61 {

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
	public int anInt1488;

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "C")
	private char aChar2;

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "Ljava/lang/String;")
	public String aString20;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "Z")
	public boolean aBoolean126 = true;

	static {
		new Class221("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLclient!lk;I)V")
	private void method1396(@OriginalArg(1) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static223.method3757(arg0.method4217());
		} else if (arg1 == 2) {
			this.anInt1488 = arg0.method4239();
		} else if (arg1 == 4) {
			this.aBoolean126 = false;
		} else if (arg1 == 5) {
			this.aString20 = arg0.method4201();
			return;
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)Z")
	public boolean method1397() {
		return this.aChar2 == 's';
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLclient!lk;)V")
	public void method1398(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4240();
			if (local17 == 0) {
				return;
			}
			this.method1396(arg0, local17);
		}
	}
}
