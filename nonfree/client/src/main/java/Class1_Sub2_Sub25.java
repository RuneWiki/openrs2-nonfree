import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class1_Sub2_Sub25 extends Class1_Sub2 {

	@OriginalMember(owner = "client!nl", name = "N", descriptor = "I")
	private int anInt3767;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub25() {
		this(4096);
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(I)V")
	private Class1_Sub2_Sub25(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt3767 = 4096;
		this.anInt3767 = arg0;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			Static319.method514(local16, 0, Static299.anInt5670, this.anInt3767);
		}
		return local16;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3767 = (arg0.method2595() << 12) / 255;
		}
	}
}
