import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nda")
public final class Class215 {

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "I")
	private int anInt6453 = 0;

	@OriginalMember(owner = "client!nda", name = "h", descriptor = "I")
	private int anInt6457 = 0;

	@OriginalMember(owner = "client!nda", name = "e", descriptor = "Lclient!it;")
	private Class16 aClass16_1 = null;

	@OriginalMember(owner = "client!nda", name = "f", descriptor = "I")
	private int anInt6455 = 0;

	@OriginalMember(owner = "client!nda", name = "l", descriptor = "Lclient!en;")
	private final Class90_Sub1 aClass90_Sub1_27;

	@OriginalMember(owner = "client!nda", name = "d", descriptor = "Lclient!h;")
	private final Class122 aClass122_3;

	@OriginalMember(owner = "client!nda", name = "j", descriptor = "[Lclient!ua;")
	private final Class8[] aClass8Array1;

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "Lclient!aea;")
	public final Class8_Sub1 aClass8_Sub1_1;

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lclient!en;)V")
	public Class215(@OriginalArg(0) Class90_Sub1 arg0) {
		this.aClass90_Sub1_27 = arg0;
		this.aClass122_3 = new Class122(arg0);
		this.aClass8Array1 = new Class8[10];
		this.aClass8Array1[1] = new Class8_Sub7(arg0);
		this.aClass8Array1[2] = new Class8_Sub9(arg0, this.aClass122_3);
		this.aClass8Array1[4] = new Class8_Sub2(arg0, this.aClass122_3);
		this.aClass8Array1[5] = new Class8_Sub4(arg0, this.aClass122_3);
		this.aClass8Array1[6] = new Class8_Sub3(arg0);
		this.aClass8Array1[7] = new Class8_Sub5(arg0);
		this.aClass8Array1[3] = this.aClass8_Sub1_1 = new Class8_Sub1(arg0);
		this.aClass8Array1[8] = new Class8_Sub6(arg0, this.aClass122_3);
		this.aClass8Array1[9] = new Class8_Sub8(arg0, this.aClass122_3);
		if (!this.aClass8Array1[8].method6919()) {
			this.aClass8Array1[8] = this.aClass8Array1[4];
		}
		if (!this.aClass8Array1[9].method6919()) {
			this.aClass8Array1[9] = this.aClass8Array1[8];
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZZIBII)V")
	public void method5195(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(17) boolean local17 = arg1 & this.aClass90_Sub1_27.method7502();
		if (!local17 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			if (arg2 == 4) {
				arg3 = arg4;
			}
			arg2 = 2;
		}
		if (arg2 != 0 && arg0) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (this.anInt6457 != arg2) {
			if (this.anInt6457 != 0) {
				this.aClass8Array1[this.anInt6457 & Integer.MAX_VALUE].method6922();
			}
			if (arg2 != 0) {
				this.aClass8Array1[arg2 & Integer.MAX_VALUE].method6918(arg0);
				this.aClass8Array1[Integer.MAX_VALUE & arg2].method6927(arg0);
				this.aClass8Array1[arg2 & Integer.MAX_VALUE].method6924(arg3, arg4);
			}
			this.aClass16_1 = null;
			this.anInt6457 = arg2;
			this.anInt6455 = arg3;
			this.anInt6453 = arg4;
		} else if (this.anInt6457 != 0) {
			this.aClass8Array1[this.anInt6457 & Integer.MAX_VALUE].method6927(arg0);
			if (arg4 != this.anInt6453 || arg3 != this.anInt6455) {
				this.aClass8Array1[this.anInt6457 & Integer.MAX_VALUE].method6924(arg3, arg4);
				this.anInt6453 = arg4;
				this.anInt6455 = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(BILclient!it;)Z")
	public boolean method5196(@OriginalArg(1) int arg0, @OriginalArg(2) Class16 arg1) {
		if (this.anInt6457 == 0) {
			return false;
		}
		if (arg1 != this.aClass16_1) {
			this.aClass8Array1[this.anInt6457 & Integer.MAX_VALUE].method6923(arg0, arg1);
			this.aClass16_1 = arg1;
		}
		return true;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(II)Z")
	public boolean method5197() {
		return this.aClass8Array1[3].method6919();
	}
}
