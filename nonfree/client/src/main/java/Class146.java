import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public final class Class146 {

	@OriginalMember(owner = "client!hda", name = "d", descriptor = "I")
	public final int anInt4453;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class146(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4453 = arg1;
	}

	@OriginalMember(owner = "client!hda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Z)I")
	public int method3648() {
		return this.anInt4453;
	}
}
