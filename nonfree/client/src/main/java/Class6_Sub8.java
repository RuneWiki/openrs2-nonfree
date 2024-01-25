import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public abstract class Class6_Sub8 extends Class6 {

	@OriginalMember(owner = "client!qp", name = "k", descriptor = "I")
	public int anInt10800;

	@OriginalMember(owner = "client!qp", name = "l", descriptor = "Lclient!nt;")
	public Class6_Sub21 aClass6_Sub21_6;

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "Lclient!qp;")
	public Class6_Sub8 aClass6_Sub8_9;

	@OriginalMember(owner = "client!qp", name = "j", descriptor = "Z")
	public volatile boolean aBoolean744 = true;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
	public abstract void method9119(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "([III)V")
	public abstract void method9120(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "()Lclient!qp;")
	public abstract Class6_Sub8 method9121();

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "([III)V")
	protected final void method9122(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean744) {
			this.method9120(arg0, arg1, arg2);
		} else {
			this.method9119(arg2);
		}
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "()I")
	public int method9123() {
		return 255;
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "()Lclient!qp;")
	public abstract Class6_Sub8 method9124();

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "()I")
	public abstract int method9125();
}
