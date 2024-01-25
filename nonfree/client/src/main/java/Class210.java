import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class210 {

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
	public int anInt6119 = -1;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "Z")
	public boolean aBoolean395 = false;

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
	public int anInt6118 = 2;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "Z")
	public boolean aBoolean396 = false;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
	public int anInt6116 = 64;

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
	public int anInt6122 = 64;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
	public int anInt6124 = 1;

	static {
		new Class84("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLclient!lh;I)V")
	public void method4941(@OriginalArg(1) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method4130();
			if (local5 == 0) {
				return;
			}
			this.method4947(arg1, local5, arg0);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIILclient!lh;)V")
	private void method4947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1 arg2) {
		if (arg1 == 1) {
			this.anInt6119 = arg2.method4093();
			if (this.anInt6119 == 65535) {
				this.anInt6119 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt6116 = arg2.method4093() + 1;
			this.anInt6122 = arg2.method4093() + 1;
		} else if (arg1 == 3) {
			arg2.method4112();
		} else if (arg1 == 4) {
			this.anInt6118 = arg2.method4130();
		} else if (arg1 == 5) {
			this.anInt6124 = arg2.method4130();
		} else if (arg1 == 6) {
			this.aBoolean395 = true;
		} else if (arg1 == 7) {
			this.aBoolean396 = true;
		}
	}
}
