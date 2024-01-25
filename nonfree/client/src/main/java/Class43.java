import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public final class Class43 {

	@OriginalMember(owner = "client!co", name = "b", descriptor = "Lclient!tc;")
	public Class1_Sub9_Sub4 aClass1_Sub9_Sub4_1;

	@OriginalMember(owner = "client!co", name = "f", descriptor = "Lclient!nr;")
	public Class1_Sub33 aClass1_Sub33_1;

	@OriginalMember(owner = "client!co", name = "l", descriptor = "Lclient!cj;")
	public Class1_Sub8_Sub1 aClass1_Sub8_Sub1_1;

	@OriginalMember(owner = "client!co", name = "m", descriptor = "Lclient!p;")
	public Class194 aClass194_1;

	@OriginalMember(owner = "client!co", name = "g", descriptor = "I")
	public final int anInt919;

	@OriginalMember(owner = "client!co", name = "h", descriptor = "I")
	public final int anInt920;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "I")
	public final int anInt916;

	@OriginalMember(owner = "client!co", name = "n", descriptor = "I")
	public int anInt924;

	@OriginalMember(owner = "client!co", name = "i", descriptor = "I")
	public final int anInt921;

	@OriginalMember(owner = "client!co", name = "c", descriptor = "B")
	public final byte aByte20;

	static {
		new Class142(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(BIIIII)V")
	public Class43(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt919 = arg1;
		this.anInt920 = arg5;
		this.anInt916 = arg4;
		this.anInt924 = arg3;
		this.anInt921 = arg2;
		this.aByte20 = arg0;
	}
}
