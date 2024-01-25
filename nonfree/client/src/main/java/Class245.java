import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public final class Class245 {

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "Lclient!ui;")
	private final Class289 aClass289_7;

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
	public final int anInt6944;

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
	private final int anInt6943;

	@OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
	public final int anInt6948;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(IILclient!ui;)V")
	public Class245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class289 arg2) {
		this.aClass289_7 = arg2;
		this.anInt6944 = arg0;
		this.anInt6943 = arg1;
		this.anInt6948 = this.anInt6943 * this.aClass289_7.anInt8371;
		if (this.anInt6944 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
