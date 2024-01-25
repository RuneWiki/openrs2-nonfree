import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class6_Sub4_Sub7 extends Class6_Sub4 {

	@OriginalMember(owner = "client!eu", name = "F", descriptor = "I")
	private int anInt2650;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(I)V")
	public Class6_Sub4_Sub7(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt2650 = 4096;
		this.anInt2650 = arg0;
	}

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub7() {
		this(4096);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt2650 = (arg1.method8604() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8323(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass372_41.method8736(arg0);
		if (super.aClass372_41.aBoolean691) {
			Static655.method5835(local16, 0, Static6.anInt111, this.anInt2650);
		}
		return local16;
	}
}
