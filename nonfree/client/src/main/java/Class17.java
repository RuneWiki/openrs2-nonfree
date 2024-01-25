import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class Class17 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "Lclient!cb;")
	protected final Class9_Sub1 aClass9_Sub1_19;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!cb;)V")
	public Class17(@OriginalArg(0) Class9_Sub1 arg0) {
		this.aClass9_Sub1_19 = arg0;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V")
	public abstract void method6794(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V")
	public void method6795() {
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!pb;II)V")
	public abstract void method6796(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
	public void method6798() {
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(B)Z")
	public abstract boolean method6799();

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
	public abstract void method6800();

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(Z)V")
	public void method6801() {
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BZ)V")
	public abstract void method6802(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
	public void method6804() {
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZZ)V")
	public abstract void method6805(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "(B)V")
	public void method6806() {
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V")
	public void method6807() {
	}
}
