import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public final class Class16_Sub1 extends Class16 {

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "Lclient!sd;")
	public final Interface20 anInterface20_2;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!sv;II[B)V")
	public Class16_Sub1(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface20_2 = arg0.method7251(arg1, arg3, arg2, false, Static490.aClass214_14);
		this.anInterface20_2.method7531(false, false);
	}

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!sv;II[I)V")
	public Class16_Sub1(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface20_2 = arg0.method7248(arg1, arg2, arg3, false);
		this.anInterface20_2.method7531(false, false);
	}
}
