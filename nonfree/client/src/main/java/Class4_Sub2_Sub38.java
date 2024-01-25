import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class4_Sub2_Sub38 extends Class4_Sub2 {

	@OriginalMember(owner = "client!wm", name = "K", descriptor = "I")
	private int anInt10501;

	@OriginalMember(owner = "client!wm", name = "N", descriptor = "I")
	private int anInt10503;

	@OriginalMember(owner = "client!wm", name = "O", descriptor = "I")
	private int anInt10504;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(I)V")
	private Class4_Sub2_Sub38(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method8187(arg0);
	}

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub38() {
		this(0);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.method8187(arg0.method7013());
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8201(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass64_41.method1614(arg0);
		if (super.aClass64_41.aBoolean154) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static417.anInt5248; local34++) {
				local24[local34] = this.anInt10501;
				local28[local34] = this.anInt10504;
				local32[local34] = this.anInt10503;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(II)V")
	private void method8187(@OriginalArg(1) int arg0) {
		this.anInt10501 = arg0 >> 12 & 0xFF0;
		this.anInt10504 = arg0 >> 4 & 0xFF0;
		this.anInt10503 = (arg0 & 0xFF) << 4;
	}
}
