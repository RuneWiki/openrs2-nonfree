import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public abstract class Class9 {

	@OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
	protected final int anInt6022;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
	public final int anInt6015;

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "I")
	public final int anInt6017;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(III)V")
	protected Class9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6022 = arg2;
		this.anInt6015 = arg0;
		this.anInt6017 = arg1;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(III)V")
	public abstract void method4772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(III)V")
	public abstract void method4773(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIZ)V")
	public abstract void method4774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
