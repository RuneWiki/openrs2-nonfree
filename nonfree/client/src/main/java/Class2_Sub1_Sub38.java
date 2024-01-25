import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class2_Sub1_Sub38 extends Class2_Sub1 {

	@OriginalMember(owner = "client!vs", name = "K", descriptor = "I")
	private int anInt6891;

	@OriginalMember(owner = "client!vs", name = "M", descriptor = "I")
	private int anInt6892;

	@OriginalMember(owner = "client!vs", name = "R", descriptor = "I")
	private int anInt6897;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(I)V")
	private Class2_Sub1_Sub38(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method5962(arg0);
	}

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub38() {
		this(0);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.method5962(arg1.method5736());
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6060(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass26_41.method350(arg0);
		if (super.aClass26_41.aBoolean41) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static391.anInt7118; local34++) {
				local24[local34] = this.anInt6892;
				local28[local34] = this.anInt6891;
				local32[local34] = this.anInt6897;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(II)V")
	private void method5962(@OriginalArg(1) int arg0) {
		this.anInt6892 = arg0 >> 12 & 0xFF0;
		this.anInt6891 = arg0 >> 4 & 0xFF0;
		this.anInt6897 = (arg0 & 0xFF) << 4;
	}
}
