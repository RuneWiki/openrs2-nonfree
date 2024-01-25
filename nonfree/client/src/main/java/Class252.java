import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class252 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
	private int anInt7413 = 0;

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
	private int anInt7416 = 0;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "Lclient!aba;")
	private Class4 aClass4_1 = null;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
	private int anInt7418 = 0;

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "Lclient!jj;")
	private final Class62_Sub3 aClass62_Sub3_33;

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "Lclient!lm;")
	private final Class188 aClass188_4;

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "[Lclient!iq;")
	private final Class44[] aClass44Array1;

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "Lclient!cc;")
	public final Class44_Sub1 aClass44_Sub1_1;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class252(@OriginalArg(0) Class62_Sub3 arg0) {
		this.aClass62_Sub3_33 = arg0;
		this.aClass188_4 = new Class188(arg0);
		this.aClass44Array1 = new Class44[10];
		this.aClass44Array1[1] = new Class44_Sub3(arg0);
		this.aClass44Array1[2] = new Class44_Sub6(arg0, this.aClass188_4);
		this.aClass44Array1[4] = new Class44_Sub8(arg0, this.aClass188_4);
		this.aClass44Array1[5] = new Class44_Sub2(arg0, this.aClass188_4);
		this.aClass44Array1[6] = new Class44_Sub5(arg0);
		this.aClass44Array1[7] = new Class44_Sub7(arg0);
		this.aClass44Array1[3] = this.aClass44_Sub1_1 = new Class44_Sub1(arg0);
		this.aClass44Array1[8] = new Class44_Sub4(arg0, this.aClass188_4);
		this.aClass44Array1[9] = new Class44_Sub9(arg0, this.aClass188_4);
		if (!this.aClass44Array1[8].method7281()) {
			this.aClass44Array1[8] = this.aClass44Array1[4];
		}
		if (!this.aClass44Array1[9].method7281()) {
			this.aClass44Array1[9] = this.aClass44Array1[8];
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!aba;B)Z")
	public boolean method6028(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1) {
		if (this.anInt7413 == 0) {
			return false;
		}
		if (arg1 != this.aClass4_1) {
			this.aClass44Array1[Integer.MAX_VALUE & this.anInt7413].method7275(arg0, arg1);
			this.aClass4_1 = arg1;
		}
		return true;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Z")
	public boolean method6029() {
		return this.aClass44Array1[3].method7281();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZIZIII)V")
	public void method6031(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) boolean local9 = arg0 & this.aClass62_Sub3_33.method7044();
		if (!local9 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			if (arg4 == 4) {
				arg1 = arg3;
			}
			arg4 = 2;
		}
		if (arg4 != 0 && arg2) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (this.anInt7413 != arg4) {
			if (this.anInt7413 != 0) {
				this.aClass44Array1[Integer.MAX_VALUE & this.anInt7413].method7280();
			}
			if (arg4 != 0) {
				this.aClass44Array1[Integer.MAX_VALUE & arg4].method7274(arg2);
				this.aClass44Array1[Integer.MAX_VALUE & arg4].method7277(arg2);
				this.aClass44Array1[Integer.MAX_VALUE & arg4].method7278(arg3, arg1);
			}
			this.anInt7418 = arg3;
			this.anInt7413 = arg4;
			this.anInt7416 = arg1;
			this.aClass4_1 = null;
		} else if (this.anInt7413 != 0) {
			this.aClass44Array1[this.anInt7413 & Integer.MAX_VALUE].method7277(arg2);
			if (this.anInt7418 != arg3 || arg1 != this.anInt7416) {
				this.aClass44Array1[Integer.MAX_VALUE & this.anInt7413].method7278(arg3, arg1);
				this.anInt7418 = arg3;
				this.anInt7416 = arg1;
			}
		}
	}
}
