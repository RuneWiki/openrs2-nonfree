import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public abstract class Class4_Sub29 extends Class4 {

	@OriginalMember(owner = "client!li", name = "r", descriptor = "Z")
	public boolean aBoolean427;

	@OriginalMember(owner = "client!li", name = "p", descriptor = "Lclient!no;")
	protected final Class66_Sub3 aClass66_Sub3_25;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!no;)V")
	public Class4_Sub29(@OriginalArg(0) Class66_Sub3 arg0) {
		this.aClass66_Sub3_25 = arg0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)Z")
	public abstract boolean method4864();

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)Z")
	public abstract boolean method4865();

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(I)Z")
	public final boolean method4866() {
		return false;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)I")
	public final int method4867() {
		return 1;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!gaa;Lclient!gaa;BI)V")
	public abstract void method4868(@OriginalArg(0) Class114_Sub1 arg0, @OriginalArg(1) Class114_Sub1 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V")
	public abstract void method4869(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(B)Z")
	public final boolean method4870() {
		return this.aBoolean427;
	}

	@OriginalMember(owner = "client!li", name = "d", descriptor = "(B)I")
	public int method4871() {
		return 0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BI)V")
	public abstract void method4873(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!li", name = "g", descriptor = "(I)V")
	public abstract void method4875();
}
