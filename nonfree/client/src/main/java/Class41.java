import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class Class41 implements Interface1 {

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
	public final int anInt9779;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "Lclient!gq;")
	public final Class117 aClass117_13;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
	public final int anInt9771;

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
	public final int anInt9781;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
	public final int anInt9775;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
	public final int anInt9777;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "Lclient!kfa;")
	public final Class178 aClass178_12;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
	public final int anInt9773;

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
	public final int anInt9780;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!gq;Lclient!kfa;IIIIIII)V")
	public Class41(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt9779 = arg4;
		this.aClass117_13 = arg0;
		this.anInt9771 = arg7;
		this.anInt9781 = arg3;
		this.anInt9775 = arg6;
		this.anInt9777 = arg8;
		this.aClass178_12 = arg1;
		this.anInt9773 = arg5;
		this.anInt9780 = arg2;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)Lclient!qi;")
	@Override
	public Class275 method8059() {
		return null;
	}
}
