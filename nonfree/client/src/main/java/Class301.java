import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public final class Class301 {

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "I")
	public int anInt8985;

	@OriginalMember(owner = "client!rga", name = "c", descriptor = "I")
	public int anInt8987;

	@OriginalMember(owner = "client!rga", name = "g", descriptor = "I")
	public int anInt8991;

	@OriginalMember(owner = "client!rga", name = "e", descriptor = "I")
	public int anInt8989 = 128;

	@OriginalMember(owner = "client!rga", name = "h", descriptor = "I")
	public int anInt8992 = 128;

	@OriginalMember(owner = "client!rga", name = "j", descriptor = "I")
	public int anInt8993;

	@OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(I)V")
	public Class301(@OriginalArg(0) int arg0) {
		this.anInt8993 = arg0;
	}

	@OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(IIIIII)V")
	private Class301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8992 = arg1;
		this.anInt8993 = arg0;
		this.anInt8987 = arg5;
		this.anInt8985 = arg3;
		this.anInt8991 = arg4;
		this.anInt8989 = arg2;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(BLclient!rga;)V")
	public void method7445(@OriginalArg(1) Class301 arg0) {
		this.anInt8993 = arg0.anInt8993;
		this.anInt8992 = arg0.anInt8992;
		this.anInt8989 = arg0.anInt8989;
		this.anInt8991 = arg0.anInt8991;
		this.anInt8987 = arg0.anInt8987;
		this.anInt8985 = arg0.anInt8985;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(B)Lclient!rga;")
	public Class301 method7446() {
		return new Class301(this.anInt8993, this.anInt8992, this.anInt8989, this.anInt8985, this.anInt8991, this.anInt8987);
	}
}
