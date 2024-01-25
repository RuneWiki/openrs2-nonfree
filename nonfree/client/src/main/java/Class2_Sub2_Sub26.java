import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class2_Sub2_Sub26 extends Class2_Sub2 {

	@OriginalMember(owner = "client!os", name = "L", descriptor = "I")
	private int anInt5490;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub26() {
		this(4096);
	}

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(I)V")
	public Class2_Sub2_Sub26(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt5490 = 4096;
		this.anInt5490 = arg0;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5490 = (arg0.method6138() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass234_41.method5375(arg0);
		if (super.aClass234_41.aBoolean454) {
			Static472.method5023(local9, 0, Static398.anInt6955, this.anInt5490);
		}
		return local9;
	}
}
