import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public abstract class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!bi", name = "y", descriptor = "Z")
	public boolean aBoolean83;

	@OriginalMember(owner = "client!bi", name = "r", descriptor = "Lclient!od;")
	protected final Class128_Sub2 aClass128_Sub2_7;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!od;)V")
	public Class1_Sub4(@OriginalArg(0) Class128_Sub2 arg0) {
		this.aClass128_Sub2_7 = arg0;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BI)V")
	public abstract void method867(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)Z")
	public final boolean method868() {
		return this.aBoolean83;
	}

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "(I)V")
	public abstract void method871();

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BII)V")
	public abstract void method872(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "(I)I")
	public int method874() {
		return 0;
	}

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "(I)Z")
	public abstract boolean method875();

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "(I)I")
	public final int method876() {
		return 1;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILclient!ah;ILclient!ah;)V")
	public abstract void method877(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub1 arg2);

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "(I)Z")
	public final boolean method878() {
		return false;
	}

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "(I)Z")
	public abstract boolean method879();
}
