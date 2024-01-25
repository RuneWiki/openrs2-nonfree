import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class60 {

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
	private int anInt1579 = 0;

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
	private int anInt1580 = 0;

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "Lclient!ao;")
	private Class13 aClass13_1 = null;

	@OriginalMember(owner = "client!dv", name = "i", descriptor = "I")
	private int anInt1582 = 0;

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "Lclient!ht;")
	private final Class109_Sub1 aClass109_Sub1_8;

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "Lclient!go;")
	private final Class96 aClass96_1;

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "[Lclient!sc;")
	private final Class56[] aClass56Array1;

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "Lclient!rv;")
	public final Class56_Sub8 aClass56_Sub8_1;

	static {
		new Class84("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lclient!ht;)V")
	public Class60(@OriginalArg(0) Class109_Sub1 arg0) {
		this.aClass109_Sub1_8 = arg0;
		this.aClass96_1 = new Class96(arg0);
		this.aClass56Array1 = new Class56[10];
		this.aClass56Array1[1] = new Class56_Sub1(arg0);
		this.aClass56Array1[2] = new Class56_Sub3(arg0, this.aClass96_1);
		this.aClass56Array1[4] = new Class56_Sub9(arg0, this.aClass96_1);
		this.aClass56Array1[5] = new Class56_Sub2(arg0, this.aClass96_1);
		this.aClass56Array1[6] = new Class56_Sub7(arg0);
		this.aClass56Array1[7] = new Class56_Sub4(arg0);
		this.aClass56Array1[3] = this.aClass56_Sub8_1 = new Class56_Sub8(arg0);
		this.aClass56Array1[8] = new Class56_Sub6(arg0, this.aClass96_1);
		this.aClass56Array1[9] = new Class56_Sub5(arg0, this.aClass96_1);
		if (!this.aClass56Array1[8].method5085()) {
			this.aClass56Array1[8] = this.aClass56Array1[4];
		}
		if (!this.aClass56Array1[9].method5085()) {
			this.aClass56Array1[9] = this.aClass56Array1[8];
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)Z")
	public boolean method1382() {
		return this.aClass56Array1[3].method5085();
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!ao;BI)Z")
	public boolean method1383(@OriginalArg(0) Class13 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1579 == 0) {
			return false;
		}
		if (arg0 != this.aClass13_1) {
			this.aClass56Array1[Integer.MAX_VALUE & this.anInt1579].method5086(arg1, arg0);
			this.aClass13_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IZIZ)V")
	public void method1384(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) boolean local5 = arg2 & this.aClass109_Sub1_8.method4721();
		if (!local5 && (arg0 == 4 || arg0 == 8)) {
			arg0 = 2;
		}
		if (arg0 != 0 && arg1) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (arg0 != this.anInt1579) {
			if (this.anInt1579 != 0) {
				this.aClass56Array1[Integer.MAX_VALUE & this.anInt1579].method5084();
			}
			if (arg0 != 0) {
				this.aClass56Array1[Integer.MAX_VALUE & arg0].method5087(arg1);
				this.aClass56Array1[arg0 & Integer.MAX_VALUE].method5079(arg1);
			}
			this.aClass13_1 = null;
			this.anInt1579 = arg0;
			this.anInt1582 = Integer.MIN_VALUE;
			this.anInt1580 = Integer.MIN_VALUE;
		} else if (this.anInt1579 != 0) {
			this.aClass56Array1[Integer.MAX_VALUE & this.anInt1579].method5079(arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(III)V")
	public void method1385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 != this.anInt1580 | arg1 != this.anInt1582) & this.anInt1579 != 0) {
			this.aClass56Array1[Integer.MAX_VALUE & this.anInt1579].method5083(arg0, arg1);
			this.anInt1580 = arg0;
			this.anInt1582 = arg1;
		}
	}
}
