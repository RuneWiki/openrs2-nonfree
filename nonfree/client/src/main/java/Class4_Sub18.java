import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public abstract class Class4_Sub18 extends Class4 {

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "Z")
	public boolean aBoolean218;

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "Lclient!pc;")
	protected final Class33_Sub3 aClass33_Sub3_10;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!pc;)V")
	public Class4_Sub18(@OriginalArg(0) Class33_Sub3 arg0) {
		this.aClass33_Sub3_10 = arg0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)Z")
	public abstract boolean method2766();

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ld;Lclient!ld;IB)V")
	public abstract void method2768(@OriginalArg(0) Class116_Sub2 arg0, @OriginalArg(1) Class116_Sub2 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(Z)Z")
	public final boolean method2769() {
		return false;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)Z")
	public final boolean method2770() {
		return this.aBoolean218;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(Z)I")
	public final int method2772() {
		return 1;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)Z")
	public abstract boolean method2773();

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIB)V")
	public abstract void method2774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)V")
	public abstract void method2775(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(Z)I")
	public int method2781() {
		return 0;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
	public abstract void method2782();
}
