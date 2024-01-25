import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public abstract class Class38 {

	@OriginalMember(owner = "client!jfa", name = "d", descriptor = "Lclient!ifa;")
	protected final Class44_Sub2 aClass44_Sub2_21;

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lclient!ifa;)V")
	public Class38(@OriginalArg(0) Class44_Sub2 arg0) {
		this.aClass44_Sub2_21 = arg0;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)Z")
	public abstract boolean method7427();

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)V")
	public void method7429() {
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ZI)V")
	public abstract void method7431(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IZI)V")
	public abstract void method7433(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "(I)V")
	public abstract void method7434();

	@OriginalMember(owner = "client!jfa", name = "e", descriptor = "(I)V")
	public void method7437() {
	}

	@OriginalMember(owner = "client!jfa", name = "f", descriptor = "(I)V")
	public void method7438() {
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IZ)V")
	public abstract void method7439(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILclient!oa;B)V")
	public abstract void method7440(@OriginalArg(0) int arg0, @OriginalArg(1) Interface16 arg1);

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)V")
	public void method7441() {
	}

	@OriginalMember(owner = "client!jfa", name = "g", descriptor = "(I)V")
	public void method7442() {
	}

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "(B)V")
	public void method7443() {
	}
}
