import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public final class Class281 {

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
	public int anInt7412;

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
	public int anInt7413;

	@OriginalMember(owner = "client!qr", name = "h", descriptor = "Lclient!q;")
	public Class11 aClass11_5;

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "Lclient!qr;")
	public Class281 aClass281_2;

	@OriginalMember(owner = "client!qr", name = "k", descriptor = "I")
	public int anInt7418;

	@OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
	public final int anInt7417;

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
	public final int anInt7415;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(II)V")
	public Class281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7417 = arg0;
		this.anInt7415 = arg1;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IB)Lclient!qr;")
	public Class281 method6192(@OriginalArg(0) int arg0) {
		return new Class281(this.anInt7417, arg0);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)Lclient!uca;")
	public Class334 method6193() {
		return Static66.method1443(this.anInt7417);
	}
}
