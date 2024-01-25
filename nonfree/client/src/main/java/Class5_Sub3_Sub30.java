import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class5_Sub3_Sub30 extends Class5_Sub3 {

	@OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
	private int anInt5331;

	static {
		new Class85("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
		new Class85("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(I)V")
	public Class5_Sub3_Sub30(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt5331 = 4096;
		this.anInt5331 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub30() {
		this(4096);
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			Static368.method5428(local9, 0, Static7.anInt129, this.anInt5331);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5331 = (arg0.method5115() << 12) / 255;
		}
	}
}
