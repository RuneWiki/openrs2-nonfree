import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public abstract class Class116 {

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
	public final int anInt7709;

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
	public final int anInt7706;

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
	protected final int anInt7710;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(III)V")
	protected Class116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7709 = arg0;
		this.anInt7706 = arg1;
		this.anInt7710 = arg2;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZII)V")
	public abstract void method6462(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IBI)V")
	public abstract void method6465(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(IBI)V")
	public abstract void method6467(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
