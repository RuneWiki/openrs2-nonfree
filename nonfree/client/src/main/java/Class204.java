import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public final class Class204 {

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
	public int anInt5586;

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
	public int anInt5590;

	@OriginalMember(owner = "client!qp", name = "i", descriptor = "B")
	private byte aByte72;

	@OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
	public int anInt5593;

	@OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
	public int anInt5594;

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "I")
	public int anInt5595;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V")
	public Class204() {
	}

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!sv;)V")
	public Class204(@OriginalArg(0) Class2_Sub13 arg0) {
		this.aByte72 = arg0.method3605();
		this.anInt5590 = arg0.method3555();
		this.anInt5586 = arg0.method3574();
		this.anInt5593 = arg0.method3574();
		this.anInt5595 = arg0.method3574();
		this.anInt5594 = arg0.method3574();
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)I")
	public int method4436() {
		return (this.aByte72 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)I")
	public int method4437() {
		return this.aByte72 & 0x7;
	}
}
