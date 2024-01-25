import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public abstract class Class104 {

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "[I")
	public static final int[] anIntArray705 = new int[16384];

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "[I")
	public static final int[] anIntArray706 = new int[16384];

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
	public final int anInt5807;

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
	public final int anInt5808;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
	protected final int anInt5806;

	static {
		@Pc(13) double local13 = 3.834951969714103E-4D;
		for (@Pc(15) int local15 = 0; local15 < 16384; local15++) {
			anIntArray705[local15] = (int) (Math.sin((double) local15 * local13) * 32768.0D);
			anIntArray706[local15] = (int) (Math.cos((double) local15 * local13) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(III)V")
	protected Class104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5807 = arg1;
		this.anInt5808 = arg0;
		this.anInt5806 = arg2;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZII)V")
	public abstract void method5079(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(III)V")
	public abstract void method5080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BII)V")
	public abstract void method5084(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
