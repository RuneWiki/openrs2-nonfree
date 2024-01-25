import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class74 {

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
	public int anInt2435;

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
	public int anInt2437;

	@OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
	public int anInt2439;

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
	public int anInt2433 = 128;

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
	public int anInt2436 = 128;

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
	public int anInt2434;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(I)V")
	public Class74(@OriginalArg(0) int arg0) {
		this.anInt2434 = arg0;
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(IIIIII)V")
	private Class74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2435 = arg3;
		this.anInt2439 = arg4;
		this.anInt2433 = arg1;
		this.anInt2437 = arg5;
		this.anInt2436 = arg2;
		this.anInt2434 = arg0;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!dl;Z)V")
	public void method2181(@OriginalArg(0) Class74 arg0) {
		this.anInt2439 = arg0.anInt2439;
		this.anInt2437 = arg0.anInt2437;
		this.anInt2433 = arg0.anInt2433;
		this.anInt2434 = arg0.anInt2434;
		this.anInt2435 = arg0.anInt2435;
		this.anInt2436 = arg0.anInt2436;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)Lclient!dl;")
	public Class74 method2182() {
		return new Class74(this.anInt2434, this.anInt2433, this.anInt2436, this.anInt2435, this.anInt2439, this.anInt2437);
	}
}
