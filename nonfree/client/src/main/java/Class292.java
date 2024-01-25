import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public final class Class292 {

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
	public int anInt8318;

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
	public int anInt8320;

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
	public int anInt8321;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
	public int anInt8315 = 128;

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
	public int anInt8322 = 128;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
	public int anInt8317;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(I)V")
	public Class292(@OriginalArg(0) int arg0) {
		this.anInt8317 = arg0;
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(IIIIII)V")
	private Class292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8322 = arg2;
		this.anInt8320 = arg5;
		this.anInt8318 = arg4;
		this.anInt8317 = arg0;
		this.anInt8321 = arg3;
		this.anInt8315 = arg1;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)Lclient!sh;")
	public Class292 method6552() {
		return new Class292(this.anInt8317, this.anInt8315, this.anInt8322, this.anInt8321, this.anInt8318, this.anInt8320);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!sh;I)V")
	public void method6555(@OriginalArg(0) Class292 arg0) {
		this.anInt8320 = arg0.anInt8320;
		this.anInt8321 = arg0.anInt8321;
		this.anInt8318 = arg0.anInt8318;
		this.anInt8322 = arg0.anInt8322;
		this.anInt8317 = arg0.anInt8317;
		this.anInt8315 = arg0.anInt8315;
	}
}
