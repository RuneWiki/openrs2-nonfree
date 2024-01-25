import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public abstract class Class4_Sub7_Sub8 extends Class4_Sub7 {

	@OriginalMember(owner = "client!vs", name = "u", descriptor = "Lclient!hg;")
	public final Interface11 anInterface11_3;

	@OriginalMember(owner = "client!vs", name = "v", descriptor = "I")
	public final int anInt4615;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lclient!hg;I)V")
	protected Class4_Sub7_Sub8(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) int arg1) {
		this.anInterface11_3 = arg0;
		this.anInt4615 = arg1;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)Z")
	public abstract boolean method3886();

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method3887();
}
