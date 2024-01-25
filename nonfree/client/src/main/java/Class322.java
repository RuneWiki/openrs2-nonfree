import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public final class Class322 implements Interface25 {

	@OriginalMember(owner = "client!tga", name = "n", descriptor = "I")
	public final int anInt9421;

	@OriginalMember(owner = "client!tga", name = "h", descriptor = "I")
	public final int anInt9418;

	@OriginalMember(owner = "client!tga", name = "i", descriptor = "I")
	public final int anInt9419;

	@OriginalMember(owner = "client!tga", name = "l", descriptor = "Lclient!ee;")
	public final Class79 aClass79_19;

	@OriginalMember(owner = "client!tga", name = "g", descriptor = "I")
	public final int anInt9417;

	@OriginalMember(owner = "client!tga", name = "p", descriptor = "I")
	public final int anInt9423;

	@OriginalMember(owner = "client!tga", name = "s", descriptor = "I")
	public final int anInt9425;

	@OriginalMember(owner = "client!tga", name = "d", descriptor = "I")
	public final int anInt9415;

	@OriginalMember(owner = "client!tga", name = "j", descriptor = "I")
	public final int anInt9420;

	@OriginalMember(owner = "client!tga", name = "o", descriptor = "I")
	public final int anInt9422;

	@OriginalMember(owner = "client!tga", name = "c", descriptor = "I")
	public final int anInt9414;

	@OriginalMember(owner = "client!tga", name = "e", descriptor = "Lclient!haa;")
	public final Class127 aClass127_16;

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString100;

	@OriginalMember(owner = "client!tga", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!ee;Lclient!haa;IIIIIIIIII)V")
	public Class322(@OriginalArg(0) String arg0, @OriginalArg(1) Class79 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt9421 = arg7;
		this.anInt9418 = arg5;
		this.anInt9419 = arg10;
		this.aClass79_19 = arg1;
		this.anInt9417 = arg11;
		this.anInt9423 = arg8;
		this.anInt9425 = arg6;
		this.anInt9415 = arg3;
		this.anInt9420 = arg9;
		this.anInt9422 = arg12;
		this.anInt9414 = arg4;
		this.aClass127_16 = arg2;
		this.aString100 = arg0;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)Lclient!hda;")
	@Override
	public Class129 method8540() {
		return Static535.aClass129_8;
	}
}
