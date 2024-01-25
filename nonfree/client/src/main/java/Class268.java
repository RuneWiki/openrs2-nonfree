import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class268 {

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "Lclient!uu;")
	private Class164 aClass164_1 = null;

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
	private int anInt7886 = 0;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
	private int anInt7880 = 0;

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
	private int anInt7883 = 0;

	@OriginalMember(owner = "client!sl", name = "o", descriptor = "Lclient!mh;")
	private final Class4_Sub3 aClass4_Sub3_40;

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "Lclient!pda;")
	private final Class224 aClass224_5;

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "[Lclient!tb;")
	private final Class83[] aClass83Array1;

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "Lclient!ev;")
	public final Class83_Sub2 aClass83_Sub2_1;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!mh;)V")
	public Class268(@OriginalArg(0) Class4_Sub3 arg0) {
		this.aClass4_Sub3_40 = arg0;
		this.aClass224_5 = new Class224(arg0);
		this.aClass83Array1 = new Class83[10];
		this.aClass83Array1[1] = new Class83_Sub3(arg0);
		this.aClass83Array1[2] = new Class83_Sub9(arg0, this.aClass224_5);
		this.aClass83Array1[4] = new Class83_Sub5(arg0, this.aClass224_5);
		this.aClass83Array1[5] = new Class83_Sub7(arg0, this.aClass224_5);
		this.aClass83Array1[6] = new Class83_Sub4(arg0);
		this.aClass83Array1[7] = new Class83_Sub6(arg0);
		this.aClass83Array1[3] = this.aClass83_Sub2_1 = new Class83_Sub2(arg0);
		this.aClass83Array1[8] = new Class83_Sub8(arg0, this.aClass224_5);
		this.aClass83Array1[9] = new Class83_Sub1(arg0, this.aClass224_5);
		if (!this.aClass83Array1[8].method7930()) {
			this.aClass83Array1[8] = this.aClass83Array1[4];
		}
		if (!this.aClass83Array1[9].method7930()) {
			this.aClass83Array1[9] = this.aClass83Array1[8];
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)Z")
	public boolean method6964() {
		return this.aClass83Array1[3].method7930();
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILclient!uu;I)Z")
	public boolean method6966(@OriginalArg(1) Class164 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt7886 == 0) {
			return false;
		}
		if (arg0 != this.aClass164_1) {
			this.aClass83Array1[Integer.MAX_VALUE & this.anInt7886].method7922(arg1, arg0);
			this.aClass164_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBZIIZ)V")
	public void method6967(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(9) boolean local9 = arg1 & this.aClass4_Sub3_40.method7219();
		if (!local9 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			if (arg2 == 4) {
				arg0 = arg3;
			}
			arg2 = 2;
		}
		if (arg2 != 0 && arg4) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (this.anInt7886 != arg2) {
			if (this.anInt7886 != 0) {
				this.aClass83Array1[Integer.MAX_VALUE & this.anInt7886].method7925();
			}
			if (arg2 != 0) {
				this.aClass83Array1[Integer.MAX_VALUE & arg2].method7924(arg4);
				this.aClass83Array1[Integer.MAX_VALUE & arg2].method7927(arg4);
				this.aClass83Array1[Integer.MAX_VALUE & arg2].method7926(arg3, arg0);
			}
			this.aClass164_1 = null;
			this.anInt7883 = arg3;
			this.anInt7880 = arg0;
			this.anInt7886 = arg2;
		} else if (this.anInt7886 != 0) {
			this.aClass83Array1[Integer.MAX_VALUE & this.anInt7886].method7927(arg4);
			if (arg3 != this.anInt7883 || this.anInt7880 != arg0) {
				this.aClass83Array1[this.anInt7886 & Integer.MAX_VALUE].method7926(arg3, arg0);
				this.anInt7883 = arg3;
				this.anInt7880 = arg0;
			}
		}
	}
}
