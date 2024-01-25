import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class6_Sub8_Sub30 extends Class6_Sub8 {

	@OriginalMember(owner = "client!qr", name = "H", descriptor = "I")
	private int anInt8429;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(I)V")
	public Class6_Sub8_Sub30(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt8429 = 4096;
		this.anInt8429 = arg0;
	}

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub30() {
		this(4096);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt8429 = (arg1.method3030() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			Static695.method5644(local9, 0, Static83.anInt1268, this.anInt8429);
		}
		return local9;
	}
}
