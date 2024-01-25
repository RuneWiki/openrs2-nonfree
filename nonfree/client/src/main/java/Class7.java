import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class Class7 {

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Lclient!pp;")
	protected final Class6_Sub44 aClass6_Sub44_34;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
	protected int anInt10186;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!pp;)V")
	public Class7(@OriginalArg(0) Class6_Sub44 arg0) {
		this.aClass6_Sub44_34 = arg0;
		this.anInt10186 = this.method8782();
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(ILclient!pp;)V")
	public Class7(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub44 arg1) {
		this.anInt10186 = arg0;
		this.aClass6_Sub44_34 = arg1;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)V")
	public final void method8781(@OriginalArg(0) int arg0) {
		if (this.method8786(arg0) != 3) {
			this.method8783(arg0);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)I")
	protected abstract int method8782();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
	protected abstract void method8783(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	public abstract void method8785();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)I")
	public abstract int method8786(@OriginalArg(1) int arg0);
}
