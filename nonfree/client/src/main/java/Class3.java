import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class Class3 {

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
	protected final int anInt10308;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
	public final int anInt10310;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
	public final int anInt10311;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(III)V")
	protected Class3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt10308 = arg2;
		this.anInt10310 = arg1;
		this.anInt10311 = arg0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBI)V")
	public abstract void method8589(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
	public abstract void method8593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZII)V")
	public abstract void method8595(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
