import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public final class Class384 {

	@OriginalMember(owner = "client!wga", name = "g", descriptor = "I")
	private final int anInt10636;

	@OriginalMember(owner = "client!wga", name = "b", descriptor = "Lclient!pj;")
	private final Class278 aClass278_20;

	@OriginalMember(owner = "client!wga", name = "m", descriptor = "I")
	public final int anInt10631;

	@OriginalMember(owner = "client!wga", name = "d", descriptor = "I")
	public final int anInt10632;

	@OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(IILclient!pj;)V")
	public Class384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class278 arg2) {
		this.anInt10636 = arg1;
		this.aClass278_20 = arg2;
		this.anInt10631 = arg0;
		this.anInt10632 = this.aClass278_20.anInt7757 * this.anInt10636;
		if (this.anInt10631 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wga", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
