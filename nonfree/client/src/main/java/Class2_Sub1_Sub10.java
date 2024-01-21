import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class2_Sub1_Sub10 extends Class2_Sub1 {

	@OriginalMember(owner = "client!fh", name = "lb", descriptor = "I")
	private int anInt1346;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(I)V")
	private Class2_Sub1_Sub10(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt1346 = 4096;
		this.anInt1346 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub10() {
		this(4096);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1346 = (arg0.method2387() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(5) int[] local5 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			Static186.method1562(local5, 0, Static129.anInt3118, this.anInt1346);
		}
		return local5;
	}
}
