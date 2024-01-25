import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public final class Class17 {

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
	public int anInt635;

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
	public int anInt641;

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
	public int anInt644;

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
	public int anInt639 = 128;

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
	public int anInt636 = 128;

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
	public int anInt645;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(I)V")
	public Class17(@OriginalArg(0) int arg0) {
		this.anInt645 = arg0;
	}

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(IIIIII)V")
	private Class17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt645 = arg0;
		this.anInt644 = arg3;
		this.anInt636 = arg2;
		this.anInt635 = arg4;
		this.anInt639 = arg1;
		this.anInt641 = arg5;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BLclient!ao;)V")
	public void method662(@OriginalArg(1) Class17 arg0) {
		this.anInt639 = arg0.anInt639;
		this.anInt636 = arg0.anInt636;
		this.anInt635 = arg0.anInt635;
		this.anInt644 = arg0.anInt644;
		this.anInt641 = arg0.anInt641;
		this.anInt645 = arg0.anInt645;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)Lclient!ao;")
	public Class17 method663() {
		return new Class17(this.anInt645, this.anInt639, this.anInt636, this.anInt644, this.anInt635, this.anInt641);
	}
}
