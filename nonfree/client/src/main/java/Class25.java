import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public final class Class25 {

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
	public int anInt601;

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "I")
	public int anInt602;

	@OriginalMember(owner = "client!baa", name = "j", descriptor = "I")
	public int anInt608;

	@OriginalMember(owner = "client!baa", name = "e", descriptor = "I")
	public int anInt604 = 128;

	@OriginalMember(owner = "client!baa", name = "d", descriptor = "I")
	public int anInt603 = 128;

	@OriginalMember(owner = "client!baa", name = "k", descriptor = "I")
	public int anInt609;

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(I)V")
	public Class25(@OriginalArg(0) int arg0) {
		this.anInt609 = arg0;
	}

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(IIIIII)V")
	private Class25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt609 = arg0;
		this.anInt608 = arg5;
		this.anInt601 = arg3;
		this.anInt602 = arg4;
		this.anInt603 = arg2;
		this.anInt604 = arg1;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)Lclient!baa;")
	public Class25 method607() {
		return new Class25(this.anInt609, this.anInt604, this.anInt603, this.anInt601, this.anInt602, this.anInt608);
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lclient!baa;Z)V")
	public void method609(@OriginalArg(0) Class25 arg0) {
		this.anInt602 = arg0.anInt602;
		this.anInt604 = arg0.anInt604;
		this.anInt608 = arg0.anInt608;
		this.anInt603 = arg0.anInt603;
		this.anInt609 = arg0.anInt609;
		this.anInt601 = arg0.anInt601;
	}
}
