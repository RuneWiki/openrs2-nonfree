import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public abstract class Class20 {

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(I)Z")
	public abstract boolean method5110();

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(B)V")
	public abstract void method5111();

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IILclient!qa;B)Z")
	public abstract boolean method5112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class128 arg2);

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BLclient!qa;)V")
	public abstract void method5114(@OriginalArg(1) Class128 arg0);

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(ILclient!qa;)Lclient!nf;")
	public abstract Class13_Sub4 method5115(@OriginalArg(1) Class128 arg0);

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ZIILclient!er;Lclient!qa;IB)V")
	public abstract void method5116(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) Class128 arg4, @OriginalArg(5) int arg5);
}
