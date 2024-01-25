import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public abstract class Class14 {

	@OriginalMember(owner = "client!lda", name = "f", descriptor = "Lclient!eq;")
	protected final Class33_Sub3 aClass33_Sub3_43;

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lclient!eq;)V")
	public Class14(@OriginalArg(0) Class33_Sub3 arg0) {
		this.aClass33_Sub3_43 = arg0;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(BLclient!kp;I)V")
	public abstract void method8542(@OriginalArg(1) Class121 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IZ)V")
	public abstract void method8543(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(III)V")
	public abstract void method8544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)V")
	public abstract void method8545();

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(B)Z")
	public abstract boolean method8549();

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(IZ)V")
	public abstract void method8550(@OriginalArg(1) boolean arg0);
}
