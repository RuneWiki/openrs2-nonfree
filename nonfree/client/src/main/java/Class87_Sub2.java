import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public final class Class87_Sub2 extends Class87 {

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "Lclient!dea;")
	public final Interface3 anInterface3_2;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!nd;II[B)V")
	public Class87_Sub2(@OriginalArg(0) Class62_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.anInterface3_2 = arg0.method4707(arg1, arg2, false, arg3, Static301.aClass174_10);
		this.anInterface3_2.method7454(false, false);
	}

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!nd;II[I)V")
	public Class87_Sub2(@OriginalArg(0) Class62_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		this.anInterface3_2 = arg0.method4692(false, arg2, arg3, arg1);
		this.anInterface3_2.method7454(false, false);
	}
}
