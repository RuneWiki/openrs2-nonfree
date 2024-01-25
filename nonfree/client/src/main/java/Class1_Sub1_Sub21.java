import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class1_Sub1_Sub21 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lq", name = "N", descriptor = "I")
	private int anInt3804;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub21() {
		this(4096);
	}

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(I)V")
	public Class1_Sub1_Sub21(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt3804 = 4096;
		this.anInt3804 = arg0;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3804 = (arg1.method4463() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			Static459.method2113(local9, 0, Static434.anInt4326, this.anInt3804);
		}
		return local9;
	}
}
