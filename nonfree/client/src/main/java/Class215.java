import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public final class Class215 {

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "Lclient!wc;")
	public Class47 aClass47_3;

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
	public int anInt6804;

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "Lclient!mi;")
	public Class215 aClass215_1;

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
	public int anInt6806;

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
	public int anInt6810;

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
	public final int anInt6803;

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
	public final int anInt6805;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(II)V")
	public Class215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6803 = arg0;
		this.anInt6805 = arg1;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)Lclient!bt;")
	public Class37 method5690() {
		return Static187.method3364(this.anInt6803);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Lclient!mi;")
	public Class215 method5694(@OriginalArg(1) int arg0) {
		return new Class215(this.anInt6803, arg0);
	}
}
