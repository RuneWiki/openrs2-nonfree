import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public final class Class10_Sub24 extends Class10 {

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "S")
	public short aShort62;

	static {
		new Class182("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
	private Class10_Sub24() {
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(S)V")
	public Class10_Sub24(@OriginalArg(0) short arg0) {
		this.aShort62 = arg0;
	}
}
