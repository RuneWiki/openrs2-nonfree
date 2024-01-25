import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public final class Class165 {

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
	public int anInt5047;

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "Lclient!nk;")
	public Class165 aClass165_2;

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
	public int anInt5048;

	@OriginalMember(owner = "client!nk", name = "j", descriptor = "Lclient!ia;")
	public Class107 aClass107_3;

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
	public int anInt5054;

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
	public final int anInt5052;

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
	public final int anInt5051;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(II)V")
	public Class165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5052 = arg1;
		this.anInt5051 = arg0;
	}

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!nk;I)V")
	public Class165(@OriginalArg(0) Class165 arg0, @OriginalArg(1) int arg1) {
		this.aClass165_2 = arg0;
		this.anInt5052 = arg1 + this.aClass165_2.anInt5052;
		this.anInt5051 = this.aClass165_2.anInt5051;
		this.aClass107_3 = this.aClass165_2.aClass107_3;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)Lclient!hm;")
	public Class102 method3869() {
		return Static62.method1239(this.anInt5051);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZI)Lclient!nk;")
	public Class165 method3871(@OriginalArg(1) int arg0) {
		return new Class165(this.anInt5051, arg0);
	}
}
