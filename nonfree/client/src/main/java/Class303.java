import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public final class Class303 {

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Lclient!eh;")
	public Class56 aClass56_12;

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "Lclient!rf;")
	public Class303 aClass303_1;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
	public int anInt8517;

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
	public int anInt8518;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
	public int anInt8520;

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
	public final int anInt8521;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
	public final int anInt8513;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(II)V")
	public Class303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8521 = arg0;
		this.anInt8513 = arg1;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)Lclient!oha;")
	public Class257 method7243() {
		return Static520.method7348(this.anInt8521);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZ)Lclient!rf;")
	public Class303 method7245(@OriginalArg(0) int arg0) {
		return new Class303(this.anInt8521, arg0);
	}
}
