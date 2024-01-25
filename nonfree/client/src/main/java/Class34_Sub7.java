import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public final class Class34_Sub7 extends Class34 {

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lclient!rda;)V")
	public Class34_Sub7(@OriginalArg(0) Class126_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8519() {
		return true;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(Z)V")
	@Override
	public void method8516() {
		super.aClass126_Sub3_39.method7126(false);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8518(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(III)V")
	@Override
	public void method8520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8521(@OriginalArg(0) boolean arg0) {
		super.aClass126_Sub3_39.method7126(true);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(BILclient!iga;)V")
	@Override
	public void method8522(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1) {
		super.aClass126_Sub3_39.method7113(arg1);
		super.aClass126_Sub3_39.method7105(arg0);
	}
}
