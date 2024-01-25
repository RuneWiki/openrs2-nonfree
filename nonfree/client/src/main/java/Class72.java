import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public abstract class Class72 {

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "Lclient!mj;")
	protected final Class45_Sub2 aClass45_Sub2_22;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!mj;)V")
	public Class72(@OriginalArg(0) Class45_Sub2 arg0) {
		this.aClass45_Sub2_22 = arg0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZ)V")
	public abstract void method7182(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V")
	public void method7183() {
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)V")
	public abstract void method7184();

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
	public void method7185() {
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
	public void method7186() {
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)Z")
	public abstract boolean method7187();

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)V")
	public abstract void method7188(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(B)V")
	public void method7190() {
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "(B)V")
	public void method7191() {
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "(I)V")
	public void method7192() {
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZI)V")
	public abstract void method7193(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BILclient!lc;)V")
	public abstract void method7194(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1);
}
