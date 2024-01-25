import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class4_Sub2_Sub39 extends Class4_Sub2 {

	@OriginalMember(owner = "client!wp", name = "I", descriptor = "I")
	private int anInt10536;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(I)V")
	public Class4_Sub2_Sub39(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt10536 = 4096;
		this.anInt10536 = arg0;
	}

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub39() {
		this(4096);
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass135_41.method3011(arg0);
		if (super.aClass135_41.aBoolean278) {
			Static599.method3056(local9, 0, Static417.anInt5248, this.anInt10536);
		}
		return local9;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt10536 = (arg0.method7004() << 12) / 255;
		}
	}
}
