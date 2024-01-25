import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public final class Class281 {

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
	public int anInt8276;

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
	public int anInt8278;

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
	public int anInt8279;

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
	public int anInt8280;

	@OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
	public int anInt8283;

	@OriginalMember(owner = "client!qr", name = "k", descriptor = "I")
	public int anInt8285;

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "I")
	public int anInt8286;

	@OriginalMember(owner = "client!qr", name = "m", descriptor = "I")
	public int anInt8287;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
	public int anInt8275 = 128;

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
	public int anInt8281 = 128;

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
	public int anInt8284;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(I)V")
	public Class281(@OriginalArg(0) int arg0) {
		this.anInt8284 = arg0;
	}

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(IIIIII)V")
	private Class281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8287 = arg4;
		this.anInt8285 = arg5;
		this.anInt8275 = arg1;
		this.anInt8284 = arg0;
		this.anInt8281 = arg2;
		this.anInt8276 = arg3;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!qr;Z)V")
	public void method7116(@OriginalArg(0) Class281 arg0) {
		this.anInt8285 = arg0.anInt8285;
		this.anInt8276 = arg0.anInt8276;
		this.anInt8287 = arg0.anInt8287;
		this.anInt8281 = arg0.anInt8281;
		this.anInt8284 = arg0.anInt8284;
		this.anInt8275 = arg0.anInt8275;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)Lclient!qr;")
	public Class281 method7117() {
		return new Class281(this.anInt8284, this.anInt8275, this.anInt8281, this.anInt8276, this.anInt8287, this.anInt8285);
	}
}
