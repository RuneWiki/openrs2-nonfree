import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class Class109 implements Interface25 {

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
	public final int anInt9908;

	@OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
	public final int anInt9905;

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
	public final int anInt9904;

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
	public final int anInt9907;

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "I")
	public final int anInt9909;

	@OriginalMember(owner = "client!fq", name = "h", descriptor = "Lclient!ee;")
	public final Class79 aClass79_21;

	@OriginalMember(owner = "client!fq", name = "o", descriptor = "I")
	public final int anInt9913;

	@OriginalMember(owner = "client!fq", name = "n", descriptor = "I")
	public final int anInt9912;

	@OriginalMember(owner = "client!fq", name = "l", descriptor = "Lclient!haa;")
	public final Class127 aClass127_18;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!ee;Lclient!haa;IIIIIII)V")
	public Class109(@OriginalArg(0) Class79 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt9908 = arg3;
		this.anInt9905 = arg2;
		this.anInt9904 = arg5;
		this.anInt9907 = arg7;
		this.anInt9909 = arg6;
		this.aClass79_21 = arg0;
		this.anInt9913 = arg4;
		this.anInt9912 = arg8;
		this.aClass127_18 = arg1;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)Lclient!hda;")
	@Override
	public Class129 method8540() {
		return null;
	}
}
