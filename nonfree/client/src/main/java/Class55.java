import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public abstract class Class55 {

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
	protected final int anInt7557;

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
	public final int anInt7555;

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
	public final int anInt7553;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(III)V")
	protected Class55(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7557 = arg2;
		this.anInt7555 = arg1;
		this.anInt7553 = arg0;
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(III)V")
	public abstract void method6527(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)V")
	public abstract void method6528(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IBI)V")
	public abstract void method6532(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
