import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class216 {

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "I")
	public int anInt5840;

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "J")
	public long aLong174;

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
	private int anInt5841;

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
	public int anInt5843;

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "I")
	public int anInt5846;

	@OriginalMember(owner = "client!rp", name = "l", descriptor = "I")
	public int anInt5848;

	@OriginalMember(owner = "client!rp", name = "n", descriptor = "I")
	public int anInt5850;

	@OriginalMember(owner = "client!rp", name = "o", descriptor = "I")
	public int anInt5851;

	@OriginalMember(owner = "client!rp", name = "q", descriptor = "I")
	public int anInt5853;

	@OriginalMember(owner = "client!rp", name = "t", descriptor = "I")
	public int anInt5856;

	@OriginalMember(owner = "client!rp", name = "u", descriptor = "I")
	public int anInt5857;

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
	public int anInt5845 = 0;

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "Z")
	private boolean aBoolean487 = false;

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
	public int anInt5844 = 0;

	static {
		new Class151("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
		new Class151("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!dh;IB)V")
	private void method4546(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5841 = arg0.method4485();
		} else if (arg1 == 2) {
			arg0.method4463();
		} else if (arg1 == 3) {
			this.anInt5851 = arg0.method4487();
			this.anInt5848 = arg0.method4487();
			this.anInt5853 = arg0.method4487();
		} else if (arg1 == 4) {
			this.anInt5850 = arg0.method4463();
			this.anInt5856 = arg0.method4487();
		} else if (arg1 == 6) {
			this.anInt5843 = arg0.method4463();
		} else if (arg1 == 8) {
			this.anInt5845 = 1;
		} else if (arg1 == 9) {
			this.anInt5844 = 1;
		} else if (arg1 == 10) {
			this.aBoolean487 = true;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Z)V")
	public void method4547() {
		this.anInt5846 = Class1_Sub1_Sub25.anIntArray248[this.anInt5841 << 3];
		this.anInt5840 = (int) Math.sqrt((double) (this.anInt5851 * this.anInt5851 + this.anInt5848 * this.anInt5848 + this.anInt5853 * this.anInt5853));
		if (this.anInt5856 == 0) {
			this.anInt5856 = 1;
		}
		if (this.anInt5850 == 0) {
			this.aLong174 = 2147483647L;
		} else if (this.anInt5850 == 1) {
			this.aLong174 = this.anInt5840 * 8 / this.anInt5856;
			this.aLong174 *= this.aLong174;
		} else if (this.anInt5850 == 2) {
			this.aLong174 = this.anInt5840 * 8 / this.anInt5856;
		}
		if (this.aBoolean487) {
			this.anInt5840 *= -1;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!dh;B)V")
	public void method4551(@OriginalArg(0) Class1_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4463();
			if (local9 == 0) {
				return;
			}
			this.method4546(arg0, local9);
		}
	}
}
