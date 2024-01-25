import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class Class33 implements Interface17 {

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
	public final int anInt7245;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	public final int anInt7249;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
	public final int anInt7251;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
	public final int anInt7247;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "Lclient!mfa;")
	public final Class239 aClass239_13;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
	public final int anInt7252;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public final int anInt7250;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
	public final int anInt7246;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "Lclient!al;")
	public final Class18 aClass18_12;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!al;Lclient!mfa;IIIIIII)V")
	public Class33(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class239 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt7245 = arg8;
		this.anInt7249 = arg3;
		this.anInt7251 = arg5;
		this.anInt7247 = arg2;
		this.aClass239_13 = arg1;
		this.anInt7252 = arg6;
		this.anInt7250 = arg7;
		this.anInt7246 = arg4;
		this.aClass18_12 = arg0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)Lclient!hfa;")
	@Override
	public Class152 method9627() {
		return null;
	}
}
