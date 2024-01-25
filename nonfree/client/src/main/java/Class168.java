import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public final class Class168 implements Interface24 {

	@OriginalMember(owner = "client!k", name = "a", descriptor = "Lclient!kda;")
	public final Class173 aClass173_6;

	@OriginalMember(owner = "client!k", name = "j", descriptor = "I")
	public final int anInt5706;

	@OriginalMember(owner = "client!k", name = "p", descriptor = "Ljava/lang/String;")
	public final String aString67;

	@OriginalMember(owner = "client!k", name = "q", descriptor = "I")
	public final int anInt5710;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "I")
	public final int anInt5701;

	@OriginalMember(owner = "client!k", name = "n", descriptor = "I")
	public final int anInt5709;

	@OriginalMember(owner = "client!k", name = "f", descriptor = "I")
	public final int anInt5702;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "I")
	public final int anInt5699;

	@OriginalMember(owner = "client!k", name = "d", descriptor = "I")
	public final int anInt5700;

	@OriginalMember(owner = "client!k", name = "h", descriptor = "I")
	public final int anInt5704;

	@OriginalMember(owner = "client!k", name = "k", descriptor = "I")
	public final int anInt5707;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "Lclient!cu;")
	public final Class60 aClass60_7;

	@OriginalMember(owner = "client!k", name = "l", descriptor = "I")
	public final int anInt5708;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!kda;Lclient!cu;IIIIIIIIII)V")
	public Class168(@OriginalArg(0) String arg0, @OriginalArg(1) Class173 arg1, @OriginalArg(2) Class60 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.aClass173_6 = arg1;
		this.anInt5706 = arg10;
		this.aString67 = arg0;
		this.anInt5710 = arg6;
		this.anInt5701 = arg3;
		this.anInt5709 = arg9;
		this.anInt5702 = arg12;
		this.anInt5699 = arg5;
		this.anInt5700 = arg7;
		this.anInt5704 = arg11;
		this.anInt5707 = arg4;
		this.aClass60_7 = arg2;
		this.anInt5708 = arg8;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)Lclient!hs;")
	@Override
	public Class138 method8348() {
		return Static540.aClass138_7;
	}
}
