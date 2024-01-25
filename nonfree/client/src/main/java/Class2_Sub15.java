import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public abstract class Class2_Sub15 extends Class2 {

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "Z")
	public boolean aBoolean369;

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "Lclient!uca;")
	protected final Class162_Sub3 aClass162_Sub3_23;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!uca;)V")
	public Class2_Sub15(@OriginalArg(0) Class162_Sub3 arg0) {
		this.aClass162_Sub3_23 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)I")
	public final int method4027() {
		return 1;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)Z")
	public abstract boolean method4029();

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)V")
	public abstract void method4031(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BII)V")
	public abstract void method4032(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)Z")
	public final boolean method4033() {
		return false;
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)I")
	public int method4035() {
		return 0;
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(B)Z")
	public abstract boolean method4036();

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)Z")
	public final boolean method4037() {
		return this.aBoolean369;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)V")
	public abstract void method4038();

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!aaa;Lclient!aaa;II)V")
	public abstract void method4039(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) Class3_Sub1 arg1, @OriginalArg(2) int arg2);
}
