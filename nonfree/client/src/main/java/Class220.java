import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public final class Class220 {

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
	public int anInt6477;

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
	public int anInt6478;

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
	public int anInt6479;

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
	public int anInt6480;

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
	public int anInt6482;

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
	public int anInt6484;

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
	public int anInt6486;

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
	public int anInt6487;

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
	public int anInt6485 = 128;

	@OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
	public int anInt6491 = 128;

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
	public int anInt6481;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(I)V")
	public Class220(@OriginalArg(0) int arg0) {
		this.anInt6481 = arg0;
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(IIIIII)V")
	private Class220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6485 = arg2;
		this.anInt6491 = arg1;
		this.anInt6484 = arg3;
		this.anInt6477 = arg5;
		this.anInt6481 = arg0;
		this.anInt6480 = arg4;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!ml;B)V")
	public void method5459(@OriginalArg(0) Class220 arg0) {
		this.anInt6477 = arg0.anInt6477;
		this.anInt6481 = arg0.anInt6481;
		this.anInt6491 = arg0.anInt6491;
		this.anInt6484 = arg0.anInt6484;
		this.anInt6480 = arg0.anInt6480;
		this.anInt6485 = arg0.anInt6485;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)Lclient!ml;")
	public Class220 method5460() {
		return new Class220(this.anInt6481, this.anInt6491, this.anInt6485, this.anInt6484, this.anInt6480, this.anInt6477);
	}
}
