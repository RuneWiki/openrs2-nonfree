import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public final class Class1_Sub4_Sub8_Sub1 extends Class1_Sub4_Sub8 {

	@OriginalMember(owner = "client!ga", name = "L", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference1;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!ur;Ljava/lang/Object;I)V")
	public Class1_Sub4_Sub8_Sub1(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference1 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method3010() {
		return true;
	}

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3009() {
		return this.aSoftReference1.get();
	}
}
