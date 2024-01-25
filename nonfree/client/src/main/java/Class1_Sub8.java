import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public abstract class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!cw", name = "m", descriptor = "Z")
	public boolean aBoolean59;

	@OriginalMember(owner = "client!cw", name = "r", descriptor = "Lclient!ok;")
	protected final Class134_Sub2 aClass134_Sub2_2;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lclient!ok;)V")
	public Class1_Sub8(@OriginalArg(0) Class134_Sub2 arg0) {
		this.aClass134_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)Z")
	public abstract boolean method585();

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(II)V")
	public abstract void method586(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(Z)I")
	public int method587() {
		return 0;
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(B)V")
	public abstract void method588();

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILclient!wn;ILclient!wn;)V")
	public abstract void method589(@OriginalArg(0) int arg0, @OriginalArg(1) Class40_Sub3 arg1, @OriginalArg(3) Class40_Sub3 arg2);

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(BII)V")
	public abstract void method590(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)Z")
	public abstract boolean method591();

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)Z")
	public final boolean method593() {
		return false;
	}

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "(I)Z")
	public final boolean method595() {
		return this.aBoolean59;
	}

	@OriginalMember(owner = "client!cw", name = "e", descriptor = "(I)I")
	public final int method596() {
		return 1;
	}
}
