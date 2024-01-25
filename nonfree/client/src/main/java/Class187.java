import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public abstract class Class187 {

	@OriginalMember(owner = "client!nu", name = "f", descriptor = "I")
	public final int anInt8301;

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "I")
	public final int anInt8298;

	@OriginalMember(owner = "client!nu", name = "i", descriptor = "I")
	protected final int anInt8303;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(III)V")
	protected Class187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8301 = arg0;
		this.anInt8298 = arg1;
		this.anInt8303 = arg2;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)V")
	public abstract void method6715(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(III)V")
	public abstract void method6716(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "(III)V")
	public abstract void method6720(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
