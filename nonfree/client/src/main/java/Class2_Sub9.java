import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public abstract class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!ft", name = "q", descriptor = "Z")
	public boolean aBoolean94;

	@OriginalMember(owner = "client!ft", name = "k", descriptor = "Lclient!pg;")
	protected final Class163_Sub2 aClass163_Sub2_10;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lclient!pg;)V")
	public Class2_Sub9(@OriginalArg(0) Class163_Sub2 arg0) {
		this.aClass163_Sub2_10 = arg0;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IB)V")
	public abstract void method867(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)Z")
	public abstract boolean method868();

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(B)I")
	public int method869() {
		return 0;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILclient!bd;ILclient!bd;)V")
	public abstract void method870(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub1 arg1, @OriginalArg(3) Class20_Sub1 arg2);

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)Z")
	public final boolean method871() {
		return this.aBoolean94;
	}

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "(B)Z")
	public final boolean method874() {
		return false;
	}

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(I)V")
	public abstract void method875();

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "(I)I")
	public final int method876() {
		return 1;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZII)V")
	public abstract void method877(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "(B)Z")
	public abstract boolean method878();
}
