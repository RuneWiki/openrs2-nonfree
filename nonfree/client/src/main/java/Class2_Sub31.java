import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public abstract class Class2_Sub31 extends Class2 {

	@OriginalMember(owner = "client!hp", name = "n", descriptor = "Z")
	public boolean aBoolean783;

	@OriginalMember(owner = "client!hp", name = "t", descriptor = "Lclient!lea;")
	protected final Class101_Sub2 aClass101_Sub2_42;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!lea;)V")
	public Class2_Sub31(@OriginalArg(0) Class101_Sub2 arg0) {
		this.aClass101_Sub2_42 = arg0;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)Z")
	public abstract boolean method9274();

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)Z")
	public final boolean method9275() {
		return false;
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)I")
	public int method9276() {
		return 0;
	}

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "(I)I")
	public final int method9278() {
		return 1;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZI)V")
	public abstract void method9280(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!wi;ILclient!wi;I)V")
	public abstract void method9281(@OriginalArg(0) Class50_Sub4 arg0, @OriginalArg(2) Class50_Sub4 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(B)Z")
	public abstract boolean method9282();

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)V")
	public abstract void method9283(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "(I)Z")
	public final boolean method9285() {
		return this.aBoolean783;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)V")
	public abstract void method9288();
}
