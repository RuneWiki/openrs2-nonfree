import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public final class Class4_Sub5_Sub1_Sub1 extends Class4_Sub5_Sub1 {

	@OriginalMember(owner = "client!hda", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lclient!be;Ljava/lang/Object;I)V")
	public Class4_Sub5_Sub1_Sub1(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!hda", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method3330() {
		return true;
	}

	@OriginalMember(owner = "client!hda", name = "e", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3332() {
		return this.aSoftReference2.get();
	}
}
