import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uaa")
public final class Class288 {

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "Lclient!ea;")
	private Class73 aClass73_1 = null;

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "I")
	private int anInt7983 = 0;

	@OriginalMember(owner = "client!uaa", name = "l", descriptor = "I")
	private int anInt7989 = 0;

	@OriginalMember(owner = "client!uaa", name = "j", descriptor = "I")
	private int anInt7988 = 0;

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "Lclient!uq;")
	private final Class122_Sub3 aClass122_Sub3_39;

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "Lclient!ln;")
	private final Class184 aClass184_6;

	@OriginalMember(owner = "client!uaa", name = "k", descriptor = "[Lclient!dt;")
	private final Class13[] aClass13Array1;

	@OriginalMember(owner = "client!uaa", name = "g", descriptor = "Lclient!uk;")
	public final Class13_Sub9 aClass13_Sub9_1;

	static {
		new Class306("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lclient!uq;)V")
	public Class288(@OriginalArg(0) Class122_Sub3 arg0) {
		this.aClass122_Sub3_39 = arg0;
		this.aClass184_6 = new Class184(arg0);
		this.aClass13Array1 = new Class13[10];
		this.aClass13Array1[1] = new Class13_Sub1(arg0);
		this.aClass13Array1[2] = new Class13_Sub5(arg0, this.aClass184_6);
		this.aClass13Array1[4] = new Class13_Sub8(arg0, this.aClass184_6);
		this.aClass13Array1[5] = new Class13_Sub3(arg0, this.aClass184_6);
		this.aClass13Array1[6] = new Class13_Sub6(arg0);
		this.aClass13Array1[7] = new Class13_Sub2(arg0);
		this.aClass13Array1[3] = this.aClass13_Sub9_1 = new Class13_Sub9(arg0);
		this.aClass13Array1[8] = new Class13_Sub4(arg0, this.aClass184_6);
		this.aClass13Array1[9] = new Class13_Sub7(arg0, this.aClass184_6);
		if (!this.aClass13Array1[8].method6732()) {
			this.aClass13Array1[8] = this.aClass13Array1[4];
		}
		if (!this.aClass13Array1[9].method6732()) {
			this.aClass13Array1[9] = this.aClass13Array1[8];
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)Z")
	public boolean method6621() {
		return this.aClass13Array1[3].method6732();
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BILclient!ea;)Z")
	public boolean method6622(@OriginalArg(1) int arg0, @OriginalArg(2) Class73 arg1) {
		if (this.anInt7989 == 0) {
			return false;
		}
		if (this.aClass73_1 != arg1) {
			this.aClass13Array1[this.anInt7989 & Integer.MAX_VALUE].method6729(arg1, arg0);
			this.aClass73_1 = arg1;
		}
		return true;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZBZIII)V")
	public void method6623(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) boolean local5 = arg0 & this.aClass122_Sub3_39.method7221();
		if (!local5 && (arg3 == 4 || arg3 == 8 || arg3 == 9)) {
			if (arg3 == 4) {
				arg2 = arg4;
			}
			arg3 = 2;
		}
		if (arg3 != 0 && arg1) {
			arg3 |= Integer.MIN_VALUE;
		}
		if (this.anInt7989 != arg3) {
			if (this.anInt7989 != 0) {
				this.aClass13Array1[this.anInt7989 & Integer.MAX_VALUE].method6728();
			}
			if (arg3 != 0) {
				this.aClass13Array1[arg3 & Integer.MAX_VALUE].method6727(arg1);
				this.aClass13Array1[Integer.MAX_VALUE & arg3].method6731(arg1);
				this.aClass13Array1[arg3 & Integer.MAX_VALUE].method6730(arg4, arg2);
			}
			this.aClass73_1 = null;
			this.anInt7983 = arg2;
			this.anInt7989 = arg3;
			this.anInt7988 = arg4;
		} else if (this.anInt7989 != 0) {
			this.aClass13Array1[Integer.MAX_VALUE & this.anInt7989].method6731(arg1);
			if (this.anInt7988 != arg4 || this.anInt7983 != arg2) {
				this.aClass13Array1[Integer.MAX_VALUE & this.anInt7989].method6730(arg4, arg2);
				this.anInt7988 = arg4;
				this.anInt7983 = arg2;
			}
		}
	}
}
