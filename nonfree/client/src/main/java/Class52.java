import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public final class Class52 {

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "I")
	public int anInt1621;

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "Lclient!cea;")
	public Class52 aClass52_1;

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "I")
	public int anInt1622;

	@OriginalMember(owner = "client!cea", name = "f", descriptor = "Lclient!q;")
	public Class81 aClass81_2;

	@OriginalMember(owner = "client!cea", name = "h", descriptor = "I")
	public int anInt1625;

	@OriginalMember(owner = "client!cea", name = "i", descriptor = "I")
	public final int anInt1626;

	@OriginalMember(owner = "client!cea", name = "m", descriptor = "I")
	public final int anInt1630;

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(II)V")
	public Class52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1626 = arg1;
		this.anInt1630 = arg0;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(II)Lclient!cea;")
	public Class52 method1376(@OriginalArg(0) int arg0) {
		return new Class52(this.anInt1630, arg0);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Z)Lclient!rba;")
	public Class286 method1379() {
		return Static466.method6801(this.anInt1630);
	}
}
