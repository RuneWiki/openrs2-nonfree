import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class11_Sub4_Sub6 extends Class11_Sub4 {

	@OriginalMember(owner = "client!eq", name = "x", descriptor = "C")
	private char aChar1;

	@OriginalMember(owner = "client!eq", name = "A", descriptor = "I")
	public int anInt1448;

	@OriginalMember(owner = "client!eq", name = "D", descriptor = "Ljava/lang/String;")
	public String aString12;

	@OriginalMember(owner = "client!eq", name = "w", descriptor = "Z")
	public boolean aBoolean87 = true;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!kh;I)V")
	private void method1174(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub25 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static35.method516(arg1.method5175());
		} else if (arg0 == 2) {
			this.anInt1448 = arg1.method5198();
		} else if (arg0 == 4) {
			this.aBoolean87 = false;
			return;
		} else if (arg0 == 5) {
			this.aString12 = arg1.method5184();
			return;
		}
	}

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "(I)Z")
	public boolean method1176() {
		return this.aChar1 == 's';
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BLclient!kh;)V")
	public void method1177(@OriginalArg(1) Class11_Sub25 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5185();
			if (local13 == 0) {
				return;
			}
			this.method1174(local13, arg0);
		}
	}
}
