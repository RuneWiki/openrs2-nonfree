import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public final class Class154 {

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "Lclient!lc;")
	private final Class171 aClass171_5;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
	public final int anInt4311;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
	private final int anInt4314;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
	public final int anInt4308;

	static {
		new Class202(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(IILclient!lc;)V")
	public Class154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_5 = arg2;
		this.anInt4311 = arg0;
		this.anInt4314 = arg1;
		this.anInt4308 = this.aClass171_5.anInt4927 * this.anInt4314;
		if (this.anInt4311 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
