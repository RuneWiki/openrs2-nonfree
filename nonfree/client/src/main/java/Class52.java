import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public abstract class Class52 {

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
	public final int anInt6838;

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
	protected final int anInt6842;

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
	public final int anInt6843;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(III)V")
	protected Class52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6838 = arg0;
		this.anInt6842 = arg2;
		this.anInt6843 = arg1;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IBI)V")
	public abstract void method5581(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)V")
	public abstract void method5584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZII)V")
	public abstract void method5586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
