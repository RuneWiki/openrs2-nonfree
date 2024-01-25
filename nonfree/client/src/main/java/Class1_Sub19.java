import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public abstract class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!gh", name = "q", descriptor = "Z")
	public boolean aBoolean452;

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "Lclient!ks;")
	protected final Class63_Sub1 aClass63_Sub1_40;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!ks;)V")
	public Class1_Sub19(@OriginalArg(0) Class63_Sub1 arg0) {
		this.aClass63_Sub1_40 = arg0;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V")
	public abstract void method5451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "()V")
	public abstract void method5452();

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)Z")
	public final boolean method5453() {
		return false;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "()I")
	public int method5454() {
		return 0;
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "()Z")
	public abstract boolean method5455();

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "(I)I")
	public final int method5456() {
		return 1;
	}

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "(I)Z")
	public final boolean method5457() {
		return this.aBoolean452;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILclient!qb;Lclient!qb;)V")
	public abstract void method5458(@OriginalArg(0) int arg0, @OriginalArg(1) Class19_Sub3 arg1, @OriginalArg(2) Class19_Sub3 arg2);

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "(I)V")
	public abstract void method5459(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "()Z")
	public abstract boolean method5460();
}
