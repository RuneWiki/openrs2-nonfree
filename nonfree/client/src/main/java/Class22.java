import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class Class22 implements Interface24 {

	@OriginalMember(owner = "client!au", name = "d", descriptor = "I")
	public final int anInt5432;

	@OriginalMember(owner = "client!au", name = "j", descriptor = "I")
	public final int anInt5436;

	@OriginalMember(owner = "client!au", name = "c", descriptor = "I")
	public final int anInt5431;

	@OriginalMember(owner = "client!au", name = "m", descriptor = "I")
	public final int anInt5438;

	@OriginalMember(owner = "client!au", name = "p", descriptor = "I")
	public final int anInt5441;

	@OriginalMember(owner = "client!au", name = "e", descriptor = "Lclient!ega;")
	public final Class79 aClass79_14;

	@OriginalMember(owner = "client!au", name = "q", descriptor = "Lclient!og;")
	public final Class238 aClass238_9;

	@OriginalMember(owner = "client!au", name = "n", descriptor = "I")
	public final int anInt5439;

	@OriginalMember(owner = "client!au", name = "i", descriptor = "I")
	public final int anInt5435;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!og;Lclient!ega;IIIIIII)V")
	public Class22(@OriginalArg(0) Class238 arg0, @OriginalArg(1) Class79 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt5432 = arg6;
		this.anInt5436 = arg3;
		this.anInt5431 = arg8;
		this.anInt5438 = arg7;
		this.anInt5441 = arg4;
		this.aClass79_14 = arg1;
		this.aClass238_9 = arg0;
		this.anInt5439 = arg2;
		this.anInt5435 = arg5;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(B)Lclient!io;")
	@Override
	public Class152 method5661() {
		return null;
	}
}
