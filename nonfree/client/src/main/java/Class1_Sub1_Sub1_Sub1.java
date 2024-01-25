import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public final class Class1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ck", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference aSoftReference2;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!nba;Ljava/lang/Object;I)V")
	public Class1_Sub1_Sub1_Sub1(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.aSoftReference2 = new SoftReference(arg1);
	}

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method4833() {
		return true;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4832() {
		return this.aSoftReference2.get();
	}
}
