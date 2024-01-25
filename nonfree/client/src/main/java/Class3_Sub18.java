import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public abstract class Class3_Sub18 extends Class3 {

	@OriginalMember(owner = "client!eaa", name = "o", descriptor = "Z")
	public boolean aBoolean541;

	@OriginalMember(owner = "client!eaa", name = "n", descriptor = "Lclient!us;")
	protected final Class43_Sub3 aClass43_Sub3_29;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lclient!us;)V")
	public Class3_Sub18(@OriginalArg(0) Class43_Sub3 arg0) {
		this.aClass43_Sub3_29 = arg0;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(B)Z")
	public abstract boolean method5733();

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)I")
	public int method5734() {
		return 0;
	}

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "(I)Z")
	public final boolean method5737() {
		return this.aBoolean541;
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(B)I")
	public final int method5740() {
		return 1;
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(II)V")
	public abstract void method5741(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIZ)V")
	public abstract void method5742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "(B)V")
	public abstract void method5743();

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!db;IILclient!db;)V")
	public abstract void method5744(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class34_Sub2 arg2);

	@OriginalMember(owner = "client!eaa", name = "d", descriptor = "(B)Z")
	public abstract boolean method5745();

	@OriginalMember(owner = "client!eaa", name = "f", descriptor = "(I)Z")
	public final boolean method5746() {
		return false;
	}
}
