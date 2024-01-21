import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class3_Sub1_Sub36 extends Class3_Sub1 {

	@OriginalMember(owner = "client!vc", name = "db", descriptor = "I")
	private int anInt4076;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(I)V")
	private Class3_Sub1_Sub36(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt4076 = 4096;
		this.anInt4076 = arg0;
	}

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub36() {
		this(4096);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt4076 = (arg1.method1545() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			Static188.method2241(local9, 0, Static129.anInt3285, this.anInt4076);
		}
		return local9;
	}
}
