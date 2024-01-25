import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public final class Class287 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
	public int anInt7686;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
	public int anInt7690;

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
	public int anInt7692;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
	public int anInt7687 = 128;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
	public int anInt7693 = 128;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
	public int anInt7689;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(I)V")
	public Class287(@OriginalArg(0) int arg0) {
		this.anInt7689 = arg0;
	}

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(IIIIII)V")
	private Class287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7692 = arg4;
		this.anInt7693 = arg1;
		this.anInt7690 = arg5;
		this.anInt7687 = arg2;
		this.anInt7686 = arg3;
		this.anInt7689 = arg0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)Lclient!rf;")
	public Class287 method6405() {
		return new Class287(this.anInt7689, this.anInt7693, this.anInt7687, this.anInt7686, this.anInt7692, this.anInt7690);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZLclient!rf;)V")
	public void method6407(@OriginalArg(1) Class287 arg0) {
		this.anInt7693 = arg0.anInt7693;
		this.anInt7689 = arg0.anInt7689;
		this.anInt7692 = arg0.anInt7692;
		this.anInt7687 = arg0.anInt7687;
		this.anInt7686 = arg0.anInt7686;
		this.anInt7690 = arg0.anInt7690;
	}
}
