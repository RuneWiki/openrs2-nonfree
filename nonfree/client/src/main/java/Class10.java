import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public abstract class Class10 {

	@OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
	public final int anInt7906;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
	public final int anInt7903;

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
	protected final int anInt7907;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(III)V")
	protected Class10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7906 = arg1;
		this.anInt7903 = arg0;
		this.anInt7907 = arg2;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(III)V")
	public abstract void method6568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(III)V")
	public abstract void method6570(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIB)V")
	public abstract void method6571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
