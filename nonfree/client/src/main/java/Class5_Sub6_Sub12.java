import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class5_Sub6_Sub12 extends Class5_Sub6 {

	@OriginalMember(owner = "client!eu", name = "H", descriptor = "I")
	private int anInt2381;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(I)V")
	public Class5_Sub6_Sub12(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt2381 = 4096;
		this.anInt2381 = arg0;
	}

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub12() {
		this(4096);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass296_41.method7185(arg0);
		if (super.aClass296_41.aBoolean614) {
			Static685.method8333(local15, 0, Static421.anInt7443, this.anInt2381);
		}
		return local15;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2381 = (arg0.method3642() << 12) / 255;
		}
	}
}
