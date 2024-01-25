import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public final class Class315 {

	@OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
	public int anInt8454;

	@OriginalMember(owner = "client!qt", name = "h", descriptor = "I")
	public int anInt8455;

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "I")
	public int anInt8459;

	@OriginalMember(owner = "client!qt", name = "g", descriptor = "I")
	public int anInt8456 = -1;

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "Lclient!cb;")
	public final Class53 aClass53_10;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lclient!sj;)V")
	public Class315(@OriginalArg(0) Class4_Sub2_Sub1_Sub2 arg0) {
		this.aClass53_10 = new Class53_Sub1(arg0, false);
	}
}
