import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public final class Class248 {

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
	public int anInt7265;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
	public int anInt7266;

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
	public int anInt7267;

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
	public int anInt7271;

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
	public int anInt7272;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
	public int anInt7275;

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
	public int anInt7277;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
	public int anInt7264 = 128;

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
	public int anInt7276 = 128;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	public int anInt7263;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(I)V")
	public Class248(@OriginalArg(0) int arg0) {
		this.anInt7263 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(IIIIII)V")
	private Class248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7264 = arg2;
		this.anInt7271 = arg5;
		this.anInt7263 = arg0;
		this.anInt7276 = arg1;
		this.anInt7265 = arg3;
		this.anInt7275 = arg4;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)Lclient!ve;")
	public Class248 method5630() {
		return new Class248(this.anInt7263, this.anInt7276, this.anInt7264, this.anInt7265, this.anInt7275, this.anInt7271);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!ve;B)V")
	public void method5635(@OriginalArg(0) Class248 arg0) {
		this.anInt7263 = arg0.anInt7263;
		this.anInt7276 = arg0.anInt7276;
		this.anInt7264 = arg0.anInt7264;
		this.anInt7275 = arg0.anInt7275;
		this.anInt7265 = arg0.anInt7265;
		this.anInt7271 = arg0.anInt7271;
	}
}
