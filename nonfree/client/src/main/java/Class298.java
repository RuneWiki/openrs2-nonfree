import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public final class Class298 {

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "Lclient!sk;")
	public Class25 aClass25_7;

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
	public int anInt8373;

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "Lclient!qr;")
	public Class298 aClass298_1;

	@OriginalMember(owner = "client!qr", name = "m", descriptor = "I")
	public int anInt8378;

	@OriginalMember(owner = "client!qr", name = "n", descriptor = "I")
	public int anInt8379;

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
	public final int anInt8371;

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
	public final int anInt8372;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(II)V")
	public Class298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8371 = arg1;
		this.anInt8372 = arg0;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)Lclient!om;")
	public Class265 method7100() {
		return Static600.method7989(this.anInt8372);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)Lclient!qr;")
	public Class298 method7101(@OriginalArg(1) int arg0) {
		return new Class298(this.anInt8372, arg0);
	}
}
