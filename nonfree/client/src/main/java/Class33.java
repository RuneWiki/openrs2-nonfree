import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public final class Class33 {

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
	public int anInt598;

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
	public int anInt599;

	@OriginalMember(owner = "client!bs", name = "l", descriptor = "I")
	public int anInt605;

	@OriginalMember(owner = "client!bs", name = "h", descriptor = "I")
	public int anInt602 = 128;

	@OriginalMember(owner = "client!bs", name = "j", descriptor = "I")
	public int anInt604 = 128;

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
	public int anInt597;

	static {
		new Class96("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(I)V")
	public Class33(@OriginalArg(0) int arg0) {
		this.anInt597 = arg0;
	}

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(IIIIII)V")
	private Class33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt597 = arg0;
		this.anInt599 = arg5;
		this.anInt605 = arg4;
		this.anInt604 = arg1;
		this.anInt602 = arg2;
		this.anInt598 = arg3;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)Lclient!bs;")
	public Class33 method503() {
		return new Class33(this.anInt597, this.anInt604, this.anInt602, this.anInt598, this.anInt605, this.anInt599);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!bs;I)V")
	public void method505(@OriginalArg(0) Class33 arg0) {
		this.anInt599 = arg0.anInt599;
		this.anInt597 = arg0.anInt597;
		this.anInt605 = arg0.anInt605;
		this.anInt598 = arg0.anInt598;
		this.anInt604 = arg0.anInt604;
		this.anInt602 = arg0.anInt602;
	}
}
