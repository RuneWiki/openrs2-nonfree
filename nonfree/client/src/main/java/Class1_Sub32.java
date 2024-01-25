import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public abstract class Class1_Sub32 extends Class1 {

	@OriginalMember(owner = "client!ps", name = "m", descriptor = "Z")
	public boolean aBoolean562;

	@OriginalMember(owner = "client!ps", name = "n", descriptor = "Lclient!hj;")
	protected final Class2_Sub1 aClass2_Sub1_39;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!hj;)V")
	public Class1_Sub32(@OriginalArg(0) Class2_Sub1 arg0) {
		this.aClass2_Sub1_39 = arg0;
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)Z")
	public final boolean method5586() {
		return false;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "()V")
	public abstract void method5587();

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "()Z")
	public abstract boolean method5588();

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(B)Z")
	public final boolean method5589() {
		return this.aBoolean562;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILclient!rq;Lclient!rq;)V")
	public abstract void method5590(@OriginalArg(0) int arg0, @OriginalArg(1) Class18_Sub1 arg1, @OriginalArg(2) Class18_Sub1 arg2);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)V")
	public abstract void method5591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "()Z")
	public abstract boolean method5592();

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "()I")
	public int method5593() {
		return 0;
	}

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)I")
	public final int method5594() {
		return 1;
	}

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "(I)V")
	public abstract void method5595(@OriginalArg(0) int arg0);
}
