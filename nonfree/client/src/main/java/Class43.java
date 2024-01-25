import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class43 {

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
	private int anInt1216 = 0;

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
	private int anInt1219 = 0;

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
	private int anInt1221 = 0;

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "Lclient!kk;")
	private Class8 aClass8_1 = null;

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "Lclient!ih;")
	private final Class106_Sub2 aClass106_Sub2_9;

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "Lclient!jq;")
	private final Class135 aClass135_1;

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "[Lclient!vo;")
	private final Class100[] aClass100Array1;

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "Lclient!wo;")
	public final Class100_Sub8 aClass100_Sub8_1;

	static {
		new Class158("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class43(@OriginalArg(0) Class106_Sub2 arg0) {
		this.aClass106_Sub2_9 = arg0;
		this.aClass135_1 = new Class135(arg0);
		this.aClass100Array1 = new Class100[10];
		this.aClass100Array1[1] = new Class100_Sub1(arg0);
		this.aClass100Array1[2] = new Class100_Sub3(arg0, this.aClass135_1);
		this.aClass100Array1[4] = new Class100_Sub9(arg0, this.aClass135_1);
		this.aClass100Array1[5] = new Class100_Sub2(arg0, this.aClass135_1);
		this.aClass100Array1[6] = new Class100_Sub4(arg0);
		this.aClass100Array1[7] = new Class100_Sub5(arg0);
		this.aClass100Array1[3] = this.aClass100_Sub8_1 = new Class100_Sub8(arg0);
		this.aClass100Array1[8] = new Class100_Sub6(arg0, this.aClass135_1);
		this.aClass100Array1[9] = new Class100_Sub7(arg0, this.aClass135_1);
		if (!this.aClass100Array1[8].method6157()) {
			this.aClass100Array1[8] = this.aClass100Array1[4];
		}
		if (!this.aClass100Array1[9].method6157()) {
			this.aClass100Array1[9] = this.aClass100Array1[8];
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!kk;IB)Z")
	public boolean method923(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt1221 == 0) {
			return false;
		}
		if (this.aClass8_1 != arg0) {
			this.aClass100Array1[Integer.MAX_VALUE & this.anInt1221].method6159(arg1, arg0);
			this.aClass8_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)Z")
	public boolean method924() {
		return this.aClass100Array1[3].method6157();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZIIIZ)V")
	public void method925(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(13) boolean local13 = arg4 & this.aClass106_Sub2_9.method5973();
		if (!local13 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			if (arg0 == 4) {
				arg3 = arg2;
			}
			arg0 = 2;
		}
		if (arg0 != 0 && arg1) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (arg0 != this.anInt1221) {
			if (this.anInt1221 != 0) {
				this.aClass100Array1[Integer.MAX_VALUE & this.anInt1221].method6160();
			}
			if (arg0 != 0) {
				this.aClass100Array1[Integer.MAX_VALUE & arg0].method6154(arg1);
				this.aClass100Array1[arg0 & Integer.MAX_VALUE].method6155(arg1);
				this.aClass100Array1[arg0 & Integer.MAX_VALUE].method6153(arg3, arg2);
			}
			this.anInt1219 = arg3;
			this.anInt1221 = arg0;
			this.anInt1216 = arg2;
			this.aClass8_1 = null;
		} else if (this.anInt1221 != 0) {
			this.aClass100Array1[Integer.MAX_VALUE & this.anInt1221].method6155(arg1);
			if (arg2 != this.anInt1216 || arg3 != this.anInt1219) {
				this.aClass100Array1[Integer.MAX_VALUE & this.anInt1221].method6153(arg3, arg2);
				this.anInt1219 = arg3;
				this.anInt1216 = arg2;
			}
			return;
		}
	}
}
