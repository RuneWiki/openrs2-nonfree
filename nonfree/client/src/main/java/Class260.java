import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class Class260 implements Interface8 {

	@OriginalMember(owner = "client!qga", name = "n", descriptor = "I")
	public final int anInt9478;

	@OriginalMember(owner = "client!qga", name = "h", descriptor = "I")
	public final int anInt9472;

	@OriginalMember(owner = "client!qga", name = "m", descriptor = "I")
	public final int anInt9477;

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "Lclient!oca;")
	public final Class237 aClass237_11;

	@OriginalMember(owner = "client!qga", name = "f", descriptor = "Lclient!ffa;")
	public final Class100 aClass100_11;

	@OriginalMember(owner = "client!qga", name = "k", descriptor = "I")
	public final int anInt9475;

	@OriginalMember(owner = "client!qga", name = "i", descriptor = "I")
	public final int anInt9473;

	@OriginalMember(owner = "client!qga", name = "l", descriptor = "I")
	public final int anInt9476;

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "I")
	public final int anInt9468;

	@OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Lclient!ffa;Lclient!oca;IIIIIII)V")
	public Class260(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt9478 = arg7;
		this.anInt9472 = arg2;
		this.anInt9477 = arg8;
		this.aClass237_11 = arg1;
		this.aClass100_11 = arg0;
		this.anInt9475 = arg4;
		this.anInt9473 = arg3;
		this.anInt9476 = arg5;
		this.anInt9468 = arg6;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)Lclient!fl;")
	@Override
	public Class103 method7774() {
		return null;
	}
}
