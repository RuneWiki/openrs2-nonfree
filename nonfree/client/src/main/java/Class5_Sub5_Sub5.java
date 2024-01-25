import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public abstract class Class5_Sub5_Sub5 extends Class5_Sub5 {

	@OriginalMember(owner = "client!kv", name = "r", descriptor = "I")
	public final int anInt10470;

	@OriginalMember(owner = "client!kv", name = "t", descriptor = "Lclient!pt;")
	public final Interface20 anInterface20_3;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lclient!pt;I)V")
	protected Class5_Sub5_Sub5(@OriginalArg(0) Interface20 arg0, @OriginalArg(1) int arg1) {
		this.anInt10470 = arg1;
		this.anInterface20_3 = arg0;
	}

	@OriginalMember(owner = "client!kv", name = "g", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method8985();

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)Z")
	public abstract boolean method8986();
}
