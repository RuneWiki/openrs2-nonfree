import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public abstract class Class14_Sub5 extends Class14 {

	@OriginalMember(owner = "client!aw", name = "u", descriptor = "Z")
	public boolean aBoolean435;

	@OriginalMember(owner = "client!aw", name = "t", descriptor = "Lclient!pi;")
	protected final Class144_Sub3 aClass144_Sub3_23;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!pi;)V")
	public Class14_Sub5(@OriginalArg(0) Class144_Sub3 arg0) {
		this.aClass144_Sub3_23 = arg0;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IZ)V")
	public abstract void method5485(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Z)I")
	public final int method5486() {
		return 1;
	}

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "(I)Z")
	public final boolean method5487() {
		return this.aBoolean435;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IZI)V")
	public abstract void method5488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "(I)Z")
	public final boolean method5489() {
		return false;
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(B)Z")
	public abstract boolean method5490();

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)V")
	public abstract void method5491();

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!sb;IILclient!sb;)V")
	public abstract void method5493(@OriginalArg(0) Class161_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class161_Sub1 arg2);

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "(B)I")
	public int method5494() {
		return 0;
	}

	@OriginalMember(owner = "client!aw", name = "f", descriptor = "(I)Z")
	public abstract boolean method5496();
}
