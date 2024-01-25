import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public abstract class Class4_Sub46 extends Class4 {

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "Z")
	public boolean aBoolean646;

	@OriginalMember(owner = "client!uk", name = "n", descriptor = "Lclient!kga;")
	protected final Class44_Sub3 aClass44_Sub3_41;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!kga;)V")
	public Class4_Sub46(@OriginalArg(0) Class44_Sub3 arg0) {
		this.aClass44_Sub3_41 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)Z")
	public final boolean method7550() {
		return false;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V")
	public abstract void method7552(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "(B)Z")
	public final boolean method7553() {
		return this.aBoolean646;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)Z")
	public abstract boolean method7554();

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)I")
	public final int method7555() {
		return 1;
	}

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)I")
	public int method7556() {
		return 0;
	}

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "(B)Z")
	public abstract boolean method7557();

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZI)V")
	public abstract void method7558(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!saa;ILclient!saa;B)V")
	public abstract void method7559(@OriginalArg(0) Class77_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1 arg2);

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V")
	public abstract void method7560();
}
