import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jda")
public final class Class185 {

	@OriginalMember(owner = "client!jda", name = "h", descriptor = "I")
	private int anInt5083 = 0;

	@OriginalMember(owner = "client!jda", name = "p", descriptor = "I")
	private int anInt5085 = 0;

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "I")
	private int anInt5086 = 0;

	@OriginalMember(owner = "client!jda", name = "d", descriptor = "Lclient!ml;")
	private final Class75_Sub3 aClass75_Sub3_20;

	@OriginalMember(owner = "client!jda", name = "l", descriptor = "Lclient!au;")
	private final Class27 aClass27_3;

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "[Lclient!wk;")
	private final Class69[] aClass69Array1;

	@OriginalMember(owner = "client!jda", name = "m", descriptor = "Lclient!fg;")
	public final Class69_Sub4 aClass69_Sub4_1;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lclient!ml;)V")
	public Class185(@OriginalArg(0) Class75_Sub3 arg0) {
		this.aClass75_Sub3_20 = arg0;
		this.aClass27_3 = new Class27(arg0);
		this.aClass69Array1 = new Class69[10];
		this.aClass69Array1[1] = new Class69_Sub2(arg0);
		this.aClass69Array1[2] = new Class69_Sub9(arg0, this.aClass27_3);
		this.aClass69Array1[4] = new Class69_Sub5(arg0, this.aClass27_3);
		this.aClass69Array1[5] = new Class69_Sub6(arg0, this.aClass27_3);
		this.aClass69Array1[6] = new Class69_Sub1(arg0);
		this.aClass69Array1[7] = new Class69_Sub7(arg0);
		this.aClass69Array1[3] = this.aClass69_Sub4_1 = new Class69_Sub4(arg0);
		this.aClass69Array1[8] = new Class69_Sub3(arg0, this.aClass27_3);
		this.aClass69Array1[9] = new Class69_Sub8(arg0, this.aClass27_3);
		if (!this.aClass69Array1[8].method8637()) {
			this.aClass69Array1[8] = this.aClass69Array1[4];
		}
		if (!this.aClass69Array1[9].method8637()) {
			this.aClass69Array1[9] = this.aClass69Array1[8];
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(II)Z")
	public boolean method4636() {
		return this.aClass69Array1[3].method8637();
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IZZIII)V")
	public void method4637(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) boolean local5 = arg1 & this.aClass75_Sub3_20.method6633();
		if (!local5 && (arg3 == 4 || arg3 == 8 || arg3 == 9)) {
			if (arg3 == 4) {
				arg0 = arg4;
			}
			arg3 = 2;
		}
		if (arg3 != 0 && arg2) {
			arg3 |= Integer.MIN_VALUE;
		}
		if (arg3 != this.anInt5086) {
			if (this.anInt5086 != 0) {
				this.aClass69Array1[Integer.MAX_VALUE & this.anInt5086].method8638();
			}
			if (arg3 != 0) {
				this.aClass69Array1[Integer.MAX_VALUE & arg3].method8635(arg2);
				this.aClass69Array1[Integer.MAX_VALUE & arg3].method8632(arg2);
				this.aClass69Array1[Integer.MAX_VALUE & arg3].method8634(arg4, arg0);
			}
			this.anInt5085 = arg0;
			this.anInt5083 = arg4;
			this.anInt5086 = arg3;
		} else if (this.anInt5086 != 0) {
			this.aClass69Array1[this.anInt5086 & Integer.MAX_VALUE].method8632(arg2);
			if (arg4 != this.anInt5083 || arg0 != this.anInt5085) {
				this.aClass69Array1[Integer.MAX_VALUE & this.anInt5086].method8634(arg4, arg0);
				this.anInt5083 = arg4;
				this.anInt5085 = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILclient!ica;I)Z")
	public boolean method4641(@OriginalArg(1) Class44 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5086 == 0) {
			return false;
		} else {
			this.aClass69Array1[Integer.MAX_VALUE & this.anInt5086].method8631(arg1, arg0);
			return true;
		}
	}
}
