import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public abstract class Class53 {

	@OriginalMember(owner = "client!hha", name = "c", descriptor = "I")
	protected final int anInt9768;

	@OriginalMember(owner = "client!hha", name = "h", descriptor = "I")
	public final int anInt9772;

	@OriginalMember(owner = "client!hha", name = "b", descriptor = "I")
	public final int anInt9767;

	@OriginalMember(owner = "client!hha", name = "<init>", descriptor = "(III)V")
	protected Class53(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9768 = arg2;
		this.anInt9772 = arg1;
		this.anInt9767 = arg0;
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(ZII)V")
	public abstract void method8322(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(III)V")
	public abstract void method8328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!hha", name = "b", descriptor = "(III)V")
	public abstract void method8329(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
