import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class3_Sub46 extends Class3 {

	@OriginalMember(owner = "client!su", name = "p", descriptor = "[Lclient!saa;")
	public static final Class317[] aClass317Array1 = new Class317[5];

	@OriginalMember(owner = "client!su", name = "l", descriptor = "I")
	public int anInt9113;

	@OriginalMember(owner = "client!su", name = "m", descriptor = "I")
	public int anInt9114;

	@OriginalMember(owner = "client!su", name = "n", descriptor = "I")
	public int anInt9115;

	@OriginalMember(owner = "client!su", name = "o", descriptor = "I")
	public int anInt9116;

	@OriginalMember(owner = "client!su", name = "s", descriptor = "I")
	public int anInt9118;

	@OriginalMember(owner = "client!su", name = "k", descriptor = "I")
	public int anInt9112 = -1;

	@OriginalMember(owner = "client!su", name = "q", descriptor = "Z")
	public boolean aBoolean638 = false;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass317Array1.length; local4++) {
			aClass317Array1[local4] = new Class317();
		}
	}

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(I)V")
	public Class3_Sub46(@OriginalArg(0) int arg0) {
		this.anInt9112 = arg0;
	}
}
