import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lba")
public final class Class1_Sub1_Sub19 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lba", name = "F", descriptor = "I")
	private int anInt5354;

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub19() {
		this(4096);
	}

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(I)V")
	public Class1_Sub1_Sub19(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt5354 = 4096;
		this.anInt5354 = arg0;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			Static600.method3767(local9, 0, Static87.anInt1964, this.anInt5354);
		}
		return local9;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt5354 = (arg1.method4393() << 12) / 255;
		}
	}
}
