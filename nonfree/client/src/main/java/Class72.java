import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public final class Class72 {

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "J")
	public final long aLong73;

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "Lclient!kd;")
	private final Class39_Sub2 aClass39_Sub2_10;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!kd;J[Lclient!sn;)V")
	public Class72(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class224[] arg2) {
		this.aLong73 = arg1;
		this.aClass39_Sub2_10 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass39_Sub2_10.method3190(this.aLong73);
		super.finalize();
	}
}
