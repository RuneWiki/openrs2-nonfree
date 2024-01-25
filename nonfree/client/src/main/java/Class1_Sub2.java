import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "Lclient!fk;")
	public final Interface8 anInterface8_6;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!ee;II[B)V")
	public Class1_Sub2(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface8_6 = arg0.method8112(arg1, arg2, false, arg3, Static111.aClass122_5);
		this.anInterface8_6.method7068(false, false);
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!ee;II[I)V")
	public Class1_Sub2(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface8_6 = arg0.method8103(arg2, arg1, arg3, false);
		this.anInterface8_6.method7068(false, false);
	}
}
