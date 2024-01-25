import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public abstract class Class14_Sub2_Sub4 extends Class14_Sub2 {

	@OriginalMember(owner = "client!kea", name = "u", descriptor = "I")
	public final int anInt8731;

	@OriginalMember(owner = "client!kea", name = "v", descriptor = "Lclient!uha;")
	public final Interface24 anInterface24_3;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Lclient!uha;I)V")
	protected Class14_Sub2_Sub4(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) int arg1) {
		this.anInt8731 = arg1;
		this.anInterface24_3 = arg0;
	}

	@OriginalMember(owner = "client!kea", name = "g", descriptor = "(I)Z")
	public abstract boolean method7554();

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method7557();
}
