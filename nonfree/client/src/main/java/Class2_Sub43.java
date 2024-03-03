import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class2_Sub43 extends Class2 {

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
	public static int anInt7161 = 0;

	@OriginalMember(owner = "client!wh", name = "v", descriptor = "Lclient!h;")
	public static final Class89 aClass89_253 = new Class89(77, 12);

	@OriginalMember(owner = "client!wh", name = "A", descriptor = "[Lclient!cm;")
	public static final Class36[] aClass36Array1 = new Class36[5];

	@OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
	public static int anInt7165 = 0;

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
	public final int anInt7164;

	@OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
	public final int anInt7163;

	static {
		for (@Pc(14) int local14 = 0; local14 < aClass36Array1.length; local14++) {
			aClass36Array1[local14] = new Class36();
		}
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(II)V", line = 156)
	public Class2_Sub43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7164 = arg1;
		this.anInt7163 = arg0;
	}
}
