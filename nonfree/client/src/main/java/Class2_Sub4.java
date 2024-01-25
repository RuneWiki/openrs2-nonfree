import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public abstract class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!qh", name = "o", descriptor = "Z")
	public boolean aBoolean59;

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "Lclient!qj;")
	protected final Class100_Sub3 aClass100_Sub3_6;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!qj;)V")
	public Class2_Sub4(@OriginalArg(0) Class100_Sub3 arg0) {
		this.aClass100_Sub3_6 = arg0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!pm;ZILclient!pm;)V")
	public abstract void method611(@OriginalArg(0) Class23_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class23_Sub1 arg2);

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)I")
	public int method612() {
		return 0;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)I")
	public final int method613() {
		return 1;
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V")
	public abstract void method614();

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)Z")
	public final boolean method616() {
		return false;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V")
	public abstract void method617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "(I)Z")
	public abstract boolean method618();

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "(I)Z")
	public final boolean method619() {
		return this.aBoolean59;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
	public abstract void method621(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "(I)Z")
	public abstract boolean method622();
}
