import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public abstract class Class42 {

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
	public final int anInt5253;

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
	public final int anInt5254;

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
	protected final int anInt5252;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(III)V")
	protected Class42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5253 = arg1;
		this.anInt5254 = arg0;
		this.anInt5252 = arg2;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZII)V")
	public abstract void method4691(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)V")
	public abstract void method4693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IBI)V")
	public abstract void method4694(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
