import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class Class265 {

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
	public final int anInt7253;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
	public final int anInt7251;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
	public final int anInt7249;

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
	public final int anInt7256;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIII)V")
	public Class265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7253 = arg2;
		this.anInt7251 = arg1;
		this.anInt7249 = arg3;
		this.anInt7256 = arg0;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)Lclient!qd;")
	public Class265 method5978(@OriginalArg(0) int arg0) {
		return new Class265(this.anInt7256, arg0, this.anInt7253, this.anInt7249);
	}
}
