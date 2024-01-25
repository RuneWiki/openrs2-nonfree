import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public final class Class289 {

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
	public int anInt7468;

	@OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
	public int anInt7469;

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
	public int anInt7473;

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
	public int anInt7475;

	@OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
	public int anInt7476;

	@OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
	public int anInt7477;

	@OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
	public int anInt7479;

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
	public int anInt7483;

	@OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
	public int anInt7471 = 128;

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
	public int anInt7466 = 128;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
	public int anInt7474;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(I)V")
	public Class289(@OriginalArg(0) int arg0) {
		this.anInt7474 = arg0;
	}

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(IIIIII)V")
	private Class289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7473 = arg3;
		this.anInt7466 = arg2;
		this.anInt7474 = arg0;
		this.anInt7471 = arg1;
		this.anInt7479 = arg5;
		this.anInt7483 = arg4;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)Lclient!pl;")
	public Class289 method6504() {
		return new Class289(this.anInt7474, this.anInt7471, this.anInt7466, this.anInt7473, this.anInt7483, this.anInt7479);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZLclient!pl;)V")
	public void method6505(@OriginalArg(1) Class289 arg0) {
		this.anInt7473 = arg0.anInt7473;
		this.anInt7474 = arg0.anInt7474;
		this.anInt7471 = arg0.anInt7471;
		this.anInt7466 = arg0.anInt7466;
		this.anInt7483 = arg0.anInt7483;
		this.anInt7479 = arg0.anInt7479;
	}
}
