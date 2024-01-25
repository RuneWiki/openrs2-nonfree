import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class Class17 {

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)Z")
	public abstract boolean method4778();

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(Lclient!uo;B)Lclient!kj;")
	public abstract Class8_Sub5 method4779(@OriginalArg(0) Class32 arg0);

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!uo;IIZ)Z")
	public abstract boolean method4783(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!uo;IIIZBLclient!pc;)V")
	public abstract void method4786(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class17 arg5);

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!uo;)V")
	public abstract void method4787(@OriginalArg(1) Class32 arg0);

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
	public abstract void method4789();
}
