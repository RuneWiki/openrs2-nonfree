import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class318 {

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
	private int anInt9358 = 0;

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
	private int anInt9359 = 0;

	@OriginalMember(owner = "client!wr", name = "g", descriptor = "Lclient!baa;")
	private Class19 aClass19_1 = null;

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
	private int anInt9361 = 0;

	@OriginalMember(owner = "client!wr", name = "i", descriptor = "Lclient!os;")
	private final Class39_Sub3 aClass39_Sub3_43;

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "Lclient!km;")
	private final Class162 aClass162_6;

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "[Lclient!fq;")
	private final Class93[] aClass93Array1;

	@OriginalMember(owner = "client!wr", name = "j", descriptor = "Lclient!gh;")
	public final Class93_Sub2 aClass93_Sub2_1;

	static {
		new Class202("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!os;)V")
	public Class318(@OriginalArg(0) Class39_Sub3 arg0) {
		this.aClass39_Sub3_43 = arg0;
		this.aClass162_6 = new Class162(arg0);
		this.aClass93Array1 = new Class93[10];
		this.aClass93Array1[1] = new Class93_Sub1(arg0);
		this.aClass93Array1[2] = new Class93_Sub3(arg0, this.aClass162_6);
		this.aClass93Array1[4] = new Class93_Sub9(arg0, this.aClass162_6);
		this.aClass93Array1[5] = new Class93_Sub5(arg0, this.aClass162_6);
		this.aClass93Array1[6] = new Class93_Sub4(arg0);
		this.aClass93Array1[7] = new Class93_Sub6(arg0);
		this.aClass93Array1[3] = this.aClass93_Sub2_1 = new Class93_Sub2(arg0);
		this.aClass93Array1[8] = new Class93_Sub7(arg0, this.aClass162_6);
		this.aClass93Array1[9] = new Class93_Sub8(arg0, this.aClass162_6);
		if (!this.aClass93Array1[8].method7490()) {
			this.aClass93Array1[8] = this.aClass93Array1[4];
		}
		if (!this.aClass93Array1[9].method7490()) {
			this.aClass93Array1[9] = this.aClass93Array1[8];
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lclient!baa;IB)Z")
	public boolean method7782(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt9358 == 0) {
			return false;
		}
		if (arg0 != this.aClass19_1) {
			this.aClass93Array1[Integer.MAX_VALUE & this.anInt9358].method7495(arg0, arg1);
			this.aClass19_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BI)Z")
	public boolean method7783() {
		return this.aClass93Array1[3].method7490();
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IZIIIZ)V")
	public void method7784(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(9) boolean local9 = arg1 & this.aClass39_Sub3_43.method6073();
		if (!local9 && (arg3 == 4 || arg3 == 8 || arg3 == 9)) {
			if (arg3 == 4) {
				arg0 = arg2;
			}
			arg3 = 2;
		}
		if (arg3 != 0 && arg4) {
			arg3 |= Integer.MIN_VALUE;
		}
		if (this.anInt9358 != arg3) {
			if (this.anInt9358 != 0) {
				this.aClass93Array1[Integer.MAX_VALUE & this.anInt9358].method7494();
			}
			if (arg3 != 0) {
				this.aClass93Array1[arg3 & Integer.MAX_VALUE].method7489(arg4);
				this.aClass93Array1[Integer.MAX_VALUE & arg3].method7493(arg4);
				this.aClass93Array1[arg3 & Integer.MAX_VALUE].method7496(arg2, arg0);
			}
			this.anInt9359 = arg0;
			this.anInt9358 = arg3;
			this.anInt9361 = arg2;
			this.aClass19_1 = null;
		} else if (this.anInt9358 != 0) {
			this.aClass93Array1[this.anInt9358 & Integer.MAX_VALUE].method7493(arg4);
			if (this.anInt9361 != arg2 || arg0 != this.anInt9359) {
				this.aClass93Array1[this.anInt9358 & Integer.MAX_VALUE].method7496(arg2, arg0);
				this.anInt9359 = arg0;
				this.anInt9361 = arg2;
			}
		}
	}
}
