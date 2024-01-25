import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public abstract class Class32 {

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "Lclient!lba;")
	protected final Class132_Sub1 aClass132_Sub1_21;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!lba;)V")
	public Class32(@OriginalArg(0) Class132_Sub1 arg0) {
		this.aClass132_Sub1_21 = arg0;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZ)V")
	public abstract void method8315(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BZ)V")
	public abstract void method8316(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Z)V")
	public void method8317() {
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILclient!ml;)V")
	public abstract void method8318(@OriginalArg(1) int arg0, @OriginalArg(2) Interface17 arg1);

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	public void method8319() {
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
	public void method8320() {
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
	public void method8321() {
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)V")
	public abstract void method8322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)V")
	public void method8323() {
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)Z")
	public abstract boolean method8324();

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(B)V")
	public void method8325() {
	}

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "(I)V")
	public abstract void method8328();
}
