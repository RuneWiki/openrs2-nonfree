import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public abstract class Class4_Sub31 extends Class4 {

	@OriginalMember(owner = "client!oba", name = "q", descriptor = "Z")
	public boolean aBoolean439;

	@OriginalMember(owner = "client!oba", name = "v", descriptor = "Lclient!kfa;")
	protected final Class7_Sub2 aClass7_Sub2_28;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Lclient!kfa;)V")
	public Class4_Sub31(@OriginalArg(0) Class7_Sub2 arg0) {
		this.aClass7_Sub2_28 = arg0;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Z)Z")
	public abstract boolean method5052();

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(B)Z")
	public final boolean method5053() {
		return false;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(BI)V")
	public abstract void method5054(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!oba", name = "e", descriptor = "(B)I")
	public final int method5055() {
		return 1;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)I")
	public int method5056() {
		return 0;
	}

	@OriginalMember(owner = "client!oba", name = "f", descriptor = "(B)V")
	public abstract void method5057();

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(Z)Z")
	public final boolean method5058() {
		return this.aBoolean439;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!il;Lclient!il;II)V")
	public abstract void method5059(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) Class3_Sub2 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oba", name = "g", descriptor = "(B)Z")
	public abstract boolean method5061();

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(III)V")
	public abstract void method5062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
