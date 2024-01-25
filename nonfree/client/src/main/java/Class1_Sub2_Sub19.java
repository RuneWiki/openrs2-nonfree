import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class1_Sub2_Sub19 extends Class1_Sub2 {

	@OriginalMember(owner = "client!jr", name = "G", descriptor = "I")
	private int anInt3107;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(I)V")
	public Class1_Sub2_Sub19(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt3107 = 4096;
		this.anInt3107 = arg0;
	}

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub19() {
		this(4096);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt3107 = (arg1.method3141() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			Static367.method5379(local14, 0, Static251.anInt6509, this.anInt3107);
		}
		return local14;
	}
}
