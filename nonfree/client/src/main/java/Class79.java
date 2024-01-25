import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public abstract class Class79 {

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
	public final int anInt9202;

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
	public final int anInt9201;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
	protected final int anInt9200;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(III)V")
	protected Class79(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9202 = arg1;
		this.anInt9201 = arg0;
		this.anInt9200 = arg2;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IBI)V")
	public abstract void method7540(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V")
	public abstract void method7541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZII)V")
	public abstract void method7543(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
