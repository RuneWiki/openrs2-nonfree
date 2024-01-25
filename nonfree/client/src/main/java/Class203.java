import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public final class Class203 {

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
	public int anInt6040;

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
	public int anInt6041;

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
	public int anInt6044;

	@OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
	public int anInt6045;

	@OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
	public int anInt6046;

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
	public int anInt6047;

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "Lclient!qr;")
	public Class203 aClass203_2;

	@OriginalMember(owner = "client!qr", name = "p", descriptor = "I")
	public int anInt6051;

	@OriginalMember(owner = "client!qr", name = "q", descriptor = "I")
	public int anInt6052;

	@OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
	public int anInt6053;

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
	public final int anInt6042;

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
	public final int anInt6043;

	@OriginalMember(owner = "client!qr", name = "k", descriptor = "I")
	public final int anInt6048;

	@OriginalMember(owner = "client!qr", name = "n", descriptor = "I")
	private final int anInt6049;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "B")
	public final byte aByte90;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(IIIIB)V")
	public Class203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt6042 = arg1;
		this.anInt6043 = arg2;
		this.anInt6048 = arg3;
		this.anInt6049 = arg0;
		this.aByte90 = arg4;
	}

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!qr;I)V")
	public Class203(@OriginalArg(0) Class203 arg0, @OriginalArg(1) int arg1) {
		this.aClass203_2 = arg0;
		this.anInt6042 = arg1 + this.aClass203_2.anInt6042;
		this.anInt6049 = this.aClass203_2.anInt6049;
		this.anInt6048 = arg1 + this.aClass203_2.anInt6048;
		this.aByte90 = this.aClass203_2.aByte90;
		this.anInt6043 = arg1 + this.aClass203_2.anInt6043;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IBII)Lclient!qr;")
	public Class203 method4787(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class203(this.anInt6049, arg1, arg0, arg2, this.aByte90);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)Lclient!rm;")
	public Class210 method4788() {
		return Static23.method322(this.anInt6049);
	}
}
