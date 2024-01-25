import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public abstract class Class77 {

	@OriginalMember(owner = "client!so", name = "d", descriptor = "I")
	public final int anInt6157;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "I")
	protected final int anInt6154;

	@OriginalMember(owner = "client!so", name = "b", descriptor = "I")
	public final int anInt6155;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(III)V")
	protected Class77(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6157 = arg1;
		this.anInt6154 = arg2;
		this.anInt6155 = arg0;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IBI)V")
	public abstract void method5253(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIB)V")
	public abstract void method5254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(IBI)V")
	public abstract void method5256(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
