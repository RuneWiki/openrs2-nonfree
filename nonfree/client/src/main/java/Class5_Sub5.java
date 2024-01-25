import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class Class5_Sub5 extends Class5 {

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "Z")
	public boolean aBoolean23;

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "Lclient!mm;")
	protected final Class55_Sub1 aClass55_Sub1_2;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!mm;)V")
	public Class5_Sub5(@OriginalArg(0) Class55_Sub1 arg0) {
		this.aClass55_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)I")
	public final int method230() {
		return 1;
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
	public abstract void method231(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "()Z")
	public abstract boolean method232();

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)Z")
	public final boolean method233() {
		return false;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "()Z")
	public abstract boolean method234();

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "()V")
	public abstract void method235();

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)V")
	public abstract void method236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!hn;Lclient!hn;)V")
	public abstract void method237(@OriginalArg(0) int arg0, @OriginalArg(1) Class60_Sub4 arg1, @OriginalArg(2) Class60_Sub4 arg2);

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)Z")
	public final boolean method238() {
		return this.aBoolean23;
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "()I")
	public int method239() {
		return 0;
	}
}
