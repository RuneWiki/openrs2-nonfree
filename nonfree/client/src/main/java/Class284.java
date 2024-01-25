import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public final class Class284 {

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
	public int anInt8649;

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
	public int anInt8651;

	@OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
	public int anInt8655;

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
	public int anInt8652 = 128;

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
	public int anInt8650 = 128;

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
	public int anInt8654;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(I)V")
	public Class284(@OriginalArg(0) int arg0) {
		this.anInt8654 = arg0;
	}

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(IIIIII)V")
	private Class284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt8652 = arg2;
		this.anInt8654 = arg0;
		this.anInt8649 = arg5;
		this.anInt8655 = arg3;
		this.anInt8650 = arg1;
		this.anInt8651 = arg4;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!qi;Z)V")
	public void method7138(@OriginalArg(0) Class284 arg0) {
		this.anInt8649 = arg0.anInt8649;
		this.anInt8655 = arg0.anInt8655;
		this.anInt8651 = arg0.anInt8651;
		this.anInt8654 = arg0.anInt8654;
		this.anInt8652 = arg0.anInt8652;
		this.anInt8650 = arg0.anInt8650;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)Lclient!qi;")
	public Class284 method7140() {
		return new Class284(this.anInt8654, this.anInt8650, this.anInt8652, this.anInt8655, this.anInt8651, this.anInt8649);
	}
}
