import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class Class3 {

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
	public int anInt126;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
	public int anInt127;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZI)V")
	public abstract void method142(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIB)V")
	public abstract void method143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)V")
	public abstract void method145(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
