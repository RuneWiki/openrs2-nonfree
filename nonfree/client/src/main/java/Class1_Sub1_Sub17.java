import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class1_Sub1_Sub17 extends Class1_Sub1 {

	@OriginalMember(owner = "client!kd", name = "kb", descriptor = "I")
	private int anInt2394;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub17(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt2394 = 4096;
		this.anInt2394 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub17() {
		this(4096);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2394 = (arg0.method3793() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			Static233.method869(local9, 0, Static157.anInt3431, this.anInt2394);
		}
		return local9;
	}
}
