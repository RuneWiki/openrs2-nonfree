import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public abstract class Class185 {

	static {
		new Class231(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)[B")
	public abstract byte[] method4067();

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(I[B)V")
	public abstract void method4068(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(III)[B")
	public abstract byte[] method4071(@OriginalArg(0) int arg0);
}
