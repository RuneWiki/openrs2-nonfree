import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public final class Class257 {

	@OriginalMember(owner = "client!pia", name = "c", descriptor = "I")
	public final int anInt8007;

	@OriginalMember(owner = "client!pia", name = "e", descriptor = "I")
	private final int anInt8009;

	@OriginalMember(owner = "client!pia", name = "<init>", descriptor = "(II)V")
	public Class257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8007 = arg1;
		this.anInt8009 = arg0;
	}

	@OriginalMember(owner = "client!pia", name = "c", descriptor = "(I)I")
	public int method6642() {
		return this.anInt8009;
	}

	@OriginalMember(owner = "client!pia", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
