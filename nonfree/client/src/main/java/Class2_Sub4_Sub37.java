import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class2_Sub4_Sub37 extends Class2_Sub4 {

	@OriginalMember(owner = "client!va", name = "U", descriptor = "I")
	private int anInt5994;

	static {
		new Class32("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
	}

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(I)V")
	public Class2_Sub4_Sub37(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt5994 = 4096;
		this.anInt5994 = arg0;
	}

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub37() {
		this(4096);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass237_41.method5430(arg0);
		if (super.aClass237_41.aBoolean441) {
			Static399.method2490(local9, 0, Static76.anInt1458, this.anInt5994);
		}
		return local9;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5994 = (arg0.method5350() << 12) / 255;
		}
	}
}
