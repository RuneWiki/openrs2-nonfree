import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public abstract class Class125 {

	@OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
	public final int anInt10751;

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
	protected final int anInt10752;

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "I")
	public final int anInt10754;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(III)V")
	protected Class125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt10751 = arg1;
		this.anInt10752 = arg2;
		this.anInt10754 = arg0;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIB)V")
	public abstract void method9258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZII)V")
	public abstract void method9263(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)V")
	public abstract void method9264(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
