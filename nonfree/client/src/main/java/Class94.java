import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class94 {

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "Lclient!ig;")
	private final Class47_Sub2 aClass47_Sub2_20;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
	public final int anInt3041;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!ig;I[Lclient!bd;)V")
	public Class94(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17[] arg2) {
		this.aClass47_Sub2_20 = arg0;
		this.anInt3041 = arg1;
	}

	@OriginalMember(owner = "client!ie", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass47_Sub2_20.method2770(this.anInt3041);
		super.finalize();
	}
}
