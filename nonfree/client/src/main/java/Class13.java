import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public abstract class Class13 {

	@OriginalMember(owner = "client!oda", name = "i", descriptor = "Lclient!kd;")
	protected final Class57_Sub3 aClass57_Sub3_21;

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class13(@OriginalArg(0) Class57_Sub3 arg0) {
		this.aClass57_Sub3_21 = arg0;
	}

	@OriginalMember(owner = "client!oda", name = "d", descriptor = "(I)V")
	public void method8260() {
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V")
	public abstract void method8261();

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZB)V")
	public abstract void method8262(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIB)V")
	public abstract void method8263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!oda", name = "c", descriptor = "(B)V")
	public void method8266() {
	}

	@OriginalMember(owner = "client!oda", name = "e", descriptor = "(I)V")
	public void method8267() {
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(B)V")
	public void method8268() {
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(B)V")
	public void method8269() {
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Z)Z")
	public abstract boolean method8270();

	@OriginalMember(owner = "client!oda", name = "c", descriptor = "(I)V")
	public void method8272() {
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZI)V")
	public abstract void method8273(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IILclient!rca;)V")
	public abstract void method8274(@OriginalArg(0) int arg0, @OriginalArg(2) Interface22 arg1);
}
