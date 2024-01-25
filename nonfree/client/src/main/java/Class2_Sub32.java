import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public abstract class Class2_Sub32 extends Class2 {

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "Z")
	public boolean aBoolean639;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "Lclient!bo;")
	protected final Class26_Sub1 aClass26_Sub1_40;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!bo;)V")
	public Class2_Sub32(@OriginalArg(0) Class26_Sub1 arg0) {
		this.aClass26_Sub1_40 = arg0;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)Z")
	public abstract boolean method5801();

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IBI)V")
	public abstract void method5802(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)Z")
	public final boolean method5803() {
		return this.aBoolean639;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V")
	public abstract void method5804(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)I")
	public final int method5805() {
		return 1;
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)V")
	public abstract void method5806();

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!wr;Lclient!wr;I)V")
	public abstract void method5807(@OriginalArg(0) int arg0, @OriginalArg(1) Class65_Sub3 arg1, @OriginalArg(2) Class65_Sub3 arg2);

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "(I)Z")
	public abstract boolean method5809();

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "(I)Z")
	public final boolean method5810() {
		return false;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(Z)I")
	public int method5812() {
		return 0;
	}
}
