import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class Class110 implements Interface14 {

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public final int anInt8731;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
	public final int anInt8734;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
	public final int anInt8732;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
	public final int anInt8733;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
	public final int anInt8738;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
	public final int anInt8739;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
	public final int anInt8729;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "Lclient!aba;")
	public final Class4 aClass4_11;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "Lclient!fda;")
	public final Class112 aClass112_16;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!fda;Lclient!aba;IIIIIII)V")
	public Class110(@OriginalArg(0) Class112 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt8731 = arg5;
		this.anInt8734 = arg2;
		this.anInt8732 = arg7;
		this.anInt8733 = arg8;
		this.anInt8738 = arg6;
		this.anInt8739 = arg3;
		this.anInt8729 = arg4;
		this.aClass4_11 = arg1;
		this.aClass112_16 = arg0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Lclient!ve;")
	@Override
	public Class370 method7954() {
		return null;
	}
}
