import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public final class Class124 {

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
	public final int anInt3998;

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "Lclient!ig;")
	private final Class152 aClass152_4;

	@OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
	private final int anInt4001;

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
	public final int anInt3996;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(IILclient!ig;)V")
	public Class124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class152 arg2) {
		this.anInt3998 = arg0;
		this.aClass152_4 = arg2;
		this.anInt4001 = arg1;
		this.anInt3996 = this.anInt4001 * this.aClass152_4.anInt4478;
		if (this.anInt3998 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
