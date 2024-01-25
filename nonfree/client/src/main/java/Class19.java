import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public abstract class Class19 {

	@OriginalMember(owner = "client!us", name = "d", descriptor = "I")
	public final int anInt8861;

	@OriginalMember(owner = "client!us", name = "b", descriptor = "I")
	protected final int anInt8860;

	@OriginalMember(owner = "client!us", name = "g", descriptor = "I")
	public final int anInt8864;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(III)V")
	protected Class19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8861 = arg1;
		this.anInt8860 = arg2;
		this.anInt8864 = arg0;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IZI)V")
	public abstract void method7060(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(III)V")
	public abstract void method7064(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIZ)V")
	public abstract void method7066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
