import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class Class56 implements Interface12 {

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "Lclient!eha;")
	public final Class97 aClass97_15;

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
	public final int anInt9421;

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
	public final int anInt9415;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "Lclient!oea;")
	public final Class252 aClass252_11;

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
	public final int anInt9414;

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
	public final int anInt9417;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
	public final int anInt9412;

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
	public final int anInt9419;

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
	public final int anInt9422;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!eha;Lclient!oea;IIIIIII)V")
	public Class56(@OriginalArg(0) Class97 arg0, @OriginalArg(1) Class252 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.aClass97_15 = arg0;
		this.anInt9421 = arg6;
		this.anInt9415 = arg7;
		this.aClass252_11 = arg1;
		this.anInt9414 = arg5;
		this.anInt9417 = arg2;
		this.anInt9412 = arg8;
		this.anInt9419 = arg3;
		this.anInt9422 = arg4;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)Lclient!hm;")
	@Override
	public Class151 method8831() {
		return null;
	}
}
