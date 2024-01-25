import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public final class Class275 {

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
	public int anInt7884;

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "B")
	private byte aByte115;

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
	public int anInt7885;

	@OriginalMember(owner = "client!qu", name = "i", descriptor = "I")
	public int anInt7888;

	@OriginalMember(owner = "client!qu", name = "j", descriptor = "I")
	public int anInt7889;

	@OriginalMember(owner = "client!qu", name = "k", descriptor = "I")
	public int anInt7890;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V")
	public Class275() {
	}

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lclient!ie;)V")
	public Class275(@OriginalArg(0) Class3_Sub26 arg0) {
		this.aByte115 = arg0.method6825();
		this.anInt7885 = arg0.method6811();
		this.anInt7890 = arg0.method6816();
		this.anInt7884 = arg0.method6816();
		this.anInt7888 = arg0.method6816();
		this.anInt7889 = arg0.method6816();
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)I")
	public int method6188() {
		return this.aByte115 & 0x7;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)I")
	public int method6189() {
		return (this.aByte115 & 0x8) == 8 ? 1 : 0;
	}
}
