import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public final class Class103 {

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
	public int anInt2990;

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
	public int anInt2991;

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
	public int anInt2992;

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "Lclient!fk;")
	public Class103 aClass103_1;

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "Lclient!q;")
	public Class8 aClass8_1;

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
	public final int anInt2993;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
	public final int anInt2989;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(II)V")
	public Class103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2993 = arg1;
		this.anInt2989 = arg0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZI)Lclient!fk;")
	public Class103 method2735(@OriginalArg(1) int arg0) {
		return new Class103(this.anInt2989, arg0);
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)Lclient!mp;")
	public Class222 method2736() {
		return Static443.method6828(this.anInt2989);
	}
}
