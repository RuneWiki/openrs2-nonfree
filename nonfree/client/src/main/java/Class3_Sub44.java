import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public final class Class3_Sub44 extends Class3 {

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
	public final int anInt7904;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "Z")
	public final boolean aBoolean618;

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
	public final int anInt7903;

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
	public final int anInt7906;

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
	public final int anInt7905;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
	public final int anInt7901;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class3_Sub44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt7904 = arg1;
		this.aBoolean618 = arg5;
		this.anInt7903 = arg4;
		this.anInt7906 = arg3;
		this.anInt7905 = arg2;
		this.anInt7901 = arg0;
	}
}
