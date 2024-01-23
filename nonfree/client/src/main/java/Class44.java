import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class44 {

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
	public int anInt2071;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
	public int anInt2072;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
	public int anInt2073;

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
	public int anInt2074;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
	public Class44() {
	}

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!ie;)V")
	public Class44(@OriginalArg(0) Class44 arg0) {
		this.anInt2072 = arg0.anInt2072;
		this.anInt2071 = arg0.anInt2071;
		this.anInt2074 = arg0.anInt2074;
		this.anInt2073 = arg0.anInt2073;
	}
}
