import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public final class Class9 {

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
	public final int anInt226;

	static {
		new Class202(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V")
	public Class9(@OriginalArg(0) int arg0) {
		this.anInt226 = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
