import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public abstract class Class4_Sub6_Sub1 extends Class4_Sub6 {

	@OriginalMember(owner = "client!hm", name = "H", descriptor = "Lclient!er;")
	public final Interface5 anInterface5_3;

	@OriginalMember(owner = "client!hm", name = "G", descriptor = "I")
	public final int anInt8961;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!er;I)V")
	protected Class4_Sub6_Sub1(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1) {
		this.anInterface5_3 = arg0;
		this.anInt8961 = arg1;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)Z")
	public abstract boolean method6872();

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method6875();
}
