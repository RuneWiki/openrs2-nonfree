import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class1_Sub3_Sub5 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ci", name = "I", descriptor = "I")
	private int anInt1281;

	@OriginalMember(owner = "client!ci", name = "J", descriptor = "I")
	private int anInt1282;

	@OriginalMember(owner = "client!ci", name = "S", descriptor = "I")
	private int anInt1290;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(I)V")
	private Class1_Sub3_Sub5(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method954(arg0);
	}

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub5() {
		this(0);
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5538(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass144_41.method3947(arg0);
		if (super.aClass144_41.aBoolean415) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static153.anInt3378; local34++) {
				local24[local34] = this.anInt1290;
				local28[local34] = this.anInt1281;
				local32[local34] = this.anInt1282;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)V")
	private void method954(@OriginalArg(1) int arg0) {
		this.anInt1290 = arg0 >> 12 & 0xFF0;
		this.anInt1282 = (arg0 & 0xFF) << 4;
		this.anInt1281 = arg0 >> 4 & 0xFF0;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.method954(arg1.method4514());
		}
	}
}
