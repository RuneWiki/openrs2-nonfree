import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public abstract class Class71 {

	@OriginalMember(owner = "client!st", name = "d", descriptor = "[F")
	public static final float[] aFloatArray76 = new float[16384];

	@OriginalMember(owner = "client!st", name = "f", descriptor = "[F")
	public static final float[] aFloatArray77 = new float[16384];

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray76[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray77[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
	protected Class71() {
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)Z")
	public abstract boolean method7694();

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(I)V")
	public abstract void method7695();

	@OriginalMember(owner = "client!st", name = "c", descriptor = "(I)Z")
	protected abstract boolean method7696();

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(B)Z")
	protected abstract boolean method7699();

	@OriginalMember(owner = "client!st", name = "d", descriptor = "(I)V")
	public abstract void method7700();

	@OriginalMember(owner = "client!st", name = "e", descriptor = "(I)I")
	public abstract int method7701();

	@OriginalMember(owner = "client!st", name = "f", descriptor = "(I)I")
	public abstract int method7702();

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Z)Lclient!wi;")
	public abstract Class6_Sub15 method7703();

	@OriginalMember(owner = "client!st", name = "g", descriptor = "(I)Z")
	public final boolean method7705() {
		return this.method7694() || this.method7696() || this.method7699();
	}
}
