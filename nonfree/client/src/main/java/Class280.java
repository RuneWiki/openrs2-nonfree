import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pfa")
public final class Class280 {

	@OriginalMember(owner = "client!pfa", name = "d", descriptor = "I")
	private int anInt7330 = 0;

	@OriginalMember(owner = "client!pfa", name = "j", descriptor = "I")
	private int anInt7333 = 0;

	@OriginalMember(owner = "client!pfa", name = "n", descriptor = "I")
	private int anInt7335 = 0;

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "Lclient!lf;")
	private final Class95_Sub3 aClass95_Sub3_32;

	@OriginalMember(owner = "client!pfa", name = "i", descriptor = "Lclient!tf;")
	private final Class336 aClass336_5;

	@OriginalMember(owner = "client!pfa", name = "g", descriptor = "[Lclient!baa;")
	private final Class22[] aClass22Array1;

	@OriginalMember(owner = "client!pfa", name = "k", descriptor = "Lclient!qv;")
	public final Class22_Sub7 aClass22_Sub7_1;

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class280(@OriginalArg(0) Class95_Sub3 arg0) {
		this.aClass95_Sub3_32 = arg0;
		this.aClass336_5 = new Class336(arg0);
		this.aClass22Array1 = new Class22[10];
		this.aClass22Array1[1] = new Class22_Sub6(arg0);
		this.aClass22Array1[2] = new Class22_Sub2(arg0, this.aClass336_5);
		this.aClass22Array1[4] = new Class22_Sub8(arg0, this.aClass336_5);
		this.aClass22Array1[5] = new Class22_Sub4(arg0, this.aClass336_5);
		this.aClass22Array1[6] = new Class22_Sub9(arg0);
		this.aClass22Array1[7] = new Class22_Sub5(arg0);
		this.aClass22Array1[3] = this.aClass22_Sub7_1 = new Class22_Sub7(arg0);
		this.aClass22Array1[8] = new Class22_Sub1(arg0, this.aClass336_5);
		this.aClass22Array1[9] = new Class22_Sub3(arg0, this.aClass336_5);
		if (!this.aClass22Array1[8].method6982()) {
			this.aClass22Array1[8] = this.aClass22Array1[4];
		}
		if (!this.aClass22Array1[9].method6982()) {
			this.aClass22Array1[9] = this.aClass22Array1[8];
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ILclient!ru;I)Z")
	public boolean method6145(@OriginalArg(0) int arg0, @OriginalArg(1) Class10 arg1) {
		if (this.anInt7330 == 0) {
			return false;
		} else {
			this.aClass22Array1[this.anInt7330 & Integer.MAX_VALUE].method6979(arg1, arg0);
			return true;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IZIIZI)V")
	public void method6147(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(17) boolean local17 = arg1 & this.aClass95_Sub3_32.method8002();
		if (!local17 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			if (arg2 == 4) {
				arg0 = arg3;
			}
			arg2 = 2;
		}
		if (arg2 != 0 && arg4) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt7330) {
			if (this.anInt7330 != 0) {
				this.aClass22Array1[this.anInt7330 & Integer.MAX_VALUE].method6980();
			}
			if (arg2 != 0) {
				this.aClass22Array1[arg2 & Integer.MAX_VALUE].method6978(arg4);
				this.aClass22Array1[Integer.MAX_VALUE & arg2].method6984(arg4);
				this.aClass22Array1[arg2 & Integer.MAX_VALUE].method6985(arg0, arg3);
			}
			this.anInt7333 = arg3;
			this.anInt7335 = arg0;
			this.anInt7330 = arg2;
		} else if (this.anInt7330 != 0) {
			this.aClass22Array1[this.anInt7330 & Integer.MAX_VALUE].method6984(arg4);
			if (arg3 != this.anInt7333 || arg0 != this.anInt7335) {
				this.aClass22Array1[this.anInt7330 & Integer.MAX_VALUE].method6985(arg0, arg3);
				this.anInt7335 = arg0;
				this.anInt7333 = arg3;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(II)Z")
	public boolean method6149() {
		return this.aClass22Array1[3].method6982();
	}
}
