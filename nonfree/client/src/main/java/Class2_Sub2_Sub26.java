import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class2_Sub2_Sub26 extends Class2_Sub2 {

	@OriginalMember(owner = "client!nf", name = "ab", descriptor = "I")
	private int anInt3362;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(I)V")
	private Class2_Sub2_Sub26(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt3362 = 4096;
		this.anInt3362 = arg0;
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub26() {
		this(4096);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			Static203.method2768(local12, 0, Static106.anInt3045, this.anInt3362);
		}
		return local12;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt3362 = (arg1.method218() << 12) / 255;
		}
	}
}
