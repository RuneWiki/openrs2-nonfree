import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public abstract class Class62 {

	@OriginalMember(owner = "client!og", name = "d", descriptor = "Lclient!ef;")
	protected final Class49_Sub2 aClass49_Sub2_43;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!ef;)V")
	public Class62(@OriginalArg(0) Class49_Sub2 arg0) {
		this.aClass49_Sub2_43 = arg0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIZ)V")
	public abstract void method5819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)Z")
	public abstract boolean method5821();

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)V")
	public abstract void method5822(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZB)V")
	public abstract void method5825(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
	public abstract void method5829();

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!mk;II)V")
	public abstract void method5830(@OriginalArg(0) Class55 arg0, @OriginalArg(2) int arg1);
}
