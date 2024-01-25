import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public abstract class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!om", name = "q", descriptor = "Z")
	public boolean aBoolean112;

	@OriginalMember(owner = "client!om", name = "t", descriptor = "Lclient!ji;")
	protected final Class15_Sub3 aClass15_Sub3_5;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lclient!ji;)V")
	public Class3_Sub8(@OriginalArg(0) Class15_Sub3 arg0) {
		this.aClass15_Sub3_5 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(III)V")
	public abstract void method1543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V")
	public abstract void method1544(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Z")
	public final boolean method1545() {
		return this.aBoolean112;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)Z")
	public final boolean method1546() {
		return false;
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
	public abstract void method1548();

	@OriginalMember(owner = "client!om", name = "h", descriptor = "(I)I")
	public int method1549() {
		return 0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!vga;Lclient!vga;II)V")
	public abstract void method1550(@OriginalArg(0) Class11_Sub2 arg0, @OriginalArg(1) Class11_Sub2 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!om", name = "i", descriptor = "(I)Z")
	public abstract boolean method1551();

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(Z)I")
	public final int method1553() {
		return 1;
	}

	@OriginalMember(owner = "client!om", name = "j", descriptor = "(I)Z")
	public abstract boolean method1554();
}
