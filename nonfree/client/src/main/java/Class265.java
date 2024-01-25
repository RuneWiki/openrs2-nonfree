import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public final class Class265 {

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	public int anInt7517;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	public int anInt7522;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	public int anInt7524;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
	public int anInt7516 = 128;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	public int anInt7521 = 128;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	public int anInt7518;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(I)V")
	public Class265(@OriginalArg(0) int arg0) {
		this.anInt7518 = arg0;
	}

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(IIIIII)V")
	private Class265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7524 = arg3;
		this.anInt7516 = arg1;
		this.anInt7522 = arg5;
		this.anInt7518 = arg0;
		this.anInt7517 = arg4;
		this.anInt7521 = arg2;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!sc;)V")
	public void method6287(@OriginalArg(1) Class265 arg0) {
		this.anInt7516 = arg0.anInt7516;
		this.anInt7522 = arg0.anInt7522;
		this.anInt7521 = arg0.anInt7521;
		this.anInt7524 = arg0.anInt7524;
		this.anInt7517 = arg0.anInt7517;
		this.anInt7518 = arg0.anInt7518;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Lclient!sc;")
	public Class265 method6291() {
		return new Class265(this.anInt7518, this.anInt7516, this.anInt7521, this.anInt7524, this.anInt7517, this.anInt7522);
	}
}
