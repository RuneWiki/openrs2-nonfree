import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class1_Sub4_Sub5 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
	private int anInt547;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(I)V")
	private Class1_Sub4_Sub5(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt547 = 4096;
		this.anInt547 = arg0;
	}

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub5() {
		this(4096);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(5) int[] local5 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			Static319.method1765(local5, 0, Static182.anInt3492, this.anInt547);
		}
		return local5;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt547 = (arg0.method1378() << 12) / 255;
		}
	}
}
