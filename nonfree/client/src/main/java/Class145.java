import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public final class Class145 {

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
	public int anInt3876;

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
	public int anInt3878;

	@OriginalMember(owner = "client!ho", name = "k", descriptor = "I")
	public int anInt3879;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
	public int anInt3872 = 128;

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
	public int anInt3882 = 128;

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
	public int anInt3880;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(I)V")
	public Class145(@OriginalArg(0) int arg0) {
		this.anInt3880 = arg0;
	}

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(IIIIII)V")
	private Class145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3882 = arg1;
		this.anInt3876 = arg3;
		this.anInt3872 = arg2;
		this.anInt3880 = arg0;
		this.anInt3879 = arg4;
		this.anInt3878 = arg5;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ILclient!ho;)V")
	public void method3348(@OriginalArg(1) Class145 arg0) {
		this.anInt3880 = arg0.anInt3880;
		this.anInt3879 = arg0.anInt3879;
		this.anInt3878 = arg0.anInt3878;
		this.anInt3872 = arg0.anInt3872;
		this.anInt3882 = arg0.anInt3882;
		this.anInt3876 = arg0.anInt3876;
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)Lclient!ho;")
	public Class145 method3351() {
		return new Class145(this.anInt3880, this.anInt3882, this.anInt3872, this.anInt3876, this.anInt3879, this.anInt3878);
	}
}
