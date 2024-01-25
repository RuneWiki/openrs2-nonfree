import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public final class Class230 {

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "Lclient!bl;")
	private final Class28_Sub1 aClass28_Sub1_34;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "J")
	public final long aLong180;

	static {
		new Class231(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lclient!bl;J[Lclient!uh;)V")
	public Class230(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class243[] arg2) {
		this.aClass28_Sub1_34 = arg0;
		this.aLong180 = arg1;
	}

	@OriginalMember(owner = "client!sj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass28_Sub1_34.method647(this.aLong180);
		super.finalize();
	}
}
