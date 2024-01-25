import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public final class Class6_Sub8 extends Class6 {

	@OriginalMember(owner = "client!cp", name = "C", descriptor = "I")
	public final int anInt1492;

	@OriginalMember(owner = "client!cp", name = "x", descriptor = "I")
	public final int anInt1488;

	static {
		new Class267("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(II)V")
	public Class6_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1492 = arg0;
		this.anInt1488 = arg1;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)I")
	public int method1216() {
		return Static110.method5745(this.anInt1492);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IB)Z")
	public boolean method1218(@OriginalArg(0) int arg0) {
		return (this.anInt1492 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)Z")
	public boolean method1220() {
		return (this.anInt1492 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "(I)I")
	public int method1225() {
		return this.anInt1492 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "(I)Z")
	public boolean method1226() {
		return (this.anInt1492 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(Z)Z")
	public boolean method1227() {
		return (this.anInt1492 & 0x1) != 0;
	}
}
