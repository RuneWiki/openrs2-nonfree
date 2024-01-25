import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public final class Class10_Sub38 extends Class10 {

	@OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
	public final int anInt5644;

	@OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
	public final int anInt5651;

	static {
		new Class182("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(II)V")
	public Class10_Sub38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5644 = arg0;
		this.anInt5651 = arg1;
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)I")
	public int method4501() {
		return this.anInt5644 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)I")
	public int method4502() {
		return Static219.method3313(this.anInt5644);
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)Z")
	public boolean method4504() {
		return (this.anInt5644 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)Z")
	public boolean method4506() {
		return (this.anInt5644 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)Z")
	public boolean method4508(@OriginalArg(0) int arg0) {
		return (this.anInt5644 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "(I)Z")
	public boolean method4509() {
		return (this.anInt5644 >> 21 & 0x1) != 0;
	}
}
