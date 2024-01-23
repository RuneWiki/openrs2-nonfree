import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public abstract class Class28 {

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
	public int anInt4140;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
	public int anInt4139;

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
	protected int anInt4144;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(III)V")
	protected Class28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4140 = arg1;
		this.anInt4139 = arg0;
		this.anInt4144 = arg2;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)V")
	public abstract void method2851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIZ)V")
	public abstract void method2853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIB)V")
	public abstract void method2857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
