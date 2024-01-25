import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public abstract class Class21 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "[I")
	public static final int[] anIntArray655 = new int[16384];

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "[I")
	public static final int[] anIntArray656 = new int[16384];

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "Lclient!gp;")
	protected final Class3_Sub27 aClass3_Sub27_31;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
	protected int anInt10079;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray656[local9] = (int) (Math.sin((double) local9 * local7) * 16384.0D);
			anIntArray655[local9] = (int) (Math.cos((double) local9 * local7) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!gp;)V")
	public Class21(@OriginalArg(0) Class3_Sub27 arg0) {
		this.aClass3_Sub27_31 = arg0;
		this.anInt10079 = this.method8636();
	}

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(ILclient!gp;)V")
	public Class21(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub27 arg1) {
		this.aClass3_Sub27_31 = arg1;
		this.anInt10079 = arg0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)V")
	protected abstract void method8634(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)I")
	public abstract int method8635(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)I")
	protected abstract int method8636();

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)V")
	public abstract void method8639();

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V")
	public final void method8641(@OriginalArg(1) int arg0) {
		if (this.method8635(arg0) != 3) {
			this.method8634(arg0);
		}
	}
}
