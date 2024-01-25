import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public final class Class272 {

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
	public int anInt7640;

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "I")
	public int anInt7641;

	@OriginalMember(owner = "client!ps", name = "j", descriptor = "I")
	public int anInt7647;

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "I")
	public int anInt7642 = 128;

	@OriginalMember(owner = "client!ps", name = "m", descriptor = "I")
	public int anInt7650 = 128;

	@OriginalMember(owner = "client!ps", name = "k", descriptor = "I")
	public int anInt7648;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(I)V")
	public Class272(@OriginalArg(0) int arg0) {
		this.anInt7648 = arg0;
	}

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(IIIIII)V")
	private Class272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7642 = arg1;
		this.anInt7648 = arg0;
		this.anInt7641 = arg5;
		this.anInt7640 = arg3;
		this.anInt7647 = arg4;
		this.anInt7650 = arg2;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!ps;I)V")
	public void method6665(@OriginalArg(0) Class272 arg0) {
		this.anInt7641 = arg0.anInt7641;
		this.anInt7650 = arg0.anInt7650;
		this.anInt7647 = arg0.anInt7647;
		this.anInt7648 = arg0.anInt7648;
		this.anInt7642 = arg0.anInt7642;
		this.anInt7640 = arg0.anInt7640;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)Lclient!ps;")
	public Class272 method6666() {
		return new Class272(this.anInt7648, this.anInt7642, this.anInt7650, this.anInt7640, this.anInt7647, this.anInt7641);
	}
}
