import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class5_Sub1_Sub35 extends Class5_Sub1 {

	@OriginalMember(owner = "client!va", name = "L", descriptor = "I")
	private int anInt3937;

	@OriginalMember(owner = "client!va", name = "O", descriptor = "I")
	private int anInt3940;

	@OriginalMember(owner = "client!va", name = "W", descriptor = "I")
	private int anInt3944;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub35() {
		this(0);
	}

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(I)V")
	private Class5_Sub1_Sub35(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2984(arg0);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)V")
	private void method2984(@OriginalArg(1) int arg0) {
		this.anInt3940 = arg0 >> 4 & 0xFF0;
		this.anInt3937 = arg0 >> 12 & 0xFF0;
		this.anInt3944 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3193(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass105_41.method3106(arg0);
		if (super.aClass105_41.aBoolean183) {
			@Pc(26) int[] local26 = local13[0];
			@Pc(30) int[] local30 = local13[2];
			@Pc(34) int[] local34 = local13[1];
			for (@Pc(36) int local36 = 0; local36 < Static174.anInt3489; local36++) {
				local26[local36] = this.anInt3937;
				local34[local36] = this.anInt3940;
				local30[local36] = this.anInt3944;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.method2984(arg0.method3072());
		}
	}
}
