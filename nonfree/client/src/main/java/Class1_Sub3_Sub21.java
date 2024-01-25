import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class1_Sub3_Sub21 extends Class1_Sub3 {

	@OriginalMember(owner = "client!mb", name = "I", descriptor = "I")
	private int anInt4332;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I)V")
	public Class1_Sub3_Sub21(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt4332 = 4096;
		this.anInt4332 = arg0;
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub21() {
		this(4096);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4332 = (arg0.method4130() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			Static460.method4215(local16, 0, Static347.anInt5974, this.anInt4332);
		}
		return local16;
	}
}
